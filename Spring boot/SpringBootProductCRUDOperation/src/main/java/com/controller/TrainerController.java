package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Trainer;
import com.service.TrainerService;

@RestController
public class TrainerController {

	@Autowired
	TrainerService trainerService;
	
	@RequestMapping(value = "storeTrainer",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeTrainerInformation(@RequestBody Trainer trainer) {
		return trainerService.stroreTrainerInfo(trainer);
	}
	
	@RequestMapping(value = "trainerAndStudentInfo",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Object[]> retrieveJoin() {
		return trainerService.retrieveJoinInfo();
	}
}




