package cuentas;

public class CCuenta {

    /**
     * @return devuelve el nombre introducido a la variable
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre asigna un nombre a la variable
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return devuelve la cuenta introducida en la variable
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta asigna un numero de cuenta a la variable
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return devuelve el saldo introducido en la variable
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo asigna un saldo de cuenta a la variable
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return devuelve el tipo de interés introducido en la variable
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés asigna un tipo de interés a la variable
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @param nombre variable de tipo String que sirve para determinar el nombre
     */
    private String nombre;
    
    /**
     * @param cuenta variable de tipo String que sirve para determinar el número de cuenta
     */
    private String cuenta;
    
    /**
     * @param saldo variable de tipo double que sirve para determinar el saldo
     */
    private double saldo;
    
      /**
     * @param tipoInteres variable de tipo double que sirve para determinar el tipo de interés
     */
    private double tipoInterés;

    
    /**
     * Sirve para crear una cuenta con los datos "predeterminados"
     */
    public CCuenta()
    {
    }

    
    /**
     * Crea una cuenta con datos introducidos en las variables explicadas anteriormente
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * 
 * @return devuelve el saldo 
 */
    public double estado()
    {
        return getSaldo();
    }

    
    /**
     * Se utiliza para ingresar una cantidad de dinero en la cuenta
     * @param cantidad variable de tipo double 
     * @throws Exception indica que no se puede ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    
    /**
     * Se utiliza para retirar una cantidad de dinero de la cuenta
     * @param cantidad vairable de tipo double
     * @throws Exception indica que no se puede retirar una cantidad negativa o que no hay suficiente saldo para retirar la cantidad indicada
     */ 
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
