package Enum;

import javax.swing.JOptionPane;

public class EnumerableChar{
 
    public static void main(String[] args){

        Status statusOne = Status.INACTIVE; 
        Status statusTwo = Status.ACTIVE;
               

        JOptionPane.showMessageDialog(null, "Status One: " + statusOne.getValue() + "\nStatus Two: " + statusTwo.getValue());
    }

    enum Status{
        
        ACTIVE('1'), INACTIVE('0');
    
        private char valueStatus;
    
        Status(char valueStatus){
            this.valueStatus = valueStatus;
        }
    
        public char getValue(){
            return this.valueStatus;
        }
    }
}
