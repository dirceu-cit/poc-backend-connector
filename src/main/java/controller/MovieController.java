package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/movie")
public class MovieController {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public @ResponseBody String getMovie(@PathVariable final String name) {

		return "The movie is: " + name;
	}

}