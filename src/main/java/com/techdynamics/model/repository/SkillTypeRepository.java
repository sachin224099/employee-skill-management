/**
 * 
 */
package com.techdynamics.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techdynamics.model.entity.SkillType;

/**
 * @author syadav
 *
 */
@Repository
public interface SkillTypeRepository extends JpaRepository<SkillType, Long>{

}
