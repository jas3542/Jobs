package org.BusinessService;

import org.Interfaces.JobsServiceI;
import org.Utilities.HttpRequest;

public class JobsService implements JobsServiceI {

	public String getJobs() {
		
		HttpRequest http = new HttpRequest();
		http.run();
		//get data
		return "Jobs Controler Works";
		
	}
}
