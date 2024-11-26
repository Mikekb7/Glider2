module org.example.glider2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens org.example.glider2 to javafx.fxml;
    exports org.example.glider2;
}