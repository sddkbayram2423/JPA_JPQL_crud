package com.proje.repositoryÝmp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.proje.JPQLfacoryRepository.jpqlFactory;
import com.proje.JPQLfacoryRepositoryÝmp.jpqlFactoryÝmp;
import com.proje.model.Brand;
import com.proje.model.Category;
import com.proje.model.Product;
import com.proje.model.ProductDetails;
import com.proje.queries.ProductQueries;
import com.proje.repository.ProductRepository;

public class ProductRepositoryÝmp implements ProductRepository {
	private jpqlFactory jpqlfactory=new jpqlFactoryÝmp();
	private EntityManager entitiymanager=jpqlfactory.getEntityManager();
	private EntityTransaction entityTransaction=jpqlfactory.getEntityTransaction();
	@Override
	public Product saveProduct(Product product) {
		//Test baþarýlý
		this.entityTransaction.begin();
		
		this.entitiymanager.persist(product);
		
		this.entityTransaction.commit();
		
		return product;
	}

	@Override
	public Brand saveBrand(Brand brand) {
		//Test baþarýlý
		this.entityTransaction.begin();
		
		this.entitiymanager.persist(brand);
		
		this.entityTransaction.commit();
		
		return brand;
	}

	@Override
	public Category saveCategory(Category category) {
		//Test baþarýlý
		this.entityTransaction.begin();
		
		this.entitiymanager.persist(category);
		
		this.entityTransaction.commit();
		
		return category;
	}

	@Override
	public List<Product> findProducts() {
		//Test baþarýlý
//		Query query=this.entitiymanager.createQuery(ProductQueries.findPrudcts);
//		List<Product> products=query.getResultList();
		
		TypedQuery<Product> typedQuery=this.entitiymanager.createQuery(ProductQueries.findPrudcts,Product.class);
		List<Product> products=typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<Product> finProductEntities(int firstResult, int maxResult) {
		//Test baþarýlý
		TypedQuery<Product> typedQuery=this.entitiymanager.createQuery(ProductQueries.findPrudcts,Product.class);
		typedQuery.setFirstResult(firstResult);
		typedQuery.setMaxResults(maxResult);
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public Product finProductById(int productId) {
		//Test baþarýlý
		TypedQuery<Product> typedQuery=this.entitiymanager.createQuery(ProductQueries.findProductById,Product.class);
		typedQuery.setParameter("productId", productId);
		Product product=typedQuery.getSingleResult();
		return product;
	}

	@Override
	public List<ProductDetails> findProductDetails() {
		//Test baþarýlý
		TypedQuery<ProductDetails> typedQuery=this.entitiymanager.createQuery(ProductQueries.findProductDetails,ProductDetails.class);
		List<ProductDetails> productDetails=typedQuery.getResultList();
		return productDetails;
	}

	@Override
	public ProductDetails findProductDetailsById(int productId) {
		//Test baþarýlý
		TypedQuery<ProductDetails> typedQuery=this.entitiymanager.createQuery(ProductQueries.findProductDetailById,ProductDetails.class);
		typedQuery.setParameter("productId", productId);
		ProductDetails productDetails=typedQuery.getSingleResult();
		return productDetails;
	}

	@Override
	public List<String> findProductNames() {
		//Test baþarýlý
		TypedQuery<String> typedQuery=this.entitiymanager.createQuery(ProductQueries.findProductNames,String.class);
		List<String> strings=typedQuery.getResultList();
		return strings;
	}

	@Override
	public List<Object[]> findProductNameAndPrice() {
		//Test baþarýlý
		Query query=this.entitiymanager.createQuery(ProductQueries.findProductNamePrice);
		@SuppressWarnings("unchecked")
		List<Object[]> objects=query.getResultList();
		return objects;
	}

	@Override
	public List<Product> findGreatPrice(double unitPrice) {
		//Test baþarýlý
		TypedQuery<Product> typedQuery=this.entitiymanager.createQuery(ProductQueries.findGreatPrice,Product.class);
		typedQuery.setParameter("unitPrice", unitPrice);
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findGreatAndLessPrice(double minUnitPrice, double maxUnitPrice) {
		//Test baþarýlý
		TypedQuery<Product> typedQuery=this.entitiymanager.createQuery(ProductQueries.findGreatLessPrice,Product.class);
		typedQuery.setParameter("minUnitPrice", minUnitPrice);
		typedQuery.setParameter("maxUnitPrice", maxUnitPrice);
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findBetweenPrice(double minUnitPrice, double maxUnitPrice) {
		//Test baþarýlý
		TypedQuery<Product> typedQuery=this.entitiymanager.createQuery(ProductQueries.findBetweenPrice,Product.class);
		typedQuery.setParameter("minUnitPrice", minUnitPrice);
		typedQuery.setParameter("maxUnitPrice", maxUnitPrice);
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findLikeProductName(String productName) {
		//Test baþarýlý
		TypedQuery<Product> typedQuery=this.entitiymanager.createQuery(ProductQueries.findLikeProductName,Product.class);
		typedQuery.setParameter("productName", "%"+productName+"%");
		
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findInCategoryName(String categoryName1, String categoryName2) {
		//Test baþarýlý
		TypedQuery<Product> typedQuery=this.entitiymanager.createQuery(ProductQueries.findInCategoryName,Product.class);
		typedQuery.setParameter("categoryName1", categoryName1);
		typedQuery.setParameter("categoryName2", categoryName2);
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findAllProduct(int categoryId) {
		//Test baþarýlý
		TypedQuery<Product> typedQuery=this.entitiymanager.createQuery(ProductQueries.findAllProduct,Product.class);
		typedQuery.setParameter("categoryId", categoryId);
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Object[]> findFunctionsPrice() {
		//Test baþarýlý
		Query query=this.entitiymanager.createQuery(ProductQueries.findFunctionsPrice);
		@SuppressWarnings("unchecked")
		List<Object[]> objects=query.getResultList();
		return objects;
	}

	@Override
	public List<Object[]> findGroupByCategory() {
		//Test baþarýlý
		Query query=this.entitiymanager.createQuery(ProductQueries.findGroupByCategory);
		@SuppressWarnings("unchecked")
		List<Object[]> objects=query.getResultList();
		return objects;
	}

	@Override
	public List<Object[]> findGroupByHavingCategory(double unitPrice) {
		//Test baþarýlý
		Query query=this.entitiymanager.createQuery(ProductQueries.findGroupByHavingCategory);
		query.setParameter("unitPrice", unitPrice);
		@SuppressWarnings("unchecked")
		List<Object[]> findGroupByHavingCategory=query.getResultList();
		return findGroupByHavingCategory;
	}

	@Override
	public List<Product> findOrderByPrice() {
		//Test baþarýlý
		TypedQuery<Product> typedQuery=this.entitiymanager.createQuery(ProductQueries.findOrderByprice,Product.class);
		List<Product> findOrderByPrice=typedQuery.getResultList();
		return findOrderByPrice;
	}

}
