module com.example.studentregistrationui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires java.desktop;

    opens com.example.studentregistrationui to javafx.fxml;
    exports com.example.studentregistrationui;
}