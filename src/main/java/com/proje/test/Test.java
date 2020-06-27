package com.proje.test;

import com.proje.model.Brand;
import com.proje.model.Category;
import com.proje.model.Product;
import com.proje.repository.ProductRepository;
import com.proje.repository›mp.ProductRepository›mp;

public class Test {	
	public static void main(String[] args) {
	

	}

	public static void addData() {
		ProductRepository productRepository=new ProductRepository›mp();
		
		Brand brand1=new Brand("APPLE");
		Brand brand2=new Brand("LG");
		Brand brand3=new Brand("SAMSUNG");
		Brand brand4=new Brand("ASUS");
		Brand brand5=new Brand("SONY");
		
		
		Category category1=new Category("TELEFON");
		Category category2=new Category("B›LG›SAYAR");
		Category category3=new Category("TABLET");
		
	
		Product product1=new Product("ipone 7", 3500, 12,brand1,category1);
		Product product2=new Product("LG G3", 2900, 9,brand2,category1);
		Product product3=new Product("Sony Experia", 1950, 2,brand5,category1);
		Product product4=new Product("Mac i7", 8500, 6,brand1,category2);
		Product product5=new Product("ASUS i7", 3640, 7,brand4,category2);
		Product product6=new Product("SAMSUNG Z500", 5460, 4,brand3,category2);
		Product product7=new Product("›PAD", 7400, 8,brand1,category3);
		Product product8=new Product("GALAXY tablet", 1500, 1,brand3,category3);
		Product product9=new Product("Sony tablet 7", 1120, 3,brand5,category3);
		
		
		productRepository.saveBrand(brand1);
		productRepository.saveBrand(brand2);
		productRepository.saveBrand(brand3);
		productRepository.saveBrand(brand4);
		productRepository.saveBrand(brand5);
		
		productRepository.saveCategory(category1);
		productRepository.saveCategory(category2);
		productRepository.saveCategory(category3);
		
		productRepository.saveProduct(product1);
		productRepository.saveProduct(product2);
		productRepository.saveProduct(product3);
		productRepository.saveProduct(product4);
		productRepository.saveProduct(product5);
		productRepository.saveProduct(product6);
		productRepository.saveProduct(product7);
		productRepository.saveProduct(product8);
		productRepository.saveProduct(product9);
	}
	
	public static void test() {
		
//		ProductRepository productRepository=new ProductRepository›mp();
	
//		List<Product> products=productRepository.findProducts();
//		for(Product product:products) {
//		System.out.println(product);
//		}
		
//		List<Product> products=productRepository.finProductEntities(1, 3);
//		for(Product product:products) {
//		System.out.println(product);
//		}
		
//		List<Product> products=productRepository.findOrderByPrice();
//		for(Product product:products) {
//		System.out.println(product);
//		}	
	
//		List<Object[]> products=productRepository.findFunctionsPrice() ;
//		for(Object[] product:products) {
//			
//		System.out.println(product[0]+" "+product[2]);
//		}
		
	}
}
