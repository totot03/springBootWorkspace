package com.zeus.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zeus.dto.Address;
import com.zeus.dto.BoardDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TestController {

	@GetMapping("/test/posthome")
	public void posthome() {		
	}

	@RequestMapping(value = "/test/gohome1", method = RequestMethod.POST)
//	@ResponseBody
	public String gohome(Model model, @ModelAttribute BoardDTO bd) {
		log.info("/test/gohome1 userId = "+ bd.toString());
		if(bd.getHobby() != null) {
			log.info("bd.getHobby().size() = "+ bd.getHobby().size());			
		}
		return "test/gohome1";
	}

	@RequestMapping(value = "/test/gohome1", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Address> gohomeGet(Model model, @ModelAttribute BoardDTO bdo) {
		ArrayList<Address> addressList = bdo.getAddress();
		log.info("/test/gohome1 userId = "+ bdo.getAddress().toString());
		
		return addressList;
	}
}
