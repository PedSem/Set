import java.util.*;

public class Main {
    private static Map<String,CuerpoCeleste>sistemasolar=new HashMap<>();
    private static Set<CuerpoCeleste>planetas=new HashSet<>();


    public static void main(String[] args) {
        CuerpoCeleste mercurio = new Planeta("Mercurio", 88);
        sistemasolar.put(mercurio.getNombre(), mercurio);
        planetas.add(mercurio);

        CuerpoCeleste venus = new Planeta("Venus", 225);
        sistemasolar.put(venus.getNombre(), venus);
        planetas.add(venus);

        CuerpoCeleste tierra = new Planeta("Tierra", 365);
        sistemasolar.put(tierra.getNombre(), tierra);
        planetas.add(tierra);

        CuerpoCeleste marte = new Planeta("Marte", 687);
        sistemasolar.put(marte.getNombre(), marte);
        planetas.add(marte);

        CuerpoCeleste jupiter = new Planeta("Jupiter", 4332);
        sistemasolar.put(jupiter.getNombre(), jupiter);
        planetas.add(jupiter);

        CuerpoCeleste saturno = new Planeta("Saturno", 10759);
        sistemasolar.put(saturno.getNombre(), saturno);
        planetas.add(saturno);

        CuerpoCeleste urano = new Planeta("Urano", 30660);
        sistemasolar.put(urano.getNombre(), urano);
        planetas.add(urano);

        CuerpoCeleste neptuno = new Planeta("Neptuno", 165);
        sistemasolar.put(neptuno.getNombre(), neptuno);
        planetas.add(neptuno);

        // Agregar satélites a la Tierra
        CuerpoCeleste lunaTierra = new Luna("Luna", 27);
        sistemasolar.put(lunaTierra.getNombre(), lunaTierra);
        tierra.addsatelite(lunaTierra);

        // Agregar satélites a Marte
        CuerpoCeleste deimos = new Luna("Deimos", 1.3);
        sistemasolar.put(deimos.getNombre(), deimos);
        marte.addsatelite(deimos);

        CuerpoCeleste phobos = new Luna("Phobos", 0.3);
        sistemasolar.put(phobos.getNombre(), phobos);
        marte.addsatelite(phobos);

        // Agregar satélites a Júpiter
        CuerpoCeleste io = new Luna("Io", 1.8);
        sistemasolar.put(io.getNombre(), io);
        jupiter.addsatelite(io);

        CuerpoCeleste europa = new Luna("Europa", 3.5);
        sistemasolar.put(europa.getNombre(), europa);
        jupiter.addsatelite(europa);

        CuerpoCeleste ganymede = new Luna("Ganymede", 7.1);
        sistemasolar.put(ganymede.getNombre(), ganymede);
        jupiter.addsatelite(ganymede);

        CuerpoCeleste callisto = new Luna("Callisto", 16.7);
        sistemasolar.put(callisto.getNombre(), callisto);
        jupiter.addsatelite(callisto);

        // Imprimir nombres de planetas
        System.out.println("Nombres de planetas:");
        for (CuerpoCeleste planeta : planetas) {
            System.out.println(planeta.getNombre());
        }

        // Imprimir lunas de Marte
        for(String key: sistemasolar.keySet()) {
            System.out.println(key + " " + sistemasolar.get(key));
        }


        // Obtener la unión de todas las lunas
        Set<CuerpoCeleste> lunas = new HashSet<>();
        for (CuerpoCeleste planeta : sistemasolar.values()) {
            lunas.addAll(planeta.getSatelites());
        }
        CuerpoCeleste pluton = new Planeta("Plutón", 884);
        System.out.println(sistemasolar.toString()); // Plutón no se agregará al conjunto porque ya hay un cuerpo celeste con el mismo nombre

        CuerpoCeleste plutonEnano = new PlanetaEnano("Plutón", 884);
        System.out.println(sistemasolar.toString()); // Plutón se agregará al conjunto como un planeta enano

        // Diferencia e intersección de conjuntos

        Set<CuerpoCeleste> interseccion = new HashSet<>(planetas);
        interseccion.retainAll(sistemasolar.values());
        System.out.println("Intersección entre planetas y cuerpos en el sistema solar:");
        for (CuerpoCeleste cuerpo : interseccion) {
            System.out.println(cuerpo.getNombre());
        }

    }

}
