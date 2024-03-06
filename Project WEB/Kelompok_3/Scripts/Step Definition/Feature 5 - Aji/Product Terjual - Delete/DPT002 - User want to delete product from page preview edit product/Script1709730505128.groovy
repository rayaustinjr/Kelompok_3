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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Input Registered Email'), [('email') : 'mariatigulto0m@gmail.com'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Input Correct Password'), [('password') : 'binar12345'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Click_btn_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 2/Homepage/Click_Btn_Jual'), [:], FailureHandling.STOP_ON_FAILURE)

String product = 'abcde'

String randomProductName = RandomStringUtils.randomAlphabetic(5)

WebUI.callTestCase(findTestCase('Pages/Feature 2/Add Product/Add Product From Homepage'), [('productName') : randomProductName
        , ('productPrice') : '100 ', ('productCategory') : 'Hobi', ('description') : 'challege'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Logout/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Input Registered Email'), [('email') : 'mariati@mailinator.com'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Input Correct Password'), [('password') : '123456'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Click_btn_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 2/Homepage/Search Product'), [('searchKey') : randomProductName], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 4 - Mariati/AcceptOffer/Select Product Name'), [('productName') : randomProductName], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 4 - Mariati/OfferProduct/Click button Saya Tertarik dan Ingin Nego'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 4 - Mariati/OfferProduct/Input Field harga Tawar'), [('offerPrice') : '100'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 4 - Mariati/OfferProduct/Click button Kirim'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 4 - Mariati/OfferProduct/Verify waiting respom'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Logout/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Input Registered Email'), [('email') : 'mariatigulto0m@gmail.com'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Input Correct Password'), [('password') : 'binar12345'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Click_btn_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 2/Homepage/Click All Notification'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 4 - Mariati/Reject Offer/Click Product Notifikasi'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 4 - Mariati/AcceptOffer/Click button terima'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 4 - Mariati/AcceptOffer/Click button status offer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 4 - Mariati/AcceptOffer/Click Perbaharui Status Penjualan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 2/Homepage/Click_Homepage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 5 - Aji/Product Terjual/Click Menu Produk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 5 - Aji/Product Terjual/Click Menu Produk Terjual'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 3 - Ray/Edit Product - Daftar Jual/Click_Product'), [('productName') : GlobalVariable.GproductName], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 3 - Ray/Edit Product - Daftar Jual/Click_Btn_Edit'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 3 - Ray/Edit Product - Daftar Jual/Click_Btn_Preview'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 3 - Ray/DeleteProduct - Notifikasi/Click_Btn_Delete'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 5 - Aji/Product Terjual/Click Menu Produk Terjual'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 3 - Ray/DeleteProduct - Daftar Jual/Verify Produk Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

