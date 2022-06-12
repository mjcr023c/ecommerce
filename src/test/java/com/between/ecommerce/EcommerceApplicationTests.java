package com.between.ecommerce;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.time.Month;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.between.ecommerce.model.RequestBodyPrices;
import com.between.ecommerce.model.ResponsePrice;
import com.between.ecommerce.service.PricesService;

@SpringBootTest
class EcommerceApplicationTests {
	
	@Autowired
	@Qualifier("pricesServiceImpl")
	private PricesService pricesService;
	

	/**
	 * Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void Test1() {
		// Data Request
		LocalDateTime nowDateTime = LocalDateTime.of(2020, Month.JUNE, 14, 10, 00, 00);
		RequestBodyPrices requestBodyPrices = new RequestBodyPrices(nowDateTime, 35455, 1);

		// Data Response
		int idBrand = 1;
		int idProduct = 35455;
		int priceList = 1;
		LocalDateTime startDate = LocalDateTime.of(2020, Month.JUNE, 14, 00, 00, 00);
		LocalDateTime endDate = LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59);
		float price = (float) 35.5;
		String curr = "EUR";

		ResponsePrice assertResponsePrice = new ResponsePrice(idBrand, idProduct, priceList, startDate, endDate, price,
				curr);
		ResponsePrice responsePrice = pricesService.getPrice(requestBodyPrices);

		assertNotNull(responsePrice);
		assertEquals(assertResponsePrice, responsePrice);

	}

	/**
	 * Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */

	@Test
	public void test2() {
		// Data Request
		LocalDateTime nowDateTime = LocalDateTime.of(2020, Month.JUNE, 14, 16, 00, 00);
		RequestBodyPrices requestBodyPrices = new RequestBodyPrices(nowDateTime, 35455, 1);

		// Data Response
		int idBrand = 1;
		int idProduct = 35455;
		int priceList = 2;
		LocalDateTime startDate = LocalDateTime.of(2020, Month.JUNE, 14, 15, 00, 00);
		LocalDateTime endDate = LocalDateTime.of(2020, Month.JUNE, 14, 18, 30, 00);
		float price = (float) 25.45;
		String curr = "EUR";

		ResponsePrice assertResponsePrice = new ResponsePrice(idBrand, idProduct, priceList, startDate, endDate, price,
				curr);
		ResponsePrice responsePrice = pricesService.getPrice(requestBodyPrices);

		assertNotNull(responsePrice);
		assertEquals(assertResponsePrice, responsePrice);

	}

	/**
	 * Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test3() {
		// Data Request
		LocalDateTime nowDateTime = LocalDateTime.of(2020, Month.JUNE, 14, 21, 00, 00);
		RequestBodyPrices requestBodyPrices = new RequestBodyPrices(nowDateTime, 35455, 1);

		// Data Response
		int idBrand = 1;
		int idProduct = 35455;
		int priceList = 1;
		LocalDateTime startDate = LocalDateTime.of(2020, Month.JUNE, 14, 00, 00, 00);
		LocalDateTime endDate = LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59);
		float price = (float) 35.5;
		String curr = "EUR";

		ResponsePrice assertResponsePrice = new ResponsePrice(idBrand, idProduct, priceList, startDate, endDate, price,
				curr);
		ResponsePrice responsePrice = pricesService.getPrice(requestBodyPrices);

		assertNotNull(responsePrice);
		assertEquals(assertResponsePrice, responsePrice);

	}

	/**
	 * Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test4() {
		// Data Request
		LocalDateTime nowDateTime = LocalDateTime.of(2020, Month.JUNE, 15, 10, 00, 00);
		RequestBodyPrices requestBodyPrices = new RequestBodyPrices(nowDateTime, 35455, 1);

		// Data Response
		int idBrand = 1;
		int idProduct = 35455;
		int priceList = 3;
		LocalDateTime startDate = LocalDateTime.of(2020, Month.JUNE, 15, 00, 00, 00);
		LocalDateTime endDate = LocalDateTime.of(2020, Month.JUNE, 15, 11, 00, 00);
		float price = (float) 30.5;
		String curr = "EUR";

		ResponsePrice assertResponsePrice = new ResponsePrice(idBrand, idProduct, priceList, startDate, endDate, price,
				curr);
		ResponsePrice responsePrice = pricesService.getPrice(requestBodyPrices);

		assertNotNull(responsePrice);
		assertEquals(assertResponsePrice, responsePrice);

	}

	/**
	 * Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test5() {
		// Data Request
		LocalDateTime nowDateTime = LocalDateTime.of(2020, Month.JUNE, 15, 21, 00, 00);
		RequestBodyPrices requestBodyPrices = new RequestBodyPrices(nowDateTime, 35455, 1);

		// Data Response
		int idBrand = 1;
		int idProduct = 35455;
		int priceList = 4;
		LocalDateTime startDate = LocalDateTime.of(2020, Month.JUNE, 15, 16, 00, 00);
		LocalDateTime endDate = LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59);
		float price = (float) 38.95;
		String curr = "EUR";

		ResponsePrice assertResponsePrice = new ResponsePrice(idBrand, idProduct, priceList, startDate, endDate, price,
				curr);
		ResponsePrice responsePrice = pricesService.getPrice(requestBodyPrices);

		assertNotNull(responsePrice);
		assertEquals(assertResponsePrice, responsePrice);

	}

}
