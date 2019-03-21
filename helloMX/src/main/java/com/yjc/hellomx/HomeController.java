package com.yjc.hellomx;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yjc.hellomx.domain.CustomerVO;
import com.yjc.hellomx.service.CustomerService;
import lombok.AllArgsConstructor;

/**
 * Handles requests for the application home page.
 */
@Controller
@AllArgsConstructor
public class HomeController {
	
	
	private CustomerService customerService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET) // value 가 url pattern, method는 get아니면 post
	public String home(Locale locale, Model model) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );	//request.setAttribute와 같은 것
//		model.addAttribute("list",customerService.getList());
		return "home";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.POST) // value 가 url pattern, method는 get아니면 post
	public String insert(CustomerVO dto,Model model) {
		Date date = new Date();
		dto.setBirthday(date);
		dto.setRegdate(new Timestamp(date.getTime()));
//		model.addAttribute("insert",customerService.insertList(dto));
		return "redirect:/";
	}
	@RequestMapping(value = "/info", method = RequestMethod.GET) // value 가 url pattern, method는 get아니면 post
	public String info(Model model) {
		return "info";
	}
	@RequestMapping(value = "/menu", method = RequestMethod.GET) // value 가 url pattern, method는 get아니면 post
	public String menu(Model model) {
		return "menu";
	}
	@RequestMapping(value = "/membership", method = RequestMethod.GET) // value 가 url pattern, method는 get아니면 post
	public String membership(Model model) {
		return "membership";
	}
	@RequestMapping(value = "/customer/{cid}", method = RequestMethod.GET) // value 가 url pattern, method는 get아니면 post
	public String getCustomer(@PathVariable String cid,Model model) {
		model.addAttribute("customer",customerService.get(cid));
		return "customer::customerInfo";
	}
//	public String insertAnno(CustomerAnnoTest dto,Model model) {
//		Date date = new Date();
//		dto.setBirthday(date);
//		dto.setRegdate(new Timestamp(date.getTime()));
//		logger.info(dto.toString());
//		model.addAttribute("insert",customerService.insertList(dto));
//		return "redirect:/";
//	}
}
