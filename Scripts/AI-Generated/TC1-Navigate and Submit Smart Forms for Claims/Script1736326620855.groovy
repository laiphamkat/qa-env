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

"Step 4: Click on link Claims"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Claims'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link Claims.png')

"Step 5: Click on link SmartFormSchedule -> Navigate to page 'form endpoint#*/smart form schedule'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_SmartFormSchedule'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link SmartFormSchedule - Navigate to page form endpointsmart form schedule.png')

"Step 6: Select option with input value from select ClaimStatus"

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_form_endpoint/select_ClaimStatus'), select_ClaimStatus)

"Step 7: Select option with input value from select AACRegion"

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_form_endpoint/select_AACRegion'), select_AACRegion)

"Step 8: Click on link Apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/smart_form_schedule?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_endpoint/link_Apply'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link Apply.png')

"Step 9: Click on link SubmitSmartForms"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/smart_form_schedule?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_endpoint/link_SubmitSmartForms'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on link SubmitSmartForms.png')

"Step 10: Click on link Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/smart_form_schedule?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_endpoint/link_Close'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on link Close.png')

"Step 11: Click on link Clear"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/smart_form_schedule?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_endpoint/link_Clear'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link Clear.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate and Submit Smart Forms for Claims_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}