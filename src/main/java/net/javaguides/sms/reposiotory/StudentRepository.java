package net.javaguides.sms.reposiotory;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> 
{

	

	

}
