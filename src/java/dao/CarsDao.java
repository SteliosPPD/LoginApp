package dao;


import entities.Cars;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarsDao extends Database {

    String server = "localhost:3306";
    String database = "exercise3login";
    String username = "root";
    String password = "1234";
    private static final String selectCars = "SELECT * FROM `exercise3login`.`cars`";

    public List<Cars> SelectCars () throws IOException {
        
        Cars cs;
        List<Cars> cars = new ArrayList<>();

        setOptions("?zeroDateTimeBehavior=convertToNull&serverTimezone=Europe/Athens&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false");
        ResultSet rs = Database(server, database, username, password, selectCars);
        if (rs == null) {
            System.out.println("Error to the database");
        }
        try {
            while (rs.next()) {
                cs = new Cars(rs.getInt("CID"), rs.getString("CBRAND"),
                        rs.getString("CMODEL"),
                        rs.getString("CHORSEPOWER"));
                cars.add(cs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarsDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cars;

    }
    
}
