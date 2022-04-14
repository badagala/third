package com.example.demo.servicelayer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daolayer.Mobiles;
import com.example.demo.dto.Samsung;

@Service
public class ServiceLayerImpl implements ServiceLayer {
	
	@Autowired
	Mobiles mob;

	@Override
	public Samsung insert(Samsung samsung) {
		
		return mob.save(samsung);
	}

	@Override
	public Samsung retrieve(int ram) {
		
		Optional<Samsung> sam=mob.findById(ram);
		Samsung mysamsung = sam.get();
		
		return mysamsung;
	}

	@Override
	public Samsung update(Samsung samsung) {
		Optional<Samsung> samson = mob.findById(samsung.getRam());
		Samsung ursamsung = samson.get();
		
		if(samsung.getName()!=null && samsung.getName()!="") {
			ursamsung.setName(samsung.getName());	
		}
		if(samsung.getVersion()!=null && samsung.getVersion()!="") {
			ursamsung.setVersion(samsung.getVersion());			
		}
		if(samsung.getColor()!=null && samsung.getColor()!="") {
			ursamsung.setColor(samsung.getColor());
		}
		
		Samsung updatesamsung=mob.save(ursamsung);
		
		return updatesamsung;
	}

	@Override
	public boolean delete(int ram) {
		boolean isDeleted= false;
		try {
			mob.deleteById(ram);
			isDeleted=true;
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}return isDeleted;

	}
	
	
	
	

}
