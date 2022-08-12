package dev.springrunner;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

public class HelloModel {
	
	private String name;
	
	//사용자 지정 날짜 포멧
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date currentDatetime;
	
	//생성자를 통해서 현재 이름이 무엇인지 받아 올 것이다.
	HelloModel(String name) {
		if(StringUtils.hasText(name)) {
			this.name = name;
		} else {
			this.name = "스프링 웹 애플리케이션";
		}
		this.currentDatetime = new Date();
	}

	//날짜 시간 값을 꺼내 쓰기 위해서 getter을 생성
	public String getName() {
		return name;
	}

	public Date getCurrentDatetime() {
		return currentDatetime;
	}
	
}
