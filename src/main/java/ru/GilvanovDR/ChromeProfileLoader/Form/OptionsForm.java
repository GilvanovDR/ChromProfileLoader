/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.ChromeProfileLoader.Form;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

//todo must be lazy singleton
public class OptionsForm {

    Stage primaryStage = new Stage();
    public static  OptionsForm instance;

    private OptionsForm(){
        String fxmlFile = "/fxml/options.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        try {
            root = loader.load(getClass().getResourceAsStream(fxmlFile));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        primaryStage.setTitle("Настройки");
        primaryStage.setScene(new Scene(root));
        primaryStage.resizableProperty().setValue(false);
    }

    public static OptionsForm getInstance() {
        if (instance == null) {
            instance= new OptionsForm();
        }
        return instance;
    }
    public void getForm() throws Exception {
        primaryStage.show();
    }

    public void closeForm() {
        primaryStage.close();
    }
}
