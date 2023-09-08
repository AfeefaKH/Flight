package com.ust.airport.Controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.airport.Service.AirportsService;



@RestController
@RequestMapping("/api/airports")
public class AirportController {
	private final AirportsService airportService;

    @Autowired
    public AirportController(AirportsService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/fetch")
    public String fetchAndSaveAirports() {
        airportService.fetchAndSaveAirports();
        return "Data fetched and saved to the database.";
    }
    
    //print response
//    @GetMapping("/fetch-data")
//    public String fetchDataAndPrintResponse() {
//        airportService.makeHttpGetRequestAndPrintResponse();
//        return "HTTP GET request executed. Check the console for the response.";
//    }

}
