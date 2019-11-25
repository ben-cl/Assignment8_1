package sample;

import Models.Trip;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javafx.scene.control.TableColumn;

public class Main extends Application {

    TableView<Trip> table;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/Views/DetailReport.fxml"));


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        /*
        //TruckNumber Column
        TableColumn<Trip, String> trucNumColumn = new TableColumn<>("Truck Number");
        trucNumColumn.setMinWidth(200);
        trucNumColumn.setCellValueFactory(new PropertyValueFactory<>("TruckNumber"));

        //TruckNumber Column
        TableColumn<Trip, String> driverNumberColumn = new TableColumn<>("Driver Number");
        driverNumberColumn.setMinWidth(200);
        driverNumberColumn.setCellValueFactory(new PropertyValueFactory<>("DriverNumber"));


        //TruckNumber Column
        TableColumn<Trip, String> coDriverNumberColumn = new TableColumn<>("Co-Driver Number");
        coDriverNumberColumn.setMinWidth(200);
        coDriverNumberColumn.setCellValueFactory(new PropertyValueFactory<>("CoDriverNumber"));

        table = new TableView<>();
        table.setItems(getTrips());
        table.getColumns().addAll(trucNumColumn, driverNumberColumn, coDriverNumberColumn );


         */
    }
    // Get all of trips
    public ObservableList<Trip> getTrips(){


        ObservableList<Trip> trips = FXCollections.observableArrayList();

        trips.add(new Trip("truckNum1", "driverNum1","Co-DriverNum1"));
        trips.add(new Trip("truckNum2", "driverNum1","Co-DriverNum1"));
        trips.add(new Trip("truckNum3", "driverNum1","Co-DriverNum1"));

        return  trips;

    }

    public static void main(String[] args) {
        launch(args);
    }
}
