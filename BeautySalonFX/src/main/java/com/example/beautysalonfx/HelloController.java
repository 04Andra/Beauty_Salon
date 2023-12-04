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
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javafx.scene.control.Spinner;


public class HelloController {

    @FXML
    private ImageView myImageView1;

    @FXML
    private ImageView myImageView2;

//    @FXML
//    private ImageView myImageView3;

    @FXML
    private ComboBox<String> productComboBox;

    @FXML
    private Text priceDisplayText;

    @FXML
    private final ObservableMap<String, Double> productPrices = FXCollections.observableHashMap();

    @FXML
    private GridPane gridPane = new GridPane();

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

    @FXML
    private ObservableList<Object> appointmentsList1 = FXCollections.observableArrayList();

    @FXML
    private ObservableList<ObservableList<Object>> appointmentsList2 = FXCollections.observableArrayList();

    @FXML
    private String[] viewAppointments;

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

    @FXML
    private TextField name1;

    @FXML
    private PasswordField password;

    @FXML
    private Map<String, String> login = new HashMap<String, String>();

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
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        root.setStyle("-fx-background-color: #E8D9D6");
        stage.show();
    }

    @FXML
    public void switchToScene3(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen3.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        root.setStyle("-fx-background-color: #E8D9D6");
        stage.show();
    }

    @FXML
    public void switchToScene4(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen4.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        root.setStyle("-fx-background-color: #E8D9D6");
        stage.show();
    }

    @FXML
    public void switchToScene5(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen5.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        root.setStyle("-fx-background-color: #E8D9D6");
        stage.show();
    }

    @FXML
    public void switchToScene6(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen6.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        root.setStyle("-fx-background-color: #E8D9D6");
        stage.show();
    }

    @FXML
    public void switchToScene7(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen7.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        root.setStyle("-fx-background-color: #E8D9D6");
        stage.show();
    }

    @FXML
    public void switchToScene8(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen8.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        root.setStyle("-fx-background-color: #E8D9D6");
        stage.show();
    }

    @FXML
    public void switchToScene9(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("screen9.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        root.setStyle("-fx-background-color: #E8D9D6");
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
    public void seeAppointments(ActionEvent event) {
        appointments.getItems().addAll(items);
    }

//    @FXML
//    public void saveUserInput(ActionEvent event) {
//        String enteredText = name.getText();
//        UserData userData = new UserData(enteredText);
//        userList.add(userData);
//
//        // Clear the text field for the next input
//        userInputField.clear();
//
//        // Update the ListView
//        userListView.setItems(userList);
//
//        // Save user data to a text file
//        writeUserDataToFile(userList, "data.txt");
//    }

    @FXML
    public void addToAppointmentList(ActionEvent event) {
        appointmentsList1.add(name.getText());
        appointmentsList1.add(number.getText());
        appointmentsList1.add(email.getText());
        appointmentsList1.add(date.getValue());
        appointmentsList1.add(hour.getValue());
        appointmentsList1.add(message.getText());

        appointmentsList2.add(FXCollections.observableArrayList(appointmentsList1));

        //System.out.println(appointmentsList2);
        //writeUserDataToFile(appointmentsList2, "appointments.txt");
        //viewAppointments.getItems().add(FXCollections.observableArrayList(appointmentsList2));

        appointmentsList1.clear();
    }

//    private void writeUserDataToFile(ObservableList<ObservableList<Object>> userList, String filename) {
//        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
//            for (ObservableList<Object> userData : userList) {
//                writer.println(userData.);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


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

    @FXML
    public void loginAdd() {
        login.put("user1", "user1");
        login.put("user2", "user2");
        login.put("user3", "user3");
    }

    @FXML
    public void verifyLogin(ActionEvent event) throws IOException {

        loginAdd();
        boolean credentialsMatch = false;

        for (Map.Entry<String, String> el :
                login.entrySet()) {

            if (name1.getText().equals(el.getKey()) && password.getText().equals(el.getValue())) {
                credentialsMatch = true;
                break;
            }
        }

        if (credentialsMatch) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("screen7.fxml"));
            Parent root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setFullScreen(true);
            root.setStyle("-fx-background-color: #E8D9D6");
            stage.show();
        } else {
            showInfoAlert("Name or password doesn't exist!");
        }
    }

    private void showInfoAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Try again!");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void displayImage() {
        myImageView1.setImage(new Image(getClass().getResource("/backgrounds/logo.png").toString()));
    }

    @FXML
    public void displayImage2() {
        myImageView2.setImage(new Image(getClass().getResource("/backgrounds/bg_1.png").toString()));
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
