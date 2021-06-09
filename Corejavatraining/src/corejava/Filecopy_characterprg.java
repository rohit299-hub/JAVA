package corejava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filecopy_characterprg {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("F:\\Qualityclass\\textfile1.txt");
        FileWriter fw = new FileWriter("F:\\Qualityclass\\textfile2.txt");

       int c = fr.read();
       while(c!=-1) {
           fw.write(c);
           c = fr.read();
       }
       System.out.println("File copied successfully!!!");
       fr.close();
       fw.close();     
	}

}
