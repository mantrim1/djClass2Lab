/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mark
 */
public class WelcomeService {
    private final String isMorning = "Good Morning, ";
    private final String isAfternoon = "Good Afternoon, ";
    private final String isEvening = "Good Evening, ";
    private final Date date = new Date();
    private String message = "";
    private final DateFormat dateFormat = new SimpleDateFormat("hh:mm");
    private final String noon = "12:00";
    private final String afternoon = "17:00";

    
    private String selectMessage(){
      String msg;
      try{
      if (this.date.before(this.dateFormat.parse(noon))){
          msg = "Good Morning, ";
      }else if(this.date.before(this.dateFormat.parse(afternoon))){
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
        
      try{
        message += this.selectMessage() + name;
      }catch(Exception ex){
          message = "I'm afraid I can't do that, "+name;
      }
             return message ;         
    };
    
}
        

