package com.qiu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewAction {

	@RequestMapping("/news")
	public ModelAndView showNews() {
		ModelAndView andView = new ModelAndView("news");
		andView.addObject("content", "新闻项目");
		return andView;
	}

	@RequestMapping("/newDetail")
	public ModelAndView showNewsDetail(@RequestParam(value = "Id", required = false) String Id) {
		ModelAndView andView = new ModelAndView("news");
		if (Id == null) {
			andView.addObject("content", "这是新闻列表页面, 没有 ID 参数");
		} else {
			andView.addObject("content", "这是新闻页面, id 是: " + Id);
		}
		return andView;
	}
}
