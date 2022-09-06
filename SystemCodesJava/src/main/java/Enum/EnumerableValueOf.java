package Enum;

import javax.swing.JOptionPane;

public class EnumerableValueOf{
 
    public static void main(String[] args){

        Status[] lstStatus = Status.values(); // The .values() method returns all Enumerable values.

        for(Status value : lstStatus){

            JOptionPane.showMessageDialog(null, value);
        }
    }
    
    enum Status {
        
        ACTIVE('1'), INACTIVE('0'), NULL('N');
    
        private char valueStatus;
    
        Status(char valueStatus){
            this.valueStatus = valueStatus;
        }
    
        public char getValue(){
            return this.valueStatus;
        }
    }
}
