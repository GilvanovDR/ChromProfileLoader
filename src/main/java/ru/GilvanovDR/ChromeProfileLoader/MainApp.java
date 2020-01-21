/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.ChromeProfileLoader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage stage) throws Exception {
        String fxmlFile = "/fxml/main.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResourceAsStream(fxmlFile));
        stage.setTitle("ChromeLoader by GilvanovDR");
        stage.setScene(new Scene(root));
        stage.resizableProperty().setValue(false);
        stage.show();
    }
}
