/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import dominio.Alumnos;
/**
 *
 * @author TagoKG
 */
public class AlumnossDAO {
        private static final String sql_select = "SELECT carnet_alumno, nombre_alumno, direccion_alumno,telefono_alumno,email_alumno,estatus_alumno FROM alumnos";
    private static final String sql_insert = "INSERT INTO alumnos(carnet_alumno, nombre_alumno, direccion_alumno,telefono_alumno,email_alumno,estatus_alumno) VALUES(?,?,?,?,?,?)";
    private static final String sql_update = "UPDATE alumno SET carnet_alumno=?, nombre_alumno=?, direccion_alumno=?, telefono_alumno=?, email_alumno=?, estatus_alumno=? WHERE carnet_alumno=?";
    private static final String sql_delete = "DELETE FROM alumnos WHERE carnet_alumno=?";
    private static final String sql_query = "SELECT carnet_alumno, nombre_alumno, direccion_alumno,telefono_alumno,email_alumno,estatus_alumno FROM facultades WHERE carnet_alumno=?";

    public List<Alumnos> select() throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Alumnos alumnos = null;
        List<Alumnos> facultades = new ArrayList<Alumnos>();

        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(sql_select);
            rs = stmt.executeQuery();

            while (rs.next()) {
                String carnet_alumno = rs.getString("carnet_alumno");
                String nombre_alumno = rs.getString("nombre_alumno");
                String direccion_alumno = rs.getString("direccion_alumno");
                String telefono_alumno = rs.getString("telefono_alumno");
                String email_alumno = rs.getString("email_alumno");
                String estatus_alumno = rs.getString("estatus_alumno");

                alumnos = new Alumnos();
               alumnos.setCarnet_alumno(carnet_alumno);
                alumnos.setNombre_alumno(nombre_alumno);
                alumnos.setDireccion_alumno(direccion_alumno);
                alumnos.setTelefono_alumno(telefono_alumno);
                alumnos.setEmail_alumno(email_alumno);
                alumnos.setEstatus_alumno(estatus_alumno);
             

                facultades.add(alumnos);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            Conexion.close(con);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        return facultades;
    }

    public int insert(Alumnos alumnos) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(sql_insert);
              stmt.setString(1, alumnos.getCarnet_alumno());
            stmt.setString(2, alumnos.getNombre_alumno());
            stmt.setString(3, alumnos.getDireccion_alumno());
            stmt.setString(4, alumnos.getTelefono_alumno());
            stmt.setString(5, alumnos.getEmail_alumno());
            stmt.setString(6, alumnos.getEstatus_alumno());


            rows = stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            Conexion.close(con);
            Conexion.close(stmt);
        }
        return rows;
    }

    public int update(Alumnos alumnos) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(sql_update);
             stmt.setString(1, alumnos.getCarnet_alumno());
            stmt.setString(2, alumnos.getNombre_alumno());
            stmt.setString(3, alumnos.getDireccion_alumno());
            stmt.setString(4, alumnos.getTelefono_alumno());
            stmt.setString(5, alumnos.getEmail_alumno());
            stmt.setString(6, alumnos.getEstatus_alumno());

            rows = stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            Conexion.close(con);
            Conexion.close(stmt);
        }
        return rows;
    }

    public int delete(Alumnos alumnos) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_delete);
             stmt.setString(1, alumnos.getCarnet_alumno());
            rows = stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public Alumnos query(Alumnos alumnos) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Alumnos> alumnoss = new ArrayList<Alumnos>();
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_query);
            stmt.setString(1, alumnos.getCarnet_alumno());
            rs = stmt.executeQuery();
            while (rs.next()) {
                String carnet_alumno = rs.getString("carnet_alumno");
                String nombre_alumno = rs.getString("nombre_alumno");
                String direccion_alumno = rs.getString("direccion_alumno");
                String telefono_alumno = rs.getString("telefono_alumno");
                String email_alumno = rs.getString("email_alumno");
                String estatus_alumno = rs.getString("estatus_alumno");

                alumnos = new Alumnos();
                alumnos.setCarnet_alumno(carnet_alumno);
                alumnos.setNombre_alumno(nombre_alumno);
                alumnos.setDireccion_alumno(direccion_alumno);
                  alumnos.setTelefono_alumno(telefono_alumno);
                alumnos.setEmail_alumno(email_alumno);
                alumnos.setEstatus_alumno(estatus_alumno);
                rows++;
            }

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return alumnos;
    }
}
