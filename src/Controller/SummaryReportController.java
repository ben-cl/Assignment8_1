package Controller;

import Models.SummaryReport;
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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SummaryReportController implements Initializable {


    // Change data type to number?
    @FXML
    private TableView<SummaryReport> table;
    @FXML private TableColumn<SummaryReport, Integer> numberOfTrips;
    @FXML private TableColumn<SummaryReport, Double> totalMilesDriven;
    @FXML private TableColumn<SummaryReport, Double> totalGallonsPurchased;

    @FXML private TableColumn<SummaryReport, Double> totalTaxesPaid;

    ObservableList<SummaryReport> SummaryReportList = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Connection con = Models.JdbcConnection.databaseConnection();

        //Variable to keep track
        int numTrips = 0;
        double totalMiles = 0;
        double totalGallons = 0;
        double totalTaxes = 0;

        try {

            ResultSet rs = con.createStatement().executeQuery("select * from Trip");

            while(rs.next()) {

                numTrips++;
                totalMiles += rs.getDouble("MILESDRIVEN");
                totalGallons += rs.getDouble("GALLONSPURCHASED");
                totalTaxes += rs.getDouble("TAXESPAID");

                //SummaryReport sumReport = new SummaryReport(12,12, 12, 12);
                SummaryReport sumReport = new SummaryReport(numTrips,totalMiles, totalGallons, totalTaxes);


                //SummaryReportList.add(sumReport);

                System.out.println(numTrips);
                System.out.println(totalMiles);

            }



        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        //SummaryReport sumReport = new SummaryReport(numTrips,totalMiles, totalGallons, totalTaxes);

        //SummaryReportList.add(sumReport);

        numberOfTrips.setCellValueFactory(new PropertyValueFactory<SummaryReport, Integer>("NumberOfTrips"));
        totalMilesDriven.setCellValueFactory(new PropertyValueFactory<SummaryReport, Double>("TotalMilesDriven"));
        totalGallonsPurchased.setCellValueFactory(new PropertyValueFactory<SummaryReport, Double>("TotalGallonsPurchased"));
        totalTaxesPaid.setCellValueFactory(new PropertyValueFactory<SummaryReport, Double>("TotalTaxesPaid"));

        //this.table.setItems(SummaryReportList );

    }
}
