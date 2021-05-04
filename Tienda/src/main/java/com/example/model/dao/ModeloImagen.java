package com.example.model.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.example.model.bean.Imagen;

public class ModeloImagen {
	
	@Autowired
	JdbcTemplate  db;
	
	@Autowired
	ModeloProducto mp;
	public ModeloImagen() {
		
	}
	public ModeloImagen(JdbcTemplate bd) {
		this.db=bd;
	}
	public ArrayList<Imagen> getImg(int id_pro){
		ArrayList<Imagen> il = new ArrayList<Imagen>();
		String sql = "SELECT * FROM imagen WHERE id_pro="+id_pro+" AND deleted=0";
		SqlRowSet rs = db.queryForRowSet(sql);
		while(rs.next()) {
			il.add(new Imagen(
					rs.getInt("id"),
					rs.getString("img"),
					rs.getInt("id_pro")
					));
		}
		return il;
	}
}
