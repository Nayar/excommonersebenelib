package com.example.excommonersebenelib;

import java.util.ArrayList;



public class Route {
	int no;
	String from;
	String to;
	public ArrayList<BusStop> busStops;
	
	public Route(int x,String from,String to){
		no = x;
		this.from = from;
		this.to = to;
		busStops = new ArrayList<BusStop>();
	}
	public void addBusStop(BusStop x){
		busStops.add(x);
	}
}
