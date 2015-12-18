package com.softtek.salesapplication.dao.impl;

import java.util.ArrayList;

import com.softtek.salesapplication.dto.Catalogo;

public interface CatalogoDao {
	/**
	 * Este metodo regresara la lista de marcas
	 * @return ArrayList<Catalogo>
	 */
	public ArrayList<Catalogo> getCatalogo();
	
}
