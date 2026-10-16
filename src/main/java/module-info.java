module com.example.leidy {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.leidy to javafx.fxml;
    exports com.example.leidy;
    exports com.example.leidy.controller;
    opens com.example.leidy.controller to javafx.fxml;
}