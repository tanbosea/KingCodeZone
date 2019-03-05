package com.sea.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sea.crud.bean.Department;
import com.sea.crud.dao.DepartmentMapper;

@Service
public class DepartmentService {
	@Autowired
	DepartmentMapper departmentMapper;
	//获取所有部门名字
	public List getDeptsName(){
		List<Department> list=departmentMapper.selectByExample(null);
		return list;
		
	}
}
