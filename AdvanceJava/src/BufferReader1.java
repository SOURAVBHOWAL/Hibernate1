import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReader1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\Sourav Bhowal\\OneDrive\\Desktop\\CG Training\\txt1.txt"));
		String l;
		while((l=br.readLine())!=null) {
			System.out.println(l);
		}
//		BufferedReader br1 = new BufferedReader(
//				new FileReader("C:\\Users\\Sourav Bhowal\\OneDrive\\Desktop\\CG Training\\txt1.txt"));
//		System.out.println(br1.readAllLines());
		
		FileWriter fw=new FileWriter("C:\\Users\\Sourav Bhowal\\OneDrive\\Desktop\\CG Training\\txt3.txt",true);
		fw.append("abcgffghf");
		
			
	}

}



