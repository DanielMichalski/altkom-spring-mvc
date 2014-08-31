package pl.alkom.spring.controller;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.alkom.spring.util.log.AutowiredLogger;

@Controller
@RequestMapping("/")
public class IndexController {

    @AutowiredLogger
    private Logger logger;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
        return "index";
	}
}