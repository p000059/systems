package Generics;

import javax.swing.JOptionPane;

public class TwoGenericTypes<T, V> {

    private T objectT;
    private V objectV;

    public TwoGenericTypes() {
    }

    public TwoGenericTypes(T objectT, V objectV) {
        this.objectT = objectT;
        this.objectV = objectV;
    }

    public T getObjectT() {
        return objectT;
    }

    public void setObjectT(T objectT) {
        this.objectT = objectT;
    }

    public V getObjectV() {
        return objectV;
    }

    public void setObjectV(V objectV) {
        this.objectV = objectV;
    }

    public Object readTypeT(){
        return this.getObjectT().getClass().getName();
    }

    public Object readTypeV(){
        return this.getObjectV().getClass().getName();
    }
    
    public static void main(String[] args) {
		
    	TwoGenericTypes<Integer, String> twoGenericTypes = new TwoGenericTypes<>(1,"Hello Girls!");
    	
    	JOptionPane.showMessageDialog(null, 
    			"Type: " + twoGenericTypes.readTypeT() 
    			+ "\nValue: " + twoGenericTypes.getObjectT()
    			+ "\n\nType: " + twoGenericTypes.readTypeV()
    			+ "\nValue: " + twoGenericTypes.getObjectV()
    	);
	}
}
