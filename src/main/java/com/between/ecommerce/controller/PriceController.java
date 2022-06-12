package com.between.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.between.ecommerce.model.ErrorApi;
import com.between.ecommerce.model.GenericResponse;
import com.between.ecommerce.model.RequestBodyPrices;
import com.between.ecommerce.model.ResponsePrice;
import com.between.ecommerce.service.PricesService;
import com.between.ecommerce.util.Constants;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1")
public class PriceController {
	
	@Autowired
	@Qualifier("pricesServiceImpl")
	private PricesService pricesService;
	
	@PostMapping ("/prices")
	public GenericResponse getPrice(@RequestBody RequestBodyPrices requestBodyPrices) {
		GenericResponse response = new GenericResponse();
		try {
			ResponsePrice responsePrice = pricesService.getPrice(requestBodyPrices);
			response.setData(responsePrice);
		
		}catch(Exception e) {
			ErrorApi error = new ErrorApi(Constants.ERROR_500, Constants.ERROR, e.getMessage()); 
			response.setError(error);
		}
		
		return response;

	}

}
