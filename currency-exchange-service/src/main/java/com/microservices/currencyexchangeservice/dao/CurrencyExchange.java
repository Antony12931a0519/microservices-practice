package com.microservices.currencyexchangeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.currencyexchangeservice.beans.ExchangeValue;

public interface CurrencyExchange extends JpaRepository<ExchangeValue, Long> {
	
	public ExchangeValue findByFromAndTo(String from,String to);

}
