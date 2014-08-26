package pl.alkom.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.alkom.spring.model.Person;

@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(Model model) {

        Person person = new Person();
        person.setName("Katarzyna");
        person.setSurname("Góralczyk");

        model.addAttribute("person", person);
		return "index";
	}
}