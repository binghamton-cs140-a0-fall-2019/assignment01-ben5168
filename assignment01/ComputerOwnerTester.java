package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester{
	public static void main(String[] args){
		DateAndPlaceOfBirth myBirth = new DateAndPlaceOfBirth (2000, 5, 16, "Bellmore", "NY", "USA");
		StreetUSAddress myAddress = new StreetUSAddress ("2061 Freeman Avenue", "", "Bellmore", "NY", "11710"); 
		Person person1 = new Person ("Benjamin", "Martinez", "777-77-7777", myBirth, myAddress); 
		
		Computer comp1 = new Computer ("Dell", "Intel Core i9", 16, 500, false, 3000);
		Computer comp2 = new Computer ("Apple", "Intel Core i7", 32, 500, true, 3500);
		Computer comp3 = new Computer ("HP Omen", "Intel Core i5", 32, 1100, true, 3250);
		Computer comp4 = new Computer ("Alienware", "Interl Core i7", 16, 1200, false, 3000);
		
		ComputerOwner compOwner1 = new ComputerOwner(person1);
		
		compOwner1.addComputer(comp1);
		compOwner1.addComputer(comp2);
		compOwner1.addComputer(comp3);
		compOwner1.addComputer(comp4); 
		
		System.out.println(compOwner1);
		
		compOwner1.removeComputer(1);
		compOwner1.removeComputer(2);
		
		System.out.println(compOwner1);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");
		
		//DateAndPlaceOfBirth myBirth = new DateAndPlaceOfBirth (2000, 5, 16, "Bellmore", "NY", "USA");
		//StreetUSAddress myAddress = new StreetUSAddress ("2061 Freeman Avenue", "", "Bellmore", "NY", "11710"); 
		Person person12 = new Person ("Benjamin", "Martinez", "777-77-7777", myBirth, myAddress); 
		
		Computer comp12 = new Computer ("Dell", "Intel Core i9", 16, 500, false, 3000);
		Computer comp22 = new Computer ("Apple", "Intel Core i7", 32, 500, true, 3500);
		Computer comp32 = new Computer ("HP Omen", "Intel Core i5", 32, 1100, true, 3250);
		Computer comp42 = new Computer ("Alienware", "Interl Core i7", 16, 1200, false, 3000);
		
		ComputerOwner compOwner12 = new ComputerOwner(person12);
		
		compOwner12.addComputer(comp12);
		compOwner12.addComputer(comp22);
		compOwner12.addComputer(comp32);
		compOwner12.addComputer(comp42); 

		output.println(compOwner12);
		
		compOwner12.removeComputer(1);
		compOwner12.removeComputer(2);
		
		output.println(compOwner12);
		

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
		
		
		
		