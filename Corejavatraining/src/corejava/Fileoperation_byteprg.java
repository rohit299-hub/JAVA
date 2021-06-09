package corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Fileoperation_byteprg {
	
	File file =new File("F:\\Qualityclass\\textfile8.txt");
	String data="Qualitykiosk Technology pvt ltd";
	
	public void filecreate() throws IOException
	{
		if(file.createNewFile())
		{
			System.out.println("File created ... " +file.getName());
		}else
		{
			System.out.println("file already exist.");
		}
	}
	
	public void filewrite() throws IOException
	{
		 FileOutputStream fileoutputstream =new FileOutputStream(file,true);
		 fileoutputstream.write(data.getBytes());
		 fileoutputstream.close();
		 System.out.println("written to file");		 
	    
	}
	
	public void fileread() throws IOException
	{
		FileInputStream fileinputstream=new FileInputStream(file);
		int b;
		while((b=fileinputstream.read())!=-1)
		{
			System.out.print((char)b);
		}
		System.out.println("file has been read");
		
		fileinputstream.close();
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Fileoperation_byteprg fop=new Fileoperation_byteprg();
				fop.filecreate();
		
		fop.filewrite();
		fop.fileread();
	}

}
