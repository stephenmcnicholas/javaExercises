package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports extent;
	
	public static ExtentReports getReportObject() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html"; // user.dir gets path to the current proj dir, then append subdir onto that. 
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Stephen's Web Automation Results");
		reporter.config().setDocumentTitle("Stephen's test results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);  // we attach the "helper" reporter object to the main class
		extent.setSystemInfo("Tester", "Stephen McNicholas"); // sets some info for the main report class
		return extent;
	}
}
