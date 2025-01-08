package truetest.custom

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import groovy.json.JsonSlurper
import internal.GlobalVariable
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

public class TrueTestScripts {
    
    public static void login() {
        try {
            // Trigger a Login test case
            WebUI.callTestCase(findTestCase('ReusableTest/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)
        } catch(Exception e) {
            if (e.getCause() instanceof WebElementNotFoundException) {
                KeywordUtil.logInfo(e.getMessage())
                KeywordUtil.markWarning(e.getMessage())
            } else {
                throw e
            }
        }
    }
    
    static Integer DELAY_TIME = 3 // in seconds
    
    public static void navigate(String path) {
        String applicationDomain = GlobalVariable.application_domain;
        String queryParameters = "";
        try {
            queryParameters = GlobalVariable.query_params;
        }
        catch (Exception e) {
            KeywordUtil.logInfo(e.getMessage())
        }
        if (path == null) {
            path = "";
        }
        if (!path.startsWith("/")) {
            path = "/$path";
        }
        String url = "$applicationDomain$path";
        if (queryParameters != null && queryParameters.length() > 0) {
            url = "$url?$queryParameters";
        }
        WebUI.navigateToUrl(url);
        WebUI.delay(DELAY_TIME);
    }
    
    public static void selectOptionByValue(TestObject to, String rawValue) {
        def parsedValue = rawValue
        if (!parsedValue.startsWith("[")) {
            parsedValue = "[\"" + parsedValue + "\"]"
        }
        def jsonSlurper = new JsonSlurper()
        def options = jsonSlurper.parseText(parsedValue)
        for (option in options) {
            WebUI.selectOptionByValue(to, option, false)
        }
    }
}

