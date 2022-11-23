package com.nttdata.bootcamp.retoconfigservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RetoConfigServerController {
	
	@Value("${product.product-name}")
	private String productName;
	
	@GetMapping("/getProductName")
    public String productName() {
        return this.productName;
    }
}
