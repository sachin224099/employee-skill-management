/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.SkillType;
import com.techdynamics.employeeskillmanagement.repository.SkillTypeRepository;

/**
 * @author syadav
 *
 */
@Service
public class SkillTypeService implements IService<SkillType> {

	@Autowired
	private SkillTypeRepository skillTypeRepository;

	@Override
	public List<SkillType> getAll() {
		List<SkillType> list = new ArrayList<>();
		 skillTypeRepository.findAll()
		 .forEach(skillT -> list.add(skillT));
		 return list;
	}

	@Override
	public SkillType getById(Long id) {
		return skillTypeRepository.findById(id).orElse(null);
	}

	@Override
	public void update(SkillType entity) {
		skillTypeRepository.save(entity);
	}

	@Override
	public void save(SkillType entity) {
		skillTypeRepository.save(entity);
	}

	@Override
	public void removeById(Long id) {
		skillTypeRepository.deleteById(id);
	}

	@Override
	public void remove(SkillType entity) {
		skillTypeRepository.delete(entity);
	}

}