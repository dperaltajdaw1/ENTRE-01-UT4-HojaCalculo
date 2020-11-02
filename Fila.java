
/**
 *  Representa a una fila de la hoja de cálculo
 *  Toda fila tiene un identificador y en ella
 *  se anotan la fecha, los ingresos y los gastos correspondientes a un
 *  apunte  contable  de una empresa
 * 
 * @author - 
 *  
 */
public class Fila
{
    //ATRIBUTOS
    //CONSTANTES
    //VARIABLES
    private String id;
    private Fecha fecha;
    private double ingresos;
    private double gastos;
    
    //METODOS
    /*CONSTRUCTOR*/
    public Fila(String id){
         this.id = id;
         this.ingresos = 0;
         this.gastos = 0;
         this.fecha = new Fecha (1, 1, 2020);
    }
    
    public Fila(String id, Fecha fecha, double ingresos, double gastos){
        this.id = id;
        this.fecha = fecha;
        this.ingresos = ingresos;
        this.gastos = gastos;
    }
    
    /*GETTERS*/
    public String getId() {return this.id;}
        
    public Fecha getFecha() {return this.fecha;}

    public double getIngresos() {return this.ingresos;}
  
    /*SETTERS*/
    public double getGastos() {return this.gastos;}

    public double getBeneficio() {return this.ingresos - this.gastos;}
    
    /**
     * obtiene una copia idéntica a la fila actual.
     * La fecha que incluye la fila duplicada también es una copia
     */
    public Fila duplicar() {
       Fila copiaFila = new Fila(id, fecha, ingresos, gastos);
       return copiaFila;
    }

    /**
     * Representación textual de una fila
     */
    public String toString() {
      String idf = id;
      String fechaf = fecha.toString();
      double ingresosf = ingresos;
      double gastosf = gastos;
      double caja = ingresosf - gastosf;
      if(caja < 0){
        String formato ="%8s%15s%15s.2f€%15.2f€%15.2f€ **";
        String fila = String.format(formato, idf, ingresosf,gastosf, caja);
        return fila;}
      else{
        String formato ="%8s%15s%15s.2f€%15.2f€%15.2f€";
        String fila = String.format(formato, idf, ingresosf,gastosf, caja);
        return fila;}
    }
}
     


