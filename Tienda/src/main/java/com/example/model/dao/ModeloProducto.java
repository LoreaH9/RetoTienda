package com.example.model.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.example.model.bean.Producto;

public class ModeloProducto {
	@Autowired
	JdbcTemplate db;
	
	@Autowired
	ModeloProducto mp;
	
	public ModeloProducto(){
		
	}
	public ModeloProducto(JdbcTemplate db) {
		this.db=db;
	}
	
	public ArrayList<Producto> getAllProductos(){
		ArrayList<Producto> pl = new ArrayList<Producto>();
		String sql ="SELECT * FROM producto WHERE deleted=0";
		SqlRowSet rs = db.queryForRowSet(sql);
		while (rs.next()) {
			pl.add(new Producto (rs.getInt("id"), rs.getString("nombre"), rs.getInt("cod_cat"),
					rs.getDouble("precio"),rs.getInt("stock"),rs.getInt("like"), rs.getString("description")));
		}
		return pl;
	}
}
