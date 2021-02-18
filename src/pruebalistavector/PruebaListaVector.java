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
package pruebalistavector;

import modelo.ListaVector;

/**
 *
 * @author Oscar Arenas
 */
public class PruebaListaVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaVector lista = new ListaVector();

        lista.agregar(23);
        lista.agregar(7);
        lista.agregar(84);
        lista.agregar(23);

        System.out.println("Lista: ");
        System.out.println(lista);

        lista.eliminar(2);

        System.out.println("\nLista después de borrar: ");
        System.out.println(lista);
    }
}
