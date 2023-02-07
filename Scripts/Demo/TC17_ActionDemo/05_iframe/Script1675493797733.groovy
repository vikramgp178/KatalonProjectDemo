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

WebUI.navigateToUrl('https://the-internet.herokuapp.com/iframe')

WebUI.click(findTestObject('Object Repository/Page_The Internet/span_File'))

WebUI.click(findTestObject('Object Repository/Page_The Internet/svg'))

WebUI.setText(findTestObject('Object Repository/Page_The Internet/body_test'), '<p style="">test</p>')

WebUI.click(findTestObject('Object Repository/Page_The Internet/div_Paragraph_tox-toolbar__group'))

WebUI.click(findTestObject('Object Repository/Page_The Internet/button_Paragraph_tox-tbtn'))

WebUI.setText(findTestObject('Object Repository/Page_The Internet/body_test'), '<p style=""><em>test</em></p>')

WebUI.click(findTestObject('Object Repository/Page_The Internet/path'))

WebUI.setText(findTestObject('Object Repository/Page_The Internet/body_test'), '<p style="text-align: left;" data-mce-style="text-align: left;"><em>test</em></p>')

WebUI.click(findTestObject('Object Repository/Page_The Internet/path'))

WebUI.setText(findTestObject('Object Repository/Page_The Internet/body_test'), '<p style="text-align: center;" data-mce-style="text-align: center;"><em>test</em></p>')

WebUI.click(findTestObject('Object Repository/Page_The Internet/button_File'))

WebUI.click(findTestObject('Object Repository/Page_The Internet/span_Format'))

WebUI.click(findTestObject('Object Repository/Page_The Internet/button_Format'))

WebUI.click(findTestObject('Object Repository/Page_The Internet/div_Superscript'))

WebUI.closeBrowser()

