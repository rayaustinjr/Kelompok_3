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

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Verify Content'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Input Registered Email'), [('email') : 'rayseller@gmail.com'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Input Correct Password'), [('password') : '123'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Click_btn_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 2/Homepage/Verify_User_Logged'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 2/Homepage/Click_Btn_Jual'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 2/Add Product/Add Product From Homepage'), [('productName') : 'ahey', ('productPrice') : '1'
        , ('productCategory') : 'Kendaraan', ('description') : 'apaya'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 3 - Ray/DeleteProduct - Daftar Jual/Click_Btn_Hamburger'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 3 - Ray/EditProduct/Click_Product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 3 - Ray/EditProduct/Click_Btn_Edit'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 3 - Ray/EditProduct/Clear Fields'), [('productName') : '', ('productPrice') : ''
        , ('productCategory') : 'Pilih Kategori', ('description') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 3 - Ray/EditProduct/Click_Btn_Preview'), [:], FailureHandling.STOP_ON_FAILURE)

