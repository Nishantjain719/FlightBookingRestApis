package com.javatechnology.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechnology.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {

}
