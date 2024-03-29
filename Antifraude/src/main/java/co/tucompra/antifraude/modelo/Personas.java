package co.tucompra.antifraude.modelo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Personas implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public Personas() {
    }

	String cedula;
	String nombreCompleto;
	String nombreCifin;
	Integer nivel;
	String validarNombre;
	Integer score;
	String mensaje;
	boolean cedulaValida;
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getNombreCifin() {
		return nombreCifin;
	}
	public void setNombreCifin(String nombreCifin) {
		this.nombreCifin = nombreCifin;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public String getValidarNombre() {
		
		try {
			if(nombreCompleto.equalsIgnoreCase(nombreCifin)){
				validarNombre="true";
				
				return validarNombre;
			}else if(nivel==3){
                validarNombre="false";				
				return validarNombre;
			}
				
				String [] nombreSeparados=nombreCompleto.split(" ");
				String [] nombreSeparadosCifin=nombreCifin.split(" ");
				int contador=0;
				
				for (int i = 0; i < nombreSeparados.length; i++) {
					
					if (nombreCifin.toLowerCase().indexOf (nombreSeparados[i].toLowerCase()) != -1){
						contador++;
					}
				}
				
				if(nivel==1 && contador==nombreSeparadosCifin.length){
					validarNombre="true";
					
					return validarNombre;
				}
				
				if(nivel==2 && contador==nombreSeparadosCifin.length){
					validarNombre="true";
					
					return validarNombre;
				}
				
				if(validarNombre==null){
					validarNombre="false";
				}
							
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return validarNombre;
	}
	public void setValidarNombre(String validarNombre) {
		this.validarNombre = validarNombre;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public boolean isCedulaValida() {
		return cedulaValida;
	}
	public void setCedulaValida(boolean cedulaValida) {
		this.cedulaValida = cedulaValida;
	}

}