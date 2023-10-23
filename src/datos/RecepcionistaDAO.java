package datos;

import dominio.Recepcionista;
import java.sql.*;
import java.util.*;

public class RecepcionistaDAO {
    private static final String SQL_SELECTALL = "SELECT * FROM recepcionistas";
    private static final String SQL_SELECT_BY_DOCUMENTO = "SELECT documento_id,pri_nombre,seg_nombre,pri_apellido,seg_apellido,fecha_nacimiento,sexo,direccion,celular,email FROM recepcionistas WHERE codigo=?";
    private static final String SQL_INSERT = "INSERT INTO recepcionistas(codigo,documento_id,pri_nombre,seg_nombre,pri_apellido,seg_apellido,fecha_nacimiento,sexo,direccion,celular,email) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM recepcionistas WHERE codigo=?";
    private static final String SQL_UPDATE = "UPDATE recepcionistas SET pri_nombre = ?,seg_nombre = ?,pri_apellido = ?,seg_apellido = ?,fecha_nacimiento = ?,sexo = ?,direccion = ?,celular = ?,email= ? WHERE codigo=?";
    
    public List<Recepcionista> mostrar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Recepcionista recepcionista;
        List<Recepcionista> recepcionistas = new ArrayList<>();

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_SELECTALL);
            rs = stmt.executeQuery();

            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String numeroDocumento = rs.getString("documento_id");
                String primerNombre = rs.getString("pri_nombre");
                String segundoNombre = rs.getString("seg_nombre");
                String primerApellido = rs.getString("pri_apellido");
                String segundoApellido = rs.getString("seg_apellido");
                java.sql.Date fechaNacimiento = rs.getDate("fecha_nacimiento");
                String sexo = rs.getString("sexo");
                String direccion = rs.getString("direccion");
                String celular = rs.getString("celular");
                String email = rs.getString("email");
                recepcionista = new Recepcionista(codigo, numeroDocumento, primerNombre, segundoNombre, primerApellido, segundoApellido, fechaNacimiento, sexo, email, direccion, celular);
                recepcionistas.add(recepcionista);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return recepcionistas;
    }
    
    public void registrarRecepcionista(Recepcionista recepcionista) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, recepcionista.getCodigo());
            stmt.setString(2, recepcionista.getNumeroDocumento());
            stmt.setString(3, recepcionista.getPrimerNombre());
            stmt.setString(4, recepcionista.getSegundoNombre());
            stmt.setString(5, recepcionista.getPrimerApellido());
            stmt.setString(6, recepcionista.getSegundoApellido());
            stmt.setDate(7, recepcionista.getFechaNacimiento());
            stmt.setString(8, recepcionista.getSexo());
            stmt.setString(9, recepcionista.getDireccion());
            stmt.setString(10, recepcionista.getCelular());
            stmt.setString(11, recepcionista.getEmail());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
    }
    
    public void actualizarRececionista(Recepcionista recepcionista){
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setString(1, recepcionista.getPrimerNombre());
            stmt.setString(2, recepcionista.getSegundoNombre());
            stmt.setString(3, recepcionista.getPrimerApellido());
            stmt.setString(4, recepcionista.getSegundoApellido());
            stmt.setDate(5, recepcionista.getFechaNacimiento());
            stmt.setString(6, recepcionista.getSexo());
            stmt.setString(7, recepcionista.getDireccion());
            stmt.setString(8, recepcionista.getCelular());
            stmt.setString(9, recepcionista.getEmail());
            stmt.setString(10, recepcionista.getCodigo());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
    }
    
    public void eliminarRecepcionista(Recepcionista recepcionista){
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = Conexion.getConection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, recepcionista.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
    }
}
