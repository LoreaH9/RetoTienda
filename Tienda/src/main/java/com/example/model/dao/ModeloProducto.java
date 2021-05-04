package com.example.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ModeloProducto {
	@Autowired
	JdbcTemplate db;
	
	@Autowired
	ModeloProducto mp;
}
