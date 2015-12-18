package com.softtek.salesapplication.dto;

public class Products {
	
	private Integer id;
	private String nombre;
	private Integer id_marca;
	private Integer existencia;
	private Float precio;
	
	public Integer getId ()
	{
		return id;
	}
	
	public void setId (Integer id)
	{
		this.id = id;
	}
	
	public String getNombre ()
	{
		return nombre;
	}
	
	public void setNombre (String nombre)
	{
		this.nombre = nombre;
	}
	
	
	public Integer getIdMarca ()
	{
		return id_marca;
	}
	
	public void SetidMarca (Integer id_marca)
	{
		this.id_marca = id_marca;
	}
	
	public Integer getExistencia ()
	{
		return existencia;
	}
	
	public void setExistencia (Integer existencia)
	{
		this.existencia = existencia;
	}
	
	public Float getPrecio ()
	{
		return precio;
	}
	
	public void setPrecio (Float precio)
	{
		this.precio = precio;
	}
	
}
