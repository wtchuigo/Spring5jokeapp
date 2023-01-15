/**
 * 
 */
package wtchuigo.springframework.spring5jokeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import wtchuigo.springframework.spring5jokeapp.service.JokeService;

/**
 * @author Tchuigoua
 *
 */
@Controller
public class JokeController {

	private final JokeService jokeService;
	
	/**
	 * @param jokeService
	 */
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"", ""})
	public String showJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "index";
	}

}
