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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://infos3347.riskwatch.com/platform/')

WebUI.setText(findTestObject('Object Repository/Page_SecureWatch edit/input_SecureWatch  edit Login_userName'), 'rizwan@fisclouds.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SecureWatch edit/input_SecureWatch  edit Login_password'), 
    '+xsfQ0mNqrnvKx5EZav/3A==')

WebUI.click(findTestObject('Object Repository/Page_SecureWatch edit/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_SecureWatch edit/input_SecureWatch  edit Login_generatedCode'), '1245')

WebUI.click(findTestObject('Object Repository/Page_SecureWatch edit/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_SecureWatch edit/mat-icon_menu'))

WebUI.click(findTestObject('Object Repository/Page_SecureWatch edit/span_Assessments'))

WebUI.click(findTestObject('Object Repository/Page_SecureWatch edit/mat-icon_more_vert'))

WebUI.click(findTestObject('Object Repository/Page_SecureWatch edit/a_Rizwan M_1'))

WebUI.click(findTestObject('Object Repository/Page_SecureWatch edit/button_Logout'))

WebUI.closeBrowser()

