package aaa.controll;

import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.Member;
import aaa.model.Person;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("request")
public class RequestController {
	
	@RequestMapping("attr1")
	ModelAndView attr1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("req/attr");
		mav.addObject("age",29);
		mav.addObject("pname","무야호");
		mav.addObject("jum", new int [] {78,89,34});
		mav.addObject("now", new Date());
		mav.addObject("per", new Person("장동건", "남", true));
		return mav;
	}
	
	@RequestMapping("attr2")
	String attr2(HttpServletRequest request) {
		
		request.setAttribute("age",22);
		request.setAttribute("pname","무야호2");
		request.setAttribute("jum", new int [] {11,22,78,89,34});
		request.setAttribute("now", new Date());
		request.setAttribute("per", new Person("장서건", "여", true));
		return "req/attr";
	}
	
	@RequestMapping("attr3")
	String attr3(Model mm) {
		
		mm.addAttribute("age",22);
		mm.addAttribute("pname","무야호2");
		mm.addAttribute("jum", new int [] {11,22,78,89,34});
		mm.addAttribute("now", new Date());
		mm.addAttribute("per", new Person("장서건", "여", true));
		return "req/attr";
	}
	
	@RequestMapping("attr4")
	String attr4(Model mm, @ModelAttribute("age") int age,
						   @ModelAttribute("pname") String nick,
						   @ModelAttribute("age") int [] jum ) {
		System.out.println("age:"+age);
		System.out.println("nick:"+nick);
		System.out.println("jum:"+Arrays.toString(jum));
		
		mm.addAttribute("jum", new int [] {11,22,78,89,34});
		mm.addAttribute("now", new Date());
		mm.addAttribute("per", new Person("장서건", "여", true));
		return "req/attr";
	}
	
	@RequestMapping("attrForm")
	String attrForm() {
		return"req/attrForm";
	}
	
	@RequestMapping("attrReg")
	String attrReg( 
			 @ModelAttribute("age") int age,
			 @ModelAttribute("pname") String pname,
			 int [] jum,
			 String gender,
			 boolean mil,
			 Person per) {

		System.out.println("age:"+age);
		System.out.println("pname:"+pname);
		System.out.println("jum:"+Arrays.toString(jum));
		System.out.println("gender:"+gender);
		System.out.println("mil:"+mil);
		System.out.println("per:"+per);
		return "req/attrReg";
	}
	
	@RequestMapping("joinForm")
	String joinForm() {
		return"req/joinForm";
	}
	
	@RequestMapping("joinReg")
	String joinReg(
			@ModelAttribute("id") String id,
			@ModelAttribute("pw") String pw,
			@ModelAttribute("name") String name,
			@ModelAttribute("age") int age,
			@ModelAttribute("address") String address,
			@ModelAttribute("tel") String tel,
			Member member) {
		
		System.out.println("id:"+id);
		System.out.println("pw:"+pw);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("address:"+address);
		System.out.println("tel:"+tel);
		System.out.println("member : "+member);
		return "req/joinReg";
	}
	
}
