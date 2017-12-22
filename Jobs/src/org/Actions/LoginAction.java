package org.Actions;

import org.BusinessService.JobsService;
import org.BusinessService.LoginService;
import org.Interfaces.JobsServiceI;
import org.Interfaces.LoginServiceI;
import org.Model.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class LoginAction extends ActionSupport{
	
	private static final long serialVersionUID = 2893691601678276632L;
	
	private String returnData;
	private String result;
	// getting parameters from the jsp.
	private String parameterUser;
	private String parameterPassword;
	
	private User user;
	
	
	public String execute() {
		
		LoginServiceI loginI = new LoginService();
		returnData = loginI.doLogin(getUser().getParameterUser(),getUser().getParameterPassword());
		
		// if fail returned
		if (getUser().getParameterUser().equals("error")) {
			addActionError("Invalid Login Information!");
		}
		
		// TODO 1-create session cookie
		// TODO 2-call getJobs() and show them in the jsp JOBS.
		JobsServiceI jobsI = new JobsService();
		result = jobsI.getJobs();
		
		return returnData;
		
		
	}

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getReturnData() {
		return returnData;
	}

	public void setReturnData(String returnData) {
		this.returnData = returnData;
	}

	public String getParameterUser() {
		return parameterUser;
	}

	public void setParameterUser(String parameterUser) {
		this.parameterUser = parameterUser;
	}

	public String getParameterPassword() {
		return parameterPassword;
	}

	public void setParameterPassword(String parameterPassword) {
		this.parameterPassword = parameterPassword;
	}

	
	
}
