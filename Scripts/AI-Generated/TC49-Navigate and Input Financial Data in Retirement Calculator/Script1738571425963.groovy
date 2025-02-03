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

"Step 1: Navigate to */retirementcalculator"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/retirementcalculator")

"Step 2: Click on input userFinancialInputs (UserAge)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs', ['input_userFinancialInputs_internalLabel': input_userFinancialInputs_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 2-Click on input userFinancialInputs UserAge.png')

"Step 3: Enter input value in input userFinancialInputs (UserAge)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs', ['input_userFinancialInputs_internalLabel': input_userFinancialInputs_internalLabel_1]), input_userFinancialInputs)

WebUI.takeScreenshot(reportLocation + '/TC49/Step 3-Enter input value in input userFinancialInputs UserAge.png')

"Step 4: Click on input userFinancialInputs (UserAnnualIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs', ['input_userFinancialInputs_internalLabel': input_userFinancialInputs_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 4-Click on input userFinancialInputs UserAnnualIncome.png')

"Step 5: Enter input value in input userFinancialInputs (UserAnnualIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs', ['input_userFinancialInputs_internalLabel': input_userFinancialInputs_internalLabel_3]), input_userFinancialInputs_1)

WebUI.takeScreenshot(reportLocation + '/TC49/Step 5-Enter input value in input userFinancialInputs UserAnnualIncome.png')

"Step 6: Click on link navigationMenu (navigation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/link_navigationMenu"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/link_navigationMenu', ['link_navigationMenu_internalRoleLinkName': link_navigationMenu_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 6-Click on link navigationMenu navigation.png')

"Step 7: Click on input userFinancialInputs (UserRetirementSavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs', ['input_userFinancialInputs_internalLabel': input_userFinancialInputs_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 7-Click on input userFinancialInputs UserRetirementSavings.png')

"Step 8: Enter input value in input userFinancialInputs (UserRetirementSavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs', ['input_userFinancialInputs_internalLabel': input_userFinancialInputs_internalLabel_5]), input_userFinancialInputs_2)

WebUI.takeScreenshot(reportLocation + '/TC49/Step 8-Enter input value in input userFinancialInputs UserRetirementSavings.png')

"Step 9: Click on input userFinancialInputs (UserMonthlySavings) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInputs', ['input_userFinancialInputs_internalLabel': input_userFinancialInputs_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC49/Step 9-Click on input userFinancialInputs UserMonthlySavings - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC49-Navigate and Input Financial Data in Retirement Calculator_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}