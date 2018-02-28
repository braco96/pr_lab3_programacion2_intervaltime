package IntervalTime;

public class IntervalTime {

	private Time low;      // left endpoint
	private Time high;     // right endpoint

	public IntervalTime (Time low, Time high) {
		if (low == null || high == null)
			throw new NullPointerException();
		if (high.less(low)) { // conversion to valid interval
			this.low  = high;
			this.high = low;
		} else {
			this.low  = low;
			this.high = high;
		}
	}

	// ¿Está t contenido en el intervalo "this"?
	public boolean contains(Time t) {
		// COMPLETAR
		return false;
	}

	// Relación de igualdad entre intervalos
	public boolean equals(Object o) {
		// COMPLETAR
		return true;
	}

	public String toString() {
		return "[" + this.low + ", " + this.high + "]";
	}


	/////  PROBLEMA DE INCLUSIÓN

	// ¿Está el intervalo "this" incluido en intervalo "that", "this" C "that"
	public boolean isIncluded (IntervalTime that)  {
		return true;
		// COMPLETAR
	}

	// Determina si todos los intervalos del array están incluidos en
	// orden creciente (cada uno en el siguiente).
	// allIncluded (<i1,i2,...,ik-1, ik>) = i1 C i2 ... C ik-1 C ik

	public static boolean allIncluded (IntervalTime[] arr) {

		// COMPLETAR
		return false; 
	}

	/////  PROBLEMA DE BUSQUEDA

	// Relación de orden estricto entre intervalos ("this" < i)
	public boolean before (IntervalTime i) {
		return !this.equals(i) && this.high.lessEq(i.low);
	}

	// Calcula la posición de "this" en un array "arr" que está ordenado
	// en orden creciente
	//
	// Devuelve la posición de "this" si está en "arr" y -1  en otro caso.
	// Realizar la búsqueda binaria.

	public int posInArray (IntervalTime [] arr) {
		return 0;
		// COMPLETAR
	}

	// Está "this" en el array "arr"
	public boolean isInArray (IntervalTime [] arr){
		return false;
		// COMPLETAR
	}
}
