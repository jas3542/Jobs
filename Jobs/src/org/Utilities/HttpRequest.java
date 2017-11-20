package org.Utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("asdasdsadasdasdas");
			HttpURLConnection con = (HttpURLConnection) new URL("https://api.jobs.com/search/jobs?title=programmer&city=boston&state=MA&radius=40&country=US").openConnection();
			
			con.setRequestMethod("POST");
			int responseCode = con.getResponseCode();
		
			System.out.println("->"+responseCode);
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
