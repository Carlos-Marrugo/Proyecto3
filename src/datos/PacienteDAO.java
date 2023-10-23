package datos;

import dominio.Paciente;
import java.sql.*;
import java.util.*;

public class PacienteDAO {

    private static final String SQL_SELECTALL = "SELECT * FROM pacientes";
    private static final String SQL_SELECT_BY_DOCUMENTO = "SELECT pri_nombre,seg_nombre,pri_apellido,seg_apellido,fecha_nacimiento,sexo,eps,celular,email FROM pacientes WHERE tipo_documento=? && documento_id=?";
    private static final String SQL_INSERT = "INSERT INTO pacientes(tipo_documento,documento_id,pri_nombre,seg_nombre,pri_apellido,seg_apellido,fecha_nacimiento,sexo,eps,celular,email,imagen) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM pacientes WHERE tipo_documento=? && documento_id=?";
    private static final String SQL_UPDATE = "UPDATE clientes SET pri_nombre = ?,seg_nombre = ?,pri_apellido = ?,seg_apellido = ?,fecha_nacimiento = ?,sexo = ?,eps = ?,celular = ?,email= ? WHERE tipo_documento=? && documento_id=?";
    private static final String SQL_UPDATE_DOCUMENT = "UPDATE clientes SET tipo_documento = ? WHERE documento_id = ?";

    public List<Paciente> mostrar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Paciente paciente;
        List<Paciente> pacientes = new ArrayList<>();

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_SELECTALL);
            rs = stmt.executeQuery();

            while (rs.next()) {
                String tipoDocumento = rs.getString("tipo_documento");
                String numeroDocumento = rs.getString("documento_id");
                String primerNombre = rs.getString("pri_nombre");
                String segundoNombre = rs.getString("seg_nombre");
                String primerApellido = rs.getString("pri_apellido");
                String segundoApellido = rs.getString("seg_apellido");
                java.sql.Date fechaNacimiento = rs.getDate("fecha_nacimiento");
                String sexo = rs.getString("sexo");
                String eps = rs.getString("eps");
                String celular = rs.getString("celular");
                String email = rs.getString("email");
                paciente = new Paciente(tipoDocumento, numeroDocumento, primerNombre, segundoNombre, primerApellido, segundoApellido, fechaNacimiento, sexo, eps, email, celular);
                pacientes.add(paciente);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return pacientes;
    }

    public Paciente encontrarPaciente(Paciente paciente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_DOCUMENTO);
            stmt.setString(1, paciente.getTipoDocumento());
            stmt.setString(2, paciente.getNumeroDocumento());
            rs = stmt.executeQuery();
            rs.absolute(1);

            String primerNombre, segundoNombre, primerApellido, segundoApellido, sexo, eps, celular, email;
            java.sql.Date fechaNacimiento;

            primerNombre = rs.getString("pri_nombre");
            segundoNombre = rs.getString("seg_nombre");
            primerApellido = rs.getString("pri_apellido");
            segundoApellido = rs.getString("seg_apellido");
            fechaNacimiento = rs.getDate("fecha_nacimiento");
            sexo = rs.getString("sexo");
            eps = rs.getString("eps");
            celular = rs.getString("celular");
            email = rs.getString("email");
            paciente.setPrimerNombre(primerNombre);
            paciente.setSegundoNombre(segundoNombre);
            paciente.setPrimerApellido(primerApellido);
            paciente.setSegundoApellido(segundoApellido);
            paciente.setFechaNacimiento(fechaNacimiento);
            paciente.setSexo(sexo);
            paciente.setEps(eps);
            paciente.setCelular(celular);
            paciente.setEmail(email);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return paciente;
    }

    public void registrarPaciente(Paciente paciente) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, paciente.getTipoDocumento());
            stmt.setString(2, paciente.getNumeroDocumento());
            stmt.setString(3, paciente.getPrimerNombre());
            stmt.setString(4, paciente.getSegundoNombre());
            stmt.setString(5, paciente.getPrimerApellido());
            stmt.setString(6, paciente.getSegundoApellido());
            stmt.setDate(7, paciente.getFechaNacimiento());
            stmt.setString(8, paciente.getSexo());
            stmt.setString(9, paciente.getEps());
            stmt.setString(10, paciente.getCelular());
            stmt.setString(11, paciente.getEmail());
            stmt.setBlob(12, paciente.getFotoPerfil());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
    }
    
    public void actualizarPaciente(Paciente paciente){
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setString(1, paciente.getPrimerNombre());
            stmt.setString(2, paciente.getSegundoNombre());
            stmt.setString(3, paciente.getPrimerApellido());
            stmt.setString(4, paciente.getSegundoApellido());
            stmt.setDate(5, paciente.getFechaNacimiento());
            stmt.setString(6, paciente.getSexo());
            stmt.setString(7, paciente.getEps());
            stmt.setString(8, paciente.getCelular());
            stmt.setString(9, paciente.getEmail());
            stmt.setString(10, paciente.getTipoDocumento());
            stmt.setString(11, paciente.getNumeroDocumento());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
    }
    
    public void actualizarDocumento(Paciente paciente){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_UPDATE_DOCUMENT);
            stmt.setString(1, paciente.getTipoDocumento());
            stmt.setString(2, paciente.getTipoDocumento());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
    }
    
    public void eliminarPaciente(Paciente paciente){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, paciente.getTipoDocumento());
            stmt.setString(2, paciente.getNumeroDocumento());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
    }
}
