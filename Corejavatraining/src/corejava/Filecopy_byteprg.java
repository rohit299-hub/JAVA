package corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecopy_byteprg {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File infile =new File("F:\\Qualityclass\\textfile1.txt");
		File outfile =new File("F:\\Qualityclass\\textfile2.txt");
		
		FileInputStream fileinputstream =new FileInputStream(infile);
		FileOutputStream fileoutputstream =new FileOutputStream(outfile);
		
		int i;
		while ((i=fileinputstream.read())!=-1)
		{
			fileoutputstream.write(i);
		}
		System.out.println("file copied");
		fileinputstream.close();
		fileoutputstream.close();
		

	}

}
