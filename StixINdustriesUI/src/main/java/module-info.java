module com.example.stixindustriesui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stixindustriesui to javafx.fxml;
    exports com.example.stixindustriesui;
}