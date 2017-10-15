package org.Actions;

import org.BusinessControler.LoginControler;
import org.Interfaces.LoginControlerI;

public class LoginAction {

	private String returnData;
	// getting parameters from the jsp.
	private String parameterUser;
	private String parameterPassword;
	
	public String execute() {

		System.out.println(parameterUser);
		
		LoginControlerI loginI = new LoginControler();
		
		setReturnData(loginI.doLogin(getParameterUser(),getParameterPassword()));
				
		return "success";
		
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
