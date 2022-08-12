package dev.springrunner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;

@Controller
public class HelloController {
	//url 요청을 처리해 주기 위한 메소드
	//@RequestMapping 붙어서 웹의 요청을 처리해 주는 메소드를 '핸들러'라고 한다.
	//반드시 핸들러의 결과로 spring은 Model과 View을 반환해 주기를 기대합니다.
	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam("name") String name) {
		//Modle
		HelloModel model = new HelloModel(name);
		
		//view
		View view = new JstlView("/WEB-INF/templates/HelloView.jsp");
		
		//ModelAndView 생성 및 초기화
		ModelAndView mav = new ModelAndView();
		//Modle을 가져왔으니 ModleAndView 객체에 담는다.
		mav.addObject("hello", model);
		mav.setView(view);
		
		return mav;
	}
	
}
