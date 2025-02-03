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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link retirementCalculator RetirementCalculator - Navigate to page calculatorretirementcalculator.png')

"Step 3: Click on input userFinancialData (UserAge2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on input userFinancialData UserAge2.png')

"Step 4: Enter input value in input userFinancialData (UserAge2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_1]), input_userFinancialData)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Enter input value in input userFinancialData UserAge2.png')

"Step 5: Click on input userFinancialData (UserAnnualIncome2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on input userFinancialData UserAnnualIncome2.png')

"Step 6: Enter input value in input userFinancialData (UserAnnualIncome2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_3]), input_userFinancialData_1)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Enter input value in input userFinancialData UserAnnualIncome2.png')

"Step 7: Click on input userFinancialData (UserRetirementSavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on input userFinancialData UserRetirementSavings.png')

"Step 8: Enter input value in input userFinancialData (UserRetirementSavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_5]), input_userFinancialData_2)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Enter input value in input userFinancialData UserRetirementSavings.png')

"Step 9: Click on input userFinancialData (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on input userFinancialData UserMonthlySavings.png')

"Step 10: Enter input value in input userFinancialData (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_7]), input_userFinancialData_3)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Enter input value in input userFinancialData UserMonthlySavings.png')

"Step 11: Click on link navigationActions (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250203/Dynamic Objects/Page_calculator/link_navigationActions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250203/Dynamic Objects/Page_calculator/link_navigationActions', ['link_navigationActions_internalRoleLinkName': link_navigationActions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link navigationActions Next.png')

"Step 12: Click on input userFinancialData (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on input userFinancialData UserIncomeOther.png')

"Step 13: Enter input value in input userFinancialData (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_9]), input_userFinancialData_4)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Enter input value in input userFinancialData UserIncomeOther.png')

"Step 14: Click on link navigationActions (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250203/Dynamic Objects/Page_calculator/link_navigationActions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250203/Dynamic Objects/Page_calculator/link_navigationActions', ['link_navigationActions_internalRoleLinkName': link_navigationActions_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on link navigationActions Next.png')

"Step 15: Adjust div sliderControls by input value (InvestmentStyleSlider)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('Archived/Archived_20250203/Dynamic Objects/Page_calculator/div_sliderControls'), Double.valueOf(div_sliderControls))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Adjust div sliderControls by input value InvestmentStyleSlider.png')

"Step 16: Click on link navigationActions (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250203/Dynamic Objects/Page_calculator/link_navigationActions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250203/Dynamic Objects/Page_calculator/link_navigationActions', ['link_navigationActions_internalRoleLinkName': link_navigationActions_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on link navigationActions Next.png')

"Step 17: Adjust div sliderControls by input value (RequiredIncomeSlider)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('Archived/Archived_20250203/Dynamic Objects/Page_calculator/div_sliderControls'), Double.valueOf(div_sliderControls_1))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Adjust div sliderControls by input value RequiredIncomeSlider.png')

"Step 18: Click on link navigationActions (SeeMyResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "Archived/Archived_20250203/Dynamic Objects/Page_calculator/link_navigationActions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20250203/Dynamic Objects/Page_calculator/link_navigationActions', ['link_navigationActions_internalRoleLinkName': link_navigationActions_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on link navigationActions SeeMyResults.png')

"Step 19: Click on link startOver (StartOver) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Archived/Archived_20250203/Dynamic Objects/Page_calculator/link_startOver'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on link startOver StartOver - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Utilize Retirement Calculator with Multiple Inputs and Reset_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}