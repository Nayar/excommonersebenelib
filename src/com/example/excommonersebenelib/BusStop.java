package com.example.excommonersebenelib;

import com.google.android.gms.maps.model.LatLng;

public class BusStop {
	public int id;
	public double x,y;
	public LatLng geoPoint;
	public BusStop next;
	
	public BusStop(int id,double x,double y) {
		this.id = id;
		this.x = x;
		this.y = y;
		geoPoint = new LatLng(x, y);
	}
}
