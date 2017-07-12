package FirstExample;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
public class example1 {
	
	
	public static void SimpleExample()	{
		File file = new File("C:\\Temp\\ClientTrace.svclog");
		
		System.out.println("Name: " + file.getName());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Size: " + file.length());
		System.out.println("Last modified: " + new Date(file.lastModified()));
	}
	
        //Ignore this one for now
	public static void ComplexExample() throws IOException, ParseException	{
		example2 file = new example2(new File("C:\\Temp\\ClientTrace.svclog"));
		
		System.out.println("Name: " + file.getName());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Size: " + file.getSize());
		System.out.println("Last modified: " + file.getLastModified());
		System.out.println("Owner: " + file.getOwner());
		System.out.println("Created: " + file.getCreated());
		System.out.println("Accessed: " + file.getAccessed());
		System.out.println("Written: " + file.getWritten());
	}
	
	
	public static void main(String[] args) throws Exception, ParseException {
		
		SimpleExample();
		ComplexExample();
	}
}