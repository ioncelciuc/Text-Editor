import java.io.*;

public abstract class Reader {
	public void fileRead(String name) {
		try{
			FileReader in = new FileReader(name);
		    BufferedReader br = new BufferedReader(in);
	
		    String line;
		    while ((line = br.readLine()) != null) {
		        System.out.println(line);
		    }
		    in.close();
		}catch(Exception e) {
				System.out.println("Error! The requested file could not be found!");
		}
	}
}
