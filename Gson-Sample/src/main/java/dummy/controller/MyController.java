package dummy.controller;

import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import dummy.model.Order;
import dummy.model.UserNested;
import dummy.model.UserNested1;

@RestController
public class MyController {
	
	@Autowired
	private Gson gson;
	
	@Autowired
	private UserNested1 nested;
	
	@PostMapping(value = "/toobj",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	private UserNested convertObject(@RequestBody UserNested obj) {
		System.out.println(obj);
		String input = gson.toJson(obj, UserNested.class);
		System.out.println(input); 
		return obj;

	}
	
	@PostMapping(value = "/dto",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	private Order convertObject(@RequestBody Order obj) {
		System.out.println(obj);
		String input = gson.toJson(obj, Order.class);
		System.out.println(input); 
		return obj;
	}
	
	@PostMapping(value = "/toobj1",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	private UserNested1 convertObject1(@RequestBody UserNested order) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		System.out.println(order);
		nested = gson.fromJson(gson.toJson(order), UserNested1.class);
		System.out.println(nested);
		return nested;
	}
}
