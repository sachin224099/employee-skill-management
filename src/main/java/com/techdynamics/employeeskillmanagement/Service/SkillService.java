/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.Skill;
import com.techdynamics.employeeskillmanagement.repository.SkillRepository;


/**
 * @author aditya raj
 *
 */

@Service
public class SkillService extends BaseService<Skill> {

	public SkillService(SkillRepository skillRepository) {
		super(skillRepository);
	}

	
}
