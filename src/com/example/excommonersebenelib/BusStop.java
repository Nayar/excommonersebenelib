package com.example.excommonersebenelib;

import java.util.ArrayList;

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
	
	public ArrayList<Route> getRoutes(ArrayList<Route> routes){
		ArrayList<Route> ret = new ArrayList<Route>();
		for(int i = 0;i<routes.size();i++){
			for(int j = 0;j<routes.get(i).busStops.size();j++){
				if(routes.get(i).busStops.get(j).id == this.id){
					ret.add(routes.get(i));
				}
			}
		}
		return ret;
	}
}
