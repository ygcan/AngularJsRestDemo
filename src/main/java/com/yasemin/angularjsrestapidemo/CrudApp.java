package com.yasemin.angularjsrestapidemo;

import java.io.IOException;

import javax.ws.rs.core.MediaType;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@SpringBootApplication
public class CrudApp {

	public CrudApp() {
		// TODO Auto-generated constructor stub
	}

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// SpringApplication.run(CrudApp.class, args);

//		HttpClient client = new DefaultHttpClient();
//		  HttpGet request = new HttpGet("http://www.google.com");
//		  HttpResponse response = client.execute(request);
//		  BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
//		  String line = "";
//		  System.out.println("client starts..");
//		  while ((line = rd.readLine()) != null) {
//		    System.out.println(line);
//		  }
//		  System.out.println("client ends..");

		///System.out.println("post  new  post now....");

		//post();
		System.out.println("get that post now....");
		get();

	}*/

	private static void post() {
		// Sample post to order data
		Order order = new Order();
		order.setOrderName("A chair for yasemin to use while working");
		order.setOrderAmount(100);
		order.setOrderBuyer("Yasemin Can");
		order.setOrderNumber(1);
		
		Posts post = new Posts();
		post.setId(1);
		post.setUserId(1);
		post.setTitle("yasemins trial post");
		post.setBody("haydi kolay gelsin");
		
		try {
			// A client was created using the Jersey Rest API.
			// Jersey Rest API URL defined.
			Client client = Client.create();
			WebResource resource = client.resource("https://gorest.co.in/public/v2/posts");
			ClientResponse response = resource.type(MediaType.APPLICATION_XML).post(ClientResponse.class, order);
			if (response.getStatus() == 200) {
				System.out.println(response.getEntity(String.class));
			} else {
				System.out.println(response.getStatus());
			}
		} catch (Exception e) {
			System.out.println("Exception is:" + e.getMessage());
		}

	}
	
	
	
	

	private static void get() {
		try {
			// A client was created using the Jersey Rest API.
			// Jersey Rest API URL defined.
			Client client = Client.create();
			WebResource resource = client.resource("https://openlibrary.org/books/OL7353617M.json");
			ClientResponse response = resource.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
			if (response.getStatus() == 200) {
				System.out.println(response.getEntity(String.class));
			} else {
				System.out.println(response.getStatus());
			}
		} catch (Exception e) {
			System.out.println("Exception is:" + e.getMessage());
		}
	}

}
