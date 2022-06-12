package com.between.ecommerce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = EcommerceApplication.class)
@AutoConfigureMockMvc
public class PriceController {

	@Autowired
	private MockMvc mvc;
	
	/**
	 * Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test1() throws Exception {
		String content = "{\"nowDateTime\":\"2020-06-14-10.00.00\",\"productId\":35455,\"brandId\":1}";

		String resp = "{\"status\":200,\"message\":\"Ok\",\"data\":{\"idProduct\":35455,\"idBrand\":1,\"priceList\":1,\"startDate\":\"2020-06-14-00.00.00\",\"endDate\":\"2020-12-31-23.59.59\",\"price\":35.5,\"curr\":\"EUR\"}}";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/v1/prices").accept(MediaType.APPLICATION_JSON)
				.content(content).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		assertEquals(resp, response.getContentAsString());

	}
	
	/**
	 * Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test2() throws Exception {
		String content = "{\"nowDateTime\":\"2020-06-14-16.00.00\",\"productId\":35455,\"brandId\":1}";

		String resp = "{\"status\":200,\"message\":\"Ok\",\"data\":{\"idProduct\":35455,\"idBrand\":1,\"priceList\":2,\"startDate\":\"2020-06-14-15.00.00\",\"endDate\":\"2020-06-14-18.30.00\",\"price\":25.45,\"curr\":\"EUR\"}}";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/v1/prices").accept(MediaType.APPLICATION_JSON)
				.content(content).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		assertEquals(resp, response.getContentAsString());

	}
	
	/**
	 * Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test3() throws Exception {
		String content = "{\"nowDateTime\":\"2020-06-14-21.00.00\",\"productId\":35455,\"brandId\":1}";

		String resp = "{\"status\":200,\"message\":\"Ok\",\"data\":{\"idProduct\":35455,\"idBrand\":1,\"priceList\":1,\"startDate\":\"2020-06-14-00.00.00\",\"endDate\":\"2020-12-31-23.59.59\",\"price\":35.5,\"curr\":\"EUR\"}}";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/v1/prices").accept(MediaType.APPLICATION_JSON)
				.content(content).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		assertEquals(resp, response.getContentAsString());

	}

	/**
	 * Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test4() throws Exception {
		String content = "{\"nowDateTime\":\"2020-06-15-10.00.00\",\"productId\":35455,\"brandId\":1}";

		String resp = "{\"status\":200,\"message\":\"Ok\",\"data\":{\"idProduct\":35455,\"idBrand\":1,\"priceList\":3,\"startDate\":\"2020-06-15-00.00.00\",\"endDate\":\"2020-06-15-11.00.00\",\"price\":30.5,\"curr\":\"EUR\"}}";

		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/v1/prices").accept(MediaType.APPLICATION_JSON)
				.content(content).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		assertEquals(resp, response.getContentAsString());

	}
	
	/**
	 * Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test5() throws Exception {
		String content = "{\"nowDateTime\":\"2020-06-16-21.00.00\",\"productId\":35455,\"brandId\":1}";

		String resp = "{\"status\":200,\"message\":\"Ok\",\"data\":{\"idProduct\":35455,\"idBrand\":1,\"priceList\":4,\"startDate\":\"2020-06-15-16.00.00\",\"endDate\":\"2020-12-31-23.59.59\",\"price\":38.95,\"curr\":\"EUR\"}}";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/v1/prices").accept(MediaType.APPLICATION_JSON)
				.content(content).contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		assertEquals(resp, response.getContentAsString());

	}

}
