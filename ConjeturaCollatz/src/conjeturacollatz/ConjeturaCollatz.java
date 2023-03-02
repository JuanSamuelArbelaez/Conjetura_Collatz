package conjeturacollatz;

import javax.swing.JOptionPane;

public class ConjeturaCollatz
{
    public static int leerInt(String mensaje)
    {
       return Integer.parseInt(JOptionPane.showInputDialog(mensaje)); 
    }
    public static void imprimir (String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
        
    public static int validarNumero (int num)
    {
        int n= num;
        do
        {
            if (n < 40 || n>60)
                n= leerInt ("Numero ingresado no es valido. Intente de nuevo: ");
        }
        while (n<40 || n>60);
        return n;
    }
    public static int calcularIteraciones (int n)
    {
        int contador=0;
        do
        {
            if ((n%2)==0)
                n=n/2;
            else
                n= 3*n+1;
            contador++;
        }
        while (n>1);
        return contador;
    }      
                 
    public static void main(String[] args) 
    {
        int n,it;
        n= validarNumero(leerInt("Ingrese un numero entero entre 40 y 60"));
        it= calcularIteraciones (n);
        imprimir("El numero de iteraciones necesarias para convertir "+n+" a 1, es "+it);

    }
    
}
