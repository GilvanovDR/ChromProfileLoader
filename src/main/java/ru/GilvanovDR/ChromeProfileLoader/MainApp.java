/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.ChromeProfileLoader;

import javafx.application.Application;
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
