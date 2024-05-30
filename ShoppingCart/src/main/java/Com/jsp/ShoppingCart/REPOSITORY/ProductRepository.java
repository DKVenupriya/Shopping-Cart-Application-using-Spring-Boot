package Com.jsp.ShoppingCart.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.jsp.ShoppingCart.DTO.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	
}
