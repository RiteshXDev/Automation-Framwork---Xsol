package client.XSol.regression.tests;

import base.mobile.MobileBaseTest;
import client.XSol.regression.pages.Boiler_4704734Page;
import client.XSol.smoke.pages.FullDiagnosticsModelPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class Boiler_4704734Test extends MobileBaseTest
{
    @Test
    @StepTestDetails(desc = " Boiler : 4704734")
    public void test_boiler4704734_1() {
        final String SD_PATH = "xsol/boilers/4704734/";

        Boiler_4704734Page page = new Boiler_4704734Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4704734");
        ui.waitAndTap(page.flexicom30cxButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);
        ui.waitAndTap(page.displayDoesNotOperateCorrectlyButton);
        ui.waitAndTap(page.mainVoltagePresentButton);
        ui.waitAndTap(page.openCircuit_MeasuredButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "01_fuseFurtherInvestigation.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.shortCircuitMeasuredButton);
        ui.waitAndTap(page.displayNowOperatesButton);
        ui.waitAndTap(page.displayOperatesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "02_observstionDisplay.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.displayDoesNotOperateButton);
        ui.waitAndTap(page.displayDoesNotOperateButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_repairReplace.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.displayOperatesButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "03_repairReplace.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.displayStillDoesNotOperateButton);
        ui.waitAndTap(page.displayNowOperatesButton);
        ui.waitAndTap(page.displayOperates_fanDisconnectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "04_observationDisplay.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.displayDoes_fanDisconnectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "05_observationDisplay.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.displayStillDoesNotOperateButton);
        ui.waitAndTap(page.oneOrMoreVoltageButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "06_observationDisplay.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.voltagesAsAboveButton);
        ui.waitAndTap(page.openCircuitMeasuredAcrossButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "07_observationDisplay.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistanceMeasuredAtEachButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "08_observationDisplay.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }

    @Test
    @StepTestDetails(desc = " Boiler : 4704734")
    public void test_boiler4704734_2() {
        final String SD_PATH = "xsol/boilers/4704734/";

        Boiler_4704734Page page = new Boiler_4704734Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4704734");
        ui.waitAndTap(page.flexicom30cxButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);
        ui.waitAndTap(page.displayOperatesCorrectlyButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.boilerEntersStandbyButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.faultCodeDisplayedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "09_faultCodes.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.boilerFiresWithNoDemandButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.boilerDoesNotShowEitherButton);
        ui.waitAndTap(page.temperatureAroundBoilerButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "10_observationBoiler.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.temperatureBelowButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "11_observationBoilerStandby.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.boilerShowsDhwDemandButton);
        ui.waitAndTap(page.boilerNowEntersStandbyButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "12_observationBoiler.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.boilerStillFiresWithButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "13_observationBoilerStandby.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome3Button);
        ui.waitAndTap(page.boilerShowsChDemandButton);
        ui.waitAndTap(page.boilerStillFiresWithButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "14_observationBoilerStandby.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.boilerNowEntersStandbyButton);
        ui.waitAndTap(page.returnToHomeButton);
    }


    @Test
    @StepTestDetails(desc = " Boiler : 4704734")
    public void test_boiler4704734_3() {
        final String SD_PATH = "xsol/boilers/4704734/";

        Boiler_4704734Page page = new Boiler_4704734Page();

        ui.clickIfDisplayed(page.homeButton);
        ui.explicitWait(1);
        ui.waitAndTap(page.searchApplianceButton);
        ui.waitAndType(page.searchApplianceTextBox, "4704734");
        ui.waitAndTap(page.flexicom30cxButton);
        ui.waitAndTap(page.importantNoticeContinueButton);
        ui.waitAndTap(page.passButton);
        ui.waitAndTap(page.displayOperatesCorrectlyButton);
        ui.waitAndTap(page.continueButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.boilerEntersStandbyButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.pumpRunsContinuallyButton);
        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "15_observationBoilerStandby.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);
        ui.waitAndTap(page.resistanceNotAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "16_observationBoilerStandby.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.resistanceAsExpectedButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "17_observationBoilerStandby.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.selectOutcome5Button);
        ui.waitAndTap(page.fanRunsContinuallyButton);
        ui.waitAndTap(page.approx12VdcOrGreaterButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "18_observationBoilerStandby.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.noVoltageButton);
        ui.waitAndTap(page.openCircuitMeasuredAcrossButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "19_observationBoilerStandby.txt");

        ui.waitAndTap(page.backButton);
        ui.waitAndTap(page.continuityZeroResistanceButton);

        ui.printAllScrollableTexts();
        ui.compareScreenWithFile(SD_PATH + "20_observationBoilerStandby.txt");

        ui.waitAndTap(page.returnToHomeButton);
    }
}



