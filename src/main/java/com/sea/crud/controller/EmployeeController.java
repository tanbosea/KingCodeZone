package com.sea.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sea.crud.bean.Employee;
import com.sea.crud.bean.Msg;
import com.sea.crud.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	/*
	 * 查询所有员工/
	 */
//	@RequestMapping("/emps")
//	public String getEmps(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
//		// 使用一个分页插件 PageHelper
//		PageHelper.startPage(pn, 5);
//		// startPage后面就是分页查询
//		List<Employee> emps = employeeService.getAll();
//		// 把查询到的数据 封装到PageInfo PageInfo自带分页数据
//		PageInfo page = new PageInfo(emps, 5);
//		// 把pageInfo传给前端
//		model.addAttribute("page", page);
//		return "list";
//	}
	@RequestMapping("/index")
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping("/emps")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,HttpServletResponse response) {
		// 使用一个分页插件 PageHelper
		PageHelper.startPage(pn, 5);
		response.setHeader("Access-Control-Allow-Origin", "*"); 
		// startPage后面就是分页查询
		List<Employee> emps = employeeService.getAll();
		// 把查询到的数据 封装到PageInfo PageInfo自带分页数据
		PageInfo page = new PageInfo(emps, 5);
		return Msg.success().add("PageInfo", page);
	}
}
