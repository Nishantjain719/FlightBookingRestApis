package com.javatechnology.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechnology.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {

}
