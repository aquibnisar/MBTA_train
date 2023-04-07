package com.train.mbta.dataLayer;

import java.util.List;

public class TrainResponseDto {
	private String currentTime;
	private List<YellowLine> yellowLine;
	private List<RedLine> redLine;
	private List<BlueLine> blueLine;
	private List<GreenLine> greenLine;
	
	public String getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
	public List<YellowLine> getYellowLine() {
		return yellowLine;
	}
	public void setYellowLine(List<YellowLine> yellowLine) {
		this.yellowLine = yellowLine;
	}
	public List<RedLine> getRedLine() {
		return redLine;
	}
	public void setRedLine(List<RedLine> redLine) {
		this.redLine = redLine;
	}
	public List<BlueLine> getBlueLine() {
		return blueLine;
	}
	public void setBlueLine(List<BlueLine> blueLine) {
		this.blueLine = blueLine;
	}
	public List<GreenLine> getGreenLine() {
		return greenLine;
	}
	public void setGreenLine(List<GreenLine> greenLine) {
		this.greenLine = greenLine;
	}
}
