import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/02_Orange_HRM/Page_OrangeHRM/input_Username_username'), UsernameFromLocalVariable, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/02_Orange_HRM/Page_OrangeHRM/input_Password_password'), GlobalVariable.PASSWORD, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/02_Orange_HRM/Page_OrangeHRM/button_Login'))

WebUI.verifyTextPresent('Dashboard', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Leave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Performance'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Yamini Kondapalli22'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_AboutCompany Name OrangeHRMVersion Oran_baf6b6'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Yamini Kondapalli22'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

