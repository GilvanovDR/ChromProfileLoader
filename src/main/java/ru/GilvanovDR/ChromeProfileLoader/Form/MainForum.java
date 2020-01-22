/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.ChromeProfileLoader.Form;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainForum {
    private static MainForum instance = new MainForum();

    public static MainForum getInstance() {
        return instance;
    }

    private MainForum() {

    }
    public void StartForm(Stage stage) {
        String fxmlFile = "/fxml/main.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        try {
            root = loader.load(getClass().getResourceAsStream(fxmlFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("ChromeLoader by GilvanovDR");
        stage.setScene(new Scene(root));
        stage.resizableProperty().setValue(false);
        // stage.fullScreenExitKeyProperty().setValue(new KeyCodeCombination());
        stage.show();
    }
}
