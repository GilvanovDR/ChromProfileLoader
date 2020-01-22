/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.ChromeProfileLoader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCodeCombination;
import javafx.stage.Stage;
import ru.GilvanovDR.ChromeProfileLoader.Form.MainForum;

public class MainApp extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage stage) {
        MainForum.getInstance().StartForm(stage);
    }

}
