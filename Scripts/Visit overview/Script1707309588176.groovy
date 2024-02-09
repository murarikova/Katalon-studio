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

WebUI.navigateToUrl('https://sso.ph00a1.cz.infra/opensso/UI/Login?goto=https://mus.ph00a1.cz.infra/ui#/')

WebUI.setText(findTestObject('Object Repository/Page_Log in to HCI/input_IDToken1'), 'much_tester')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to HCI/input_IDToken2'), '8qXDBIeY31Mc5fCCl/I//g==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Log in to HCI/input_IDToken2'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Vist_Overview/button_Capture object_menuButton'))

WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Vist_Overview/Page_Much application/li_Visit overview'))

WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Vist_Overview/Page_Much application/div_'))

WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Vist_Overview/li_Unassigned'))

WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Vist_Overview/div'))

WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Vist_Overview/Page_Much application/button_Visit overview_searchResultsButton'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Log in to HCI/Vist_Overview/button_Safe guarantee_MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Vist_Overview/button_Safe guarantee_MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary'))

WebUI.click(findTestObject('Object Repository/Page_Log in to HCI/Vist_Overview/button_Capture object_menuButton'))




