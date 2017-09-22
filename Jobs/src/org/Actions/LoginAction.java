package org.Actions;

import org.BusinessControler.JobsControler;
import org.Interfaces.JobsControlerI;

public class LoginAction {

	public String execute() {

		JobsControlerI jobI = new JobsControler();
		
		System.out.println(jobI.getJobs());
		
		
		return "success";
		
	}
}
