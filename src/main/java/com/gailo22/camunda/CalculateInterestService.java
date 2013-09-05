package com.gailo22.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CalculateInterestService implements JavaDelegate {

	public void execute(final DelegateExecution delegate) throws Exception {

		System.out.println("Spring Bean invoked.");

	}

}
