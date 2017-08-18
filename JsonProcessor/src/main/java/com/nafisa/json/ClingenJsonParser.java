package com.nafisa.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ClingenJsonParser {
	
	
	public List<String> parseElements(String filePath)
	{
		
		JSONParser parser = new JSONParser();
		List<String> elementList = new ArrayList<String>();
        
		try {

            Object obj = parser.parse(new FileReader(filePath));

            JSONObject jsonObject = (JSONObject) obj;
            
            // loop Json Object
            for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
                String key = (String) iterator.next();
                String value = jsonObject.get(key).toString();
                String[] valueArray = value.split("[\\[\\{\\}\\]\\,]", value.length());
                for(int i=0; i< valueArray.length; i++)
                {
                	elementList.add(valueArray[i]);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

		return elementList;
	}

}
