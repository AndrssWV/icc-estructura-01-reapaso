package Controllers;

import Models.Persona;

public class PersonaController {

    public void ordenarPorEdad(Persona[] personas) {
        for(int i = 1; i < personas.length; i++) {
            Persona current = personas[i];
            int j = i-1;
            while (j>=0 && personas[j].getEdad() > current.getEdad()) {
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1] = current;
        }
    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int lower = 0;
        int higher = personas.length-1;
        while (higher>=lower) {
            int central = (higher+lower)/2;
            if (personas[central].getEdad() == edad) return personas[central];
            if (personas[central].getEdad() > edad) higher = central-1;
            else lower = central+1;
        }
        return null;
    }
}
