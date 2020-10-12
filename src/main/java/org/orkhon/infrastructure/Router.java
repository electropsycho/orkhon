package org.orkhon.infrastructure;

import javafx.animation.*;
import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.io.IOException;

public class Router {
    private Router() {}
    private static Router instance;

    public static Router instance() {
        return instance == null ? new Router() : instance;
    }

    public void navigateTo(String url) {
        try {
            var stylesheet = getClass().getResource("/style/all.css").toExternalForm();
            var loader = new FXMLLoader(getClass().getResource(url));
            Parent parent = loader.load();
            Stage stage = Context.instance().getCurrentStage();
            Scene scene = Context.instance().getCurrentStage().getScene();
            if (scene == null) {
                scene = new Scene(parent);
                stage.setScene(scene);
//                    stage.setTitle("Sample JavaFX Application");
            } else {
                stage.getScene().setRoot(parent);
            }
            scene.getStylesheets().add(stylesheet);
            stage.show();

            fadeIn(parent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fadeIn(Parent root) {
        DoubleProperty opacity = root.opacityProperty();
        Timeline fadeIn = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                new KeyFrame(new Duration(1000), new KeyValue(opacity, 1.0))
        );
        fadeIn.play();
    }
}
