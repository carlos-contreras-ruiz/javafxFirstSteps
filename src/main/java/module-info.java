module com.github.carloscontrerasruiz.fxfirststeps {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.github.carloscontrerasruiz.fxfirststeps to javafx.fxml;
    exports com.github.carloscontrerasruiz.fxfirststeps;
}