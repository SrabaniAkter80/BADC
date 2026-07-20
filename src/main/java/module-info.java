module com.summer26.section1.group3.badc {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.summer26.section1.group3.badc.common;
    opens com.summer26.section1.group3.badc.common to javafx.fxml;
}