<%@ page import ="java.sql.*" %>
<%
    try{
        String username = request.getParameter("username");  
        String password = request.getParameter("password");
        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exercise3login?" + "user=root&password=1234");    
        PreparedStatement pst = conn.prepareStatement("Select uusername,upassword from users where uusername=? and upassword=?");
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();                        
        if(rs.next()){          
           out.println("Valid login credentials");
           %>
           <div><a href="index.html">Logout</a></div>
           <jsp:include page="CarsServlet" />
           <%
        }else{
           out.println("Invalid login credentials");
           %>
           <div>Go <a href="index.html"> Home</a></div>
           <%
               }
   }
   catch(Exception e){      
       out.println("Something went wrong !! Please try again");      
   }      
%>
