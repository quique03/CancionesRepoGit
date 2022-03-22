
/**
 * Clase donde se guardan los atributos de las canciones
 * @author Enrique
 * 
 */
public class Cancion {
	
	/**
	 * Atributos de cada cancion
	 */
		private String titulo;
		private String grupo;
		private int duracion;
		private boolean sonando;

		/**
		 * Constructor sin parametros
		 */
		Cancion()
		{
			this.titulo = "";
			this.duracion = 0;
			this.sonando = false;
		}


		/**
		 * Constructor con dos par�metros
		 * 
		 * @param titulo, a�ade el t�tulo
		 * @param duracion, a�ade la duraci�n
		 */
		Cancion(String titulo, int duracion)
		{
			this.titulo = titulo;
			this.duracion = duracion;
			this.sonando = false;
		}
		

		/**
		 * Constructor con 4 par�metros
		 * 
		 * @param titulo, a�ade el t�tulo
		 * @param grupo, a�ade el grupo de m�sica
		 * @param duracion, a�ade la duraci�n
		 * @param sonando, indica si est� sonando o no
		 */
		Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 par�metros
		{
			this.titulo = titulo;
			this.duracion = duracion;
			this.sonando = sonando;
			this.grupo = grupo;
		}

		/**
		 * Cambia el valor de cual est� sonando. Si no esta sonando, 
		 * lo activa. Si est� sonando en el momento, no puede empezarlo ya que 
		 * ya ha empezado.
		 * 
		 * @return booleano
		 */
		boolean reproducirCancion() {
			if (this.sonando) {
				return false;
			} else {
				this.sonando = true;
				return true;
			}
		}
		
		/**
		 * Este metodo para la cancion
		 * @return booleano
		 */
		boolean pararCancion() {
			if (!this.sonando) {
				return false;
			} else {
				this.sonando = false;
				return true;
			}
		}

		// meter m�todos get/set/toString()
		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getGrupo() {
			return grupo;
		}

		public void setGrupo(String grupo) {
			this.grupo = grupo;
		}

		public int getDuracion() {
			return duracion;
		}

		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}

		public boolean isSonando() {
			return sonando;
		}

		public void setSonando(boolean sonando) {
			this.sonando = sonando;
		}

		/**
		 * Metodo para saber si es la misma cancion
		 * @param cancion, parametro de comprovaci�n para saber si es la misma cancion
		 * @return boolean
		 */
		boolean MismaCancion(Cancion cancion) {
			if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
				return true;
			else
				return false;
		}

		/**
		 * Metodo que mira la duracion de los par�metros
		 * @param canciones, array que comprueba la duracion de los par�metros
		 * @return canciones[posMax].titulo
		 */
		public static String MayorDuracion(Cancion[] canciones) {
			int posMax = 0;
			int max = 0;
			for (int i = 0; i < canciones.length; i++) {
				if (canciones[i].duracion > max) {
					posMax = i;
					max = canciones[i].duracion;
				}
			}
			return canciones[posMax].titulo;

		}

		/**
		 * 	Metodo para pasar de cancion a partir de la suma de la posici�n del array
		 * @param canciones, array que contiene las canciones
		 * @param titulo, nombre de la cancion
		 * @return canciones[siguiente].titulo
		 */
		static String SiguienteCancion(Cancion[] canciones, String titulo) {
			int pos = 0;
			int siguiente = 0;
			for (int i = 0; i < canciones.length; i++) {
				if (titulo == canciones[i].titulo) {
					pos = i;
				}
			}
			if (pos == canciones.length - 1) {
				siguiente = 0;
			} else {
				siguiente = pos + 1;
			}
			return canciones[siguiente].titulo;
		}
		@Override
		public String toString() {
		return "Datos de la canci�n [titulo=" + titulo + ", autor=" +

		grupo + ", duracion=" + duracion + ", sonando=" + sonando

		+ "]";

		}
}
