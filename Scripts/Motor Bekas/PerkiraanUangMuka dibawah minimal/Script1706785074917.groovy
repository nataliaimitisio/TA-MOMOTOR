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

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl(GlobalVariable.nextjs)
//
//WebUI.takeScreenshot()
WebUI.navigateToUrl(GlobalVariable.nextjs)

WebUI.verifyElementVisible(findTestObject('Motor Bekas/button_MotorBekas'))

WebUI.verifyElementClickable(findTestObject('Motor Bekas/button_MotorBekas'))

WebUI.click(findTestObject('Motor Bekas/button_MotorBekas'))

WebUI.takeScreenshot(null)

WebUI.verifyElementVisible(findTestObject('Motor Bekas/label_MotorBekas'))

WebUI.verifyElementClickable(findTestObject('Motor Bekas/label_NamaMotor'))

WebUI.click(findTestObject('Motor Bekas/label_NamaMotor'))

WebUI.takeScreenshot()

WebUI.verifyElementClickable(findTestObject('Motor Bekas/button_AjukanKredit'))

WebUI.click(findTestObject('Motor Bekas/button_AjukanKredit'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Motor Bekas/label_PengajuanMotor'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Motor Bekas/dropdown_domisili'))

WebUI.verifyElementClickable(findTestObject('Motor Bekas/dropdown_Domisili'))

WebUI.click(findTestObject('Motor Bekas/dropdown_Domisili'))

WebUI.setText(findTestObject('Motor Bekas/textbox_Domisili'), 'Bekasi')

WebUI.click(findTestObject('Motor Bekas/option_Domisili'))

WebUI.takeScreenshot()

WebUI.verifyElementClickable(findTestObject('Motor Bekas/dropdown_Cabang'))

WebUI.click(findTestObject('Motor Bekas/dropdown_Cabang'))

WebUI.click(findTestObject('Motor Bekas/option_Cabang'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Motor Bekas/textbox_PerkiraanUangMuka'), '500000')

WebUI.verifyElementVisible(findTestObject('Motor Bekas/label_minimalDP'))

WebUI.takeScreenshot()

