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

"Step 2: Click on link RetirementCalculator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250203/Page_homepage/link_RetirementCalculator2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on link RetirementCalculator2.png')

"Step 3: Click on link RetirementCalculator2 -> Navigate to page 'calculator#*/retirementcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250203/Page_homepage/link_RetirementCalculator2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link RetirementCalculator2 - Navigate to page calculatorretirementcalculator.png')

"Step 4: Click on link InvestmentFinder -> Navigate to page 'investment product finder#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250203/Page_calculator/link_InvestmentFinder'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link InvestmentFinder - Navigate to page investment product finder.png')

"Step 5: Click on link RetirementCalculator -> Navigate to page 'calculator#*/retirementcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250203/Page_investment_product_finder/link_RetirementCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on link RetirementCalculator - Navigate to page calculatorretirementcalculator.png')

"Step 6: Click on link WelcomeToFidelity -> Navigate to page 'homepage#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250203/Page_calculator/link_WelcomeToFidelity'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on link WelcomeToFidelity - Navigate to page homepage.png')

"Step 7: Click on link RetirementCalculator2 -> Navigate to page 'calculator#*/retirementcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250203/Page_homepage/link_RetirementCalculator2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on link RetirementCalculator2 - Navigate to page calculatorretirementcalculator.png')

"Step 8: Click on div InputRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250203/Page_calculator/div_InputRow'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on div InputRow.png')

"Step 9: Click on input userFinancialData (UserAge2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on input userFinancialData UserAge2 - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Explore Investment Finder and Return to Retirement Calculator_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}