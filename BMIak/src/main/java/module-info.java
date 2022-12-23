module com.example.bmiak {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bmiak to javafx.fxml;
    exports com.example.bmiak;
}