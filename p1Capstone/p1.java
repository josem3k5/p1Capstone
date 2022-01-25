package p1Capstone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner for user input
		try {
    		System.out.println("Please enter a file name to import your data from:"); // enter "src/test.csv"
    		//sc.nextLine(); // call nextLine to consume that newline character so subsequent nextLine doesn't return nothing
    		String fileName = sc.nextLine(); // store file name into fileName variable
    		File file = new File(fileName); // create a new file object
    		Scanner scanner = new Scanner(file); // create scanner to read in data (separate from scanner to not interfere when closing scanner)
    		ArrayList<String> array = new ArrayList<String>();
		
    		while (scanner.hasNextLine()) { // while there is a line, continue reading in data
    			String line = scanner.nextLine(); // grab the current line to store
    			String[] splits = line.split(","); // String array to store parsed line where "," exists for Comma Separated Values (csv)
    			
    			for (int i = 0; i < splits.length; i++) {
    				array.add(splits[i]);
    			}
    		}
    		for (int i = 0; i < array.size(); i++) {
    			System.out.print(array.get(i) + " ");
    		}
    		sc.close();
    		scanner.close(); // close scanner before leaving
			} catch (FileNotFoundException e) { // catch any errors here
				System.out.print("Oops! Something went wrong."); // error message
			}
	}
}
