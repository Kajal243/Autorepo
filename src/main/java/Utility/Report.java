package Utility;

public class Report {
	public static ExtentReports CreateReport()
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
		
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		reports.SetSystemInfo("Regression","Zerodha");
		reports.SetSystemInfo("Browser","Chrome");
		return reports;

	}

}
