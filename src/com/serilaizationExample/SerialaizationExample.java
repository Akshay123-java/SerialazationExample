package com.serilaizationExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialaizationExample implements Serializable{
	int id ;
	String name;
	
	public static final long  SerialVersionUID=10l;
	
	
	
	public SerialaizationExample(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		
		SerialaizationExample s1= new SerialaizationExample(10,"Akshay");
		
		String fileName="Serializablefile.txt";
		
		try {
			FileOutputStream f_out=new FileOutputStream(fileName);
			
		
				ObjectOutputStream o_out =new ObjectOutputStream(f_out);
				
				o_out.writeObject(s1);
				
				FileInputStream f_in =new FileInputStream(fileName);
				ObjectInputStream o_in = new ObjectInputStream(f_in);
				SerialaizationExample s2= (SerialaizationExample)o_in.readObject();
				System.out.println(s2.id + " " +s2.name);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
