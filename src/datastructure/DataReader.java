package datastructure;

import java.io.FileReader;
import java.io.BufferedReader;

public class DataReader{


	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		FileReader fr=null;
		BufferedReader br=null;
		String textFile = "C:\\Users\\Jewell\\Desktop\\Midterm18/src/data/self-driving-car";
		try{
			fr=new FileReader(textFile);
			System.out.println("Congrats, we found your data!");
		}catch(Exception e){
			System.out.println("File not found");
		}

		try{ br=new BufferedReader(fr);
			String data="";
			while((data=br.readLine())!=null){
				System.out.println(data);
			}

		}catch (Exception ex){
			System.out.println("Data cannot be found, where is it? .");
		}
	}
}

