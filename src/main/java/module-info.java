module ru.pse.chartsviewer {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.pse.chartsviewer to javafx.fxml;
    exports ru.pse.chartsviewer;
}