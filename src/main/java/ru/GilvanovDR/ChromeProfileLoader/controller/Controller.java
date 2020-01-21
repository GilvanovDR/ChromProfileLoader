/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.ChromeProfileLoader.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
//todo Exceptions (пустой список, не верный пать к списку, не верный путь к программе)
//todo создание пустого профиля, создать профиль по умолчанию
public class Controller {

    private final static File profileListPath = new File("C:\\");
    private final static String chromeExecPath = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";


    @FXML
    private ListView<String> list;

    @FXML
    public void initialize() {
        list.setItems(getProfileList());

    }

    @FXML
    public void onClickLoad(MouseEvent mouseEvent) {
        String text;
        if ((text = list.getFocusModel().getFocusedItem()) != null) {
            if (mouseEvent.getClickCount() == 2) {
                runApplication(text);
                System.exit(0);
            }
        }
    }

    private void runApplication(String text) {
        String execArgs = "--user-data-dir=" + profileListPath.getPath() + "\\" + text;
        ProcessBuilder builder = new ProcessBuilder(chromeExecPath, execArgs);
        try {
            Process process = builder.start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private ObservableList getProfileList() {
        ArrayList<String> ls = new ArrayList<String>();
        System.out.println();
        for (File file1 : Objects.requireNonNull(profileListPath.listFiles())) {
            if (file1.isDirectory()) {
                ls.add(file1.getName());
            }
        }
        System.out.println();
        return FXCollections.observableArrayList(ls);
    }


}
