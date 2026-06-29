package com.zeus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String gohome(Model model,@ModelAttribute BoardDTO boardDTO) {
		log.info("/test/gohome1 userId = "+ boardDTO.toString());
		
		return "test/gohome1";
	}
}
