module com.example.electronicdevices {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.electronicdevices to javafx.fxml;
    exports com.example.electronicdevices;
}