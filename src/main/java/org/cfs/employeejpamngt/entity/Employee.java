package org.cfs.employeejpamngt.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

@JsonPropertyOrder
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,length = 30)
    private String name;

    @Column(nullable = false,length = 30)
    private String email;

    @Column(nullable = false,length = 50)
    private String department;

    @Column(nullable = false)
    private Double salary;

    @Transient
    private String tmp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getTmp() {
        return tmp;
    }

    public void setTmp(String tmp) {
        this.tmp = tmp;
    }

    public Employee() {

    }

    public Employee(String department, String email, Integer id, String name, Double salary, String tmp) {
        this.department = department;
        this.email = email;
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.tmp = tmp;
    }

}
