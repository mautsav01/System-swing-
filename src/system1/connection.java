/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system1;


import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class connection {
    public Connection cn;
public connection() {
    try {
        // String command = "cmd /c start mstsc /v:192.168.10.5";
    //Process child = Runtime.getRuntime().exec(command);
    //OutputStream out = child.getOutputStream();
      //out.write("cd C:/ /r/n".getBytes());
    //out.flush();
    //out.write("dir /r/n".getBytes());
    //out.close();
  
    
        Class.forName("com.mysql.jdbc.Driver");
         cn=DriverManager.getConnection("jdbc:mysql://192.168.10.7:3306/login","utsav","utsav");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
        //System.out.println("ex:"+ex);
    }
}
    
    
}
