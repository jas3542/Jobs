package org.BusinessService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.Interfaces.LoginServiceI;
import org.Utilities.DBConnection;

public class LoginService implements LoginServiceI {
	/**
	 *  Here i do the query to the DB and after that i return ok or fail.
	 */
	@Override
	public String doLogin(String usernamee, String passwordd) {
		// do query.
		// if resultat ok else "fail"

		// Use DAO or Hibernate Criteria.

		/*
		String query = "";
		try {

			Connection dbCon = DBConnection.getConnection();

			PreparedStatement ps = dbCon.prepareStatement(query);
		} catch (SQLException e) {
			throw new RuntimeException("SQL Exception", e);
		}
		 */
		
		return "success";
	}
}
