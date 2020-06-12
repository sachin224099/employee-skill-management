package com.techdynamics.employeeskillmanagement.controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import com.techdynamics.employeeskillmanagement.Service.SkillService;
import com.techdynamics.employeeskillmanagement.entity.Skill;
import com.techdynamics.employeeskillmanagement.security.JwtUtil;

@WebMvcTest(SkillController.class)
public class SkillControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private SkillService skillService;
	@MockBean
	private UserDetailsService myUserDetailsService;
	@MockBean
	private JwtUtil jwtUtil;

	@Test
	@WithMockUser
	public void testGetAll() throws Exception {
		Skill java = Skill.builder().id(1L).skillName("Java").build();
		Skill angular = Skill.builder().id(2L).skillName("Angular").build();

		List<Skill> skills = new ArrayList<>();

		skills.add(java);
		skills.add(angular);

		when(skillService.getAll()).thenReturn(skills);

		mockMvc.perform(get("/rest/api/skills")).andExpect(status().isOk())
				.andExpect(jsonPath("$[0].skillName", is(java.getSkillName())))
				.andExpect(jsonPath("$[1].skillName", is(angular.getSkillName())));

	}

}
