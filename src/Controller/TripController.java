package Controller;

import Models.Trip;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TripController {

    /*
    @FXML
    private TextField driverNum;
*/
    @FXML private TextField truckNum;

    @FXML private TextField tripNum;

    @FXML private TextField driverNum;
    @FXML private TextField co_driverNum;
    @FXML private DatePicker dateDeparted;
    @FXML private DatePicker dateReturn;
    @FXML private TextField state;
    @FXML private TextField milesDriven;
    @FXML private TextField receiptNum;
    @FXML private TextField gallonsPurchased;
    @FXML private TextField taxesPaid;
    @FXML private TextField stationName;

    @FXML private TextField stationLocation;


    private Connection con = null;
    private PreparedStatement ps = null;

    public void Submit() throws SQLException {

        Trip trip = new Trip();
        trip.setTruckNumber(truckNum.getText());

        trip.setTripNumber(driverNum.getText());
        trip.setCoDriverNumber(co_driverNum.getText());
        trip.setTripNumber(tripNum.getText());
        //date
        //date
        trip.setStateCode(state.getText());
        trip.setMilesDriven(Integer.valueOf(milesDriven.getText()));
        trip.setReceiptNumber(receiptNum.getText());
        trip.setGallonsPurchased(Double.valueOf(gallonsPurchased.getText()));
        trip.setTaxesPaid(Double.valueOf(taxesPaid.getText()));
        trip.setStationName(stationName.getText());
        trip.setLocation(stationLocation.getText());



        System.out.println("Test " + truckNum.getText());
        System.out.println("Test class " + trip.getCoDriverNumber());


        addNewUser(trip);
        //trips.add(trip);


    }

    public void addNewUser(Trip t) throws SQLException {

        con = Models.JdbcConnection.databaseConnection();
        String query = "INSERT INTO TRIP (TRUCKNUMBER, DRIVERNUMBER, TRIPNUMBER, STATECODE ) VALUES (?, ?, ?, ?)";


        try {
            ps = con.prepareStatement(query);
            ps.setString(1, t.getTruckNumber());
            ps.setString(2, t.getDriverNumber());
            ps.setString(3, t.getTripNumber());
            ps.setString(4,t.getStateCode());

            int i = ps.executeUpdate();

            if(i == 1){
                System.out.println("Data Insert Successfully");
            }

        }catch (SQLException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            ps.close();
        }

    }
    @FXML
    void produceDetailReport(ActionEvent event){

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Demo.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1 ));
            stage.show();
        } catch (Exception e){
            System.out.println("Cant load");
        }

    }


    public void initialize(URL url, ResourceBundle resourceBundle) {

        con = Models.JdbcConnection.databaseConnection();


    }


}
