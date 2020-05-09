/**
 * 
 */
package com.techdynamics.employeeskillmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techdynamics.employeeskillmanagement.entity.Skill;

/**
 * @author syadav
 *
 */

public interface SkillRepository extends JpaRepository<Skill, Long>{

}
