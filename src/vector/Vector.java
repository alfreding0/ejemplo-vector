package vector;

/**
 *
 * @author alfreding0
 */
public class Vector {
    
    private int v[] = new int [0];

    public Vector(){
    }

    public int[] getV() {
        return v;
    }

    public void setV(int[] v) {
        this.v = v;
    }

    public void setDim(int lenght) {
        v = new int[lenght];
    }
    
    public int getLenght(){
        return v.length;
    }
    
    public void setValue(int posicion, int valor){
        v[posicion] = valor;
    }
    
    public void showInOutput(){
        System.out.println("Values from vector");
        System.out.println("Tamaño actual: " + v.length);
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
    
    public void cargaAleatoria(){
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random()*10+1);   
        }
    }
    
    
    
    
    
    public static void main(String [] args){
        Vector vector = new Vector();
        vector.setDim(14);
        vector.showInOutput();
    }
            
}
