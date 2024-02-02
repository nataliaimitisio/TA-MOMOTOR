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

WebUI.verifyElementClickable(findTestObject('Registrasi/button_Daftar'))

WebUI.click(findTestObject('Registrasi/button_Daftar'))

WebUI.takeScreenshot()

WebUI.verifyElementClickable(findTestObject('Registrasi/button_daftarDisini'))

WebUI.click(findTestObject('Registrasi/button_daftarDisini'))

WebUI.verifyElementVisible(findTestObject('Registrasi/textbox_Email'))

WebUI.setText(findTestObject('Registrasi/textbox_Email'), email)

WebUI.verifyElementVisible(findTestObject('Registrasi/textbox_nomorPonsel'))

WebUI.setText(findTestObject('Registrasi/textbox_nomorPonsel'), nomorponsel)

WebUI.verifyElementVisible(findTestObject('Registrasi/textbox_Sandi'))

WebUI.setText(findTestObject('Registrasi/textbox_Sandi'), password)

WebUI.check(findTestObject('Registrasi/checkbox_sdK'))

WebUI.verifyElementClickable(findTestObject('Registrasi/button_daftaruserBaru'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registrasi/button_daftaruserBaru'))

WebUI.takeScreenshot()

