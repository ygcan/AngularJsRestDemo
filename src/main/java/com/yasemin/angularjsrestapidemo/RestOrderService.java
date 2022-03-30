/*package com.yasemin.angularjsrestapidemo;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/orders")
public class RestOrderService {
	private static List<Order> orders = new ArrayList<Order>();

	@GET
	@Path("/get")
	@Produces({ MediaType.APPLICATION_XML })
	public List<Order> getOrder() throws Exception {
		
		return orders;
	}

	@POST
	@Produces({ MediaType.APPLICATION_XML })
	@Path("/post")
	public List<Order> postOrder(Order ord) throws Exception {
		orders.add(ord);
		return orders;

	}
	
}*/
