package com.summer26.section1.group3.badc.common;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitcher {

    public static Stage stage;

    public static void switchTo(String fxmlFile) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                SceneSwitcher.class.getResource(fxmlFile));

        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}