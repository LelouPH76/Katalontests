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

WebUI.setText(findTestObject('login_zlibrary/Page_Z-Library Project/input__email'), 'phnlymagmail.com')

WebUI.setText(findTestObject('login_zlibrary/Page_Z-Library Project/input__password'), 'FABbr77%#$&')

WebUI.click(findTestObject('login_zlibrary/Page_Z-Library Project/button_Entrar'))

WebUI.click(findTestObject('página principal z library/Page_Z-Library  the worlds largest e-book library. Your gateway to knowledge/div_Doar_upd-burger js-burger-toggler'))

WebUI.click(findTestObject('página principal z library/Page_Z-Library  the worlds largest e-book library. Your gateway to knowledge/span_Sair'))

