module com.summer26.section1.group3.badc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.summer26.section1.group3.badc to javafx.fxml;
    exports com.summer26.section1.group3.badc;
}