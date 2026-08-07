package com.summer26.section1.group3.badc.common;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class SceneSwitcher {

    public static Stage stage;

    public static void switchTo(String fxmlFile) throws IOException {

        URL url = SceneSwitcher.class.getResource(fxmlFile);

        if (url == null) {
            throw new  IOException("FXML file not found at path: " + fxmlFile);
        }

        FXMLLoader loader = new FXMLLoader(url);

        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}