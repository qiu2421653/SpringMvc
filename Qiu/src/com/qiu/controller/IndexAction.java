package com.qiu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * First SpringMvc
 * 
 * @author Administrator
 *
 */
public class IndexAction implements Controller {

	private String view;

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new ModelAndView(view);
		modelAndView.addObject("hello", "First SpringMvc");
		return modelAndView;
	}
}
