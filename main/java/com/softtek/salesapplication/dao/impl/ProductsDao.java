package com.softtek.salesapplication.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;



import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.softtek.salesapplication.dto.Catalogo;
import com.softtek.salesapplication.dto.Products;



public class ProductsDao {
	
	private JdbcTemplate Jdbctemplate;
	private static String QUERY_PROD_ID = "SELECT * FROM producto WHERE id = ?";
	
	


	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		Jdbctemplate = jdbctemplate;
	}
	
	public Products getIdProduct (Integer id)
	{
		String consulta = "SELECT * FROM producto WHERE id = ?";
		
		Products productID = Jdbctemplate.queryForObject(consulta, new Object [] {id}, new ProductsMapper());
		return productID;
	}
	
	public void insertProducts (Products insertProd)
	{
		String insert = "INSERT INTO productos (id, nombre, id_marca, existencia, precio) values (?, ?, ?, ?, ?)";
		
		Jdbctemplate.update(insert, new Object[] {insertProd.getId(), insertProd.getNombre(), insertProd.getIdMarca(), insertProd.getExistencia(), insertProd.getPrecio() });
		
		return;
		
	}
	
	public void deleteProdcuts (Products id)
	{
		String delete = "DELETE FROM productos WHERE id = ?";
		
		Jdbctemplate.update(delete, new Object[] {id.getId()});
		
		return;
	}
	
	
	public List<Products> listProducts () {
		String lista = "SELECT * FROM productos";
		List<Products> prod = Jdbctemplate.query(lista, new ProductsMapper());
		return prod;
	}
	
	private static final class ProductsMapper implements RowMapper
	{

		public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
			Products product = new Products ();
			product.setId(rs.getInt("Id"));
			product.setNombre(rs.getString("Nombre"));
			product.SetidMarca(rs.getInt("idMarca"));
			product.setExistencia(rs.getInt("Existencia"));
			product.setPrecio(rs.getFloat("Precio"));
			
			return product;
		}
		 
		
		
	}
	
	

}
