package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Customer;

import java.time.LocalDate;

public class CustomerFormController {

    @FXML
    private ComboBox<?> cmbTitle;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colDOB;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colSalary;

    @FXML
    private DatePicker dateDOB;

    @FXML
    private TableView<?> tblCustomers;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSalary;

    @FXML
    void btnAddCustomerOnAction(ActionEvent event) {
        String id = txtID.getText();
        String title = cmbTitle.getValue().toString();
        String name = txtName.getText();
        LocalDate dob = dateDOB.getValue();
        String address = txtAddress.getText();
        double salary = Double.parseDouble(txtSalary.getText());

        Customer customer = new Customer(id, title, name, dob,address, salary);






    }

}
