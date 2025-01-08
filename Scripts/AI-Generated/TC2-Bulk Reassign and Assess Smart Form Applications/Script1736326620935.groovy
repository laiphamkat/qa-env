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

"Step 1: Navigate to https://edge3.edge.active.jobready.io"

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Click on link SmartFormApplications -> Navigate to page 'dynamic content#smart forms/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_SmartFormApplications'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link SmartFormApplications - Navigate to page dynamic contentsmart forms.png')

"Step 5: Click on button Actions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'smart_forms/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_Actions'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on button Actions.png')

"Step 6: Click on link BulkReAssign"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'smart_forms/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_BulkReAssign'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on link BulkReAssign.png')

"Step 7: Select option with input value from select Assignee"

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_dynamic_content/select_Assignee'), select_Assignee)

"Step 8: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'smart_forms/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on button Submit.png')

"Step 9: Click on link Active -> Navigate to page 'user registration page#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'smart_forms/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_Active'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link Active - Navigate to page user registration page.png')

"Step 10: Click on button SmartForms"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_registration_page/button_SmartForms'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on button SmartForms.png')

"Step 11: Click on link ApplicationForms"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_registration_page/link_ApplicationForms'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link ApplicationForms.png')

"Step 12: Select option with input value from select LodgementType"

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_user_registration_page/select_LodgementType'), select_LodgementType)

"Step 13: Click on input SmartFormsCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_registration_page/input_SmartFormsCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on input SmartFormsCheckbox.png')

"Step 14: Click on link Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_registration_page/link_Close'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on link Close.png')

"Step 15: Click on link Claims"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_registration_page/link_Claims'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on link Claims.png')

"Step 16: Click on button Assess"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_registration_page/button_Assess'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on button Assess.png')

"Step 17: Click on link AssessSchedule"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_registration_page/link_AssessSchedule'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on link AssessSchedule.png')

"Step 18: Click on link No"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_registration_page/link_No'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on link No.png')

"Step 19: Click on button AddPredict"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_registration_page/button_AddPredict'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on button AddPredict.png')

"Step 20: Click on link AddRecurringClaims -> Navigate to page 'form submission#*/*/*/new'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_registration_page/link_AddRecurringClaims'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on link AddRecurringClaims - Navigate to page form submissionnew.png')

"Step 21: Select option with input value from select Type"

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_form_submission/select_Type'), select_Type)

"Step 22: Click on link Cancel -> Navigate to page 'user registration page#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/new?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_submission/link_Cancel'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Click on link Cancel - Navigate to page user registration page.png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Bulk Reassign and Assess Smart Form Applications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}