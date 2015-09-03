/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Mark
 */
public class WelcomeService {
    private final String isMorning = "Good Morning, ";
    private final String isAfternoon = "Good Afternoon, ";
    private final String isEvening = "Good Evening, ";
    private final Date today = new Date();
    private final  Calendar cal = GregorianCalendar.getInstance();
    private String message = "";
    private final DateFormat dateFormat = new SimpleDateFormat("hh:mm");
    private final int noon = 12;
    private final int afternoon = 17;

    
    private String selectMessage(){
      String msg;
      cal.setTime(today);
      int hour = cal.get(Calendar.HOUR_OF_DAY);
        System.out.println("HERE: " +hour);
        
      try{
     
      if (hour<noon){
          msg = "Good Morning, ";
      }else if(hour<afternoon){
          msg = "Good Afternoon, ";
      }else{
          msg = "Good Evening, ";
      }
      }catch(Exception ex){
              msg="Uh-oh something went wrong, ";
              }
      
      
      return msg;
    }
    public String welcomeGreeting(String name){
        System.out.println("Name: "+name);
        
      try{
        message += this.selectMessage() + name;
      }catch(Exception ex){
          message = "I'm afraid I can't do that, "+name;
      }
      System.out.println("Message: "+ message);
             return message ;         
    };
    
}
        

