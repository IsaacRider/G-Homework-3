package Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.File;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  

public class StockManagerSingleton {
	ArrayList<MediaProduct> productList = new ArrayList<MediaProduct>();
	
	public ArrayList<MediaProduct> readFromFile(String fileName) {
	    try {
	        Scanner fileIn = new Scanner(new FileInputStream(fileName));
	        
	        String splitBy = ","; 
	        
	        fileIn.useDelimiter(",");
	        fileIn.nextLine();
	        while (fileIn.hasNext()) {
	        	String line = fileIn.nextLine();

	        	String[] fields = line.split(splitBy);
	            String title = fields[1];
	        	double price = Double.parseDouble(fields[2]);
	            int year = Integer.parseInt(fields[3]);
	            String genre = fields[4];
	            
	            
	            MediaProduct product = new MediaProduct(title, price, year, genre);
	            productList.add(product);
	        }
	        fileIn.close();
	        return productList;

	    } 
	    catch (FileNotFoundException e) {
	        System.out.println("An error has occurred.");
	        return null;
	    }
	}
	
	public void printListOfMediaProduct(ArrayList<MediaProduct> productList){
		for(MediaProduct i : productList) {
			System.out.println(i.toString());
		}
	}
}
