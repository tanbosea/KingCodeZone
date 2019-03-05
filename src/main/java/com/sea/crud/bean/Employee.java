package com.sea.crud.bean;

public class Employee {
    private Integer empId;

    private String email;

    private String gender;

    private String empName;

    private Integer dId;
    
    public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	private  Department department;
    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", email=" + email + ", gender=" + gender + ", empName=" + empName
				+ ", dId=" + dId + "]";
	}

	public Employee(Integer empId, String email, String gender, String empName, Integer dId) {
		super();
		this.empId = empId;
		this.email = email;
		this.gender = gender;
		this.empName = empName;
		this.dId = dId;
	}

	public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
}