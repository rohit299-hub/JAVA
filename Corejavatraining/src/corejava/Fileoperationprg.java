package corejava;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileoperationprg {
	
	File file =new File("F:\\Qualityclass\\textfile.txt");
	
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
		 FileWriter myWriter = new FileWriter(file,true);
	      myWriter.write("Files in Java might be tricky, but it is fun enough!");
	      myWriter.write("This\n is\n an\n example\n");
	   
	      myWriter.append("java is a programming language");
	      myWriter.write('\n');	 
	      myWriter.append("java is a programming language");
	  
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	  
	    
	}
public void fileread() throws IOException
	{
		  FileReader fr=new FileReader(file);    
          int i;    
          while((i=fr.read())!=-1) { //Java is programming  
          System.out.print((char)i); //integer value is converted to character  
          }
          fr.close();    
    } 

public void filedelete() throws InterruptedException
{
	
    if (file.delete()) { 
    	
      System.out.println("Deleted the file: " + file.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
	
}

public static void main(String[] args) throws IOException, InterruptedException {
	// TODO Auto-generated method stub
	Fileoperationprg fop=new Fileoperationprg ();
	fop.filecreate();
	fop.filewrite();
	fop.fileread();
	//fop.filedelete();
}

}