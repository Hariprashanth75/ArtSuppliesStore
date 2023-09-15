package com.ArtSuppliesStore.ArtSuppliesStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ArtSuppliesStore.ArtSuppliesStore.entity.MyArtList;
import com.ArtSuppliesStore.ArtSuppliesStore.repository.MyArtRepository;

@Service
public class MyArtListService {
	
	@Autowired
	private MyArtRepository myart;
	
	
	public void saveMyArts(MyArtList art)
	{
		myart.save(art);
		
	}
	
	public List<MyArtList> getAllMyArts()
	{
		return myart.findAll();
	}
	
	public void deleteById(int id)
	{
		myart.deleteById(id);
	}

}
