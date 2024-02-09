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

WebUI.setText(findTestObject('Object Repository/Geolocation tracking/input_IDToken1'), 'much_tester')

WebUI.setEncryptedText(findTestObject('Object Repository/Geolocation tracking/input_IDToken2'), '8qXDBIeY31Mc5fCCl/I//g==')

WebUI.click(findTestObject('Object Repository/Geolocation tracking/input_Login.Submit'))

WebUI.click(findTestObject('Object Repository/Geolocation tracking/buttonmenuButton'))

WebUI.click(findTestObject('Object Repository/Geolocation tracking/li_Geolocation tracking'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/buttontoggleFilterMenuButton'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/buttonclearFilterButton'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/buttonsearchResultsButton'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/span_Teams position'), 'Team\'s position')

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/input_geolocationFilterType'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/label_Location'), 'LOCATION')

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/div_Select location'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Geolocation tracking/div_Select location'))

WebUI.click(findTestObject('Object Repository/Geolocation tracking/div_Select location'))

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/h2_Select location (1)'), 'Select location')

WebUI.click(findTestObject('Object Repository/Geolocation tracking/div_RegionRegion'))

WebUI.click(findTestObject('Object Repository/Geolocation tracking/li_Choose location'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/button_Done'), 0)

WebUI.click(findTestObject('Object Repository/Geolocation tracking/button_Done'))

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/div_Select location_1'), 'Select location')

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/label_Team leader'), 'TEAM LEADER')

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/div_'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Geolocation tracking/div_'))

WebUI.click(findTestObject('Geolocation tracking/div_teamLeader (1)'))

WebUI.verifyElementText(findTestObject('Geolocation tracking/li_Select team leader'), 'Select team leader')

WebUI.click(findTestObject('Geolocation tracking/li_Select team leader'))

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/label_Last result position limit'), 'LAST RESULT POSITION LIMIT')

WebUI.verifyElementPresent(findTestObject('Geolocation tracking/input_teamPosition.lastResultPosition'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Geolocation tracking/input_teamPosition.lastResultPosition'))

WebUI.click(findTestObject('Geolocation tracking/input_teamPosition.lastResultPosition'))

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/label_Position update limit (minutes)'), 
    'POSITION UPDATE LIMIT (MINUTES)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/input_teamPosition.positionUpdateLimit'), 
    0)

WebUI.setText(findTestObject('Geolocation tracking/input_teamPosition.positionUpdateLimit'), '12')

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/label_Auto refresh (minutes)'), 'AUTO REFRESH (MINUTES)')

WebUI.verifyElementPresent(findTestObject('Geolocation tracking/div_AutoRefresh'), 0)

WebUI.verifyElementClickable(findTestObject('Geolocation tracking/div_AutoRefresh'))

WebUI.click(findTestObject('Geolocation tracking/div_AutoRefresh'))

WebUI.verifyElementPresent(findTestObject('Geolocation tracking/li_Disabled'), 0)

WebUI.click(findTestObject('Geolocation tracking/li_Disabled'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/input_geolocationFilterType'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/span_Route'), 'Route')

WebUI.check(findTestObject('Object Repository/Geolocation tracking/input_concat(Route)_geolocationFilterType_Route'))

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/label_Visitor'), 'VISITOR')

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/input_Visitor_downshift-input-2'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/span_Required'), 'Required')

WebUI.setText(findTestObject('Object Repository/Geolocation tracking/input_Visitor_downshift-input-2'), 'muf_tester')

WebUI.click(findTestObject('Object Repository/Geolocation tracking/div_muf_tester'))

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/label_Date'), 'DATE')

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/input_Date_MuiInputBase-input MuiInput-inpu_de0a26'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/button_Date_MuiButtonBase-root MuiIconButton-root'), 
    0)

WebUI.click(findTestObject('Object Repository/Geolocation tracking/button_Date_MuiButtonBase-root MuiIconButton-root'))

WebUI.click(findTestObject('Object Repository/Geolocation tracking/button_6'))

WebUI.click(findTestObject('Object Repository/Geolocation tracking/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/label_Planned vs. real location distance (meters)'), 
    'PLANNED VS. REAL LOCATION DISTANCE (METERS)')

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/input_Planned vs. real location distance (m_80e779'), 
    0)

WebUI.setText(findTestObject('Geolocation tracking/input_Planned vs. real location distance (m_80e779'), '50')

WebUI.verifyElementText(findTestObject('Object Repository/Geolocation tracking/label_Auto refresh (minutes)'), 'AUTO REFRESH (MINUTES)')

WebUI.verifyElementPresent(findTestObject('Geolocation tracking/div_AutoRefreshRoute'), 0)

WebUI.verifyElementClickable(findTestObject('Geolocation tracking/div_AutoRefreshRoute'))

WebUI.click(findTestObject('Geolocation tracking/div_AutoRefreshRoute'))

WebUI.verifyElementPresent(findTestObject('Geolocation tracking/li_Disabled'), 0)

WebUI.click(findTestObject('Geolocation tracking/li_Disabled'))

WebUI.click(findTestObject('Object Repository/Geolocation tracking/buttonsearchResultsButton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Geolocation tracking/button_Geolocation tracking_RouteStatistics'), 
    0)

WebUI.click(findTestObject('Object Repository/Geolocation tracking/button_Geolocation tracking_RouteStatistics'))

WebUI.verifyElementPresent(findTestObject('Geolocation tracking/th_Shift started'), 0)

WebUI.verifyElementText(findTestObject('Geolocation tracking/th_Shift started'), 'SHIFT STARTED')

WebUI.verifyElementPresent(findTestObject('Geolocation tracking/th_Shift ended'), 0)

WebUI.verifyElementText(findTestObject('Geolocation tracking/th_Shift ended'), 'SHIFT ENDED')

WebUI.verifyElementPresent(findTestObject('Geolocation tracking/th_Travelled distance'), 0)

WebUI.verifyElementText(findTestObject('Geolocation tracking/th_Travelled distance'), 'TRAVELLED DISTANCE')

WebUI.verifyElementPresent(findTestObject('Geolocation tracking/button_Hide'), 0)

WebUI.verifyElementText(findTestObject('Geolocation tracking/button_Hide'), 'HIDE')

WebUI.verifyElementClickable(findTestObject('Geolocation tracking/button_Hide'))

WebUI.click(findTestObject('Geolocation tracking/button_Hide'))

WebUI.closeBrowser()

