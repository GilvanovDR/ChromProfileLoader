/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.ChromeProfileLoader.Form;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//todo must be lazy singleton
public class OptionsForm {

    public void start(Stage primaryStage) throws Exception {
        String fxmlFile = "/fxml/options.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResourceAsStream(fxmlFile));
        primaryStage.setTitle("Настройки");
        primaryStage.setScene(new Scene(root));
        primaryStage.resizableProperty().setValue(false);
        primaryStage.show();
    }
}
