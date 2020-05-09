/**
 * 
 */
package com.techdynamics.employeeskillmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techdynamics.employeeskillmanagement.entity.Skill;

/**
 * @author syadav
 *
 */

public interface SkillRepository extends CrudRepository<Skill, Long>{

}
