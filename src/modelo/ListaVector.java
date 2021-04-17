/*
 * Copyright (C) 2020 Oscar Arenas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package modelo;

/**
 * Implementación de una lista mediante un vector dinámico.
 *
 * @author Oscar Arenas
 */
public class ListaVector {

    // Campos (Atributos)
    private double[] datos;
    private int n; // Tamaño de la lista

    // Métodos (Comportamientos)
    public ListaVector() {
        datos = new double[1];
        n = 0;
    }

    /**
     * Adiciona el dato especificado al final de la lista. Permite almacenar
     * valores repetidos.
     *
     * @param dato valor que se agregará al final de esta lista
     */
    public void agregar(double dato) {
        if (datos.length == n) {
            cambiarCapacidad(2 * n);
        }
        datos[n++] = dato;
    }

    /**
     * Borra de la lista el valor ubicado en el índice especificado. El borrado
     * se realiza desplazando todos los elementos que estan después del ubicado
     * en el índice especificado una posición a la izquierda.
     *
     * @param indice Entero que indica la posición del valor a borrar
     * @return Retorna true si elimina el valor y false en caso contrario
     */
    public boolean eliminar(int indice) {
        if (indice >= 0 && indice < n) {
            n--;
            while (indice < n) {
                datos[indice] = datos[indice + 1];
                indice++;
            }
            if (datos.length / 4 == n) {
                cambiarCapacidad(datos.length / 2);
            }
            return true;
        }
        return false;
    }

    /**
     * Crea un nuevo vector con capacidad igual o mayor a la del vector 'datos'.
     *
     * @param nc Entero positivo que indica la nueva capacidad del vector
     * 'datos'
     */
    private void cambiarCapacidad(int nc) {
        if (nc > 0 && nc >= n) {
            double[] nuevoVector = new double[nc];

            for (int i = 0; i < n; i++) {
                nuevoVector[i] = datos[i];
            }
            datos = nuevoVector;
        }
    }

    /**
     * Retorna un número entero que indica la cantidad de elementos que tiene
     * esta lista.
     *
     * @return entero que indica la cantidad de elementos que tiene la lista.
     */
    public int tamanio() {
        return n;
    }

    /**
     * Retorna el elemento de la posición especificada.
     *
     * @param indice entero que indica la posición del dato a recuperar.
     * @return el entero ubicado en la posición esepecificada.
     * @throws IndexOutOfBoundsException si la posición no existe. La posición
     * no existe si index es menor que cero o mayor o igual al tamaño de la
     * lista.
     */
    public double obtener(int indice) throws IndexOutOfBoundsException {
        if (indice >= 0 && indice < n) {
            return datos[indice];
        }
        throw new IndexOutOfBoundsException();
    }

    /**
     * Devuelve una representación de cadena de la lista. En general, el método
     * toString devuelve una cadena que "representa textualmente" este objeto.
     * El resultado debe ser una representación concisa pero informativa que sea
     * fácil de leer para una persona.
     *
     * @return Una representación de cadena del objeto.
     */
    @Override
    public String toString() {
        String cadena = "";

        if (n > 0) {
            cadena += datos[0];

            for (int i = 1; i < n; i++) {
                cadena += ", " + datos[i];
            }
        }
        return "[" + cadena + "]";
    }
}
