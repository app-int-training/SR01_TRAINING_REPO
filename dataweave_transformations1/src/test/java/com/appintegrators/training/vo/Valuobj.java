package com.appintegrators.training.vo;

import java.util.Date;

public class Valuobj 
{
private String airlineName;
private int price;
private String departureDate;
private String planeType;
private String origination;
private String flightCode;
private int availableSeats;
private String destination;
public String getAirlineName() {
	return airlineName;
}
public void setAirlineName(String airlineName) {
	this.airlineName = airlineName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getDepartureDate() {
	return departureDate;
}
public void setDepartureDate(String departureDate) {
	this.departureDate = departureDate;
}
public String getPlaneType() {
	return planeType;
}
public void setPlaneType(String planeType) {
	this.planeType = planeType;
}
public String getOrigination() {
	return origination;
}
public void setOrigination(String origination) {
	this.origination = origination;
}
public String getFlightCode() {
	return flightCode;
}
public void setFlightCode(String flightCode) {
	this.flightCode = flightCode;
}
public int getAvailableSeats() {
	return availableSeats;
}
public void setAvailableSeats(int availableSeats2) {
	this.availableSeats = availableSeats2;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
@Override
public String toString() {
	return "Valuobj [airlineName=" + airlineName + ", price=" + price
			+ ", departureDate=" + departureDate + ", planeType=" + planeType
			+ ", origination=" + origination + ", flightCode=" + flightCode
			+ ", availableSeats=" + availableSeats + ", destination="
			+ destination + ", getAirlineName()=" + getAirlineName()
			+ ", getPrice()=" + getPrice() + ", getDepartureDate()="
			+ getDepartureDate() + ", getPlaneType()=" + getPlaneType()
			+ ", getOrigination()=" + getOrigination() + ", getFlightCode()="
			+ getFlightCode() + ", getAvailableSeats()=" + getAvailableSeats()
			+ ", getDestination()=" + getDestination() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
}
