package com.nafisa.json;

import java.util.List;
import java.util.Scanner;

public class ParseJson 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System. in); 
    	String filePath = scanner. nextLine();
    	ClingenJsonParser parser = new ClingenJsonParser();
    	List<String> elementList = parser.parseElements(filePath);
        
    	for(int i=0; i< elementList.size(); i++)
        {
    		System.out.println(elementList.get(i));
        }
  
    }
    
}



