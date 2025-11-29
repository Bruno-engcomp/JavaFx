module com.example.managemaster {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.managemaster to javafx.fxml;
    exports com.example.managemaster;
}