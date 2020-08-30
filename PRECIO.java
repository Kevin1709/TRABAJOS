
package TiposClases;

public class PRECIO 
{
String NOMBRE_DEL_CLIENTE;
int NIT_ASESOR; 
String FECHA;

public PRECIO(String Cliente,int Asesor,String Fecha)
 {
     NOMBRE_DEL_CLIENTE=Cliente;
     NIT_ASESOR=Asesor; 
     FECHA=Fecha;
 } 
  
   public void imprimir()
    {
    System.out.println ("NOMBRE CLIENTE: "+NOMBRE_DEL_CLIENTE);  
    System.out.println ("NIT DEL ASESOR: "+NIT_ASESOR);
    System.out.println ("FECHA: "+FECHA); 
    
    }
           
           
}