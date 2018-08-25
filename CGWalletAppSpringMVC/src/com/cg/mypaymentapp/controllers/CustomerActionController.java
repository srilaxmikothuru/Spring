package com.cg.mypaymentapp.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.beans.Transactions;
import com.cg.mypaymentapp.service.WalletService;

@Controller
public class CustomerActionController {
	public static String mobileNo;
	@Autowired
	WalletService walletService;

	@RequestMapping(value="/registerCustomer")
	public ModelAndView registerCustomer(@Valid @ModelAttribute("customer")Customer customer,BindingResult result) {
		if(result.hasErrors())
			return new ModelAndView("registrationPage");
		customer=walletService.createAccount(customer);
		return new ModelAndView("registrationSuccessPage", "customer",customer);

	}
	@RequestMapping(value="/loginCustomer")
	public ModelAndView loginCustomer(@RequestParam("mobileNo") String mobileNo) {	
		try {
			Customer customer = walletService.showBalance(mobileNo);
			return new ModelAndView("loginSuccessPage", "customer",customer);
		} catch (Exception e) {
			return new ModelAndView("loginPage", "errorMessage",e.getMessage());
		}		
	}

	@RequestMapping(value="/fundTransferAction")
	public ModelAndView fundTransfer(@RequestParam("mobileNo1")String source, @RequestParam("mobileNo2")String target,@RequestParam("amount")BigDecimal amount) {

		Customer customer1=walletService.fundTransfer(source, target, amount);
		return new ModelAndView("currentbalance", "customer",customer1);		
	}
	@RequestMapping(value="/depositAmount")
	public ModelAndView depositBalance(@ModelAttribute("customer")Customer customer) {
		Customer customer1=walletService.depositAmount(customer.getMobileNo(), customer.getWallet().getBalance());		
		return new ModelAndView("currentbalance", "customer",customer1);		
	}
	@RequestMapping(value="/withdrawAmount")
	public ModelAndView withdrawBalance(@ModelAttribute("customer")Customer customer) {		 
		try {
			Customer customer1 = walletService.withdrawAmount(customer.getMobileNo(), customer.getWallet().getBalance());
			return new ModelAndView("currentbalance", "customer",customer1);
		} catch (Exception e) {
			return new ModelAndView("withdraw", "errorMessage",e.getMessage());
		}
	}
	@RequestMapping(value="/printTransaction")
	public ModelAndView printtrans(@RequestParam("mobileNo1")String mobileNo) {
		List<Transactions> transaction=walletService.recentTransactions(mobileNo);
		return new ModelAndView("printTransaction","transactions",transaction);
	}

	@RequestMapping(value="/getAll")
	public ModelAndView getAll() {
		ArrayList<Customer> customer =walletService.getAllCustomerDetails();
		return new ModelAndView("getCustomers","customer",customer);
	}
	
	@RequestMapping(value="/getAllCust")
	public ModelAndView getAllCust() {
		ArrayList<Customer> customer =walletService.getAllCustomerDetailsLessThan1000();
		return new ModelAndView("getCustomersLessThan1000","customer",customer);
	}
	
	@RequestMapping(value="/updateCustomerDetails")
	public ModelAndView updateCustomerDetails(@RequestParam("mobileNo")String mobileNo, @RequestParam("name")String name) {
		Customer customer =walletService.updateDetails(mobileNo, name);
		return new ModelAndView("loginSuccessPage","customer",customer);
	}


}
