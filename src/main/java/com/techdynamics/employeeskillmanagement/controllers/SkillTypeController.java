package com.techdynamics.employeeskillmanagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techdynamics.employeeskillmanagement.Service.SkillTypeService;
import com.techdynamics.employeeskillmanagement.entity.SkillType;

/**
 * @author syadav
 *
 */
@RestController
@RequestMapping(path ="/rest/api/skilltype")
public class SkillTypeController extends BaseController<SkillType>{
	
	public SkillTypeController(SkillTypeService skillTypeService) {
		super(skillTypeService);
	}
}
