/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.ChromeProfileLoader.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import ru.GilvanovDR.ChromeProfileLoader.Form.OptionsForm;

import java.io.File;

public class OptionsController {
    @FXML
    private TextField profileFolder;
    @FXML
    private TextField chromeFilePath;
    @FXML
    private TextField defaultProfileZip;

    public void initialize() {
        if (Config.getInstance().getProfileFolder() != null) {
            profileFolder.setText(Config.getInstance().getProfileFolder());
        }
        if (Config.getInstance().getChromeFilePath() != null) {
            chromeFilePath.setText(Config.getInstance().getChromeFilePath());
        }
        if (Config.getInstance().getDefaultProfileZip() != null) {
            defaultProfileZip.setText(Config.getInstance().getDefaultProfileZip());
        }
    }

    public void onOkButtonClick() {
        Config.getInstance().setChromeFilePath(chromeFilePath.getText());
        Config.getInstance().setProfileFolder(profileFolder.getText());
        Config.getInstance().setDefaultProfileZip(defaultProfileZip.getText());
        OptionsForm.getInstance().closeForm();
    }

    public void onCancelButtonClick() {
        OptionsForm.getInstance().closeForm();
    }

    public void selectProfileFolder() {
        final DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Выберите каталог со списком профилей");
        File file = directoryChooser.showDialog(new Stage());
        if (file != null) {
            profileFolder.setText(file.getPath());
        }
    }

    public void selectChromeFile() {
        final FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Выберите файл запуска Chrome/Vivaldi/EDGE");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Execute file", "*.exe"));
        File file = fileChooser.showOpenDialog(new Stage());
        if (file != null) {
            chromeFilePath.setText(file.getPath());
        }
    }

    public void selectDefaultProfileZip() {
        final FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Выберите файл запуска Chrome/Vivaldi/EDGE");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Zip file", "*.zip"));
        File file = fileChooser.showOpenDialog(new Stage());
        if (file != null) {
            defaultProfileZip.setText(file.getPath());
        }
    }
}
