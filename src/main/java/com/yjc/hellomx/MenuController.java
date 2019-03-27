package com.yjc.hellomx;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/main/*")
public class MenuController {
	@GetMapping("")
	public String main(Locale locale,Model model) {
		return "main";
	}
}
