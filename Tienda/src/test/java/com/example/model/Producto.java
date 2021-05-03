package com.example.model;

public class Producto {
	private int id;
	private String name;
	private String tipo;
	private double precio;
	private int stock;
	private int like;
	private String description;
	
	
	public Producto(int id, String name, String tipo, double precio, int stock, int like, String description) {
		super();
		this.id = id;
		this.name = name;
		this.tipo = tipo;
		this.precio = precio;
		this.stock = stock;
		this.like = like;
		
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", name=" + name + ", tipo=" + tipo + ", precio=" + precio + ", stock=" + stock
				+ ", like=" + like + ", description=" + description + "]";
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
