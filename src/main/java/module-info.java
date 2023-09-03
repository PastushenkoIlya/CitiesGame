module com.example.CitiesGame {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup;


    opens com.example.citiesgame to javafx.fxml;
    exports com.example.citiesgame;
}