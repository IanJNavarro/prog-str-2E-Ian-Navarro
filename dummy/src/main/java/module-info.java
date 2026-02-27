module org.example.dummy {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.dummy to javafx.fxml;
    exports org.example.dummy;
}