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

        lista.agregar(28);
        lista.agregar(40);
        lista.agregar(-46);
        lista.agregar(79);
        lista.agregar(98);
        lista.agregar(37);
        lista.agregar(204);
        lista.agregar(-657);

        System.out.println("Lista: ");
        System.out.println(lista);

        ListaVector lista2 = eliminarPares(lista);

        System.out.println("\nLista después de borrar pares: ");
        System.out.println(lista);

        System.out.println("\nLista de pares: ");
        System.out.println(lista2);
    }

    public static ListaVector eliminarPares(ListaVector lista) {
        ListaVector listaPares = new ListaVector();

        for (int i = 0; i < lista.tamanio(); i++) {
            double dato = lista.obtener(i);
            if (dato % 2 == 0) {
                lista.eliminar(i);
                listaPares.agregar(dato);
                i--;
            }
        }
        return listaPares;
    }
}
