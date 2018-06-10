package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC0013_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC013_CreateLead";
		testDescription="Login into LeafTaps and navigate to create lead and finally validate the first name";
		testNodes="Leads";
		category="Smoke";
		authors="Ramesh";
		browserName="chrome";
		dataSheetName="TC013";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String fName,String lName, String cName , String loggedName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(loggedName)
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.eleFirstName(fName)
		.eleLastName(lName)
		.eleCompanyName(cName);
				
	}

}
