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

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Button_Home'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Button_Jual'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Harga_Product'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Icon_account'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Icon_list_product'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Icon_notification'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Icon_Search'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Kategori_Baju'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Kategori_Elektronik'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Kategori_Hobi'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Kategori_Kendaraan'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Kategori_Kesehatan'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Kategori_Product'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Kategori_Semua'))

WebUI.verifyElementVisible(findTestObject('Secondhand Website/Feature 1 - Shinta/Landing Page/Search_Field'))

