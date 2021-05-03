package com.example.model;

public class Imagen {
	private int id;
	private String img;
	private int id_producto;
	
	
	
	public Imagen(int id, String img, int id_producto) {
		super();
		this.id = id;
		this.img = img;
		this.id_producto = id_producto;
	}
	
	@Override
	public String toString() {
		return "Imagen [id=" + id + ", img=" + img + ", id_producto=" + id_producto + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	
	
}
