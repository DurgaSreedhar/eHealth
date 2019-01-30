package eHealth.POC;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import Action_Config.Action_Keywords;
import Action_Utility.TestData_Utility;

public class Base_Exectuable {

	public static WebDriver driver;
	public static String sActionKeyword;
	public static Action_Keywords act_Keywords;
	public static Method method[];

	public Base_Exectuable() throws NoSuchMethodException, SecurityException{
		act_Keywords = new Action_Keywords();
		method = act_Keywords.getClass().getMethods();
	}

	public static void main(String[] args) throws Exception {
		String ExlPath = "C:\\Users\\spasupuleti\\eclipse-workspace\\eHealth_POC\\src\\test\\java\\eHealth\\POC\\Base_Exectuable.java";

		TestData_Utility.setExcelFile(ExlPath, "Test Steps");

		for (int iRow=1;iRow<=5;iRow++){			
			sActionKeyword = TestData_Utility.getCellData(iRow, 2);
			exeAction_Keywords();

		}		

	}

	/*	Get each method from Action_Keywords.java file*/
	public static void exeAction_Keywords() throws Exception {
		for(int i = 0;i < method.length;i++) {

			if(method[i].getName().equals(sActionKeyword)){
				method[i].invoke(act_Keywords);			
				break;
			}
		}
	}
}
