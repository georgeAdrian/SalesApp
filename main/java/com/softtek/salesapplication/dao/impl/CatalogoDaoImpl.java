package com.softtek.salesapplication.dao.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.jdbc.core.JdbcTemplate;
import com.softtek.salesapplication.dto.Catalogo;
import org.springframework.jdbc.core.RowMapper;

public class CatalogoDaoImpl implements CatalogoDao {
	
	private static String CATALOGO_QUERY= "SELECT * FROM salesapp.CATALOGO";
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate=jdbcTemplate;
	}
	
	
	public ArrayList<Catalogo> getCatalogo() {
		// TODO Auto-generated method stub
		return (ArrayList<Catalogo>) jdbcTemplate.query(CATALOGO_QUERY, new CatalogoMapper());
	}
	
	
	private static final class CatalogoMapper implements RowMapper{
		public Catalogo mapRow(ResultSet res, int rowNum) throws SQLException{
			Catalogo catalogo= new Catalogo();
			catalogo.setId(res.getInt("Id"));
			catalogo.setMarca(res.getString("marca"));
			return catalogo;
		}

	
	}
	
	
	

}
