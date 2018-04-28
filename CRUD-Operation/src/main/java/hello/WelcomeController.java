package hello;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@Value("${application.message:Hello World}")
	private String helloMessage;
	
	@RequestMapping("/")
	String welcome(Map<String, String> model) {
		
		model.put("message", helloMessage);
		return "welcome";
	}
}