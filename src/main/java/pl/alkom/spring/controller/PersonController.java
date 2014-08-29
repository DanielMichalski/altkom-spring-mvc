package pl.alkom.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.alkom.spring.model.Person;
import pl.alkom.spring.repositories.PersonRepository;
import pl.alkom.spring.repositories.TeamRepository;

import javax.validation.Valid;

/**
 * Author: Daniel
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private TeamRepository teamRepository;

    @RequestMapping("/add")
    public String addPerson(Model model) {
        model.addAttribute("person", new Person());
        model.addAttribute("teams", teamRepository.findAll());
        return "add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePerson(@Valid Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add";
        }
        personRepository.save(person);
        return "redirect:/";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        Iterable<Person> peoples = personRepository.findAll();
        model.addAttribute("peoples", peoples);
        return "personList";
    }

    @RequestMapping("/edit")
    public String edit(@RequestParam("id") Long id, Model model) {

        Person person = personRepository.findOne(id);
        model.addAttribute("person", person);
        model.addAttribute("teams", teamRepository.findAll());

        return "add";
    }

    @RequestMapping("/messages/{personId}")
    public String showMessages(@PathVariable Long personId, Model model) {
        model.addAttribute("person", personRepository.findOne(personId));
        return "message_list";
    }

}
