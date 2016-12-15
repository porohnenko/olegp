package sbmt.andrew.mysql_noserver;

import android.os.AsyncTask;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Created by HP02 on 08.12.2016.
 */

public class DoSelection extends AsyncTask<String,Integer,String> {
    ArrayList<Person> array;

    @Override
    protected String doInBackground(String... params) {
        String url = params[0];
        Properties prop = new Properties();
        prop.put("user","student");
        prop.put("password","best");
        prop.put("autoReconnect","true");
        prop.put("characterEncoding","UTF-8");
        prop.put("useUnicode","true");

        Connection cn = null;
        Statement st = null;
      //  ResultSet rs=null;


        Person p;
        array = new ArrayList<>();


        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            cn = (Connection) DriverManager.getConnection(url,prop);
            st = (Statement) cn.createStatement();
            st.execute("INSERT INTO PERSON VALUES('Ольга','Васильева',25,2500.8)");
         //   rs = (ResultSet) st.executeQuery("SELECT * FROM PERSON");
/*
            while(rs.next()){
                p = new Person(rs.getString("fname"),
                               rs.getString("sname"),
                               rs.getInt("age"),
                               rs.getDouble("salary"));

             array.add(p);

            }
*/

        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
             try {
                 //if(rs!=null) rs.close();
                 if(st!=null) st.close();
                 if(cn!=null) cn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        return null;
    }

    @Override
    protected void onPostExecute(String s) {
/*
        String out="";
        for(int i=0;i<array.size();i++){
            out+=array.get(i).toString();
        }

        MainActivity.tv.setText(out);
*/
        MainActivity.tv.setText("Данные добавлены");

        super.onPostExecute(s);

    }
}
