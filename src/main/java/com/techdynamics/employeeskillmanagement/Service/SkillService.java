/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.Address;
import com.techdynamics.employeeskillmanagement.entity.Skill;
import com.techdynamics.employeeskillmanagement.repository.SkillRepository;


/**
 * @author aditya raj
 *
 */

@Service
public class SkillService implements IService<Skill> {

	@Autowired
	private SkillRepository skillRepository;

	@Override
	public List<Skill> getAll() {
		List<Skill> list = new ArrayList<>();
		 skillRepository.findAll()
		                 .forEach(skill -> list.add(skill));
      return list;
	}

	@Override
	public Skill getById(Long id) {
		return skillRepository.findById(id).orElse(null);
	}

	@Override
	public void update(Skill entity) {
		skillRepository.save(entity);

	}

	@Override
	public void save(Skill entity) {
		skillRepository.save(entity);

	}

	@Override
	public void removeById(Long id) {
		skillRepository.deleteById(id);

	}

	@Override
	public void remove(Skill entity) {
		skillRepository.delete(entity);

	}

}
