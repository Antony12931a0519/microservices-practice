package com.microservices.limitsservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservice.beans.LimitsConfiguration;
import com.microservices.limitsservice.configuration.Configuration;

@RestController
public class LimitsServicesController {

	@Autowired
	Configuration configuration;

	@RequestMapping("/welcome")
	public String welcomeMessage() {
		return "Hi";
	}

	@RequestMapping("/limits")
	public LimitsConfiguration getLimits(){
		return new LimitsConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}

}
