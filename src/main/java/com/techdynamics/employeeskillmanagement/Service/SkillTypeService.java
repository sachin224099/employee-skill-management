/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.SkillType;
import com.techdynamics.employeeskillmanagement.repository.SkillTypeRepository;

/**
 * @author syadav
 *
 */
@Service
public class SkillTypeService extends BaseService<SkillType> {

	public SkillTypeService(SkillTypeRepository skillTypeRepository) {
		super(skillTypeRepository);
	}

}
