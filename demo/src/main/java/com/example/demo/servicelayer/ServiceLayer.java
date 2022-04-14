package com.example.demo.servicelayer;

import com.example.demo.dto.Samsung;

public interface ServiceLayer {
	
	public Samsung insert(Samsung samsung);
	public Samsung retrieve(int ram);
	public Samsung update(Samsung samsung);
	public boolean delete(int ram);
	
	

}
