package dominio;

import java.sql.Date;

public class Cita {
    private String codigo; 
    private String numeroDocumento; 
    private Date fecha;
    private Date hora;
    private String motivo;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(String codigo) {
        this.codigo = codigo;
    }

    public Cita(String codigo, String numeroDocumento, Date fecha, Date hora, Doctor doctor, Paciente paciente) {
        this.codigo = codigo;
        this.numeroDocumento = numeroDocumento;
        this.fecha = fecha;
        this.hora = hora;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public Cita(String codigo, String numeroDocumento, Date fecha, Date hora, String motivo, Doctor doctor, Paciente paciente) {
        this.codigo = codigo;
        this.numeroDocumento = numeroDocumento;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
