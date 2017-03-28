// Jakob Vendegna
// CSC 161 201
// Age Calculator for Week1Homework

/* Given a month day and year in the correct format, 
this AgeCalculator should allow you to determine the 
number of years since a given date */

import java.util.Calendar;

public class AgeCalculator {
    
    //init variables
    int month, day, year;
    int currentYear, currentMonth, currentDate;
    int age;
    
    //create a new Calendar object and set it to today's date
    Calendar cal = Calendar.getInstance();
   
    //blank constructor
    public AgeCalculator() {

        this.currentYear = cal.get(Calendar.YEAR);
        this.currentMonth = cal.get(Calendar.MONTH);
        this.currentDate = cal.get(Calendar.DATE);
        
        this.month = 01;
        this.day = 01;
        this.year = 2000;
                
    }
    
    //main constructor, used in Week1Homework.java
    public AgeCalculator(int m, int d, int y) throws InvalidDateException {
        
        this.currentYear = cal.get(Calendar.YEAR);
        this.currentMonth = cal.get(Calendar.MONTH);
        this.currentDate = cal.get(Calendar.DATE);
        
        //try{
            //define range for acceptable input
            if(y > 1900 && y < this.currentYear) {
                this.year = y;
            }
            else {
                throw new InvalidDateException();
            }
            
            // month must be between 0 and 12
            if(m > 0 && m < 13) {
                this.month = m;
            }
            else {
                throw new InvalidDateException();
            }
            
            // April June September and November have 30 days
            if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                if(d <= 30) {
                    this.day = d;
                }
                else{
                    throw new InvalidDateException();
                }
            }
            //febuary has 28, unless it's a leap year
            else if(this.month == 02) {
                //best guess at a leap year calculation, I know I've done this before...
                if(this.year % 4 == 0){
                    if(d <= 29) {
                        this.day = d;
                    }
                    else {
                        throw new InvalidDateException();
                    }
                }
                //if not a leap year
                else{
                    if(d <= 28){
                        this.day = d;
                    }
                    else {
                        throw new InvalidDateException();
                    }
                }
            }
            // the rest of the months have 31 days
            else {
                if(d <= 31) {
                    this.day = d;
                }
                else {
                    throw new InvalidDateException();
                }
            }

        //}
        // catch any thrown exception... It will print, and works fine,
        // but looping from main to display a JOptionPane.showMessageDialog,
        // I can't figure that out.
        //catch(InvalidDateException e) {
          //  System.out.println(e.toString());
            
        //}
              
    }
    
    // I am also curious if there is a way to pass a constructor value an internal method?
    // for example above if I wanted to set the year by running this method,
    // I tried:
    // this.year = setYear(y); or this.year = this.setYear(y);
    // I did change the mehtod to an int, and set it up to return a value,
    // but it threw exceptions at me.
    // This would be a great way to reduce the amount of code it takes to 
    // create a class, if I can figure it out.
    public void setYear(int y) {
        try{
            // ensure year is in valid range
            if(y > 1900 && y < this.currentYear) {
                this.year = y;
               
            }
            else {
                throw new InvalidDateException();
            }
        }
        catch(InvalidDateException e) {
            System.out.println(e.toString());
        }
    }
        
    public void setMonth(int m) {
        try {
            //ensure month is in valid range
            if(m > 0 && m < 13)
                this.month = m;
            else
                throw new InvalidDateException();
       }
       catch(InvalidDateException e) {
           System.out.println(e.toString()); 
       }
    }
    
    public void setDay(int d) {
        try {
            // repetition...
            if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                if(d <= 30) {
                    this.day = d;
                }
                else{
                    throw new InvalidDateException();
                }
            }
            else if(this.month == 02) {
                if(this.year % 4 == 0){
                    if(d <= 29) {
                        this.day = d;
                    }
                    else {
                        throw new InvalidDateException();
                    }
                }
                else{
                    if(d <= 28){
                        this.day = d;
                    }
                    else {
                        throw new InvalidDateException();
                    }
                }
            }
            else {
                if(d <= 31) {
                    this.day = d;
                }
                else {
                    throw new InvalidDateException();
                }
            }
        }
        catch(InvalidDateException e) {
            System.out.println(e.toString());
        }
    }
    
    
    public int getCurrentYear(){
    
        return this.currentYear;
    }
    
    public int getAge() {
        //birthday has not occured
            //Calendar starts months at 0, so we must subtract 1 from this.month
        if(this.month -1 > this.currentMonth) {
            this.age = this.currentYear - this.year - 1;
        }
        //if one's birthday falls inside the current month:
        else if(this.month - 1 == this.currentMonth){
        
            if(this.day < this.currentDate) {
                this.age = this.currentYear - this.year;
            }
            else {
                this.age = this.currentYear - this.year - 1;
            }
        }
        // if your birthday has already passed
        else {
             this.age = this.currentYear - this.year;
        }
         
        
        return this.age;    
    }
    
    public String toString(){
    
        String date = this.month + "/" + this.day + "/" + this.year;
        
        return date;
    }

    
}