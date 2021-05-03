package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ModeloProducto {
	@Autowired
	JdbcTemplate db;
	
	@Autowired
	ModeloProducto mp;
}
