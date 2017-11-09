package org.Actions;

import javax.servlet.http.HttpServletRequest;

import org.BusinessControler.LoginControler;
import org.Interfaces.LoginControlerI;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	private static final long serialVersionUID = 2893691601678276632L;
	
	private String returnData;
	// getting parameters from the jsp.
	private String parameterUser;
	private String parameterPassword;
	
	public String execute() {
		
		LoginControlerI loginI = new LoginControler();
		returnData = loginI.doLogin(getParameterUser(),getParameterPassword());
		
		if (getParameterUser().equals("jas")) {
			addActionError("Invlaid Login Information!");
		}
		
		System.out.println(returnData);
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
