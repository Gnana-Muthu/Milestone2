package com.mindtree.Uistore;

import org.openqa.selenium.By;

public class LoginUistore {

	public static By Login=(By.className("header_user_info"));
	public static By User=By.id("email");
	public static By password=By.id("passwd");
	public static By Sigin=By.id("SubmitLogin");
	public static By Username=By.xpath("//span[text()='Testaccount T']");
	public static By Dress=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
	public static By SummerDress=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]");
	public static By Dress1=By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div");
	//public static By comp1=By.xpath("//a[@data-id-product='5'][1]");
	public static By comp1=By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]");
	public static By Dress2=By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]");
	public static By comp2=By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[3]/div[2]");
	//public static By comppro=By.className("total-compare-val");
	public static By comppro=By.xpath("//*[@id=\"center_column\"]/div[3]/div/form/button");
	//public static By prop1=By.xpath("//td[text()='Maxi Dress'");
	public static By prop1=By.xpath("//*[@id=\"product_comparison\"]/tbody/tr[2]/td[2]");
	public static By prop2=By.xpath("//*[@id=\"product_comparison\"]/tbody/tr[2]/td[3]");
	//public static By cart1=By.xpath("//a[@data-id-product='5']");
	//
	public static By cart1=By.xpath("//*[@id=\"product_comparison\"]/tbody/tr[1]/td[2]/div[5]/div/div/a[1]");
	public static By cart2=By.xpath("//a[@data-id-product='6']");
	//public static By cart2=By.xpath("//*[@id=\"product_comparison\"]/tbody/tr[1]/td[2]/div[6]/div/div/a[1]");
	
	public static By close1=By.className("cross");
	public static By cart=By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
	public static By checkout=By.xpath("//*[@id=\"button_order_cart\"]");
	public static By total=By.xpath("//*[@id=\"total_price\"]");
	public static By pricecart=By.id("layer_cart_product_price");
	public static By pricecarttotal=By.className("ajax_block_products_total");
	public static By proceedcheckout=By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	public static By pricetotalcart=By.id("total_product");
	
	
}