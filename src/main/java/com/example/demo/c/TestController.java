package com.example.demo.c;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.TestService;


@RestController
@RequestMapping("/api/")

public class TestController {
	@Autowired TestService objTestService;
	@RequestMapping(value="test",method=RequestMethod.GET)
	public ResponseEntity<?> test(@RequestParam Map<String, Integer> requestParam) throws Exception
	{
	//requestParam.put("Status", "vikki");
  //requestParam.put("Status", objTestService.add());
		requestParam.put("add", objTestService.add());
        requestParam.put("add", objTestService.sub());
		requestParam.put("add", objTestService.mul());
		requestParam.put("add", objTestService.div());
                                                                                        
	return new ResponseEntity<>(requestParam, HttpStatus.OK);
	}
	
}
