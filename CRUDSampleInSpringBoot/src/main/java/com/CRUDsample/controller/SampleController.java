package com.CRUDsample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.CRUDsample.model.EntitySample;
import com.CRUDsample.repository.SampleRepository;

@Controller
public class SampleController {
	
	@Autowired
	private SampleRepository sampleRepository; 

	@GetMapping("/list")
	public String getAll(Model model)
	{
		List<EntitySample> list=sampleRepository.findAll();
		System.out.println(list);
		model.addAttribute("name_list",list );
		return "all";
	}
}
