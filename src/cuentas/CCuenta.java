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

    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
