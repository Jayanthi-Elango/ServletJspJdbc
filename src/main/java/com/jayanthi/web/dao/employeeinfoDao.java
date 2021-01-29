package com.jayanthi.web.dao;

import com.jayanthi.web.model.employeeinfo;

public class employeeinfoDao {
	public employeeinfo getemployeeinfo(int user_id)
	{
		employeeinfo e= new employeeinfo();
		e.setAddress("fff");
		e.setFname("hhhh");
		e.setLname("lll");
		return e;
	}
	

}
