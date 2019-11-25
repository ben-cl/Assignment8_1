package Models;

import java.util.Date;

public class Trip {

    private String TruckNumber;
    private String DriverNumber;

    private String CoDriverNumber;
    private String TripNumber;
    private Date DateDeparted;
    //DateReturned
    private String StateCode;
    private Double MilesDriven;
    private String ReceiptNumber;
    private Double GallonsPurchased;
    private Double TaxesPaid;
    private String StationName;
    private String Location;

    public Trip() {


    }

    public Trip(String tripNumber){
        TripNumber = tripNumber;
    }
    public Trip(String truckNumber, String driverNumber, String coDriverNumber) {
        TruckNumber = truckNumber;
        DriverNumber = driverNumber;
        CoDriverNumber = coDriverNumber;
    }

    public Trip(String truckNumber, String driverNumber, String coDriverNumber, String tripNumber, String stateCode, String receiptNumber, Double gallonsPurchased, Double taxesPaid, String stationName, String location) {
        TruckNumber = truckNumber;
        DriverNumber = driverNumber;
        CoDriverNumber = coDriverNumber;
        TripNumber = tripNumber;
        StateCode = stateCode;
        ReceiptNumber = receiptNumber;
        GallonsPurchased = gallonsPurchased;
        TaxesPaid = taxesPaid;
        StationName = stationName;
        Location = location;
    }
// Setters

    public void setTruckNumber(String truckNumber) {
        TruckNumber = truckNumber;
    }

    public void setDriverNumber(String driverNumber) {
        DriverNumber = driverNumber;
    }

    public void setCoDriverNumber(String coDriverNumber) {
        CoDriverNumber = coDriverNumber;
    }

    public void setTripNumber(String tripNumber) {
        TripNumber = tripNumber;
    }

    public void setStateCode(String stateCode) {
        StateCode = stateCode;
    }

    public void setMilesDriven(double milesDriven) {
        MilesDriven = milesDriven;
    }

    public void setReceiptNumber(String receiptNumber) {
        ReceiptNumber = receiptNumber;
    }

    public void setGallonsPurchased(Double gallonsPurchased) {
        GallonsPurchased = gallonsPurchased;
    }

    public void setTaxesPaid(Double taxesPaid) {
        TaxesPaid = taxesPaid;
    }

    public void setStationName(String stationName) {
        StationName = stationName;
    }

    public void setLocation(String location) {
        Location = location;
    }


    //Getters

    public String getTruckNumber() {
        return TruckNumber;
    }

    public String getDriverNumber() {
        return DriverNumber;
    }

    public String getCoDriverNumber() {
        return CoDriverNumber;
    }

    public String getTripNumber() {
        return TripNumber;
    }

    public String getStateCode() {
        return StateCode;
    }

    public Double getMilesDriven() {
        return MilesDriven;
    }

    public String getReceiptNumber() {
        return ReceiptNumber;
    }

    public Double getGallonsPurchased() {
        return GallonsPurchased;
    }

    public Double getTaxesPaid() {
        return TaxesPaid;
    }

    public String getStationName() {
        return StationName;
    }

    public String getLocation() {
        return Location;
    }
}
