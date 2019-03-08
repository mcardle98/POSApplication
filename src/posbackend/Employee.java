package posbackend;

import java.util.Date;

public class Employee {
    private String clockTime;
    private String firstName;
    private String lastName;
    private Integer pin; 
    public Employee(String firstName, String lastName, Integer pin){
        
    }
    public Employee(String firstName, String lastName, Integer pin, Boolean manager){
        
    }
    
    private void setClockTime (){
        Date date = new Date();
        clockTime += date.toString();
    }
    private String getClockTime(){
        return clockTime;
    }

    public Integer getPin() {
        return pin;
    }
    
    
}
