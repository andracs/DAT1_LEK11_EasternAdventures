package dk.hungarian;

import java.sql.*;

public class Leaderboard {

    public static void add(Player p){

        // JDBC driver name and database URL
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost/easternadventures";

        //  Database credentials
        final String USER = "root";
        final String PASS = "password";


            Connection conn = null;
            Statement stmt = null;
            try{
                //STEP 2: Register JDBC driver
                Class.forName("com.mysql.jdbc.Driver");

                //STEP 3: Open a connection
                System.out.println("Connecting to database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);

                //STEP 4: Execute a query
                System.out.println("Creating statement...");
                stmt = conn.createStatement();
                String sql;
                sql = "INSERT INTO leaderboard (p_name, p_score) VALUES ('" + p.getNavn() + "' , " + p.getPoint() + ")";
                stmt.execute(sql);
                System.out.println("Successfully saved to leaderboard!");

                //STEP 5: Clean-up environment
                stmt.close();
                conn.close();
            }catch(SQLException se){
                //Handle errors for JDBC
                se.printStackTrace();
            }catch(Exception e){
                //Handle errors for Class.forName
                e.printStackTrace();
            }finally{
                //finally block used to close resources
                try{
                    if(stmt!=null)
                        stmt.close();
                }catch(SQLException se2){
                }// nothing we can do
                try{
                    if(conn!=null)
                        conn.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }//end finally try
            }//end try


    }

}
