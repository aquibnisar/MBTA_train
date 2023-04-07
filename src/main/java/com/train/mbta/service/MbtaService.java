package com.train.mbta.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.train.mbta.controller.MbtaController;
import com.train.mbta.dataLayer.BlueLine;
import com.train.mbta.dataLayer.GreenLine;
import com.train.mbta.dataLayer.RedLine;
import com.train.mbta.dataLayer.TrainResponseDto;
import com.train.mbta.entity.TrainDetails;
import com.train.mbta.exception.ResourceNotFoundException;
import com.train.mbta.dataLayer.YellowLine;
import com.train.mbta.utility.TrainDataLoader;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@Service
public class MbtaService {
	private static final Logger log = LoggerFactory.getLogger(MbtaService.class);
	private static ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();

	@Autowired
	TrainDataLoader trainDataLoader;
	
	public ResponseEntity<TrainResponseDto> getTrainData() throws JsonProcessingException
	{
		TrainResponseDto trainResponseDto=new TrainResponseDto();
		List<TrainDetails> trainDetailsList=trainDataLoader.getTrainDetails();
		if(trainDetailsList==null || trainDetailsList.size()==0)
		{
			log.error("ERROR >>> not found");
			throw new ResourceNotFoundException("not found");
		}
	    ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zone2 = ZoneId.of("America/Indiana/Indianapolis");
	    LocalTime time1 = LocalTime.now(zone1);
	    trainResponseDto.setCurrentTime(time1.toString().split("\\.")[0]);
		List<YellowLine> yellowLineList=new ArrayList<>();
		List<RedLine> redLineList=new ArrayList<>();
		List<BlueLine> blueLineList=new ArrayList<>();
		List<GreenLine> greenLinesList=new ArrayList<>();

	    
		int trainCount=0;
		for(TrainDetails trainDetails: trainDetailsList)
		{
			System.out.println(trainDetails.getTrackLine()+" >> "+trainDetails.getDestination()+" >> "+trainDetails.getDepartTime());
			LocalTime time2=trainDetails.getDepartTime();
			if(time1.isBefore(time2))
			{
				trainCount++;
				if(trainCount<=10)
				{
					if(trainDetails.getTrackLine().contains("yellow"))
					{
				        long hours = ChronoUnit.HOURS.between(time1, time2);  
				        long minutes = ChronoUnit.MINUTES.between(time1, time2);  
				        String departIn="";
				        if(hours==0)
				        {
				        	departIn=String.valueOf(minutes)+" minutes";
				        }
				        else
				        {
				        	minutes=minutes-(hours*60);
				        	departIn=String.valueOf(hours)+" hours and "+String.valueOf(minutes)+" minutes";
				        }
				        YellowLine yellowLine=new YellowLine();
				        yellowLine.setDepartingIn(departIn);
				        String dest=trainDetails.getDestination();
				        yellowLine.setDestination(dest);
				        yellowLineList.add(yellowLine);
					}
					else if(trainDetails.getTrackLine().contains("red"))
					{

				        long hours = ChronoUnit.HOURS.between(time1, time2);  
				        long minutes = ChronoUnit.MINUTES.between(time1, time2);  
				        String departIn="";
				        if(hours==0)
				        {
				        	departIn=String.valueOf(minutes)+" minutes";
				        }
				        else
				        {
				        	minutes=minutes-(hours*60);
				        	departIn=String.valueOf(hours)+" hours and "+String.valueOf(minutes)+" minutes";
				        }
				        RedLine redLine=new RedLine();
				        redLine.setDepartingIn(departIn);
				        String dest=trainDetails.getDestination();
				        redLine.setDestination(dest);
				        redLineList.add(redLine);
					
					}
					else if(trainDetails.getTrackLine().contains("blue"))
					{
				        long hours = ChronoUnit.HOURS.between(time1, time2);  
				        long minutes = ChronoUnit.MINUTES.between(time1, time2);  
				        String departIn="";
				        if(hours==0)
				        {
				        	departIn=String.valueOf(minutes)+" minutes";
				        }
				        else
				        {
				        	minutes=minutes-(hours*60);
				        	departIn=String.valueOf(hours)+" hours and "+String.valueOf(minutes)+" minutes";
				        }
				        BlueLine blueLine=new BlueLine();
				        blueLine.setDepartingIn(departIn);
				        String dest=trainDetails.getDestination();
				        blueLine.setDestination(dest);
				        blueLineList.add(blueLine);
					}
					else if(trainDetails.getTrackLine().contains("green"))
					{
				        long hours = ChronoUnit.HOURS.between(time1, time2);  
				        long minutes = ChronoUnit.MINUTES.between(time1, time2);  
				        String departIn="";
				        if(hours==0)
				        {
				        	departIn=String.valueOf(minutes)+" minutes";
				        }
				        else
				        {
				        	minutes=minutes-(hours*60);
				        	departIn=String.valueOf(hours)+" hours and "+String.valueOf(minutes)+" minutes";
				        }
				        GreenLine greenLine=new GreenLine();
				        greenLine.setDepartingIn(departIn);
				        String dest=trainDetails.getDestination();
				        greenLine.setDestination(dest);
				        greenLinesList.add(greenLine);
					}
				}
				else if(trainCount>=10)
				{
					break;
				}
			}

		}
		if(trainCount<10)
		{
			for(TrainDetails trainDetails: trainDetailsList)
			{
				System.out.println(trainDetails.getTrackLine()+" >> "+trainDetails.getDestination()+" >> "+trainDetails.getDepartTime());
				LocalTime time2=trainDetails.getDepartTime();
				trainCount++;
					if(trainCount<=10)
					{
						if(trainDetails.getTrackLine().contains("yellow"))
						{
					        long hours = ChronoUnit.HOURS.between(time1, time2);  
					        long minutes = ChronoUnit.MINUTES.between(time1, time2);  
					        String departIn="";
					        if(hours<0)
					        {
					        	hours+=23;
					        }
					        if(minutes<0)
					        {
					        	minutes+=1439;
					        }
					        if(hours==0)
					        {
					        	departIn=String.valueOf(minutes)+" minutes";
					        }
					        else
					        {
					        	minutes=minutes-(hours*60);
					        	departIn=String.valueOf(hours)+" hours and "+String.valueOf(minutes)+" minutes";
					        }
					        YellowLine yellowLine=new YellowLine();
					        yellowLine.setDepartingIn(departIn);
					        String dest=trainDetails.getDestination();
					        yellowLine.setDestination(dest);
					        yellowLineList.add(yellowLine);
						}
						else if(trainDetails.getTrackLine().contains("red"))
						{

					        long hours = ChronoUnit.HOURS.between(time1, time2);  
					        long minutes = ChronoUnit.MINUTES.between(time1, time2);  
					        String departIn="";
					        if(hours<0)
					        {
					        	hours+=23;
					        }
					        if(minutes<0)
					        {
					        	minutes+=1439;
					        }
					        if(hours==0)
					        {
					        	departIn=String.valueOf(minutes)+" minutes";
					        }
					        else
					        {
					        	minutes=minutes-(hours*60);
					        	departIn=String.valueOf(hours)+" hours and "+String.valueOf(minutes)+" minutes";
					        }
					        RedLine redLine=new RedLine();
					        redLine.setDepartingIn(departIn);
					        String dest=trainDetails.getDestination();
					        redLine.setDestination(dest);
					        redLineList.add(redLine);
						
						}
						else if(trainDetails.getTrackLine().contains("blue"))
						{
					        long hours = ChronoUnit.HOURS.between(time1, time2);  
					        long minutes = ChronoUnit.MINUTES.between(time1, time2);  
					        String departIn="";
					        if(hours<0)
					        {
					        	hours+=23;
					        }
					        if(minutes<0)
					        {
					        	minutes+=1439;
					        }
					        if(hours==0)
					        {
					        	departIn=String.valueOf(minutes)+" minutes";
					        }
					        else
					        {
					        	minutes=minutes-(hours*60);
					        	departIn=String.valueOf(hours)+" hours and "+String.valueOf(minutes)+" minutes";
					        }
					        BlueLine blueLine=new BlueLine();
					        blueLine.setDepartingIn(departIn);
					        String dest=trainDetails.getDestination();
					        blueLine.setDestination(dest);
					        blueLineList.add(blueLine);
						}
						else if(trainDetails.getTrackLine().contains("green"))
						{
					        long hours = ChronoUnit.HOURS.between(time1, time2);  
					        long minutes = ChronoUnit.MINUTES.between(time1, time2);  
					        String departIn="";
					        if(hours<0)
					        {
					        	hours+=23;
					        }
					        if(minutes<0)
					        {
					        	minutes+=1439;
					        }
					        if(hours==0)
					        {
					        	departIn=String.valueOf(minutes)+" minutes";
					        }
					        else
					        {
					        	minutes=minutes-(hours*60);
					        	departIn=String.valueOf(hours)+" hours and "+String.valueOf(minutes)+" minutes";
					        }
					        GreenLine greenLine=new GreenLine();
					        greenLine.setDepartingIn(departIn);
					        String dest=trainDetails.getDestination();
					        greenLine.setDestination(dest);
					        greenLinesList.add(greenLine);
						}
					}
					else if(trainCount>=10)
					{
						break;
					}
			}
		}
        trainResponseDto.setYellowLine(yellowLineList);
        trainResponseDto.setRedLine(redLineList);
        trainResponseDto.setBlueLine(blueLineList);
        trainResponseDto.setGreenLine(greenLinesList);
        log.info("final response >>> "+mapper.writeValueAsString(trainResponseDto));
		
		return new ResponseEntity(trainResponseDto, HttpStatus.OK);
	}
	
}
