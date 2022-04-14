package com.example.demo.frontcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Mobile;
import com.example.demo.dto.Samsung;
import com.example.demo.servicelayer.ServiceLayer;

@RestController
public class FrontController {
	
	@Autowired
	ServiceLayer service;
	
	@PostMapping("/insert")
	@ResponseBody
	public Mobile add(@RequestBody Samsung samsung) {
		Mobile mob = new Mobile();
		if(service.insert(samsung)!=null) {
			mob.setStatuscode(200);
			mob.setMsg("successful");
			mob.setDesc("Mobile inserted successfully");
		}else {
			mob.setStatuscode(400);
			mob.setMsg("Failed");
			mob.setDesc("Unable to insert");
			
		}return mob;
		
	}
		
		@GetMapping("/fetch/{ram}")
		public Mobile get(@PathVariable("ram") int ram) {
			Mobile mobi = new Mobile();
			Samsung oursamsung =service.retrieve(ram);
			if(oursamsung!=null) {
				mobi.setStatuscode(200);
				mobi.setMsg("successful");
				mobi.setDesc("Mobile which you want is getting successfully");
				mobi.setSamsung(oursamsung);
			}else {
				mobi.setStatuscode(400);
				mobi.setMsg("Failed");
				mobi.setDesc("Unable to get your details");
				mobi.setSamsung(null);
			}
			return mobi;
		}
		
		@PutMapping("/updating")
		public Mobile update(@RequestBody Samsung samsung) {
			Mobile mobil = new Mobile();
			Samsung sams=service.update(samsung);
			if(sams!=null) {
				mobil.setStatuscode(200);
				mobil.setMsg("successful");
				mobil.setDesc("Mobile updated successfully");
				mobil.setSamsung(sams);			
			}else {
				mobil.setStatuscode(400);
				mobil.setMsg("Not Updated ");
				mobil.setDesc(null);
			}
			return mobil;		
		}

		@DeleteMapping("/delete/{ram}")
		@ResponseBody
		public Mobile delete(@PathVariable("ram")int ram) {
			Mobile mobs = new Mobile();
			 
			if(service.delete(ram)) {
				mobs.setStatuscode(200);
				mobs.setMsg("Deleted");
				mobs.setDesc("Deleted successfully");
		}else {
			mobs.setStatuscode(ram);
			mobs.setMsg("try again with correct info");
			mobs.setDesc("The mobile which you want to erase is not deleted successfully");
		}
			return mobs;
		}
}


