package Com.jsp.ShoppingCart.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Com.jsp.ShoppingCart.DTO.Product;
import Com.jsp.ShoppingCart.REPOSITORY.ProductRepository;

@Repository
public class ProductDao {
	
	@Autowired
	ProductRepository repository;
	
	//Inserting product into cart
	public String addProduct(Product p)
	{
		repository.save(p);
		
		return "Product added to Cart Successfully";
			
	}
	
	
	
	//To delete an object from DB
	/* public String deleteProduct(int id)
	{
		Product p = f
				
		if(p != null)
		{
			String productname = p.getProductName();
			
			repository.delete(p);
			
			return productName+" Product was removed from cart";
		}
		
		
		return "product not available in tha cart";
	} */

}
