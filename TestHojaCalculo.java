
/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - 
 *  
 */
public class TestHojaCalculo
{
    //ATRIBUTOS
    //CONSTANTES
    //VARIABLES
    
    //METODOS
    /*CONSTRUCTOR*/
    public TestHojaCalculo()    {

    }
    /*GETTERS*/
    
    /*SETTERS*/
    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el constructor por defecto
     * de fila (el que no tiene parámetros)
     */
    public void test1(){
           HojaCalculo hoja1 = new HojaCalculo("HOJA1");
           Fecha fecha1 = new Fecha(4, 10, 2020);
           Fecha fecha2 = new Fecha(5, 10, 2020);
           Fecha fecha3 = new Fecha(1, 11, 2020);
           hoja1.addFila("Fila1", fecha1, 25.50, 132.00);
           hoja1.addFila("Fila2", fecha2, 300.00, 350.00);
           hoja1.addFila("Fila3", fecha3, 00.00, 00.00);
           
           HojaCalculo duplicaHoja1 = hoja1.duplicarHoja();
           System.out.println(hoja1.toString());
           System.out.println(duplicaHoja1.toString());
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {
           HojaCalculo hoja2 = new HojaCalculo("HOJA2");
           Fecha fecha1 = new Fecha(7, 10, 2020);
           Fecha fecha2 = new Fecha(8, 10, 2020);
           hoja2.addFila("Fila1", fecha1, 260.00, 125.00);
           hoja2.addFila("Fila2", fecha2, 125.00, 245.00);
           
           HojaCalculo duplicaHoja2 = hoja2.duplicarHoja();
           System.out.println(hoja2.toString());
           System.out.println(duplicaHoja2.toString());
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
           HojaCalculo hoja3 = new HojaCalculo("HOJA3");
           Fecha fecha1 = new Fecha(8, 10, 2020);
           hoja3.addFila("Fila1", fecha1, 670.00, 234.00);
           
           HojaCalculo duplicaHoja3 = hoja3.duplicarHoja();
           System.out.println(hoja3.toString());
           System.out.println(duplicaHoja3.toString());
    }

}
