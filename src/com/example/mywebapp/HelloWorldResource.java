package com.example.mywebapp;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloWorldResource extends ServerResource
	{
	@Get
	public String represent()
		{
		return "Hello World!";
		}
	}