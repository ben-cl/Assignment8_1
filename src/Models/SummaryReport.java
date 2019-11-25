package Models;

public class SummaryReport {

    private Integer NumberOfTrips;
    private Double TotalMilesDriven;
    private Double TotalGallonsPurchased;
    private Double TotalTaxesPaid;

    public SummaryReport(int numberOfTrips, double  totalMilesDriven, double totalGallonsPurchased, double totalTaxesPaid) {
        NumberOfTrips = numberOfTrips;
        TotalMilesDriven = totalMilesDriven;
        TotalGallonsPurchased = totalGallonsPurchased;
        TotalTaxesPaid = totalTaxesPaid;
    }

    public Integer getNumberOfTrips() {
        return NumberOfTrips;
    }

    public Double getTotalMilesDriven() {
        return TotalMilesDriven;
    }

    public Double getTotalGallonsPurchased() {
        return TotalGallonsPurchased;
    }

    public Double getTotalTaxesPaid() {
        return TotalTaxesPaid;
    }

    public void setNumberOfTrips(Integer numberOfTrips) {
        NumberOfTrips = numberOfTrips;
    }

    public void setTotalMilesDriven(Double totalMilesDriven) {
        TotalMilesDriven = totalMilesDriven;
    }

    public void setTotalGallonsPurchased(Double totalGallonsPurchased) {
        TotalGallonsPurchased = totalGallonsPurchased;
    }

    public void setTotalTaxesPaid(Double totalTaxesPaid) {
        TotalTaxesPaid = totalTaxesPaid;
    }
}
