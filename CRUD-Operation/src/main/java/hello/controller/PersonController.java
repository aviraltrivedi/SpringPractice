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
	
	
	private PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}

	@RequestMapping(value = "/addPerson")
	public ModelAndView viewAddPage(HttpServletRequest request, HttpServletResponse response, Person person) {
		System.out.println("I am in controller: method viewAddPage");
		ModelAndView modelAndView = new ModelAndView();
		/*String name = request.getParameter("personName");
		System.out.println(name);
		if (name != null) {
			person.setPersonName(name);
		}
		personService.addPerson(person);
		*/modelAndView.addObject("person", person);
		modelAndView.setViewName("addPerson");
		return modelAndView;
	}

	@RequestMapping(value = "/addedPerson")
	public ModelAndView addPerson(HttpServletRequest request, HttpServletResponse reponse, Person person) throws Exception {
		System.out.println("I am in controller: method addPerson");
		ModelAndView modelAndView = new ModelAndView();
		String name = request.getParameter("personName");
		System.out.println(name);
		person.setPersonName(name);
		personService.addPerson(person);
		modelAndView.setViewName("addedPerson");
		return modelAndView;
	}
}
