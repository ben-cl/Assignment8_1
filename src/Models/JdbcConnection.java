package Models;

import java.sql.*;

public class JdbcConnection {

    public static Connection databaseConnection(){
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl2", "batman", "batman");

        }catch(Exception e){
            System.out.println("error connect");
        }
        return con;
    }

    public static void main(String[] args){



        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl2", "batman", "batman");

            Statement st = con.createStatement();

            String sql = "select * from student";



            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                System.out.println(rs.getString(1)+ "  "+rs.getString(2));
            }
            con.close();




        }catch(Exception e){
            System.out.println("error connect");
        }
    }


}
