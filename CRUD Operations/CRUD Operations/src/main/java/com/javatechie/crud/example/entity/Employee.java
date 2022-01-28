package com.javatechie.crud.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Employee_Table")
public class Employee {

    @Id
    @NotNull
    private int id;
    @NotNull
    @Size(min = 3, max = 10)
    private String name;
    
    public Employee() {
		super();
	}
	public Employee(int id, String name, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
	}
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
}
