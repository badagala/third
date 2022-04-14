package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Samsung {

	@Id
	private int ram;
	private String name;
	private String version;
	private String color;

	public Samsung(int ram, String name, String version, String color) {
		super();
		this.ram = ram;
		this.name = name;
		this.version = version;
		this.color = color;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	protected Samsung() {
		super();

	}

	@Override
	public String toString() {
		return "Samsung [ram=" + ram + ", name=" + name + ", version=" + version + ", color=" + color + "]";
	}

}
