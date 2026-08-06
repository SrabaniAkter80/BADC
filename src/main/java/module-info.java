module com.summer26.section1.group3.badc {
    requires javafx.controls;
    requires javafx.fxml;



    exports com.summer26.section1.group3.badc.common;
    opens com.summer26.section1.group3.badc.common to javafx.fxml;
    opens com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer to javafx.fxml;
    exports com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;
    opens com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager to javafx.fxml;
    exports com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;
    opens com.summer26.section1.group3.badc.Srabani_Akter.Farmer to javafx.fxml;
    opens com.summer26.section1.group3.badc.Srabani_Akter.HR_Manager to javafx.fxml;
    opens com.summer26.section1.group3.badc.sumiyaHoque.field_officer to javafx.fxml;
    opens com.summer26.section1.group3.badc.sumiyaHoque.supplier to javafx.fxml;
}