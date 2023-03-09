package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
//	Aqui ocorreu uma injeção de independecia onde para ser criado um
//	novo vendedor precisa da criação de conexão com o banco de dados
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
