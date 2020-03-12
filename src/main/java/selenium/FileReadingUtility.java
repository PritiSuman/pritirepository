package selenium;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import managers.FileReaderManager;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.testng.Assert;


public class FileReadingUtility {
	

	public static String downloadPath = "\\src\\downloadFiles\\";
	private static String deleteExtension =".zip";
	
	
	public static void verify_DownloadWithFile_Extension(String file_Ext)
	{
		String downloadFilePath = (System.getProperty("user.dir")+ FileReaderManager.getInstance().getConfiFileReader().getdownloadFilePath());
		
		Assert.assertTrue(isFileDownloaded_Ext( downloadFilePath, file_Ext), "Failed to download document which has extension" + file_Ext);
	}
	
	
	public static void verify_SizeOfFile(long expectedSize, long actualSize)
	{
		
		Assert.assertTrue(isFileSizeExpected(expectedSize,  actualSize), "actual file is not matching with expected file");
	}
	
	
	
	 public static boolean isFileSizeExpected(long expectedSize, long actualSize)
	 	{
	 		boolean flag = false;
	 		 long difference1 = expectedSize - actualSize;
	 		// long number = 5;
	 	  	   long difference2 = actualSize - expectedSize;
	 		if ((-100<=difference1 && difference1<=100)  ||  (-100<=difference2 && difference2<=100) ) {
	 	  	//if ((difference2<=number)){
	 			 flag =true;
	 			
	 			}
	 	        

	 	    return flag;
	 	}
	
	
	
	
	
	public boolean isFileDownloaded(String downloadPath, String fileName)
	{
		boolean flag = false;
	    File dir = new File(downloadPath);
	    File[] dir_contents = dir.listFiles();
	  	    
	    for (int i = 0; i < dir_contents.length; i++) {
	        if (dir_contents[i].getName().equals(fileName))
	            return flag=true;
	            }

	    return flag;
	}
		
	
	public static boolean isFileDownloaded_Ext( String downloadFilePath, String ext)
	{
		boolean flag=false;
	    File dir = new File(downloadFilePath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        flag = false;
	    }
	    
	    for (int i = 1; i < files.length; i++) {
	    	if(files[i].getName().equalsIgnoreCase(ext)) {
	    		
	    		flag=true;
	    	}
	    }
	    return flag;
	}
	
	/* Get the latest file from a specific directory*/
	public static File getLatestFilefromDir(String dirPath){
	    File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        return null;
	    }
	
	    File lastModifiedFile = files[0];
	    for (int i = 1; i < files.length; i++) {
	       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
	           lastModifiedFile = files[i];
	       }
	    }
	    return lastModifiedFile;
	}
	
	
	public static void deleteAlltheFilesWithExt(String dirPath, String ext)
	{
		//FileFilter fileFiltr = new FileFilter(deleteExtension)
		File dir = new File(dirPath);
	    File files[] = dir.listFiles();
	    
	    for (File f : files )
	    {
	    
	    	if (f.getName().endsWith(ext))
	    	{
	    		f.delete();
	    		
	    	}
	    }
	}
	
	public static File fileRename(String downloadFilePath, String ext, String newFileName)
	{
		//FileReadingUtility fr = new FileReadingUtility();
		File newfile = FileReadingUtility.getLatestFilefromDir( downloadFilePath);
		newfile.renameTo(new File (System.getProperty("user.dir")+ "\\src\\downloadFiles\\ priti.png"));
		String filename = newfile.getName();
		
		System.out.println("latest file is " +filename);
		return newfile;
		
	}
	
	public static  File getTheNewestFile(String downloadFilePath, String ext)
	{
		File theNewestFile = null;
		File dir = new File(downloadFilePath);
		FileFilter fileFilter = new WildcardFileFilter("*." +ext);
		File[] files = dir.listFiles(fileFilter);
		
		if (files.length>0)
		{
			/**The newest files comes first**/
			Arrays.parallelSort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
			theNewestFile = files[0];
		}
		return theNewestFile;
	}
	
	
	public static File getfileWithFileNameFromdirectory ( String downloadFilePath, String name)
	{
		//boolean flag=false;
	    File dir = new File(downloadFilePath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        return null;
	    }
	    File lastModifiedFile = files[0];
	    for (int i = 1; i < files.length; i++) {
	    	if(files[i].getName().equals(name)) {
	    		
	    		lastModifiedFile =files[i];
	    	}
	    }
	    return lastModifiedFile;

	}
}
