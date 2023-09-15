package com.ArtSuppliesStore.ArtSuppliesStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ArtSuppliesStore.ArtSuppliesStore.service.MyArtListService;

@Controller
public class MyArtListController {
	
	@Autowired
	private MyArtListService service;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id)
	{
		service.deleteById(id);
		return "redirect:/my_arts";
	}

}
