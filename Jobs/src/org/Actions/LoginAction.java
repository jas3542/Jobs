package org.Actions;

import org.BusinessService.JobsService;
import org.BusinessService.LoginService;
import org.Interfaces.JobsServiceI;
import org.Interfaces.LoginServiceI;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class LoginAction extends ActionSupport{
	
	private static final long serialVersionUID = 2893691601678276632L;
	
	private String returnData;
	private String result;
	// getting parameters from the jsp.
	private String parameterUser;
	private String parameterPassword;
	
	public String execute() {
		
		LoginServiceI loginI = new LoginService();
		returnData = loginI.doLogin(getParameterUser(),getParameterPassword());
		
		// if fail returned
		if (getParameterUser().equals("error")) {
			addActionError("Invalid Login Information!");
		}
		
		// TODO 1-create session cookie
		// TODO 2-call getJobs()
		JobsServiceI jobsI = new JobsService();
		result = jobsI.getJobs();
		
		return returnData;
		
		
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
