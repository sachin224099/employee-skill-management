package com.techdynamics.employeeskillmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techdynamics.employeeskillmanagement.Service.SkillTypeService;
import com.techdynamics.employeeskillmanagement.entity.SkillType;

@RestController
@RequestMapping(path ="/rest/api/skilltype")
public class SkillTypeController {

	@Autowired
	private SkillTypeService skillTypeService;
	

	@RequestMapping(method = RequestMethod.GET)
	public List<SkillType> getAllSkillType(){
		return skillTypeService.getAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public SkillType getSkillTypeById(@PathVariable Long id) {
		return skillTypeService.getById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addSkillType(@RequestBody SkillType skillType) {
		skillTypeService.save(skillType);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void updateSkillType(@RequestBody SkillType skillType) {
		skillTypeService.update(skillType);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void removeSkillType(@PathVariable Long id) {
		skillTypeService.removeById(id);
	}
}
