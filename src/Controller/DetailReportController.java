package Controller;

import Models.JdbcConnection;
import Models.Trip;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DetailReportController implements Initializable {


    @FXML private TableView<Trip> table;
    @FXML private TableColumn<Trip, String> truckNumColumn;
    @FXML private TableColumn<Trip, String> driverNumberColumn;
    @FXML private TableColumn<Trip, String> coDriverNumberColumn;

    @FXML private TableColumn<Trip, String> TripNumber;
    @FXML private TableColumn<Trip, String> StateCode;

    //@FXML private TableColumn<Trip, int> MilesDriven;

    @FXML private TableColumn<Trip, String> ReceiptNumber;

    @FXML private TableColumn<Trip, Double> GallonsPurchased;
    @FXML private TableColumn<Trip, Double> TaxesPaid;

    @FXML private TableColumn<Trip, String> StationName;
    @FXML private TableColumn<Trip, String> Location;




    public ObservableList<Trip> trips = FXCollections.observableArrayList(

            new Trip("truckNum1", "driverNum1", "co-DriverNum1","tripNum", "QC", "receiptNumber", 20.00, 10.15, "Henri","Montreal" ),
            new Trip("truckNum2", "driverNum1", "co-DriverNum1","tripNum", "QC", "receiptNumber", 20.00, 10.15, "Henri","Montreal" ),
            new Trip("truckNum3", "driverNum1", "co-DriverNum1","tripNum", "QC", "receiptNumber", 20.00, 10.15, "Henri","Montreal" )

    );

    //ObservableList<Trip> trips = FXCollections.observableArrayList();

    // Get all of trips
//    public ObservableList<Trip> getTrips(){
//
//
//
//        trips.add(new Trip("truckNum1", "driverNum1","Co-DriverNum1"));
//        trips.add(new Trip("truckNum2", "driverNum1","Co-DriverNum1"));
//        trips.add(new Trip("truckNum3", "driverNum1","Co-DriverNum1"));
//
//        return  trips;
//
//    }
            //trips.add(new Trip("truckNum1", "driverNum1","Co-DriverNum1"));


//trips.add(new Trip("truckNum3", "driverNum1", "co-DriverNum1","tripNum", "QC", "receiptNumber", 20.00, 10.15, "Henri","Montreal" ));

//    public ObservableList<Trip> trips = FXCollections.observableArrayList(
//            new Trip("truckNum1", "driverNum1","Co-DriverNum1"),
//            new Trip("truckNum2", "driverNum1","Co-DriverNum1"),
//            new Trip("truckNum3", "driverNum1","Co-DriverNum1"),
//            new Trip("truckNum1", "driverNum1", "co-DriverNum1","tripNum", "QC", "receiptNumber", 20.00, 10.15, "Henri","Montreal" )
//    );



    ObservableList<Trip> tripList = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Connection con = Models.JdbcConnection.databaseConnection();

        try {

            ResultSet rs = con.createStatement().executeQuery("select * from Trip");

            while(rs.next()){

                Trip t = new Trip(rs.getString("TRIPNUMBER"));

                tripList.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        truckNumColumn.setCellValueFactory(new PropertyValueFactory<>("TruckNumber"));
        driverNumberColumn.setCellValueFactory(new PropertyValueFactory<>("DriverNumber"));
        coDriverNumberColumn.setCellValueFactory(new PropertyValueFactory<>("CoDriverNumber"));

        TripNumber.setCellValueFactory(new PropertyValueFactory<>("TripNumber"));
        StateCode.setCellValueFactory(new PropertyValueFactory<>("StateCode"));
        //
        ReceiptNumber.setCellValueFactory(new PropertyValueFactory<>("ReceiptNumber"));

        StateCode.setCellValueFactory(new PropertyValueFactory<>("StateCode"));
        GallonsPurchased.setCellValueFactory(new PropertyValueFactory<>("GallonsPurchased"));
        TaxesPaid.setCellValueFactory(new PropertyValueFactory<>("TaxesPaid"));

        StationName.setCellValueFactory(new PropertyValueFactory<>("StationName"));
        Location.setCellValueFactory(new PropertyValueFactory<>("Location"));

        //
        this.
        table.setItems(tripList);
    }
}





