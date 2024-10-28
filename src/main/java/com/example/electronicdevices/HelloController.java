package com.example.electronicdevices;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class HelloController {
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private TextField textName;
    @FXML
    private TextField textPrice;
    @FXML
    private TextField textWeight;
    @FXML
    private TextField TextField4;
    @FXML
    private TextField TextField5;
    @FXML
    private RadioButton RadioButtonSmartphone;
    @FXML
    private RadioButton RadioButtonTablet;
    @FXML
    private RadioButton RadioButtonLaptop;
    @FXML
    private ListView<Device> listView;

    ObservableList<Device> devices = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        listView.setItems(devices);
    }

    @FXML
    private void handleRadioButtonAction() {
        if (RadioButtonSmartphone.isSelected()) {
            label4.setVisible(true);
            label5.setVisible(true);
            label4.setText("Screen size");
            label5.setText("Camera Resolution");
            TextField4.setVisible(true);
            TextField5.setVisible(true);
        } else if (RadioButtonLaptop.isSelected()) {
            label4.setVisible(true);
            label5.setVisible(true);
            label4.setText("RAM size");
            label5.setText("Processor type");
            TextField4.setVisible(true);
            TextField5.setVisible(true);
        } else if (RadioButtonTablet.isSelected()) {
            label4.setVisible(true);
            label5.setVisible(true);
            label4.setText("batteryLife");
            label5.setText("Has Stylus?");
            TextField4.setVisible(true);
            TextField5.setVisible(true);
        }
    }
    @FXML
    void onAddClick() {

        if(RadioButtonSmartphone.isSelected()) {
            SmartPhone sm = new SmartPhone();
            sm.setName(textName.getText());
            sm.setType(Device.Type.SMARTPHONE);
            sm.setPrice( Double.parseDouble(textPrice.getText()) );
            sm.setWeight( Double.parseDouble( textWeight.getText()) );
            sm.setScreenSize( Double.parseDouble(TextField4.getText()) );
            sm.setCameraResolution( Double.parseDouble(TextField5.getText()));
            devices.add(sm);
        }
        if(RadioButtonTablet.isSelected()) {
            Tablet sm = new Tablet();
            sm.setName(textName.getText());
            sm.setType(Device.Type.TABLET);
            sm.setPrice( Double.parseDouble(textPrice.getText()) );
            sm.setWeight( Double.parseDouble( textWeight.getText()) );
            sm.setBatteryLife(Double.parseDouble(TextField4.getText()));
            sm.setHasStylus(Boolean.parseBoolean(TextField5.getText()));
            devices.add(sm);
        }
        if(RadioButtonLaptop.isSelected()) {
            Laptop sm = new Laptop();
            sm.setName(textName.getText());
            sm.setType(Device.Type.LAPTOP);
            sm.setPrice( Double.parseDouble(textPrice.getText()) );
            sm.setWeight( Double.parseDouble( textWeight.getText()) );
            sm.setRAMSize(Integer.parseInt(TextField4.getText()));
            sm.setProcessorType(TextField5.getText());
            devices.add(sm);
        }

    }
    @FXML
    private void onRemoveClick(){
        int id = listView.getSelectionModel().getSelectedIndex();
        devices.remove(id);
    }
}