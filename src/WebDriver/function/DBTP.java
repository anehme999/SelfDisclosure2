package WebDriver.function;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTP {

	public DBTP() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Connection conn = null;
		 
        try {
        	DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String dbURL = "jdbc:sqlserver://PRTDVBDB187:2064";
           // String u="jdbc:sqlserver://PRTDVBDB196:2064;databaseName=adbReference";
            String user = "protocoll";
            String pass = "protocoll";
            conn = DriverManager.getConnection(dbURL, user, pass);
            //conn = DriverManager.getConnection(u);
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
                
            }
            Statement stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT count (*) from adbValuation..tAgreement");
            System.out.println(rs);
            while(rs.next()){
            	System.out.println(rs.getInt(1));
            	} 
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
	}

}
