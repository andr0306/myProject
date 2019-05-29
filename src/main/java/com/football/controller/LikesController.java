package com.football.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LikesController {
	@RequestMapping(value = "/greeting",  method = RequestMethod.POST)
	public StringResponse greeting(
		@RequestParam(value="name", defaultValue="World") String name,
		@RequestParam(value="email", defaultValue="World") String email
		) {
		StringResponse a = new StringResponse(name);
		System.out.println(email + name);
//		return "Hello" + a.get;
		return a;
    }
	
//	private void updateLikes () {
////		Petition.update()
//	}
}

class StringResponse {

    private String response;
    private int nums;

    public StringResponse(String s) { 
       this.response = s;
       this.nums = 0;
    }

    
    
    public String getString() {
    	return this.response;
    }
    
    public int getNum() {
    	return this.nums;
    }
    // get/set omitted...
}