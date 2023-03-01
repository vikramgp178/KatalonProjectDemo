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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/OHRM/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/OHRM/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/OHRM/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/OHRM/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Object Repository/OHRM/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/OHRM/Page_OrangeHRM/input_Employee Full Name_firstName'), 'test12121')

WebUI.doubleClick(findTestObject('Object Repository/OHRM/Page_OrangeHRM/input_Employee Full Name_firstName'))

WebUI.setText(findTestObject('Object Repository/OHRM/Page_OrangeHRM/input_Employee Full Name_firstName'), 'test12121')

WebUI.setText(findTestObject('Object Repository/OHRM/Page_OrangeHRM/input_Employee Full Name_lastName'), 'test12121')

WebUI.doubleClick(findTestObject('Object Repository/OHRM/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/OHRM/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), '121212121')

WebUI.click(findTestObject('Object Repository/OHRM/Page_OrangeHRM/label'))

WebUI.setText(findTestObject('Object Repository/OHRM/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 'test12121')

WebUI.setEncryptedText(findTestObject('Object Repository/OHRM/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus o_671073'), 
    'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.click(findTestObject('Object Repository/OHRM/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/OHRM/Page_OrangeHRM/input_Employee Full Name_firstName'))

WebUI.setText(findTestObject('Object Repository/OHRM/Page_OrangeHRM/input_Employee Full Name_middleName'), 'test')

WebUI.click(findTestObject('Object Repository/OHRM/Page_OrangeHRM/button_Save'))

WebUI.doubleClick(findTestObject('Object Repository/OHRM/Page_OrangeHRM/html_OrangeHRM                  katalonfont_c9515e'))

WebUI.click(findTestObject('Object Repository/OHRM/Page_OrangeHRM/a_Directory'))

WebUI.click(findTestObject('Object Repository/OHRM/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Object Repository/OHRM/Page_OrangeHRM/a_Employee List'))

WebUI.setText(findTestObject('Object Repository/OHRM/Page_OrangeHRM/input'), 'test12121 test test12121')

WebUI.click(findTestObject('Object Repository/OHRM/Page_OrangeHRM/button_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/OHRM/Page_OrangeHRM/div_121212121'), '121212121')

WebUI.closeBrowser()

