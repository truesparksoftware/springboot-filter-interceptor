package com.cts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cont")
public class MsgController {

	
	@GetMapping("/msg")
	public String getMessage() {
		String msg="get message...";
		
		return msg;
	}
}
