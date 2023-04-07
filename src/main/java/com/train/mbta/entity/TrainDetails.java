package com.train.mbta.entity;

import java.time.LocalTime;

public class TrainDetails implements Comparable<TrainDetails>{
	private String trackLine;
	private String destination;
	private LocalTime departTime;
	
	
	public TrainDetails(String trackLine, String destination, LocalTime departTime) {
		super();
		this.trackLine = trackLine;
		this.destination = destination;
		this.departTime = departTime;
	}
	public TrainDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTrackLine() {
		return trackLine;
	}
	public void setTrackLine(String trackLine) {
		this.trackLine = trackLine;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalTime getDepartTime() {
		return departTime;
	}
	public void setDepartTime(LocalTime departTime) {
		this.departTime = departTime;
	}
	@Override
	public int compareTo(TrainDetails o) {
		if(departTime.isAfter(o.departTime))
		{
			return 1;
		}
		else if(departTime.isBefore(o.departTime))
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}
