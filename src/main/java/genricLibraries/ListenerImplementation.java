package genricLibraries;

import org.testng.ITestResult;

public class ListenerImplementation {
@Override
public void oneTestStart(ITestReOsult result) {
	System.out.println(result.getMethod().getMethodName()+"Executio Starts");
}
@Override
public void onTestSuccess(ITestResult result) {
	System.out.println(result.getMethod().getMethodName());
}

}
