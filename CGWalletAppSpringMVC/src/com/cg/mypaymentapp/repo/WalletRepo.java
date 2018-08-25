
//WalletRepo Interface

package com.cg.mypaymentapp.repo;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.mypaymentapp.beans.Customer;

public interface WalletRepo extends JpaRepository<Customer, String>
{
    @Query("select cust from Customer cust where cust.wallet.balance < ?1")
	ArrayList<Customer> findCustomers(BigDecimal amount);

}
