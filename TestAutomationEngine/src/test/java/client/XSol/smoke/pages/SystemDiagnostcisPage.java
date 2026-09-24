package client.XSol.smoke.pages;

import base.mobile.MobileBaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class SystemDiagnostcisPage extends MobileBaseTest
{
    public SystemDiagnostcisPage() {
        initMobileElements(this);

    }
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(14)")
    @iOSXCUITFindBy(accessibility = "\uF248, Diagnostics +, System guides & articles")
    public WebElement diagnosticsButton;

    @AndroidFindBy(accessibility = "\uF287, System Diagnostics, Heating system guides, wiring diagrams & fault finding, \uF23B")
    @iOSXCUITFindBy(accessibility = "\uF287, System Diagnostics, Heating system guides, wiring diagrams & fault finding, \uF23B")
    public WebElement systemDisagnosticsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"ConButt\")")
    @iOSXCUITFindBy(className = "XCUIElementTypeLink")
    public WebElement welcomeToXsolContinueButton;


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"CONTINUE\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"CONTINUE\"`]")
    public WebElement systemDiagnosticsContinueButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"REJECT\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"REJECT\"`]")
    public WebElement warningImportantNoticeRejectButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"ACCEPT\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"ACCEPT\"`]")
    public WebElement warningImportantNoticeAcceptButton;

    /* Select System from the list below */

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(0)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][1]")
    public WebElement yPlanSystemDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(1)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][2]")
    public WebElement sPlanSystemDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(2)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][3]")
    public WebElement gravitySystemDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(3)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][4]")
    public WebElement cPlanSystemDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(4)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][5]")
    public WebElement cPlanPlusSystemDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(5)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][6]")
    public WebElement mPlanSystemDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(6)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][7]")
    public WebElement wPlanSystemDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(7)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][8]")
    public WebElement wPlanSystemWithPrioritySwitchDotButton;

    @AndroidFindBy(accessibility = "y-plan%20description")
    @iOSXCUITFindBy(className = "XCUIElementTypeLink")
    public WebElement yPlanStartButton;

    /* the Y-Plan System */
    @AndroidFindBy(accessibility = "y-plan%20wiring")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"XSOL SYSTEM GUIDE (Y-PLAN INFORMATION)\"`]/XCUIElementTypeOther[4]/XCUIElementTypeLink")
    public WebElement yPlanWiringDiagramButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"yplanffg\")")
    public WebElement faultfindingButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(0)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][1]")
    public WebElement heatingOnlyDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(1)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][2]")
    public WebElement hotWaterOnlyDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(2)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][3]")
    public WebElement heatingAndHotWaterDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(3)")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"1\"")
    public WebElement heatingOnHotWaterSatisfiedDotButton;

    /* Common Buttons */

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"\uF127\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"\uF127\"`]")
    public WebElement backButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"\uF383\")")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"\uF383\"`]")
    public WebElement homeButton;

    /* the S-Plan System */

    @AndroidFindBy(accessibility = "s-plan%20description")
    @iOSXCUITFindBy(className = "XCUIElementTypeLink")
    public WebElement sPlanStartButton;

    @AndroidFindBy(accessibility = "s-plan%20wiring")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"XSOL SYSTEM GUIDE (S-PLAN INFORMATION)\"`]/XCUIElementTypeOther[6]/XCUIElementTypeLink")
    public WebElement sPlanWiringDiagramButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(0)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][1]")
    public WebElement heatingDemandDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(1)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`]")
    public WebElement hotWaterDemandDotButton;

    /* the Gravity System */

    @AndroidFindBy(accessibility = "gravitydescription")
    @iOSXCUITFindBy(className = "XCUIElementTypeLink")
    public WebElement gravitySystemStartButton;

    @AndroidFindBy(accessibility = "gravitywiring")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"XSOL SYSTEM GUIDE (GRAVITY INFORMATION)\"`]/XCUIElementTypeOther[4]/XCUIElementTypeLink")
    public WebElement gravityWiringDiagramButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(0)")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@value=\"0\"])[1]")
    public WebElement heatingAndHotWaterDemandDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(1)")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"0\"")
    public WebElement gravity_hotWaterDemandDotButton;

    /* The C Plan System */

    @AndroidFindBy(accessibility = "c-plandescription")
    @iOSXCUITFindBy(className = "XCUIElementTypeLink")
    public WebElement cPlanStartButton;

    @AndroidFindBy(accessibility = "c-planwiring")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"XSOL SYSTEM GUIDE (C-PLAN INFORMATION)\"`]/XCUIElementTypeOther[4]/XCUIElementTypeLink")
    public WebElement cPlanWiringButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(0)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][1]")
    public WebElement cPlan_heatingDemandDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(1)")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"0\"")
    public WebElement cPlan_hotWaterDemandDotButton;

    /* The C Plan Plus System */

    @AndroidFindBy(accessibility = "c-planplusdescription")
    @iOSXCUITFindBy(className = "XCUIElementTypeLink")
    public WebElement cPlanPlusStartButton;

    @AndroidFindBy(accessibility = "c-planpluswiring")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"XSOL SYSTEM GUIDE (C-PLAN PLUS INFORMATION)\"`]/XCUIElementTypeOther[4]/XCUIElementTypeLink")
    public WebElement cPlanPlusWiringButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(0)")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@value=\"0\"])[1]")
    public WebElement cPlanPlus_heatingDemandDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(1)")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"0\"")
    public WebElement cPlanPlus_hotWaterDemandDotButton;

    /* The M Plan System */

    @AndroidFindBy(accessibility = "m-plandescription")
    @iOSXCUITFindBy(className = "XCUIElementTypeLink")
    public WebElement mPlanStartButton;

    @AndroidFindBy(accessibility = "m-plan%20wiring")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"XSOL SYSTEM GUIDE (M-PLAN INFORMATION)\"`]/XCUIElementTypeOther[4]/XCUIElementTypeLink")
    public WebElement mPlanWiringButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(0)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][1]")
    public WebElement mPlan_heatingDemandDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(1)")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"0\"")
    public WebElement mPlan_hotWaterDemandDotButton;


    /* The W Plan System */

    @AndroidFindBy(accessibility = "w-plandescription")
    @iOSXCUITFindBy(className = "XCUIElementTypeLink")
    public WebElement wPlanStartButton;

    @AndroidFindBy(accessibility = "w-plan%20wiringnops")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"XSOL SYSTEM GUIDE (W-PLAN INFORMATION)\"`]/XCUIElementTypeOther[4]/XCUIElementTypeLink")
    public WebElement wPlanWiringButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(0)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][1]")
    public WebElement wPlan_heatingOnHotWaterDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(1)")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@value=\"0\"])[2]")
    public WebElement wPlan_hotWaterSatisfiedDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(2)")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"1\"")
    public WebElement wPlan_hotWaterOnlyDotButton;


    /* The W Plan System With Priority Switch */

    @AndroidFindBy(accessibility = "w-plandescriptionps")
    @iOSXCUITFindBy(className = "XCUIElementTypeLink")
    public WebElement wPlanPriorityStartButton;

    @AndroidFindBy(accessibility = "w-plan%20wiring")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"XSOL SYSTEM GUIDE (W-PLAN WITH PRIORITY SWITCH INFORMATION)\"`]/XCUIElementTypeOther[4]/XCUIElementTypeLink")
    public WebElement wPlanPriorityWiringButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(0)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][1]")
    public WebElement wPlanPriority_heating_HotWaterCallingDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(1)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][2]")
    public WebElement wPlanPriority_heating_hotWaterSatisfiedDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(2)")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`value == \"0\"`][3]")
    public WebElement wPlanPriority_hot_hotWaterCallingDotButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RadioButton\").instance(3)")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"1\"")
    public WebElement wPlanPriority_hot_hotWaterSatisfiedDotButton;



}
