package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;



public class PersonTester{
	public static void main(String[] args){
		DateAndPlaceOfBirth myBirth = new DateAndPlaceOfBirth (2000, 5, 16, "Bellmore", "NY", "USA");
		StreetUSAddress myAddress = new StreetUSAddress ("2061 Freeman Avenue", "", "Bellmore", "NY", "11710"); 
		Person person1 = new Person ("Benjamin", "Martinez", "777-77-7777", myBirth, myAddress); 
		
		System.out.println(person1);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		Person person12 = new Person ("Benjamin", "Martinez", "777-77-7777", myBirth, myAddress);
		output.println(person12);
		
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}