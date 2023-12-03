package com.example.beautysalonfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;


public class HelloController{

//    @FXML
//    private ImageView myImageView;
//    @FXML
//    private ImageView myImageView2;
//    @FXML
//    private ImageView myImageView3;

    @FXML
    private ComboBox<String> productComboBox;

    @FXML
    private Text priceDisplayText;

    private final ObservableMap<String, Double> productPrices = FXCollections.observableHashMap();

//    @FXML
//    private GridPane gridPane;

//    @FXML
//    Button listButton;

    @FXML
    private ListView<String> appointments;

    @FXML
    private String[] items = {"appointment 1", "appointment 2", "appointment 3"};

    @FXML
    private ListView<String> stock;

    @FXML
    private String[] items2 = {"product 1", "product 2", "product 3"};

    @FXML
    private ListView<Double> walletList;

    @FXML
    private Double[] items3 = {24.99, 40.59, 50.0};

    @FXML
    private double wallet = 850;

    @FXML
    private Label displayWallet;

//    @FXML
//    private final ObservableList<Double> money = FXCollections.observableArrayList();

    private ObservableList<Object> appointmentsList1 = FXCollections.observableArrayList();

    @FXML
    private ObservableList<ObservableList<Object>> appointmentsList2 = FXCollections.observableArrayList();

    @FXML
    private ListView<ObservableList<ObservableList<Object>>> appointmentsList3;

    @FXML
    private TextField name;

    @FXML
    private TextField number;

    @FXML
    private TextField email;

    @FXML
    private ComboBox box;

    @FXML
    private DatePicker date;

    @FXML
    private Spinner hour;

    @FXML
    private TextField message;

    private Stage stage;
    private Scene scene;
    private Parent root;

//    @FXML
//    public void switchToScene1(ActionEvent event) throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
//        Parent root = loader.load();
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setFullScreen(true);
//        stage.show();
//    }

    @FXML
    public void switchToScene2(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen2.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    @FXML
    public void switchToScene3(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen3.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    @FXML
    public void switchToScene4(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen4.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    @FXML
    public void switchToScene5(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen5.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    @FXML
    public void switchToScene6(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen6.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    @FXML
    public void switchToScene7(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen7.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    @FXML
    public void switchToScene8(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen8.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    @FXML
    public void switchToScene9(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen9.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    @FXML
    public void seeStock(ActionEvent event) {
        stock.getItems().addAll(items2);
    }

    @FXML
    public void seeWallet(ActionEvent event) {
        walletList.getItems().addAll(items3);
    }

    @FXML
    public void addToAppointmentList (ActionEvent event) {
        appointmentsList1.add(name.getText());
        appointmentsList1.add(number.getText());
        appointmentsList1.add(email.getText());
        appointmentsList1.add(date.getValue());
        appointmentsList1.add(hour.getValue());
        appointmentsList1.add(message.getText());
        System.out.println(appointmentsList1);

        appointmentsList2.add(FXCollections.observableArrayList(appointmentsList1));
        System.out.println(appointmentsList2);

        appointmentsList1.clear();
    }

//    @FXML
//    public void addToAppointments (ActionEvent event) {
//        appointmentsList2.addAll(appointmentsList1);
//        appointmentsList1.removeAll();
//        System.out.println(appointmentsList2);
//    }

    @FXML
    public void seeAppointments(ActionEvent event) {
        appointmentsList3.getItems().addAll(appointmentsList2);
    }

    @FXML
    public void initialize() {
        // Initialize product prices
        productPrices.put("Tuns par scurt", 20.0);
        productPrices.put("Tuns par mediu", 30.0);
        productPrices.put("Tuns par lung", 40.0);
        productPrices.put("Manichiura gel", 50.0);
        productPrices.put("Pedichiura gel", 50.0);
    }

    @FXML
    public void updatePrice() {
        String selectedProduct = productComboBox.getValue();
        if (selectedProduct != null && productPrices.containsKey(selectedProduct)) {
            double price = productPrices.get(selectedProduct);
            priceDisplayText.setText("Price: $" + price);
        } else {
            priceDisplayText.setText("Select a product to see the price.");
        }
    }

    @FXML
    public void initialize3() {
        displayWallet.setText(String.valueOf(wallet));
    }


//    @FXML
//    public void seeAppointments(ActionEvent event) {
//        appointments.getItems().addAll(items);
//    }



//    @FXML
//    public void initialize2() {
//        ObservableList<String> observableList = FXCollections.observableArrayList("Appointment 1", "Appointment 2", "Appointment 3");
//        appointments.setItems(observableList);
//    }
//
//    @FXML
//    public void populateListView() {
//        ObservableList<String> observableList = FXCollections.observableArrayList("Appointment 1", "Appointment 2", "Appointment 3");
//        appointments.setItems(observableList);
//    }

//    @FXML
//    public void initialize(URL location, ResourceBundle resources) {
//        File file = new File("backgrounds/bg_1.jpg");
//        try {
//            Image image = new Image(file.toURI().toString());
//            myImageView.setImage(image);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

//    @FXML
//    protected void displayImage() {
//        myImageView.setImage(new Image(getClass().getResource("/backgrounds/logo.png").toString()));
//    }

//    @FXML
//    protected void displayImage2() {
//        myImageView2.setImage(new Image(getClass().getResource("/backgrounds/bg_1.png").toString()));
//    }
//
//    @FXML
//    protected void displayImage3() {
//        myImageView3.setImage(new Image(getClass().getResource("/backgrounds/bg_2.png").toString()));
//    }

//    @FXML
//    public void initialize() {
//        displayImage();
////        displayImage2();
//    }

//    @FXML
//    public void initialize3() {
//        displayImage3();
//    }
}
