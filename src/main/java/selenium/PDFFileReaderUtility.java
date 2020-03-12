package selenium;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.cucumber.listener.Reporter;

import de.redsix.pdfcompare.CompareResult;
import de.redsix.pdfcompare.PdfComparator;
import managers.FileReaderManager;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;


public class PDFFileReaderUtility {
	
	/*public static void main(String[] args) throws IOException 
	{
		/*String baselinePDF = (System.getProperty("user.dir")+ "\\src\\downloadFiles\\baselineFiles\\group2 (2020-01-31 13_00 to 2020-01-31 13_10).pdf");
		String actualPDF = (System.getProperty("user.dir")+ "\\src\\downloadFiles\\actualFiles\\group2 (last 10 min).pdf");
		String diffPDF = (System.getProperty("user.dir")+ "\\src\\downloadFiles\\diffFiles\\diff");
		String baselinePDF1 = (System.getProperty("user.dir")+ "\\src\\downloadFiles\\baselineFiles\\");
		
		new PdfComparator(baselinePDF, actualPDF).compare().writeTo(diffPDF);
		
		try {
			String downloadFilePath = (System.getProperty("user.dir")+ FileReaderManager.getInstance().getConfiFileReader().getdownloadFilePath());
			//String actual = FileReadingUtility.getfile(downloadFilePath, ".pdf").getName();
			String actual = FileReadingUtility.getLatestFilefromDir(downloadFilePath).getName();
			System.out.println(actual);
			new PDFFileReaderUtility().arePDFFilesEqual("group2 (2020-02-05 14_00 to 2020-02-05 14_10)", actual);
			//FileReadingUtility.getTheSizeOfFile(baselinePDF, "file1.pdf");
			//System.out.println("Name of File: " +FileReadingUtility.getLatestFilefromDir(baselinePDF1).length());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("process completed" );
	}*/
	
	
	
	public  boolean arePDFFilesEqual(String baseline, String actual, String diff) throws InterruptedException, IOException
	{
		
		  Thread.sleep(3000);
		 String  baselinePDF = (System.getProperty("user.dir")+ "\\src\\downloadFiles\\baselineFiles\\"+baseline + ".pdf");
		 String  actualPDF = (System.getProperty("user.dir")+ "\\src\\downloadFiles\\actualFiles\\"+ actual);
		 String diffPDF = (System.getProperty("user.dir")+ "\\src\\downloadFiles\\diffFiles\\" +diff + ".pdf");
	     String ignoreFile = (System.getProperty("user.dir")+ "\\ignore.conf");
		 //final CompareResult result = new PdfComparator(baselinePDF, actualPDF ).compare();
		  
	/*if (result.isNotEqual()) {
	    System.out.println("Differences found!");
	}
	if (result.isEqual()) {
	    System.out.println("No Differences found!");
	}
	if (result.hasDifferenceInExclusion()) {
	    System.out.println("Differences in excluded areas found!");
	}
	result.getDifferences(); // returns page areas, where differences were found*/
	

	boolean isEquals = new PdfComparator(baselinePDF, actualPDF ).compare().writeTo(diffPDF);
	if (!isEquals) {
	    System.out.println("Differences found!");
	    System.out.println(isEquals);
	    Reporter.addStepLog("Diff File : " +diff);
	   
	} 
	System.out.println("process completed : " + isEquals);
	 Reporter.addStepLog("Baseline File : " +baseline);
	 Reporter.addStepLog("Actual File : " +actual);
	return isEquals;
	

}
}
