package javaTraining.springboot_thymeleaf_crud_web_app.repository;

import javaTraining.springboot_thymeleaf_crud_web_app.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
