package com.proje.queries;

public class ProductQueries {
	
	public static final String findPrudcts="Select p from Product p"; 
	
	public static final String findProductById="Select p from Product p where p.productId=:productId";
	
	public static final String findProductDetails="select new com.proje.model.ProductDetails( p.productName, p.unitPrice,p.avaible, c.categoryName, b.brandName) "
			+ "from Product p left join p.brand b left join p.category c";
	
	public static final String findProductDetailById="select new com.proje.model.ProductDetails(p.productName, p.unitPrice,p.avaible, c.categoryName, b.brandName) "
			+ "from Product p left join p.brand b left join p.category c where p.productId=:productId";

	public static final String findProductNames="Select p.productName from Product p";
	
	public static final String findProductNamePrice="Select p.productName,p.unitPrice from Product p";
	
	public static final String findGreatPrice="Select p from Product p where p.unitPrice>:unitPrice";
	
	public static final String findGreatLessPrice="Select p from Product p where p.unitPrice>:minUnitPrice and p.unitPrice<:maxUnitPrice";
	
	public static final String findBetweenPrice="Select p from Product p where p.unitPrice between :minUnitPrice and :maxUnitPrice";
	
	public static final String findLikeProductName="Select p from Product p where p.productName Like :productName";
	
	public static final String findInCategoryName="Select p from Product p left join p.category c where c.categoryName IN(:categoryName1 ,:categoryName2)"; 
	
	public static final String findAllProduct="Select p from Product p where p.unitPrice > ALL(select p2.unitPrice from Product p2 where p2.category.categoryId=:categoryId)";
	
	public static final String findFunctionsPrice="select AVG(p.unitPrice),SUM(p.unitPrice),Max(p.unitPrice),MIN(p.unitPrice),Count(p) from Product p";

	public static final String findGroupByCategory="select p.category.categoryName,AVG(p.unitPrice) from Product p group by p.category.categoryName";
	
	public static final String findGroupByHavingCategory="select p.category.categoryName,AVG(p.unitPrice) from Product p"
													+ " group by p.category.categoryName having AVG(p.unitPrice)>:unitPrice";
	
	public static final String findOrderByprice="select p from Product p order by p.unitPrice DESC";
	

}
