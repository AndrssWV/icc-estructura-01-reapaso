
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan",25),
            new Persona("Maria",30),
            new Persona("Carlos",22),
            new Persona("Ana",28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)
        };

        PersonaController pc = new PersonaController();
        ViewConsole view = new ViewConsole();
        view.printMessage("Arreglo Personas");
        view.printPersonArray(personas);
        view.printMessage("Arreglo Personas Ordenado");
        pc.ordenarPorEdad(personas);
        view.printPersonArray(personas);

        view.printMessage("Buscar Persona con edad 28");
        Persona searched = pc.buscarPorEdad(personas, 28);
        if (searched==null) {
            view.printMessage("No se encontro persona con edad 28");
        } else {
            view.printMessage("Se encontro persona con edad 28");
            view.printMessage(searched.toString());
        }

        view.printMessage("Buscar Persona con edad 42");
        Persona searched2 = pc.buscarPorEdad(personas, 42);
        if (searched2==null) {
            view.printMessage("No se encontro persona con edad 42");
        } else {
            view.printMessage("Se encontro persona con edad 42");
            view.printMessage(searched2.toString());
        }


    }
}
