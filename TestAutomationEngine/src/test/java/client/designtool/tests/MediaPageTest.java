package client.designtool.tests;

import base.web.WebBaseTest;
import client.designtool.pages.MediaPage;
import core.annotations.StepTestDetails;
import org.testng.annotations.Test;

public class MediaPageTest extends WebBaseTest {
    @Test
    @StepTestDetails(desc = "Design Tool : Media - file Upload")
    public void mediaPageTest_fileUpload() {
        MediaPage page = new MediaPage();

        ui.clickIfDisplayed(page.newModelTopButton);
        ui.waitAndClick(page.mediaButton);

        if (ui.verifyContainsText(page.collectionLocation, "Test")) {
            ui.uploadFile(page.browserFilesBar, "src/main/resources/test-Image-files/image-25.jpg");
            ui.waitAndClick(page.generalButton);
            ui.waitAndClick(page.TestButton);
            ui.waitAndClick(page.uploadButton);
            ui.verifyContainsTextAndClick(page.collectionLocation, "Test");
            ui.verifyContainsText(page.firstImageGrid, "image-25.jpg");
        } else {
            ui.uploadFile(page.browserFilesBar, "src/main/resources/test-Image-files/image-25.jpg");
            ui.waitAndClick(page.createNewCollectionButton);
            ui.waitAndType(page.createNewCollectionTextBox, "Test");
            ui.waitAndClick(page.uploadButton);
            ui.verifyContainsTextAndClick(page.collectionLocation, "Test");
            ui.verifyContainsText(page.firstImageGrid, "image-25.jpg");
        }
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Media - Multiple file Upload")
    public void mediaPageTest_multipleFilesUpload() {
        MediaPage page = new MediaPage();

        ui.clickIfDisplayed(page.newModelTopButton);
        ui.waitAndClick(page.mediaButton);

        if (ui.verifyContainsText(page.collectionLocation, "Test")) {
            ui.uploadMultipleFiles(page.browserFilesBar, "src/main/resources/test-Image-files");
            ui.waitAndClick(page.generalButton);
            ui.waitAndClick(page.TestButton);
            ui.waitAndClick(page.uploadButton);
            ui.verifyContainsTextAndClick(page.collectionLocation, "Test");
            ui.verifyContainsText(page.imageGrid, "image-8.jpg");
        } else {
            ui.uploadMultipleFiles(page.browserFilesBar, "src/main/resources/test-Image-files");
            ui.waitAndClick(page.createNewCollectionButton);
            ui.waitAndType(page.createNewCollectionTextBox, "Test");
            ui.waitAndClick(page.uploadButton);
            ui.verifyContainsTextAndClick(page.collectionLocation, "Test");
            ui.verifyContainsText(page.imageGrid, "image-8.jpg");
        }
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Media - Creating new collection")
    public void mediaPageTest_newCollection() {
        MediaPage page = new MediaPage();

        ui.clickIfDisplayed(page.newModelTopButton);
        ui.waitAndClick(page.mediaButton);
        //ui.verifyContainsText(page.collectionLocation, "Test");
        ui.verifyContainsText(page.collectionLocation, "Test");
        String collectionName = ui.getNextCollectionName(page.collectionLocation, "Test");
        ui.uploadMultipleFiles(page.browserFilesBar, "src/main/resources/test-Image-files");
        ui.waitAndClick(page.createNewCollectionButton);
        ui.waitAndType(page.createNewCollectionTextBox, collectionName);
        ui.waitAndClick(page.uploadButton);
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Media - Collection folder Check")
    public void mediaPageTest_collectionFolder() {
        MediaPage page = new MediaPage();

        ui.clickIfDisplayed(page.newModelTopButton);
        ui.waitAndClick(page.mediaButton);
        ui.verifyContainsTextAndClick(page.collectionLocation, "Test");
        ui.verifyContainsText(page.imageGrid, "image-8.jpg");
        ui.explicitWait(2);
        ui.waitAndClick(page.newModelTopButton);

    }

    @Test
    @StepTestDetails(desc = "Design Tool : Media - Scrolling Up & Down Check")
    public void mediaPageTest_scrolling() {
        MediaPage page = new MediaPage();

        ui.clickIfDisplayed(page.newModelTopButton);
        ui.waitAndClick(page.mediaButton);
        ui.scrollToElement(page.showingImageCountInfo);
        ui.explicitWait(2);
        ui.scrollUpToElement(page.mediaLibraryHeading);
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Media - Next & Previous Button Check")
    public void mediaPageTest_nextPrevious() {
        MediaPage page = new MediaPage();

        ui.clickIfDisplayed(page.newModelTopButton);
        ui.waitAndClick(page.mediaButton);
        ui.scrollToElement(page.showingImageCountInfo);
        ui.explicitWait(2);
        String previousContent = ui.getElementContent(page.imageGrid);
        ui.waitAndClick(page.nextButton);
        ui.verifyContentChanged(page.imageGrid, previousContent);
        ui.explicitWait(2);
        ui.waitAndClick(page.newModelTopButton);
    }

    @Test
    @StepTestDetails(desc = "Design Tool : Media - Search Image Check")
    public void mediaPageTest_search() {
        MediaPage page = new MediaPage();

        ui.clickIfDisplayed(page.newModelTopButton);
        ui.waitAndClick(page.mediaButton);
        ui.waitAndType(page.searchTextBox,"image-1.jpg");
        ui.verifyContainsText(page.imageGrid, "image-1.jpg");
        ui.verifyContainsTextAndClick(page.collectionLocation, "Test-1");
        ui.waitAndType(page.searchTextBox,"image-1.jpg");
        ui.verifyContainsText(page.imageGrid, "image-1.jpg");
        ui.waitAndClick(page.newModelTopButton);

    }
}
