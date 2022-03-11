module com.github.carloscontrerasruiz.fxfirststeps {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.github.carloscontrerasruiz.fxfirststeps to javafx.fxml;
    exports com.github.carloscontrerasruiz.fxfirststeps;
    exports com.github.carloscontrerasruiz.fxfirststeps.controllers;
    opens com.github.carloscontrerasruiz.fxfirststeps.controllers to javafx.fxml;
}