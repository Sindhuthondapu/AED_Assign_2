/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lenovo pc
 */
public class Validation {
    public static boolean email_Validation(String email){
        boolean status = false;
        String email_Pattern= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
                /*"^[a-zA-Z0-9-]+(\\.[A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";*/
        Pattern pattern=Pattern.compile(email_Pattern);
        Matcher matcher=pattern.matcher(email);
        
        if(matcher.matches()){
            status = true;
            
        }else{
            status = false;
        }
        return status;
    }
}
