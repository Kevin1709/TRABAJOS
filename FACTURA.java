
package TiposClases;

public class FACTURA extends PRECIO
{
 String PRODUCTO;
 float  VALOR; 
 int CANTIDAD;
 float SUMA;
 public FACTURA (String Cliente,int Asesor,String Fecha, String Producto_Nuevo, float Valor_Producto, int Cantidad_Producto)
 {
 super(Cliente,Asesor,Fecha); 
 PRODUCTO=Producto_Nuevo;
 VALOR=Valor_Producto;
 CANTIDAD=Cantidad_Producto;

 }
 public void ImprimirFactura()
  {
   
    System.out.println ("NOMBRE CLIENTE: "+NOMBRE_DEL_CLIENTE);  
    System.out.println ("NIT DEL ASESOR: "+NIT_ASESOR);
    System.out.println ("FECHA: "+FECHA); 
    System.out.println ("NUEVO PRODUCTO: "+PRODUCTO);
    System.out.println ("VALOR PRODUCTO: "+VALOR);
    System.out.println ("CANTIDAD PRODUCTO "+CANTIDAD);
    System.out.println ("TOTAL " +CANTIDAD * VALOR);
            
            
            
            
            
            
          
  }
         
       
}

