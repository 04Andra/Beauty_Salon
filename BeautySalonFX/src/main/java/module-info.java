module com.example.beautysalonfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.beautysalonfx to javafx.fxml;
    exports com.example.beautysalonfx;
}