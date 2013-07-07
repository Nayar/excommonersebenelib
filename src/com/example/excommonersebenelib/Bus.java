package com.example.excommonersebenelib;

import com.google.android.gms.maps.model.LatLng;

public class Bus {
	public String id;
	public double x,y;
	public LatLng geoPoint;
	MeraListener[] meraListeners = new MeraListener[10];
	int noListeners = 0;
	
	public Bus(String id){
		this.id = id;
	}
	
	public Bus(String id,double x, double y){
		this.id = id;
		setLocation(x,y);
	}
	
	public void setLocation(double x,double y){
		this.x = x;
		this.y = y;
		this.geoPoint = new LatLng(x, y);
		for(int i = 1;i<noListeners;i++){
			meraListeners[i].update();
		}
	}
	
	public void addListener(MeraListener ml){
		if(noListeners < 10)
			meraListeners[noListeners++] = ml;
	}
}
