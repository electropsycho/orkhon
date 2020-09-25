module orkhon {
    requires java.base;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires io.reactivex.rxjava3;

    exports org.orkhon;
    exports org.orkhon.controllers.user.auth;
    opens org.orkhon.controllers to javafx.fxml;
}