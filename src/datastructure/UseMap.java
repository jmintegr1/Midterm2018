package datastructure;

import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;

public class UseMap {

	public static void main(String[] args) {

		List<String>BanglaCities = new ArrayList<String>();
		BanglaCities.add("Chittagong");
		BanglaCities.add("Dhaka");
		BanglaCities.add("Khulna");

		List<String>USCities = new ArrayList<String>();
		USCities.add("New York City");
		USCities.add("Miami");
		USCities.add("Los Angeles");


		List<String>MexicanCities = new ArrayList<String>();
		MexicanCities.add("Mexico City");
		MexicanCities.add("Tijuana");
		MexicanCities.add("Acapulco");

		Map<String,List<String>> listofCities=new HashMap<String,List<String>>();
		listofCities.put("Bangladeshi cities",BanglaCities);
		listofCities.put("United States Cities",USCities);
		listofCities.put("Mexican Cities",MexicanCities);

		Iterator it=listofCities.entrySet().iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}

		for(Map.Entry<String,List<String>> cityInfo:listofCities.entrySet()){
			System.out.println("Cities from my favorite countries :"+cityInfo.getKey()+"--->"+cityInfo.getValue());
		}

	}

}

