package com.products.utils;

public class ConstantesGlobales {

	// endpoints catgory
	public static final String QUERY_LIST_CATEGORY = "/list/categorys";
	
	public static final String SAVECA_TEGORY = "/save/categorys";

	public static final String UPDATE_CATEGORY = "/update/categorys";

	public static final String DELETE_CATEGORY = "/delete/categorys/{id}";

	// endpoints products
	public static final String QUERY_LIST_PRODUCT = "/list/products";

	public static final String SAVE_PRODUCT = "/save/product";

	public static final String UPDATEP_RODUCT = "/update/product";

	public static final String DELETEP_RODUCT = "/delete/product/{id}";

	//endpoints Authentification
	public static final String GENERATE_TOKEN = "/login";
	public static final String CURRENT_USER = "/current"; 
}
