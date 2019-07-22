package services;

import dao.CarsDao;
import entities.Cars;
import java.io.IOException;
import java.util.List;


public class CarsService {
    
    CarsDao cDao = new CarsDao();
    
    public String getCars() throws IOException {
        
        List<Cars> cs = cDao.SelectCars();
        StringBuilder str = new StringBuilder(); 
        
            str.append("<!DOCTYPE html>")
                .append("<html>")
                .append("<head>")
                .append("<title>Our Cars!</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>Available cars!</h1>")
                .append("<br />");
            for (Cars c : cs) {
                str.append("<p>").append(c).append("</p>");
            } 
            str.append("</body>")
                .append("</html>");
        
        String string = str.toString();
        
        return string;
    }
    
}

