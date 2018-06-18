import java.io.*;
public class FileHandling {

public static void main(String[] args) throws Exception {
		
		FileReader fr =new FileReader("C:\\Users\\hp\\eclipse-workspace\\Assignment9\\src\\abc.txt");
			 
			    int i;
			    while ((i=fr.read()) != -1)
			      System.out.print((char) i);
			    fr.close();
	  }
}
