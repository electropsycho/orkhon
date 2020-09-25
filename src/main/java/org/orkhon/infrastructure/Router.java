package org.orkhon.infrastructure;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Router {
    private static Router instance;

    public static Router getInstance() {
        return instance == null ? new Router() : instance;
    }

    public void navigateTo(String url) {
        var loader = new FXMLLoader(getClass().getResource(url));
        try {
            Parent parent = loader.load();
            Stage stage = Context.getInstance().getCurrentStage();
            Scene scene = Context.getInstance().getCurrentStage().getScene();
            if (scene == null) {
                scene = new Scene(parent);
                stage.setScene(scene);
//                    stage.setTitle("Sample JavaFX Application");
            } else {
                stage.getScene().setRoot(parent);
            }
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
