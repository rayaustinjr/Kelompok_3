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
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Click Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Input Registered Email'), [('email') : 'rayseller@gmail.com'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Input Correct Password'), [('password') : '123'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 1 - Shinta/Login/Click_btn_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 2/Homepage/Click_Btn_Jual'), [:], FailureHandling.STOP_ON_FAILURE)

String product = 'abcde'

String randomProductName = RandomStringUtils.randomAlphabetic(5)

GlobalVariable.GproductName = randomProductName

WebUI.callTestCase(findTestCase('Pages/Feature 2/Add Product/Add Product From Homepage'), [('productName') : randomProductName
        , ('productPrice') : '1234567', ('productCategory') : 'Hobi', ('description') : 'barang bagus'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Feature 2/Homepage/Click_Btn_List_Product'), [:], FailureHandling.STOP_ON_FAILURE)

while (true) {
    try {
        WebUI.callTestCase(findTestCase('Pages/Feature 2/List Product Page/Verify Product Exist'), [('productName') : randomProductName], 
            FailureHandling.STOP_ON_FAILURE)

        break
    }
    catch (Exception e) {
        WebUI.callTestCase(findTestCase('Pages/Feature 2/List Product Page/Click Next Button'), [:], FailureHandling.STOP_ON_FAILURE)
    } // Jika exception terjadi, lakukan klik next
}

