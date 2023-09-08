package com.ust.airport.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ust.airport.Entity.AirportsEntity;
import com.ust.airport.Repository.AirportsRepoitory;

@Service
public class AirportsService {
	private final AirportsRepoitory airportsRepository;
//    private final String jsonUrl = "https://gist.githubusercontent.com/tdreyno/4278655/raw/7b0762c09b519f40397e4c3e100b097d861f5588/airports.json";
private final String jsonUrl = "https://cdn.jsdelivr.net/gh/besrourms/airports@latest/airports.json";
    @Autowired
    public AirportsService(AirportsRepoitory airportsRepository) {
        this.airportsRepository = airportsRepository;
    }
    RestTemplate restTemplate = new RestTemplate();
    public void fetchAndSaveAirports() {
        // Use RestTemplate to fetch JSON data from the URL
        RestTemplate restTemplate = new RestTemplate();
        AirportsEntity[] Airports = restTemplate.getForObject(jsonUrl, AirportsEntity[].class);
        
           

        // Save the fetched data to the database
        for (AirportsEntity Airport : Airports) {
            try {
        	airportsRepository.save(Airport);
            }catch(Exception e) {
            	System.out.println(Airport.getiata());
            }
//        	System.out.println(Airport);
        }
    }
    
    //print response
//    public void makeHttpGetRequestAndPrintResponse() {
//        String url = "https://example.com/api/resource"; // Replace with your API endpoint
//
//        // Make the GET request using RestTemplate
//        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
//
//        // Print the HTTP status code (e.g., 200 OK)
//        System.out.println("HTTP Status Code: " + response.getStatusCodeValue());
//
//        // Print the response body
//        String responseBody = response.getBody();
//        System.out.println("Response Body: " + responseBody);
//
//        // You can also log the response using your preferred logging framework (e.g., log4j, SLF4J, etc.)
//        // logger.info("Response Body: " + responseBody);
//    }

}
