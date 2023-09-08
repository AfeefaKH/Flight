package com.ust.airport;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AirportApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportApplication.class, args);
//		System.setProperty("javax.net.ssl.trustStore", "/path/to/custom-truststore.jks");
//		System.setProperty("javax.net.ssl.trustStorePassword", "your_password");

//		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
//		    public boolean verify(String hostname, SSLSession session) {
//		        return true;
//		    }
//		});
		
		
		
		System.out.println("HEllo Airports !!!");
	}
	
	

}
