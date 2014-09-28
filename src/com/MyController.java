package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	private String SHOPPING_CART_KEY = "shoppingCart";

	private MyService service;

	public MyService getService() {
		return service;
	}

	public void setService(MyService service) {
		this.service = service;
	}

	@RequestMapping("/viewcart.do")
	public ModelMap viewCart() {
		return new ModelMap(SHOPPING_CART_KEY, service.getShoppingCart());
	}

	@RequestMapping("/additem.do")
	public ModelAndView addItem() {
		service.addItem();
		ShoppingCart cart = service.getShoppingCart();
		return new ModelAndView("/viewcart", SHOPPING_CART_KEY, cart);
	}
}
