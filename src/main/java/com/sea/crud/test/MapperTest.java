package com.sea.crud.test;
import java.util.UUID;
import java.util.concurrent.SynchronousQueue;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.sea.crud.bean.Department;
import com.sea.crud.bean.Employee;
import com.sea.crud.dao.DepartmentMapper;
import com.sea.crud.dao.EmployeeMapper;
import com.sea.crud.service.EmployeeService;
/* 
 * 测试Dao层的工作
 * 使用Spring单元测试  自动注入需要的组件
 * 使用@ContextConfiguration指定Spring配置文件的位置
 * 直接AutoWired组件即可
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MapperTest {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	SqlSession sqlSession;
	@Autowired
	EmployeeService employeeService;
	@Test
	public void testCRUD() {
		//employeeMapper.insert(new Employee(null,"tanbosea@qq.com","女","zztam",1));
		//System.out.println(employeeMapper);
//		employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
//		for (int i = 0; i <1000; i++) {
//			String uid=UUID.randomUUID().toString().substring(0,5)+i;
//			employeeMapper.insertSelective(new Employee(null, uid+"@tanbosea", "M", uid, 1));
//		}
		//System.out.println(employeeService.getAll().size());
		System.out.println(employeeService.getAll().get(1));
		//System.out.println(employeeMapper.selectByPrimaryKey(1));
	}	
}
