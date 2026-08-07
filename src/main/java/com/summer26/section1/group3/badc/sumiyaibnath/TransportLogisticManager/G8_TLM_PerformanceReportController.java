package com.summer26.section1.group3.badc.sumiyaibnath.TransportLogisticManager;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import org.openpdf.text.*;
import org.openpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public class G8_TLM_PerformanceReportController
{
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colfarm;
    @javafx.fxml.FXML
    private DatePicker todate;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colwarehouse;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colvehicle;
    @javafx.fxml.FXML
    private TableView<Transport> tableview;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> coltransportid;
    @javafx.fxml.FXML
    private DatePicker fromdate;
    @javafx.fxml.FXML
    private TableColumn<Transport, LocalDate> colscheduleddate;
    @javafx.fxml.FXML
    private TableColumn<Transport, LocalDate> colassigneddate;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> colstatus;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> coldriver;
    @javafx.fxml.FXML
    private TableColumn<Transport, LocalDate> coldispatcheddate;

    @javafx.fxml.FXML
    public void initialize() {
        coltransportid.setCellValueFactory(new PropertyValueFactory<>("transportId"));
        colwarehouse.setCellValueFactory(new PropertyValueFactory<>("warehouse"));
        colfarm.setCellValueFactory(new PropertyValueFactory<>("farm"));
        colvehicle.setCellValueFactory(new PropertyValueFactory<>("vehicleId"));
        coldriver.setCellValueFactory(new PropertyValueFactory<>("driverName"));
        colscheduleddate.setCellValueFactory(new PropertyValueFactory<>("scheduledDate"));
        colassigneddate.setCellValueFactory(new PropertyValueFactory<>("assignmentDate"));
        coldispatcheddate.setCellValueFactory(new PropertyValueFactory<>("dispatchDate"));
        colstatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        refreshTable();
    }

    private void refreshTable() {
        tableview.getItems().clear();
        for (Transport transport : TransportManager.getTransportList()) {
            if (TransportManager.canTrackShipment(transport.getTransportId())) {
                tableview.getItems().add(transport);
            }
        }
    }

    @javafx.fxml.FXML
    public void generatereport(ActionEvent actionEvent) {
        tableview.getItems().clear();
        for (Transport transport : TransportManager.getTransportList()) {
            if (!TransportManager.canTrackShipment(transport.getTransportId())) {
                continue;
            }
            boolean fromMatch =
                    fromdate.getValue() == null ||
                            !transport.getDispatchDate().isBefore(fromdate.getValue());
            boolean toMatch =
                    todate.getValue() == null ||
                            !transport.getDispatchDate().isAfter(todate.getValue());
            if (fromMatch && toMatch) {
                tableview.getItems().add(transport);
            }
        }
        clearFields();
        label.setText("Report generated successfully.");
    }

    private void clearFields() {
        fromdate.setValue(null);
        todate.setValue(null);
    }

    @javafx.fxml.FXML
    public void download(ActionEvent actionEvent) {

        Document doc = new Document();

        FileChooser chooser = new FileChooser();
        chooser.setInitialDirectory(new File(System.getProperty("user.home"), "Desktop"));
        chooser.setInitialFileName("TransportPerformanceReport.pdf");
        chooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("PDF File", "*.pdf")
        );

        File file = chooser.showSaveDialog(label.getScene().getWindow());

        if (file == null) {
            return;
        }
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(file));

            doc.open();

            Paragraph title = new Paragraph("Transport & Delivery Performance Report");
            title.setAlignment(Element.ALIGN_CENTER);
            doc.add(title);

            doc.add(new Paragraph("Generated on: " + LocalDate.now()));
            doc.add(new Paragraph(" "));

            Table table = new Table(9);

            table.addCell("Transport ID");
            table.addCell("Warehouse");
            table.addCell("Farm");
            table.addCell("Vehicle ID");
            table.addCell("Driver");
            table.addCell("Scheduled Date");
            table.addCell("Assignment Date");
            table.addCell("Dispatch Date");
            table.addCell("Status");

            for (Transport transport : tableview.getItems()) {

                table.addCell(transport.getTransportId());
                table.addCell(transport.getWarehouse());
                table.addCell(transport.getFarm());
                table.addCell(transport.getVehicleId());
                table.addCell(transport.getDriverName());
                table.addCell(transport.getScheduledDate().toString());
                table.addCell(transport.getAssignmentDate().toString());
                table.addCell(transport.getDispatchDate().toString());
                table.addCell(transport.getStatus());

            }

            doc.add(table);
            doc.close();
            label.setText("PDF generated successfully.");
        }
        catch (DocumentException | IOException e) {
            label.setText("Could not generate PDF.");
        }
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/TransportLogisticManager/G0_TLM_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void refresh(ActionEvent actionEvent) {
        refreshTable();
        clearFields();
        label.setText("All records loaded.");
    }
}