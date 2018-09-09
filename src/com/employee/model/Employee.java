package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Tbl")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String address;
	
	@Column
	private String Department;
	
	@Column
	private String Salary;
	
	@Column
	private String Location;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public Employee() {
		super();
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public Employee(int id, String name, String address, String department, String salary, String location) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		Department = department;
		Salary = salary;
		Location = location;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", Department=" + Department
				+ ", Salary=" + Salary + ", Location=" + Location + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Department == null) ? 0 : Department.hashCode());
		result = prime * result + ((Location == null) ? 0 : Location.hashCode());
		result = prime * result + ((Salary == null) ? 0 : Salary.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Department == null) {
			if (other.Department != null)
				return false;
		} else if (!Department.equals(other.Department))
			return false;
		if (Location == null) {
			if (other.Location != null)
				return false;
		} else if (!Location.equals(other.Location))
			return false;
		if (Salary == null) {
			if (other.Salary != null)
				return false;
		} else if (!Salary.equals(other.Salary))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}