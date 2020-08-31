package org.orkhon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        String javaVersion = System.getProperty("java.version");
        var view = Objects.requireNonNull(getClass().getResource("/org/orkhon/views/MainView.fxml"));
        Parent root = FXMLLoader.load(view);
        stage.setTitle("Orhun v1.0.0");
        var scene = new Scene(root);
        String stylesheet = getClass().getResource("/style/all.css").toExternalForm();
        scene.getStylesheets().add(stylesheet);
        //scene.getStylesheets().add("/org.openlib/css/test.css");
//        stage.getIcons().add(new Image(getClass().getResourceAsStream("/org/tulib/icons/calculating.png")));
        stage.setScene(scene);
        stage.setMinWidth(700);
        stage.setMinHeight(500);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
