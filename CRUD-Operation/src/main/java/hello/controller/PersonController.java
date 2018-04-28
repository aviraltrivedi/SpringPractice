package hello.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import hello.interfaces.PersonService;
import hello.model.Person;

@Profile("dev")
@Controller
public class PersonController {

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/addPerson")
	public ModelAndView viewAddPage(HttpServletRequest request, HttpServletResponse response, Person person) {
		System.out.println("I am here");
		ModelAndView modelAndView = new ModelAndView();
		String name = request.getParameter("personName");
		System.out.println(name);
		if (name != null) {
			person.setPersonName(name);
		}
		personService.addPerson(person);
		modelAndView.addObject("person", person);
		modelAndView.setViewName("addPerson");
		return modelAndView;
	}

	public ModelAndView addPerson() {
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}
}
