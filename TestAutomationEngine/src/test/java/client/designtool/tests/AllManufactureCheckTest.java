package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.AllManufactureCheckPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class AllManufactureCheckTest extends WebBaseTest {
    @Test
    @StepTestDetails(desc = "Design Tool : All Manufactures Check")
    public void allManufacturersCheckTest_table() {

        AllManufactureCheckPage page = new AllManufactureCheckPage();
        ui.clickIfDisplayed(page.newModelTopButton);


        ui.explicitWait(1);
        ui.waitAndClick(page.allStatusDropDownButton);
        ui.waitAndClick(page.allStatusesButton);

        ui.explicitWait(1);
        ui.selectMenuOption(page.allManufacturesButton, "Alpha");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Alpha");

        ui.selectMenuOption(page.allManufacturesButton, "Apollo");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Apollo");

        ui.selectMenuOption(page.allManufacturesButton, "Aristion");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Aristion");

        ui.selectMenuOption(page.allManufacturesButton, "Ariston");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Ariston");

        ui.selectMenuOption(page.allManufacturesButton, "Baxi");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Baxi");

        ui.selectMenuOption(page.allManufacturesButton, "Biasi");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Biasi");

        ui.selectMenuOption(page.allManufacturesButton, "British Gas");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "British Gas");

        ui.selectMenuOption(page.allManufacturesButton, "Caradon");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Caradon");

        ui.selectMenuOption(page.allManufacturesButton, "Chaffoteaux");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Chaffoteaux");

        ui.selectMenuOption(page.allManufacturesButton, "Compact");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Compact");

        ui.selectMenuOption(page.allManufacturesButton, "EcoBlue");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "EcoBlue");

        ui.selectMenuOption(page.allManufacturesButton, "Elm Le Blanc");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Elm Le Blanc");

        ui.selectMenuOption(page.allManufacturesButton, "Europa");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Europa");

        ui.selectMenuOption(page.allManufacturesButton, "Ferroli");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Ferroli");

        ui.selectMenuOption(page.allManufacturesButton, "Flexicom");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Flexicom");

        ui.selectMenuOption(page.allManufacturesButton, "Gledhill");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Gledhill");

        ui.selectMenuOption(page.allManufacturesButton, "Glow");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Glow");

        ui.selectMenuOption(page.allManufacturesButton, "Glow-worm");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Glow-worm");

        ui.selectMenuOption(page.allManufacturesButton, "Glowworm");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Glowworm");

        ui.selectMenuOption(page.allManufacturesButton, "Greenstar");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Greenstar");

        ui.selectMenuOption(page.allManufacturesButton, "Halstead");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Halstead");

        ui.selectMenuOption(page.allManufacturesButton, "Heatline");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Heatline");

        ui.selectMenuOption(page.allManufacturesButton, "Henrad");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Henrad");

        ui.selectMenuOption(page.allManufacturesButton, "Ideal");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Ideal");

        ui.selectMenuOption(page.allManufacturesButton, "Intergas");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Intergas");

        ui.selectMenuOption(page.allManufacturesButton, "iQE");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "iQE");

        ui.selectMenuOption(page.allManufacturesButton, "Johnson");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Johnson");

        ui.selectMenuOption(page.allManufacturesButton, "Johnson & Starley");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Johnson & Starley");

        ui.selectMenuOption(page.allManufacturesButton, "Keston");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Keston");

        ui.selectMenuOption(page.allManufacturesButton, "Little");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Little");

        ui.selectMenuOption(page.allManufacturesButton, "Main");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Main");

        ui.selectMenuOption(page.allManufacturesButton, "Maxol");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Maxol");

        ui.selectMenuOption(page.allManufacturesButton, "Meridian");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Meridian");

        ui.selectMenuOption(page.allManufacturesButton, "Microgenus");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Microgenus");

        ui.selectMenuOption(page.allManufacturesButton, "Myson");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Myson");

        ui.selectMenuOption(page.allManufacturesButton, "Ocean");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Ocean");

        ui.selectMenuOption(page.allManufacturesButton, "Potterton");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Potterton");

        ui.selectMenuOption(page.allManufacturesButton, "Powermax");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Powermax");

        ui.selectMenuOption(page.allManufacturesButton, "Pro");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Pro");

        ui.selectMenuOption(page.allManufacturesButton, "Range");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Range");

        ui.selectMenuOption(page.allManufacturesButton, "Ravenheat");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Ravenheat");

        ui.selectMenuOption(page.allManufacturesButton, "Remeha");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Remeha");

        ui.selectMenuOption(page.allManufacturesButton, "Reponse");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Reponse");

        ui.selectMenuOption(page.allManufacturesButton, "Sabre");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Sabre");

        ui.selectMenuOption(page.allManufacturesButton, "Saunier Duval");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Saunier Duval");

        ui.selectMenuOption(page.allManufacturesButton, "Scottish Gas");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Scottish Gas");

        ui.selectMenuOption(page.allManufacturesButton, "Sime");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Sime");

        ui.selectMenuOption(page.allManufacturesButton, "Ultimate");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Ultimate");

        ui.selectMenuOption(page.allManufacturesButton, "Untitled");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Untitled");

        ui.selectMenuOption(page.allManufacturesButton, "Uzii");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Uzii");

        ui.selectMenuOption(page.allManufacturesButton, "Vaillant");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Vaillant");

        ui.selectMenuOption(page.allManufacturesButton, "Viessmann");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Viessmann");

        ui.selectMenuOption(page.allManufacturesButton, "Vokera");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Vokera");

        ui.selectMenuOption(page.allManufacturesButton, "Wickes");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Wickes");

        ui.selectMenuOption(page.allManufacturesButton, "Worcester");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Worcester");

        ui.selectMenuOption(page.allManufacturesButton, "Zanussi");
        ui.explicitWait(2);
        ui.verifyStatus(page.table, "Zanussi");


    }

    @Test
    @StepTestDetails(desc = "Design Tool : All Manufactures Check - Board Page")
    public void allManufacturersCheckTest_board() {

        AllManufactureCheckPage page = new AllManufactureCheckPage();
        ui.clickIfDisplayed(page.newModelTopButton);
        ui.waitAndClick(page.boardButton);

        ui.explicitWait(2);
        ui.selectMenuOption(page.allManufacturesButton, "Alpha");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Alpha");

        ui.selectMenuOption(page.allManufacturesButton, "Apollo");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Apollo");

        ui.selectMenuOption(page.allManufacturesButton, "Aristion");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Aristion");

        ui.selectMenuOption(page.allManufacturesButton, "Ariston");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Ariston");

        ui.selectMenuOption(page.allManufacturesButton, "Baxi");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Baxi");

        ui.selectMenuOption(page.allManufacturesButton, "Biasi");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Biasi");

        ui.selectMenuOption(page.allManufacturesButton, "British Gas");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "British Gas");

        ui.selectMenuOption(page.allManufacturesButton, "Caradon");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Caradon");

        ui.selectMenuOption(page.allManufacturesButton, "Chaffoteaux");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Chaffoteaux");

        ui.selectMenuOption(page.allManufacturesButton, "Compact");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Compact");

        ui.selectMenuOption(page.allManufacturesButton, "EcoBlue");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "EcoBlue");

        ui.selectMenuOption(page.allManufacturesButton, "Elm Le Blanc");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Elm Le Blanc");

        ui.selectMenuOption(page.allManufacturesButton, "Europa");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Europa");

        ui.selectMenuOption(page.allManufacturesButton, "Ferroli");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Ferroli");

        ui.selectMenuOption(page.allManufacturesButton, "Flexicom");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Flexicom");

        ui.selectMenuOption(page.allManufacturesButton, "Gledhill");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Gledhill");

        ui.selectMenuOption(page.allManufacturesButton, "Glow");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Glow");

        ui.selectMenuOption(page.allManufacturesButton, "Glow-worm");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Glow-worm");

        ui.selectMenuOption(page.allManufacturesButton, "Glowworm");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Glowworm");

        ui.selectMenuOption(page.allManufacturesButton, "Greenstar");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Greenstar");

        ui.selectMenuOption(page.allManufacturesButton, "Halstead");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Halstead");

        ui.selectMenuOption(page.allManufacturesButton, "Heatline");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Heatline");

        ui.selectMenuOption(page.allManufacturesButton, "Henrad");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Henrad");

        ui.selectMenuOption(page.allManufacturesButton, "Ideal");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Ideal");

        ui.selectMenuOption(page.allManufacturesButton, "Intergas");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Intergas");

        ui.selectMenuOption(page.allManufacturesButton, "iQE");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "iQE");

        ui.selectMenuOption(page.allManufacturesButton, "Johnson");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Johnson");

        ui.selectMenuOption(page.allManufacturesButton, "Johnson & Starley");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Johnson & Starley");

        ui.selectMenuOption(page.allManufacturesButton, "Keston");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Keston");

        ui.selectMenuOption(page.allManufacturesButton, "Little");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Little");

        ui.selectMenuOption(page.allManufacturesButton, "Main");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Main");

        ui.selectMenuOption(page.allManufacturesButton, "Maxol");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Maxol");

        ui.selectMenuOption(page.allManufacturesButton, "Meridian");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Meridian");

        ui.selectMenuOption(page.allManufacturesButton, "Microgenus");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Microgenus");

        ui.selectMenuOption(page.allManufacturesButton, "Myson");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Myson");

        ui.selectMenuOption(page.allManufacturesButton, "Ocean");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Ocean");

        ui.selectMenuOption(page.allManufacturesButton, "Potterton");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Potterton");

        ui.selectMenuOption(page.allManufacturesButton, "Powermax");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Powermax");

        ui.selectMenuOption(page.allManufacturesButton, "Pro");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Pro");

        ui.selectMenuOption(page.allManufacturesButton, "Range");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Range");

        ui.selectMenuOption(page.allManufacturesButton, "Ravenheat");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Ravenheat");

        ui.selectMenuOption(page.allManufacturesButton, "Remeha");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Remeha");

        ui.selectMenuOption(page.allManufacturesButton, "Reponse");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Reponse");

        ui.selectMenuOption(page.allManufacturesButton, "Sabre");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Sabre");

        ui.selectMenuOption(page.allManufacturesButton, "Saunier Duval");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Saunier Duval");

        ui.selectMenuOption(page.allManufacturesButton, "Scottish Gas");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Scottish Gas");

        ui.selectMenuOption(page.allManufacturesButton, "Sime");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Sime");

        ui.selectMenuOption(page.allManufacturesButton, "Ultimate");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Ultimate");

        ui.selectMenuOption(page.allManufacturesButton, "Untitled");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Untitled");

        ui.selectMenuOption(page.allManufacturesButton, "Uzii");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Uzii");

        ui.selectMenuOption(page.allManufacturesButton, "Vaillant");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Vaillant");

        ui.selectMenuOption(page.allManufacturesButton, "Viessmann");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Viessmann");

        ui.selectMenuOption(page.allManufacturesButton, "Vokera");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Vokera");

        ui.selectMenuOption(page.allManufacturesButton, "Wickes");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Wickes");

        ui.selectMenuOption(page.allManufacturesButton, "Worcester");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Worcester");

        ui.selectMenuOption(page.allManufacturesButton, "Zanussi");
        ui.explicitWait(2);
        ui.verifyContainsText(page.board, "Zanussi");

    }
}
