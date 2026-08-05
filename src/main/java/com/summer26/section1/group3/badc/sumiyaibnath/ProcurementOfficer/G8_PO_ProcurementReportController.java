package com.summer26.section1.group3.badc.sumiyaibnath.ProcurementOfficer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import org.openpdf.text.*;
import org.openpdf.text.pdf.PdfWriter;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.FileOutputStream;
import org.openpdf.text.alignment.HorizontalAlignment;


public class G8_PO_ProcurementReportController
{
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colproduct;
    @javafx.fxml.FXML
    private ComboBox<String> product;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, Double> coltotalamount;
    @javafx.fxml.FXML
    private DatePicker purchasedate;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, LocalDate> colpurchasedate;
    @javafx.fxml.FXML
    private TableView<PurchaseOrder> tableview;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colquantity;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colsupplier;
    @javafx.fxml.FXML
    private TextField supplierid;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colunitprice;
    @javafx.fxml.FXML
    private TableColumn<PurchaseOrder, String> colorderid;

    @javafx.fxml.FXML
    public void initialize() {

        product.getItems().addAll("Seed", "Fertilizer", "Soil", "Bio-Pesticides", "Machinery");

        colorderid.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        colsupplier.setCellValueFactory(new PropertyValueFactory<>("supplierId"));
        colproduct.setCellValueFactory(new PropertyValueFactory<>("product"));
        colquantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colunitprice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        coltotalamount.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
        colpurchasedate.setCellValueFactory(new PropertyValueFactory<>("orderDate"));

        tableview.setItems(
                FXCollections.observableArrayList(
                        PurchaseOrderManager.getOrderList()
                )
        );
    }

    @javafx.fxml.FXML
    public void download(ActionEvent actionEvent) {

        Document doc = new Document();

        FileChooser chooser = new FileChooser();
        chooser.setInitialDirectory(new File(System.getProperty("user.home"), "Desktop")); // Change this if needed
        chooser.setInitialFileName("ProcurementReport.pdf");
        chooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("PDF File", "*.pdf")
        );
        File file = chooser.showSaveDialog(label.getScene().getWindow());

        if (file == null) return;

        try {
            PdfWriter.getInstance(doc, new FileOutputStream(file));

            doc.open();

            Paragraph title = new Paragraph("Procurement Report");
            title.setAlignment(Element.ALIGN_CENTER);
            doc.add(title);

            doc.add(new Paragraph("Generated on: " + LocalDate.now()));
            doc.add(new Paragraph(" "));

            Table table = new Table(7);

            table.addCell("OrderID");
            table.addCell("SupplierID");
            table.addCell("Product");
            table.addCell("Quantity");
            table.addCell("Unit Price");
            table.addCell("Total Amount");
            table.addCell("Order Date");

            double grandTotal = 0.0;

            for (PurchaseOrder order : tableview.getItems()) {
                table.addCell(order.getOrderId());
                table.addCell(order.getSupplierId());
                table.addCell(order.getProduct());
                table.addCell(order.getQuantity());
                table.addCell(order.getUnitPrice());
                table.addCell("" + order.getTotalAmount());
                table.addCell(order.getOrderDate().toString());

                grandTotal += order.getTotalAmount();
            }

            doc.add(table);

            doc.add(new Paragraph("Grand Total Purchase Amount: " + grandTotal));
            doc.close();
            label.setText("PDF generated successfully.");

        }
        catch (DocumentException | IOException e) {
            label.setText("Could not generate PDF.");
        }

    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/sumiyaibnath/ProcurementOfficer/G0_PO_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void generate(ActionEvent actionEvent) {

        ArrayList<PurchaseOrder> reportList = new ArrayList<>();
        for (PurchaseOrder order : PurchaseOrderManager.getOrderList()) {

            boolean match = true;

            if (!supplierid.getText().isEmpty()) {
                if (!order.getSupplierId().equalsIgnoreCase(supplierid.getText())) {
                    match = false;
                }
            }
            if (product.getValue() != null) {
                if (!order.getProduct().equalsIgnoreCase(product.getValue())) {
                    match = false;
                }
            }
            if (purchasedate.getValue() != null) {
                if (!order.getOrderDate().equals(purchasedate.getValue())) {
                    match = false;
                }
            }
            if (match) {
                reportList.add(order);
            }
        }
        tableview.setItems(FXCollections.observableArrayList(reportList));
        label.setText("Report generated successfully.");
    }

    @javafx.fxml.FXML
    public void refresh(ActionEvent actionEvent) {

        supplierid.clear();
        product.setValue(null);
        purchasedate.setValue(null);

        tableview.setItems(
                FXCollections.observableArrayList(
                        PurchaseOrderManager.getOrderList()
                )
        );
        label.setText("Report refreshed.");
    }
}