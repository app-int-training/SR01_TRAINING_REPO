package com.artist.vo;

import java.io.Serializable;
import java.util.Calendar;
public class ArtistVo implements Serializable
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String Client,Artist,Spras,Title,firstName,lastNamePrefix,artistName,
searchInfo,actionCode;
Calendar receiveDate;
public String getClient() {
	return Client;
}
public void setClient(String client) {
	Client = client;
}
public String getArtist() {
	return Artist;
}
public void setArtist(String artist) {
	Artist = artist;
}
public String getSpras() {
	return Spras;
}
public void setSpras(String spras) {
	Spras = spras;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastNamePrefix() {
	return lastNamePrefix;
}
public void setLastNamePrefix(String lastNamePrefix) {
	this.lastNamePrefix = lastNamePrefix;
}
public String getArtistName() {
	return artistName;
}
public void setArtistName(String artistName) {
	this.artistName = artistName;
}
public String getSearchInfo() {
	return searchInfo;
}
public void setSearchInfo(String searchInfo) {
	this.searchInfo = searchInfo;
}
public String getActionCode() {
	return actionCode;
}
public void setActionCode(String actionCode) {
	this.actionCode = actionCode;
}
public Calendar getReceiveDate() {
	return receiveDate;
}
public void setReceiveDate(Calendar receiveDate) {
	this.receiveDate = receiveDate;
}
@Override
public String toString() {
	return "ArtistVo [Client=" + Client + ", Artist=" + Artist + ", Spras="
			+ Spras + ", Title=" + Title + ", firstName=" + firstName
			+ ", lastNamePrefix=" + lastNamePrefix + ", artistName="
			+ artistName + ", searchInfo=" + searchInfo + ", actionCode="
			+ actionCode + ", receiveDate=" + receiveDate + "]";
}
}
