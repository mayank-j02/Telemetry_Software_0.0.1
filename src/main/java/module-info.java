module com.example.telemetry_01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    requires java.logging;
    requires jssc;
    requires eu.hansolo.medusa;


    opens com.example.telemetry_01 to javafx.fxml;
    exports com.example.telemetry_01;
}