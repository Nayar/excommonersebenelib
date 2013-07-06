package com.example.excommonersebenelib;

public class BusStops {
	public BusStop head;
	
	public void add(int id,double x,double y){
		if(head == null){
			head = new BusStop(id,x,y);
			return;
		}
		BusStop current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = new BusStop(id,x, y);
	}
}
