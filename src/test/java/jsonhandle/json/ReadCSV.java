package jsonhandle.json;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class ReadCSV {

	public static void main(String[] args) {
		 String csvFile = "E:\\file.csv";

	        CSVReader reader = null;
	        try {
	            reader = new CSVReader(new FileReader(csvFile));
	            String[] line;
	            while ((line = reader.readNext()) != null) {
	                System.out.println("Country [id= " + line[0] + ", code= " + line[1] + " , name=" + line[2] + "]");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }


	    }


}
