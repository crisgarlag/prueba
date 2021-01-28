import java.time.LocalDateTime;

public class Fiesta {
	// Se crean los atributos de la clase, privados para que solo sean accesibles desde la misma
	private String tipo; // El tipo de fiesta(cumpleaños, colegio...)
	private LocalDateTime fechaHora= LocalDateTime.now();// Atributo de tipo fecha y hora inicializado al momento actual.
	private String direccion; // Direccion de la fiesta
	private int bebidas; // Numero de bebidas
	private int bocadillos; // Numero de bocadillos
	private int invitados; // Numero de invitados
	
	/**
	 * Constructor de la clase Fiesta con los siguientes parametros
	 * @param tipo El tipo de fiesta(cumpleaños, colegio...)
	 * @param fechaHora Fecha y hora de la fiesta
	 * @param direccion Direccion de la fiesta
	 * @param bebidas Numero de bocadillos
	 * @param bocadillos Numero de invitados
	 */
	public Fiesta(String tipo, LocalDateTime fechaHora,String direccion, int bebidas, int bocadillos) {
		super();
		this.tipo=tipo;
		this.fechaHora=fechaHora;
		this.direccion= direccion;
		this.bebidas=bebidas;
		this.bocadillos=bocadillos;
		this.invitados=0;
	}
	/**
	 * Constructor de la clase Fiesta que permite crear un objeto con valores inventados asignados
	 */
	public Fiesta() {
		super();
		this.tipo="Cumpleaños";
		this.fechaHora=LocalDateTime.of(2021, 2, 10, 18, 00);
		this.direccion= "C/ Cervantes";
		this.bebidas=30;
		this.bocadillos=30;
		this.invitados=30;
	}
	/**
	 * @return Devuelve una cadena con todos los valores de los atributos del objeto
	 */
	public String consultar() {
		return "Fiesta: tipo: "+ tipo + " -fecha y hora: " +  fechaHora + " -direccion; " + direccion + " -bebidas " + 
					bebidas + " -bocadillos: " + bocadillos + " -invitados: " + invitados;
	}
	
	// Se construyen los getters and setters para cada atributo que nos permite modificarlos o consultarlos.
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getBebidas() {
		return bebidas;
	}
	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}
	public int getBocadillos() {
		return bocadillos;
	}
	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}
	public int getInvitados() {
		return invitados;
	}
	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}
	/**
	 * Incrementa en 1 el valor que tenga el atributo invitados
	 */
	public void invitar() {
		invitados++;
	}
	/**
	 * Decrementa en 1 el valor que tenga el atributo invitados
	 */
	public void cancelarInvitacion() {
		invitados--;
	}
	/**
	 * 
	 * @return El coste total de la fiesta. 5*invitados + 2*bebidas + 3*bocadillos
	 */
	public double precioFiesta() {
		return (invitados*5)+ (bebidas*2)+ (bocadillos*3);
	}
}
