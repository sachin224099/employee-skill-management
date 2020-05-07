/**
 * 
 */
package com.techdynamics.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techdynamics.model.entity.SkillType;
import com.techdynamics.model.repository.SkillTypeRepository;

/**
 * @author syadav
 *
 */
public class SkillTypeService implements Service<SkillType> {
	
	@Autowired
	private SkillTypeRepository skillTypeRepository;

	@Override
	public List<SkillType> getAll() {
		return skillTypeRepository.findAll();
	}

	@Override
	public SkillType getById(Long id) {
		
		return skillTypeRepository.getOne(id);
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
