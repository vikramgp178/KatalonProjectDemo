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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Demo/TC02_Manual_Mode'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Recruitment'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_My Info'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Full Name_firstName'), 'PaulTest')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Nickname_oxd-input oxd-input--focus'), 'Polly')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_License Expiry Date_oxd-icon bi-calendar _fa83c8'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_19'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Paul Collings'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

