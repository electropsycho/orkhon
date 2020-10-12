module orkhon {
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires io.reactivex.rxjava3;
    requires lombok;
    requires org.jdbi.v3.core;
    requires org.jdbi.v3.sqlobject;
    requires com.zaxxer.hikari;
    requires java.sql;

    exports org.orkhon;
    exports org.orkhon.controllers.user.auth;
    opens org.orkhon.controllers to javafx.fxml;
}