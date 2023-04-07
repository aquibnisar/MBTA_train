package com.train.mbta.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.train.mbta.dataLayer.TrainResponseDto;
import com.train.mbta.service.MbtaService;
import com.train.mbta.utility.TrainDataLoader;
import static com.train.mbta.utility.ConstantVariables.*;

@RestController
public class MbtaController {
	private static final Logger log = LoggerFactory.getLogger(MbtaController.class);

	@Autowired
	MbtaService mbtaService;
	
	@GetMapping(value = GET_TRAIN_DATA_URL,produces = "application/json")
	public ResponseEntity<TrainResponseDto> trainData() throws JsonProcessingException
	{
		log.info("Controller URL call >>> "+GET_TRAIN_DATA_URL);
		return mbtaService.getTrainData();
	}
}
