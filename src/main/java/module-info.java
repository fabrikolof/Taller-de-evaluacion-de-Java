module com.example.tallerjava1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tallerjava1 to javafx.fxml;
    exports com.example.tallerjava1;
}