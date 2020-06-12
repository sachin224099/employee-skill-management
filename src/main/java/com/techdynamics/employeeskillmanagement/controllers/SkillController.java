package com.techdynamics.employeeskillmanagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techdynamics.employeeskillmanagement.Service.SkillService;
import com.techdynamics.employeeskillmanagement.entity.Skill;

/**
 * @author syadav
 *
 */
@RestController
@RequestMapping(path ="/rest/api/skills")
public class SkillController extends BaseController<Skill>{
	
	public SkillController(SkillService skillService) {
		super(skillService);
	}
}
