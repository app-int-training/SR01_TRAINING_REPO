package com.appintegrators.training.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

import com.appintegrators.training.vo.Valuobj;


public class Mainjava implements Callable{
	public Object onCall(MuleEventContext pEventCtx ) throws Exception 
	{
		MuleMessage msg = pEventCtx.getMessage();
		Object dbResultSetData = msg.getPayload();
		StringBuilder sb = new StringBuilder();
		ArrayList<Valuobj> personsFromDB = new ArrayList<Valuobj>();
		List<Map> resultSet = (List<Map>) dbResultSetData;		
		//@SuppressWarnings({ "rawtypes", "unchecked" })
		for( Map aRowData : resultSet )
		{			
		String airlineName = (String) aRowData.get( "airlineName" );
		int price = (int) aRowData.get("price");
		String departureDate = (String) aRowData.get("departureDate");
		String planeType = (String) aRowData.get("planeType");
		String origination = (String) aRowData.get("origination");
		String flightCode = (String) aRowData.get("flightCode");
		int availableSeats = (int) aRowData.get("availableSeats");
		String destination = (String) aRowData.get("destination");
		Valuobj val = new Valuobj();
		val.setAirlineName(airlineName);
		val.setPrice(price);
		val.setDepartureDate(departureDate);
		val.setPlaneType(planeType);
		val.setOrigination(origination);
		val.setFlightCode(flightCode);
		val.setAvailableSeats(availableSeats);
		val.setDestination(destination);
		sb.append(val);
		personsFromDB.add(val);		
	}
		System.out.println(sb.toString());
	    return sb.toString();		
	}
	}
