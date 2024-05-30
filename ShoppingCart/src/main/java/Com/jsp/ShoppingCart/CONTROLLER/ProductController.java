package Com.jsp.ShoppingCart.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.jsp.ShoppingCart.DAO.ProductDao;
import Com.jsp.ShoppingCart.DTO.Product;

@RestController
public class ProductController {
	
	@Autowired
	ProductDao dao;
	
	@PostMapping("/add")
	public String insertProduct(@RequestBody Product p)
	{
		String message = dao.addProduct(p);
		
		return message;		
	}

}
