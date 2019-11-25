package sample;

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

public class Controller {

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


    ObservableList<Trip> trips = FXCollections.observableArrayList();

    public void Submit(){

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


        trips.add(trip);


    }

    @FXML
    void tripJournal(ActionEvent event){

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Views/Trip.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1 ));
            stage.show();
        } catch (Exception e){
            System.out.println("Cant load");
        }

    }

    @FXML
    void produceDetailReport(ActionEvent event){

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Views/DetailReport.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1 ));
            stage.show();
        } catch (Exception e){
            System.out.println("Cant load");
        }

    }

    @FXML
    void produceSummaryReport(ActionEvent event){

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Views/SummaryReport.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e){
            System.out.println("Cant load");
            System.out.println(e);
        }

    }


}
