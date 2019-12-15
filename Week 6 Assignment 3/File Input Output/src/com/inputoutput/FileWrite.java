package com.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException{
		int num = 1;
		File file = new File("H:\\workspace\\File Input Output\\src\\com\\inputoutput.txt");
		try (FileWriter writer = new FileWriter(file,true)) {
			while(num <= 100){
			writer.write(num+" ");
			num++;
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	
	
	}
}
	  