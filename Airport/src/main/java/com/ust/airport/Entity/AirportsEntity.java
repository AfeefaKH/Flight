package com.ust.airport.Entity;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class AirportsEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String iata;
	private String name;
	public AirportsEntity(Long id, String iata, String name) {
//		public AirportsEntity(String iata, String name) {

		super();
		this.id = id;
		this.iata = iata;
		this.name = name;
	}
	public AirportsEntity() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getiata() {
		return iata;
	}
	public void setiata(String iata) {
		this.iata = iata;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "AirportsEntity [id=" + id + ", iata=" + iata + ", name=" + name + "]";
//		return "AirportsEntity [iata=" + iata + ", name=" + name + "]";

	}
	
	
	
	
//	@JsonProperty("id")
//    private Long id;
//	@JsonProperty("code")
//    private String code;
//
//    @JsonProperty("lat")
//    private String latitude;
//
//    @JsonProperty("lon")
//    private String longitude;
//
//    @JsonProperty("name")
//    private String name;
//
//    @JsonProperty("city")
//    private String city;
//
//    @JsonProperty("state")
//    private String state;
//
//    @JsonProperty("country")
//    private String country;
//
//    @JsonProperty("woeid")
//    private String woeid;
//
//    @JsonProperty("tz")
//    private String timeZone;
//
//    @JsonProperty("phone")
//    private String phone;
//
//    @JsonProperty("type")
//    private String type;
//
//    @JsonProperty("email")
//    private String email;
//
//    @JsonProperty("url")
//    private String url;
//
//    @JsonProperty("runway_length")
//    private String runwayLength;
//
//    @JsonProperty("elev")
//    private String elevation;
//
//    @JsonProperty("icao")
//    private String icao;
//
//    @JsonProperty("direct_flights")
//    private String directFlights;
//
//    @JsonProperty("carriers")
//    private String carriers;
//    
//    public AirportsEntity() {}
//
//	public AirportsEntity(Long id, String code, String latitude, String longitude, String name, String city,
//			String state, String country, String woeid, String timeZone, String phone, String type, String email,
//			String url, String runwayLength, String elevation, String icao, String directFlights, String carriers) {
//		super();
//		this.id = id;
//		this.code = code;
//		this.latitude = latitude;
//		this.longitude = longitude;
//		this.name = name;
//		this.city = city;
//		this.state = state;
//		this.country = country;
//		this.woeid = woeid;
//		this.timeZone = timeZone;
//		this.phone = phone;
//		this.type = type;
//		this.email = email;
//		this.url = url;
//		this.runwayLength = runwayLength;
//		this.elevation = elevation;
//		this.icao = icao;
//		this.directFlights = directFlights;
//		this.carriers = carriers;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getCode() {
//		return code;
//	}
//
//	public void setCode(String code) {
//		this.code = code;
//	}
//
//	public String getLatitude() {
//		return latitude;
//	}
//
//	public void setLatitude(String latitude) {
//		this.latitude = latitude;
//	}
//
//	public String getLongitude() {
//		return longitude;
//	}
//
//	public void setLongitude(String longitude) {
//		this.longitude = longitude;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public String getWoeid() {
//		return woeid;
//	}
//
//	public void setWoeid(String woeid) {
//		this.woeid = woeid;
//	}
//
//	public String getTimeZone() {
//		return timeZone;
//	}
//
//	public void setTimeZone(String timeZone) {
//		this.timeZone = timeZone;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getUrl() {
//		return url;
//	}
//
//	public void setUrl(String url) {
//		this.url = url;
//	}
//
//	public String getRunwayLength() {
//		return runwayLength;
//	}
//
//	public void setRunwayLength(String runwayLength) {
//		this.runwayLength = runwayLength;
//	}
//
//	public String getElevation() {
//		return elevation;
//	}
//
//	public void setElevation(String elevation) {
//		this.elevation = elevation;
//	}
//
//	public String getIcao() {
//		return icao;
//	}
//
//	public void setIcao(String icao) {
//		this.icao = icao;
//	}
//
//	public String getDirectFlights() {
//		return directFlights;
//	}
//
//	public void setDirectFlights(String directFlights) {
//		this.directFlights = directFlights;
//	}
//
//	public String getCarriers() {
//		return carriers;
//	}
//
//	public void setCarriers(String carriers) {
//		this.carriers = carriers;
//	}
//
//	@Override
//	public String toString() {
//		return "AirportsEntity [id=" + id + ", code=" + code + ", latitude=" + latitude + ", longitude=" + longitude
//				+ ", name=" + name + ", city=" + city + ", state=" + state + ", country=" + country + ", woeid=" + woeid
//				+ ", timeZone=" + timeZone + ", phone=" + phone + ", type=" + type + ", email=" + email + ", url=" + url
//				+ ", runwayLength=" + runwayLength + ", elevation=" + elevation + ", icao=" + icao + ", directFlights="
//				+ directFlights + ", carriers=" + carriers + "]";
//	}
//    
	    
}
