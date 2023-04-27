package com.rs.non_bdd;

import javax.swing.text.AsyncBoxView.ChildLocator;

public class MethodChaining {
String place;
String modeOfTravel;

public String getPlace() {
	return place;
}

public MethodChaining setPlace(String place) {
	this.place = place;
	return this;
}

public String getModeOfTravel() {
	return modeOfTravel;
}

public MethodChaining setModeOfTravel(String modeOfTravel) {
	this.modeOfTravel = modeOfTravel;
	return this;
}
public void whrAreYouGoing() {
	System.out.println(getPlace()+" by "+getModeOfTravel());
}
public static void main(String[] args) {
	MethodChaining chaining=new MethodChaining();
	chaining.setPlace("Kochi");
	chaining.setModeOfTravel("car");
	chaining.whrAreYouGoing();
	chaining.setPlace("Ooty").setModeOfTravel("Car").whrAreYouGoing();
	
	
}

	
}
