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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://nextjs.momotor.id/')

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Motor Baru/button_MotorBaru'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Motor Baru/button_MotorBaru'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Motor Baru/label_MotorBaru'))

WebUI.click(findTestObject('Motor Baru/button_CekDetail'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Motor Baru/button_AjukanKredit'))

WebUI.click(findTestObject('Motor Baru/button_AjukanKredit'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Motor Baru/textbox_NamaLengkap'))

WebUI.setText(findTestObject('Motor Baru/textbox_NamaLengkap'), 'Dwi')

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Motor Baru/textbox_NomorHandphone'))

WebUI.setText(findTestObject('Motor Baru/textbox_NomorHandphone'), '081021828746')

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Motor Baru/textbox_Email'))

WebUI.setText(findTestObject('Motor Baru/textbox_Email'), 'testingdwi08@gmail.com')

WebUI.takeScreenshot()

