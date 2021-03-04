package mx.unam.aragon.dp;


public class Direccion {
    String calle;
    String numero;
    String colonia;
    String delegación;
    String estado;
    String cp;

    public Direccion() {
    }

    public Direccion(String calle, String numero, String colonia, String delegación, String estado, String cp) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.delegación = delegación;
        this.estado = estado;
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getDelegación() {
        return delegación;
    }

    public void setDelegación(String delegación) {
        this.delegación = delegación;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
    
     
         
    
}
