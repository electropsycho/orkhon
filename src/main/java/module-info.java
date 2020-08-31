module orkhon {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires io.reactivex.rxjava3;
//    requires javafx.web;
//    requires org.jdbi.v3.core;
//    requires eu.hansolo.medusa;
//    requires org.jfxtras.styles.jmetro;

    exports org.orkhon;
    opens org.orkhon.controllers to javafx.fxml;
}