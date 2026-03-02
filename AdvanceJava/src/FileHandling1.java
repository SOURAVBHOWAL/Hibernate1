import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling1 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Sourav Bhowal\\OneDrive\\Desktop\\CG Training\\txt1.txt");
		System.out.println(f.createNewFile());
		FileInputStream fs=new FileInputStream(f);
		Scanner sc= new Scanner(new File("C:\\Users\\Sourav Bhowal\\OneDrive\\Desktop\\CG Training\\txt1.txt"));
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		int count;
		while((count=fs.read())!=-1)
			System.out.print((char)count);
		
	}

}

