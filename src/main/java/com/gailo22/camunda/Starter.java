package com.gailo22.camunda;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Starter implements InitializingBean {

	@Autowired
	private RuntimeService runtimeService;

	public void afterPropertiesSet() throws Exception {
		this.runtimeService.startProcessInstanceByKey("loanApproval");
	}

	public void setRuntimeService(final RuntimeService runtimeService) {
		this.runtimeService = runtimeService;
	}
}