
package matriz;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Matriz {
    int fila,columna;
    DefaultTableModel tabla1=new DefaultTableModel(); 
    DefaultTableModel tabla2=new DefaultTableModel(); 
    DefaultTableModel tablar=new DefaultTableModel(); 
    public Matriz() {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    public void inicio () {
           JOptionPane.showMessageDialog(null , "Seleccione la Operacion que va a realizar ");
    }
    
    
    public int sumar () {
    int a,r=0;
        int i,j;
        int afila ; ///=Integer.valueOf(jTextField1.getText());
        int acolumna; ///=Integer.valueOf(jTextField2.getText());
        
        
        for(i=0;i<this.fila;i++){
        for(j=0;j<this.columna;j++){
        r= (Integer.valueOf(tabla1.getValueAt(i,j).toString())) + (Integer.valueOf(tabla2.getValueAt(i,j).toString()));
        tablar.setValueAt(r + "", i, j);
        r=0;
        }
        }
        return r;
     }
    
}
