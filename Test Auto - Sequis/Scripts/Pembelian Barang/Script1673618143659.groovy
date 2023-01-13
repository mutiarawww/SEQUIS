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

Mobile.startApplication('C:\\Users\\Lenovo\\Downloads\\Android-MyDemoAppRN.1.3.0.build-244.apk', true)

Mobile.tap(findTestObject('Pembelian Barang/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Pembelian Barang/android.widget.TextView - Add To Cart'), 0)

Mobile.tap(findTestObject('Pembelian Barang/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Pembelian Barang/android.widget.TextView - Proceed To Checkout'), 0)

Mobile.tap(findTestObject('Object Repository/Pembelian Barang/android.widget.TextView - bobexample.com'), 0)

Mobile.tap(findTestObject('Object Repository/Pembelian Barang/android.view.ViewGroup (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Pembelian Barang/android.widget.EditText - Rebecca Winter'), 'Mutiara Nova', 
    0)

Mobile.setText(findTestObject('Object Repository/Pembelian Barang/android.widget.EditText - Mandorley 112'), 'Jalan Kebahagiaan No.100', 
    0)

Mobile.setText(findTestObject('Object Repository/Pembelian Barang/android.widget.EditText - Truro'), 'Jakarta', 0)

Mobile.setText(findTestObject('Object Repository/Pembelian Barang/android.widget.EditText - Cornwall'), 'Jakarta Selatan', 
    0)

Mobile.setText(findTestObject('Object Repository/Pembelian Barang/android.widget.EditText - 89750'), '12345', 0)

Mobile.setText(findTestObject('Object Repository/Pembelian Barang/android.widget.EditText - United Kingdom'), 'Indonesia', 
    0)

Mobile.tap(findTestObject('Object Repository/Pembelian Barang/android.widget.TextView - To Payment'), 0)

Mobile.setText(findTestObject('Object Repository/Pembelian Barang/android.widget.EditText - Rebecca Winter (1)'), 'Mutiara Nova', 
    0)

Mobile.setText(findTestObject('Object Repository/Pembelian Barang/android.widget.EditText - 3258 1265 7568 789'), '325812657568789', 
    0)

Mobile.setText(findTestObject('Object Repository/Pembelian Barang/android.widget.EditText - 0325'), '0325', 0)

Mobile.setText(findTestObject('Object Repository/Pembelian Barang/android.widget.EditText - 123'), '123', 0)

Mobile.tap(findTestObject('Object Repository/Pembelian Barang/android.widget.TextView - Review Order'), 0)

Mobile.tap(findTestObject('Object Repository/Pembelian Barang/android.widget.TextView - Place Order'), 0)

Mobile.tap(findTestObject('Object Repository/Pembelian Barang/android.widget.TextView - Continue Shopping'), 0)

Mobile.closeApplication()

