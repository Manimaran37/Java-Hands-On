import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.management.ValueExp;

public class HashMapDemo {

	HashMap<String, String> mapObj = new HashMap<>();
	
	public String saveCountryCapital(String country, String capital) {
		mapObj.put(country, capital);
		return "Country and Capital Saved";
	}
	
	public String getCapital(String country) {
		for (Map.Entry<String, String> entry : mapObj.entrySet()) {
			String key = entry.getKey();
			if(key.equals(country))
				return "Capital of " + country + " is " +mapObj.get(country);
		}
		return "Country not found";
	}
	
	public String getCountry(String capital) {
		for (Map.Entry<String, String> entry : mapObj.entrySet()) {
			String value = entry.getValue();
			if(value.equals(capital))
				return capital + " is capital of " + entry.getKey();
		}
		return "Capital not found";
	}
	
	public HashMap<String, String> swaHashMap(HashMap<String, String> hashMap) {
		HashMap<String, String> mapObj2 = new HashMap<>();
		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			mapObj2.put(val, key);
		}
		return mapObj2;
	}
	
	public ArrayList<String> countryArrayList() {
		ArrayList<String> countryArrayList = new ArrayList<>();
		for (Map.Entry<String, String> entry : this.mapObj.entrySet()) {
			String key = entry.getKey();
			countryArrayList.add(key);
		}
		return countryArrayList;
	}
	
	public ArrayList<String> capitalArrayList() {
		ArrayList<String> capitalArrayList = new ArrayList<>();
		for (Map.Entry<String, String> entry : this.mapObj.entrySet()) {
			String value = entry.getValue();
			capitalArrayList.add(value);
		}
		return capitalArrayList;
	}
	
	public void displayMap(HashMap<String, String> map) {
		System.out.println("-------------------------------\nKey-Country  Value-Capital");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("  " + key + "         " + val);
		}
		System.out.println("-------------------------------\n");
	}
	
	public static void main(String[] args) {
		HashMapDemo objDemo = new HashMapDemo();
		
		System.out.println(objDemo.saveCountryCapital("India", "Delhi"));
		System.out.println(objDemo.saveCountryCapital("Japan", "Tokyo"));
//		System.out.println(objDemo.saveCountryCapital("Japan", "Tokyo"));
		
		System.out.println("\nCountry and Capital saved in Map: ");
		objDemo.displayMap(objDemo.mapObj);
		
		System.out.println(objDemo.getCapital("India"));
		System.out.println(objDemo.getCountry("Tokyo"));
		System.out.println(objDemo.getCountry("Delhi"));
		
		System.out.println("\nNew HashMap with Capital as Key and Country as Value: ");
		objDemo.displayMap(objDemo.swaHashMap(objDemo.mapObj));
		
		System.out.println("ArrayList Of Country: \n" + objDemo.countryArrayList());
		System.out.println("ArrayList Of Capital: \n" + objDemo.capitalArrayList());
		
		System.out.println();
		System.out.println(objDemo.saveCountryCapital("India", "Duplicate"));
		System.out.println(objDemo.saveCountryCapital("Duplicate", "Tokyo"));
		System.out.println("\nTry to add duplicate Keys and Values: ");
		objDemo.displayMap(objDemo.mapObj);

		
	}

}
