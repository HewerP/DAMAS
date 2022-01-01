module br.upe.damas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens br.upe.damas to javafx.fxml;
    exports br.upe.damas;
}