module com.example.deciderapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.deciderapp to javafx.fxml;
    exports com.example.deciderapp;
    exports com.example.deciderapp.applictions;
    opens com.example.deciderapp.applictions to javafx.fxml;
    exports com.example.deciderapp.controllers;
    opens com.example.deciderapp.controllers to javafx.fxml;
    exports com.example.deciderapp.objects;
    opens com.example.deciderapp.objects to javafx.fxml;
}