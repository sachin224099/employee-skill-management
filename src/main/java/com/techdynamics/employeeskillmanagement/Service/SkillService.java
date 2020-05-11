/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.Employee;
import com.techdynamics.employeeskillmanagement.entity.Skill;
import com.techdynamics.employeeskillmanagement.repository.SkillRepository;


/**
 * @author aditya raj
 *
 */

@Service
public class SkillService extends BaseService<Skill> {

	private SkillRepository skillRepository;
	public SkillService(SkillRepository skillRepository) {
		super(skillRepository);
		this.skillRepository= skillRepository;
	}

	public List<Skill> getSkillsByEmployee(Employee employee){
		return skillRepository.findByEmployee(employee);
	}
	
}
