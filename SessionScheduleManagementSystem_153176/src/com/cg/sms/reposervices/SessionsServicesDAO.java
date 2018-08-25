package com.cg.sms.reposervices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.sms.beans.ScheduledSessions;

public interface SessionsServicesDAO extends JpaRepository<ScheduledSessions,Integer>{
}
