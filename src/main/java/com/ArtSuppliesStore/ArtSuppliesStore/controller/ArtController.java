package com.ArtSuppliesStore.ArtSuppliesStore.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.ArtSuppliesStore.ArtSuppliesStore.entity.Art;
import com.ArtSuppliesStore.ArtSuppliesStore.entity.MyArtList;
import com.ArtSuppliesStore.ArtSuppliesStore.service.ArtService;
import com.ArtSuppliesStore.ArtSuppliesStore.service.MyArtListService;




@Controller
public class ArtController {
	
	@Autowired
	private ArtService service;
	
	@Autowired
	private MyArtListService myArtService;
	
	@GetMapping("/home")
	public String home()
	{
		
		return "home";
	}
	
	@GetMapping("/art_register")
	public String artRegister()
	{
		return "artRegister";
	}
	
	@GetMapping("/available_arts")
	public ModelAndView getAllArts()
	{
		List<Art> list =service.getAllArts();
//		ModelAndView m = new ModelAndView();
//		m.setViewName("artList");
//		m.addObject("art",list);
		return new ModelAndView("artList","art",list);
	}
	
	@PostMapping("/save")
	public String addArt(@ModelAttribute Art a)
	{
		service.save(a);
		return "redirect:/available_arts";
		
	}
	
	@GetMapping("/my_arts")
	public String getMyArts(Model model)
	{
		List<MyArtList> list = myArtService.getAllMyArts();
		model.addAttribute("art", list);
		return "myArts";
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id)
	{
		Art a = service.getArtById(id);
		MyArtList ab = new MyArtList(a.getId(),a.getName(),a.getSeller(),a.getPrice());
		myArtService.saveMyArts(ab);
		return "redirect:/my_arts";
	}
	
	@RequestMapping("/editArts/{id}")
	public String editArts(@PathVariable("id") int id, Model model)
	{
		Art a = service.getArtById(id);
		model.addAttribute("art",a);
		return "artEdit";
	}
	
	@RequestMapping("/deleteArts/{id}")
	public String deleteArts(@PathVariable("id") int id, Model model)
	{
		service.deleteById(id);
		return "redirect:/available_arts";
	}

}

