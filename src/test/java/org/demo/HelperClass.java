package org.demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public class HelperClass {
	
		public static int LinkCHecker(String str) throws IOException {
			
			HttpURLConnection httpurl=null;
			URL url = new URL(str);
			httpurl= (HttpURLConnection)url.openConnection();
			httpurl.connect();
			
			int statuscode = httpurl.getResponseCode();
			return statuscode;
			
		}

}
