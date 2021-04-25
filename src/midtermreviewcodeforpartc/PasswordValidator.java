/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author Rafaeru
 */
public class PasswordValidator {
    
    //String Child Class
    private String password;
    //Boolean Child Classes
    private Boolean length;
    private Boolean upper;
    private Boolean special;
    
    //Constructors
    public PasswordValidator()
    {}
    public PasswordValidator(String passwrd, Boolean checkLength, Boolean checkUpper, Boolean checkSpecial) {
        this.password = passwrd;
        this.length = checkLength;  
        this.upper = checkUpper;
        this.special = checkSpecial;
    }
    
    //Mutators
    public void setPassword(String passwrd) {
        this.password = passwrd;
    }
    public void setLength(Boolean checkLength) {
        this.length = checkLength;
    }
    public void setUpper(Boolean checkUpper) {
        this.upper = checkUpper;
    }
    public void setSpecial(Boolean checkSpecial) {
        this.special = checkSpecial;
    }
    
    //Accessors
    public String getPassword() {
        return password;
    }
    public Boolean getLength() {
        //If the password length is more than 8
        //Then length returns true, else returns false
        if(password.length() >= 8) {
            this.length = true;
            return length;
        } else {
            this.length = false;
            return length;
        }
    } 
    public Boolean getUpper() {
        boolean upper = false;
        for(int i = 0; i<password.length(); i++) {
            //If the password contains an upper case
            //Then upper returns true, else returns false
            if(Character.isUpperCase(password.charAt(i))) {
                upper = true;
                
            }
        }
        return upper;
    }
    public Boolean getSpecial() {
        boolean special =false;
        for(int i = 0; i<password.length(); i++){
            //If the password contains a special character
            //Then special returns true, else returns false
            if(!Character.isLetterOrDigit(password.charAt(i))){
                special = true;
            }
          }
        return special;
    }
    
}
