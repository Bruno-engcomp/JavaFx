module com.example.drawingstuff {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.drawingstuff to javafx.fxml;
    exports com.example.drawingstuff;
}