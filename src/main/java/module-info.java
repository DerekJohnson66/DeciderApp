module com.example.deciderapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.deciderapp to javafx.fxml;
    exports com.example.deciderapp;
}