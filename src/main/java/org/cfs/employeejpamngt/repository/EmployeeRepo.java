package org.cfs.employeejpamngt.repository;

import org.cfs.employeejpamngt.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
