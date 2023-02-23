package com.unit.unit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unit.unit.service.Service;

@RestController
@RequestMapping("/get")
public class SampleControler {

   @Autowired	
  private	Service service;


 @GetMapping("/data")
public ResponseEntity<String> getData(){
 
 String srt=	service.getData();
	return ResponseEntity.ok(srt);
}
	
}
