import java.io.BufferedReader;
import java.io.FileReader;

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
				System.out.println("Eroare! Fisierul nu a putut fi gasit!");
		}
	}
}
