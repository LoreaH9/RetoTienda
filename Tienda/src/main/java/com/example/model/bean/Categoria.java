package com.example.model.bean;

public class Categoria {
	private int id_cat;
	private String nombre;
	
	public Categoria(int id_cat, String nombre) {
		super();
		this.id_cat = id_cat;
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Categoria [id_cat=" + id_cat + ", nombre=" + nombre + "]";
	}
	
	public int getId_cat() {
		return id_cat;
	}
	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
