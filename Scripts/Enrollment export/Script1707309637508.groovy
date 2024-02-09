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
import com.kms.katalon.core.webui.constants.CoreWebuiMessageConstants as CoreWebuiMessageConstants
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/button_Capture object_menuButton'))

WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/li_Visit import  export'))

WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Visit_Import_Export/span_Enrollment export'))

WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Visit_Import_Export/button_Generate'))

WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Visit_Import_Export/button_Refresh'))

if (true) {
    WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Visit_Import_Export/button_Download'), FailureHandling.STOP_ON_FAILURE)
} else if (true) {
    WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Visit_Import_Export/button_Refresh'), FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Visit_Import_Export/button_Download'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

