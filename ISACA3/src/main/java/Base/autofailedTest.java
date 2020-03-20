package Base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

 public interface autofailedTest 
{
	 
	  boolean runfailedcases(ITestResult result);
}
  class callfailedmethod implements autofailedTest
  {
	 int count =0;
     int retrylimit =4;
	 public boolean  runfailedcases(ITestResult result)
	 {
		 if(count<retrylimit && result.isSuccess()==true)
			{
				count++;
				return true;
			}
		 return false;	
 }
 }

 

		