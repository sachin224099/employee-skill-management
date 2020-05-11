/**
 * 
 */
package com.techdynamics.employeeskillmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techdynamics.employeeskillmanagement.entity.Employee;
import com.techdynamics.employeeskillmanagement.entity.Skill;

/**
 * @author syadav
 *
 */

public interface SkillRepository extends JpaRepository<Skill, Long>{
	List<Skill> findByEmployee(Employee employee);

}
