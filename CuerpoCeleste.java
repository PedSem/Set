import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {
    private String nombre;
    private double PeriodoOrbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipocuerpo;

    public CuerpoCeleste(String nombre, double periodoOrbital,TipoCuerpoCeleste tipocuerpo) {
        this.nombre = nombre;
        this.PeriodoOrbital = periodoOrbital;
        this.satelites=new HashSet<CuerpoCeleste>();
        this.tipocuerpo = tipocuerpo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return PeriodoOrbital;
    }

    public TipoCuerpoCeleste getTipocuerpo() {
        return tipocuerpo;
    }



    public Set<CuerpoCeleste> getSatelites() {
        return satelites=new HashSet<>();
    }
    public boolean addsatelite(CuerpoCeleste satelite){
       if(satelite.getTipocuerpo()==TipoCuerpoCeleste.luna){
           return satelites.add(satelite);
       }
       return false;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CuerpoCeleste)) return false;
        CuerpoCeleste that = (CuerpoCeleste) o;
        return Objects.equals(nombre, that.nombre) &&
                tipocuerpo == that.tipocuerpo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipocuerpo) + 31;
    }

    @Override
    public String toString() {
        return nombre + "- " + PeriodoOrbital;
    }

}
