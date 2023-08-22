package aaa.controll;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.Member;
import ch.qos.logback.classic.spi.STEUtil;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("login")
public class loginController {
	
	@RequestMapping("loginReg")
	String make(HttpServletResponse response, String pid, String pw) {
		ArrayList<Member> members = new ArrayList<>();
		members.add(new Member("aaa", "장동건", "1111"));
		
		ModelAndView mav = new ModelAndView("login/loginAlert");
		String msg = "로그인 실패";
		
		
		return "login/login";
	}
	
	
	
	@RequestMapping("login")
	String login(Model mm,
			HttpServletResponse response,
			@CookieValue(value = "pid", defaultValue = "")String pid,
			@CookieValue(value = "pw", defaultValue = "")String pw) {
		
			if (pid != "" && pw != "") {
				mm.addAttribute("pid", pid);
				mm.addAttribute("pw", pw);
			}
		
		return "login/login";
	}
	
	@RequestMapping("view")
	ModelAndView view(Model mm,
			HttpServletResponse response,
			@CookieValue(value = "pid", defaultValue = "")String pid,
			@CookieValue(value = "pw", defaultValue = "")String pw) {
		ModelAndView mav = new ModelAndView("login/view");
			
		mav.addObject("pid",pid);
		mav.addObject("pw",pw);
		
		return mav ;
	}
	
	@RequestMapping("logout")
	ModelAndView logout(
			@CookieValue(value = "pname") String pname,
			HttpServletResponse response) {
		
		Cookie coo = new Cookie("pid", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		coo = new Cookie("pname", "");
		coo.setMaxAge(0);
		ModelAndView mav = new ModelAndView("login/view");
		mav.addObject("msg", pname+"로그아웃 되었습니다.");
		
		return mav;
	}
}
