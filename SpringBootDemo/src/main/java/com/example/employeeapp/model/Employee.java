package com.example.employeeapp.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
@Data // Lombok generates getters, setters, etc.
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(length = 15)
    private String phoneNumber;

    @Column(nullable = false)
    private LocalDate hire_date;

    @Column(length = 50)
    private String jobTitle;

    private Integer departmentId;

    private Double salary;

    private Long managerId;

    @Column(nullable = false, updatable = false)
    private LocalDate created_at = LocalDate.now();

    @Column(nullable = false)
    private LocalDate updated_at = LocalDate.now();

	public Long getEmployeeId() {
		return employee_id;
	}

	public void setEmployeeId(Long employeeId) {
		this.employee_id = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getHireDate() {
		return hire_date;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hire_date = hireDate;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public LocalDate getCreatedAt() {
		return created_at;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.created_at = createdAt;
	}

	public LocalDate getUpdatedAt() {
		return updated_at;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updated_at = updatedAt;
	}
}
