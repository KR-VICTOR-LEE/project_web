package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	String homeGo()	{
		System.out.println();
		//return "homehome";
		return "index";
		
		/*
		  application.yaml 설정
		  Server : 
		    port : 80
		  spring : 
			  thymeleaf:
			    prefix : views/
			    suffix : .html
			    cache : false 
		 */
	}
}
