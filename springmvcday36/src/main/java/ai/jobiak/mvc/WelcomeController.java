package ai.jobiak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller//is a stereo type annotation @Component,@service,@Conttroller,@Respository
public class WelcomeController {
	@RequestMapping(value="gone",method=RequestMethod.GET)
	public String message(ModelMap map) {
	map.put("msg1", "Welcome to Spring MVC Programming");
	map.put("msg2", "Spring for limitless options");
	map.put("toungeTwister", "Betty Botter bought some butter. ");
	return "welcome";//template
}
}