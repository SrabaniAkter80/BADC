//package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;
//
//import com.summer26.section1.group3.badc.common.SceneSwitcher;
//import javafx.event.ActionEvent;
//
//import java.io.IOException;
//
//public class G0_Farmer_DashboardController
//{
//    @javafx.fxml.FXML
//    public void initialize() {
//    }
//
//
//
//    @javafx.fxml.FXML
//    public void handlePlaceOrderButton(ActionEvent actionEvent) throws IOException{
//        SceneSwitcher.switchTo(
//                "/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G2_Farmer_Place_Order.fxml"
//        );
//    }
//
//    @javafx.fxml.FXML
//    public void hanldeUpdateProfileButton(ActionEvent actionEvent) throws IOException{
//        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G3_Farmer_Update_Profile.fxml");
//    }
//
//    @javafx.fxml.FXML
//    public void handleApplicationStatusButton(ActionEvent actionEvent) throws IOException{
//        SceneSwitcher.switchTo(
//                "/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G4_Application_Status.fxml"
//        );
//    }
//
//    @javafx.fxml.FXML
//    public void handleDeleveryConfirmationButton(ActionEvent actionEvent) throws IOException{
//        SceneSwitcher.switchTo(
//                "/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G8_Farmer_Delivery_Confirmation.fxml"
//        );
//    }
//
//
//    @javafx.fxml.FXML
//    public void handleSubmitComplaintButton(ActionEvent actionEvent) throws IOException{
//        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G7_Farmer_Submit_Complaint.fxml" );
//    }
//
//    @javafx.fxml.FXML
//    public void handleProductListButton(ActionEvent actionEvent) throws IOException{
//        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G1_View_Product_List.fxml");
//    }
//
//    @Deprecated
//    public void handleNotificationsStatusButton(ActionEvent actionEvent) throws IOException{
//        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G6_Farmer_Notifications.fxml");
//    }
//
//    @Deprecated
//    public void handleCancelOrderButton(ActionEvent actionEvent) throws IOException{
//        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G5_Cancel_Order.fxml");
//    }
//
//    @javafx.fxml.FXML
//    public void handleMyOrdersButton(ActionEvent actionEvent) {
//    }
//
//    @javafx.fxml.FXML
//    public void handleNotificationsButton(ActionEvent actionEvent) {
//    }
//}
package com.summer26.section1.group3.badc.Srabani_Akter.Farmer;

import com.summer26.section1.group3.badc.common.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class G0_Farmer_DashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleMyOrdersButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G5_Cancel_Order.fxml");
    }

    @javafx.fxml.FXML
    public void handlePlaceOrderButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G2_Farmer_Place_Order.fxml");
    }

    @javafx.fxml.FXML
    public void hanldeUpdateProfileButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G3_Farmer_Update_Profile.fxml");
    }

    @javafx.fxml.FXML
    public void handleApplicationStatusButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G4_Application_Status.fxml");
    }

    @javafx.fxml.FXML
    public void handleDeleveryConfirmationButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G8_Farmer_Delivery_Confirmation.fxml");
    }

    @javafx.fxml.FXML
    public void handleNotificationsButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G6_Farmer_Notifications.fxml");
    }

    @javafx.fxml.FXML
    public void handleSubmitComplaintButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G7_Farmer_Submit_Complaint.fxml");
    }

    @javafx.fxml.FXML
    public void handleProductListButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/Srabani_Akter/Farmer/G1_View_Product_List.fxml");
    }

    @javafx.fxml.FXML
    public void HandleBackToLoginPage(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/summer26/section1/group3/badc/common/login.fxml");
    }
}