package org.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadSample {

	public static void main(String[] args) throws IOException {
		 
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Day5Desetion\\src\\main\\resources\\Sample1.json");

		FileReader r = new FileReader(f);
		
		ObjectMapper objectmapper = new ObjectMapper();
		
		Root readValue = objectmapper.readValue(r, Root.class);

		System.out.println(readValue.getName());
		
		System.out.println(readValue.getAge());
		
		System.out.println(readValue.isStatus());
		
		
		
		Address address = readValue.getAddress();
		
		System.out.println(address.getCity());
		
		System.out.println(address.getState());
		
		System.out.println(address.getCountry());
		
		System.out.println(address.getPincode());
		
		
		
		ArrayList<String> courses = readValue.getCourses();
		for(int i=0;i<courses.size();i++) {
			
			String string = courses.get(i);
			
			System.out.println(string);
			
		}
			
		
		}
	}


