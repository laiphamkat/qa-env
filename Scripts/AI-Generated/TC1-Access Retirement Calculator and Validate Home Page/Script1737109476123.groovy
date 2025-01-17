import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to *"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}")

"Step 2: Click on link retirementCalculator (RetirementCalculator) -> Navigate to page 'calculator#*/retirementcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_homepage/link_retirementCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link retirementCalculator RetirementCalculator - Navigate to page calculatorretirementcalculator.png')

"Step 3: Click on input userFinancialData (UserAge)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on input userFinancialData UserAge.png')

"Step 4: Enter input value in input userFinancialData (UserAge)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_1]), input_userFinancialData)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Enter input value in input userFinancialData UserAge.png')

"Step 5: Click on input userFinancialData (UserAnnualIncome) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on input userFinancialData UserAnnualIncome - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Access Retirement Calculator and Validate Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}