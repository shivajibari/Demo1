package jsonhandle.json;
//import java.io.FileNotFounreadjsondException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class readjson
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
 
        try {
 
            Object obj = parser.parse(new FileReader("C:\\Users\\Shivaji\\Downloads\\sample.json"));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String name = (String) jsonObject.get("firstName");
            String author = (String) jsonObject.get("lastName");
            System.out.println( jsonObject.get("address"));
            JSONArray companyList = (JSONArray) jsonObject.get("address");
            //JSONArray a = ((JSONArray) jsonObject).getJSONArray("address");
            System.out.println(companyList);
            System.out.println("Name: " + name);
            System.out.println("Author: " + author);
            System.out.println("\nCompany List:");
            Iterator<String> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}