package org.orkhon.controllers;

import io.reactivex.rxjava3.core.Observable;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class MainController  implements Initializable {

//    @FXML
//    public Button btnReactive;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        btnReactive.setOnMouseClicked(mouseEvent -> {
//            Observable.just(1,2,3,4,5)
//                    .zipWith(Observable.interval(1000, TimeUnit.MILLISECONDS), (item, interval) -> item)
//                    .subscribe(integer -> {
//                        Platform.runLater(() -> {
//                           btnReactive.setText(integer.toString());
//                        });
//                    });
//        });
    }
}
