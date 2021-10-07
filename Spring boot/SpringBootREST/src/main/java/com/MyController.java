package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@RequestMapping(value = "say",method = RequestMethod.GET)
	public String sayHello() {
		return "Welcome to Spring REST Controller Example";
	}
	@RequestMapping(value = "html",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtml() {
		return "<font color=red>Welcome to Spring REST Controller Example</font>";
	}
	@RequestMapping(value = "text",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlainText() {
		return "<font color=red>Welcome to Spring REST Controller Examplefont>";
	}
	@RequestMapping(value = "xml",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_XML_VALUE)
	public String sayXml() {
		return "<a>Welcome to Spring REST Controller Example</a>";
	}
}
