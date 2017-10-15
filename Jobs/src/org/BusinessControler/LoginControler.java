package org.BusinessControler;

import org.Interfaces.LoginControlerI;

public class LoginControler implements LoginControlerI {
	// here i do the query to the DB and after that i return ok or fail.
	@Override
	public String doLogin(String usernamee,String passwordd) {
		// do query.
		// if resultat ok else "fail"
		return "ok";
	}
}
