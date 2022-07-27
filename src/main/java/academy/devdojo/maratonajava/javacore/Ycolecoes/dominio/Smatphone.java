package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smatphone {
   private String serialNumber;
   private String marca;

    public Smatphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;

    }
    //Reflexivo: x.equals(x) tem de ser true para tudo que for diferente de null
    //simetrico: para x e y diferentes de null, se x.equals (y) ==true, logo, y.equals(x) == true
    //Transitividade para x, y,z diferentes de null, se x.equals(y) ==true, logo y.equals(x) == true e x.equals(y) logo, y.equals(z)==true
    //consistente: x.equals(x) sempre retorna  true se x for diferente de null
    //para x diferente de null, x.equals(null) tem de retornar false.
    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass())return false;
        Smatphone celular = (Smatphone) obj;
        return serialNumber != null && serialNumber.equals(celular.serialNumber);


    }
    //se x.equals(y)==true, y.hashCode == x.hashCode()
    // y.hashCode() ==x.hashCode() não necessariamente o equals y.equals(x) tem que ser true
    //e.equals(y)==false
    //y.hashCode() != x.hashCode() x.equals(y) devera ser false
    @Override
    public int hashCode() {
        return  serialNumber==null ? 0 :this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smatphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
