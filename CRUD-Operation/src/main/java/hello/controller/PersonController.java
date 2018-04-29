package hello.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import hello.model.Person;
import hello.service.PersonServiceImpl;

@Profile("dev")
@Controller
public class PersonController {
		
	@Autowired
	PersonServiceImpl personServiceProp;
	
	
	@RequestMapping(value = "/addPerson")
	public ModelAndView viewAddPage(HttpServletRequest request, HttpServletResponse response, Person person) {
		System.out.println("I am in controller: method viewAddPage");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("person", person);
		modelAndView.setViewName("addPerson");
		return modelAndView;
	}
	
	@RequestMapping(value = "/addedPerson")
	public ModelAndView addPerson(HttpServletRequest request, HttpServletResponse response, Person person) {
		System.out.println("I am in controller: method addPerson");
		ModelAndView modelAndView = new ModelAndView();
		try {
			personServiceProp.addPerson(person);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		modelAndView.setViewName("addedPerson");
		return modelAndView;
	}
}
