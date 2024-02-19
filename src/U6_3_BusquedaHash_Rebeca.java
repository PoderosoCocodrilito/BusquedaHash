/*
		 * MATERIA: Estructura de Datos
		 * NO.Programa: U6_3
		 * PROGRAMA: U6_3_BusquedaHash
		 * ALUMNA: Diana Rebeca Ortega Salas
		 * FECHA: 06/12/2023
		 */
class BusquedaHash{
	String tablaHash[];
	public BusquedaHash(int tam) {
		  tablaHash = new String[tam]; 	
}
	public int metodoHash(String nombre) {
		int arregloT = tablaHash.length;
		int asci = 0;	
		char aux;
		for (int i = 0; i < nombre.length(); i++) {
			aux = nombre.charAt(i);
			asci += (int)aux;
		}
		int valorHash  = asci % arregloT; 
	    
		return valorHash;
	}
	
	public void insertarValorHash(int valorH, String nom) {
		System.out.println("`"  + nom +"` llave hash: "+valorH);
		
		if (tablaHash[valorH] == null) {
			tablaHash[valorH] = nom;
			System.out.println ("Se ha insertado valor en tabla hash.");
		} else {
			System.out.println("Colisión.");
		}
		System.out.println();
	}
	public void insertar(String nom) {
		insertarValorHash(metodoHash(nom), nom);
	}
	public void buscar(String n) {
		if (tablaHash[metodoHash(n)]!=null) {
			System.out.println("`" + n + "` se encuentra en la posición " + metodoHash(n) + " de la tabla hash.");
		} else { 
			System.out.println("No hay valor asignado en tabla hash.");
		}
	}
}
public class U6_3_BusquedaHash_Rebeca {

	public static void main(String[] args) {
		
		 BusquedaHash hash = new BusquedaHash(20);
		 System.out.println();
		 System.out.println("--------BÚSQUEDA HASH--------");
		 hash.insertar("Samuel");
		 hash.insertar("Juan");
		 hash.insertar("Jessica");
		 hash.insertar("Roberto");
		 hash.insertar("Jorge");
		 hash.buscar("Samuel");
	
	}

}
