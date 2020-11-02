
/**
 *  Un objeto de esta clase representa a una sencilla
 *  hoja de cálculo. La hoja tiene hasta un máximo de 3 filas (no más)
 *  En cada fila la empresa "apunta" los ingresos y gastos en 
 *  una determinada fecha
 * 
 * @author -   
 *  
 */
public class HojaCalculo
{
    //ATRIBUTOS
    //CONSTANTES
    //VARIABLES
    private String nombre;
    private Fila fila1;
    private Fila fila2;
    private Fila fila3;
    
    //METODOS
    /*CONSTRUCTOR*/

    /**
     * Crea la hoja de cálculo con el nombre indicado 
     * e inicializa las filas al valor null (inicialmente
     * la hoja se crea sin filas)
     */
    public HojaCalculo(String nombre)    {
        this.nombre = nombre;
        this.fila1 = null;
        this.fila1 = null;
        this.fila1 = null;
    }
    
    /*GETTERS*/
    /**
     *Nombre de la hoja
     */
    public String getNombre(){return this.nombre;}

    /**
     * Fila1
     */
    public Fila getFila1(){return fila1;}

    /**
     * Fila2
     */
    public Fila getFila2(){return fila2;}

    /**
     * Fila3
     */
    public Fila getFila3(){return fila3;}

    /**
     * Devuelve el nº de filas de la hoja
     * (dependerá de cuántas filas estén a null)
     */
    public int getNumeroFilas(){
        int totalFilas = 0;
        if(fila1 != null){
            totalFilas +=totalFilas;}        
        if(fila2 != null){
            totalFilas +=totalFilas;}
        if(fila3 != null){
            totalFilas +=totalFilas;}
            
        return totalFilas;
    }

    /**
     * Devuelve true si la hoja está completa
     * (tiene exactamente 3 filas)
     */
    public boolean hojaCompleta(){
        if(getNumeroFilas() == 3){
            return true;}
        else{
            return false;}
    }

    /**
     * Se añade una nueva fila a la hoja
     * Si la hoja está completa se muestra el mensaje "FilaX no se puede añadir en HOJAX"
     * Si no está completa se añade la fila a la hoja teniendo en cuenta
     * si se añade como primera, segunda o tercera fila (no han de quedar huecos)
     */
    public void addFila(Fila fila){
         if(hojaCompleta()){
            System.out.printf("%n no se puede añadir en ",fila.getId(),nombre);}
         else{
            if(fila1 == null){
            fila1=fila;
            System.out.print(fila1);}
            else{
                if(fila2 == null){
                fila2=fila;
                System.out.print(fila2);}
                else{
                fila3=fila;
                System.out.print(fila3);}
            }
        }
    }

    /**
     * Dada la información a guardar en una fila el método
     * crea la fila y la añade a la hoja
     * (evita repetir código)
     */
    public void addFila(String id, Fecha fecha, double ingresos, double gastos){
         Fila filaNueva = new Fila (id, fecha, ingresos, gastos);
         this.addFila(filaNueva);
    }

    /**
     * Calcula y devuelve el total de ingresos entre
     * todas las filas que incluye la hoja
     */
    public double getTotalIngresos(){
        double totalIngresos = 0.0;
        if(fila1 != null){
        totalIngresos = totalIngresos + fila1.getIngresos();}
        if(fila2 != null){
        totalIngresos = totalIngresos + fila2.getIngresos();}
        if(fila3 != null){
        totalIngresos = totalIngresos + fila3.getIngresos();}
        
        return totalIngresos;
    }

    /**
     * Calcula y devuelve el total de gastos
     * entre todas las filas que incluye la hoja
     */
    public double getTotalGastos(){
        double totalGastos = 0.0;
        if(fila1 != null){
        totalGastos = totalGastos + fila1.getGastos();}
        if(fila2 != null){
        totalGastos = totalGastos + fila2.getGastos();}
        if(fila3 != null){
        totalGastos = totalGastos + fila3.getGastos();}
        
        return totalGastos;
    }

    /**
     * Calcula y devuelve el total del beneficio
     * entre todas las filas que incluye la hoja
     */
    public double getBeneficio(){
        double totalBeneficio = 0.0;
        if(fila1 != null){
        totalBeneficio = totalBeneficio + fila1.getBeneficio();}
        if(fila2 != null){
        totalBeneficio = totalBeneficio + fila2.getBeneficio();}
        if(fila3 != null){
        totalBeneficio = totalBeneficio + fila3. getBeneficio();}
        
        return totalBeneficio;

    }

    /**
     * Representación textual de la hoja
     * con el formato exacto que indica el enunciado
     */
    public String toString(){
        String formato = "\n%s%n%8s%15s%15s%15s";
        String fila = String.format(formato, nombre,"FECHA","INGRESOS","GASTOS","BENEFICIOS");
        switch(getNumeroFilas()){
            case 1: fila = fila +"\n"+ fila1.toString();
            case 2: fila = fila +"\n"+ fila2.toString();
            case 3: fila = fila +"\n"+ fila3.toString();
        }
    
        String linea="--------------------------------------------------------------------------";
        String resultados = String.format("%25s€%15€%15€"+ getTotalIngresos(), getTotalGastos(),getBeneficio());
        fila = fila + resultados;
        return fila;
    }

    /**
     * Devuelve un duplicado de la hoja actual.
     * El nombre de la hoja duplicada será "Duplicada HojaX"
     * Al duplicar la hoja se duplicarán también las filas que contenga
     */
    public HojaCalculo duplicarHoja(){
        HojaCalculo copiaHoja = new HojaCalculo("Duplicado "+ nombre);
        switch(getNumeroFilas()){
            case 1: Fila filaNueva1 = fila1.duplicar();
                    copiaHoja.addFila(filaNueva1);
            case 2: Fila filaNueva2 = fila2.duplicar();
                    copiaHoja.addFila(filaNueva2);
            case 3: Fila filaNueva3 = fila3.duplicar();
                    copiaHoja.addFila(filaNueva3);
        }
        
        return copiaHoja;}
}
