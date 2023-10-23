package dominio;

import com.mysql.jdbc.Blob;
import java.io.File;
import java.sql.Date;

public class Paciente {
    
    private Blob fotoPerfil;
    private String tipoDocumento; 
    private String numeroDocumento; 
    private String primerNombre; 
    private String segundoNombre; 
    private String primerApellido; 
    private String segundoApellido; 
    private Date fechaNacimiento;
    private String sexo;
    private String eps;
    private String email;
    private String celular;

    public Paciente() {
    }
    
    public Paciente(String tipoDocumento, String numeroDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public Paciente(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Paciente(String tipoDocumento, String numeroDocumento, String primerNombre, String primerApellido, String segundoApellido, Date fechaNacimiento, String sexo, String eps, String email, String celular) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.eps = eps;
        this.email = email;
        this.celular = celular;
    }

    public Paciente(String tipoDocumento, String numeroDocumento, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento, String sexo, String eps, String email, String celular) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.eps = eps;
        this.email = email;
        this.celular = celular;
    }

    public Paciente(Blob fotoPerfil, String tipoDocumento, String numeroDocumento, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento, String sexo, String eps, String email, String celular) {
        this.fotoPerfil = fotoPerfil;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.eps = eps;
        this.email = email;
        this.celular = celular;
    }
    
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Blob getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(Blob fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
    
}
