public class Planeta extends CuerpoCeleste{
    public Planeta(String nombre, double periodoOrbital) {
        super(nombre,periodoOrbital,TipoCuerpoCeleste.planeta);

    }
    @Override
    public boolean addsatelite(CuerpoCeleste satelite){
        return super.addsatelite(satelite);
    }



}
