package com.between.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.between.ecommerce.component.ResponsePriceConverter;
import com.between.ecommerce.entity.Prices;
import com.between.ecommerce.model.RequestBodyPrices;
import com.between.ecommerce.model.ResponsePrice;
import com.between.ecommerce.repository.PricesRepository;
import com.between.ecommerce.service.PricesService;


@Service("pricesServiceImpl")
public class PricesServiceImpl implements PricesService {

	@Autowired
	@Qualifier("pricesRepository")
	private PricesRepository pricesRepository;
	
	@Autowired
	@Qualifier("responsePriceConverter")
	private ResponsePriceConverter responsePriceConverter;

	@Override
	public ResponsePrice getPrice(RequestBodyPrices requestBodyPrices) {

		List<Prices> prices = pricesRepository.getPrice(requestBodyPrices.getBrandId(),requestBodyPrices.getProductId(), requestBodyPrices.getNowDateTime());
		if (!prices.isEmpty()) {
			ResponsePrice responsePrice = responsePriceConverter.convertPricesToResponsePrice(prices.get(0));
			return responsePrice;
		} else {
			return null;
		}
	}

}
