package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

//		Aqui foi criada uma injeção de dependecia onde para
//		ser criado um vendedor, o programador necessita de 
//		utilizar a classe DaoFactory e não instanciando direto
//		pela classe SellerDao, pois há um encadeamento de 
//		dependencia ja que a classe sellerDao
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
