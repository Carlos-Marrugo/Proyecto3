package hosptial;

import datos.PacienteDAO;
import dominio.Paciente;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import static java.lang.System.exit;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.*;

public class Recepcionista extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo1 = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();

    public Recepcionista() {
        initComponents();
        this.setLocationRelativeTo(null);
        tableModelCitasHoy();
        tableModelListadoCitas();
        tableModelPacientes();
    }

    private void tableModelCitasHoy() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Hora");
        modelo.addColumn("Doctor");
        modelo.addColumn("Paciente");
        modelo.addColumn("Consultorio");
        tablaCitasHoy.setModel(modelo);
        tablaCitasHoy.getColumnModel().getColumn(0).setWidth(120);
        tablaCitasHoy.getColumnModel().getColumn(0).setMinWidth(120);
        tablaCitasHoy.getColumnModel().getColumn(0).setMaxWidth(120);
        tablaCitasHoy.getColumnModel().getColumn(1).setWidth(120);
        tablaCitasHoy.getColumnModel().getColumn(1).setMinWidth(120);
        tablaCitasHoy.getColumnModel().getColumn(1).setMaxWidth(120);
        JTableHeader header = tablaCitasHoy.getTableHeader();
        header.setDefaultRenderer(headerRenderer);
    }
    
    private void tableModelListadoCitas() {
        modelo2.addColumn("Codigo");
        modelo2.addColumn("Fecha");
        modelo2.addColumn("Hora");
        modelo2.addColumn("Consultorio");
        tablaListadoCitas.setModel(modelo2);
        tablaListadoCitas.getColumnModel().getColumn(0).setWidth(120);
        tablaListadoCitas.getColumnModel().getColumn(0).setMinWidth(120);
        tablaListadoCitas.getColumnModel().getColumn(0).setMaxWidth(120);
        tablaListadoCitas.getColumnModel().getColumn(1).setWidth(150);
        tablaListadoCitas.getColumnModel().getColumn(1).setMinWidth(150);
        tablaListadoCitas.getColumnModel().getColumn(1).setMaxWidth(150);
        JTableHeader header = tablaListadoCitas.getTableHeader();
        header.setDefaultRenderer(headerRenderer);
    }
    
    private void tableModelPacientes(){
        modelo1.addColumn(" ");
        modelo1.addColumn("Nro Documento");
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Apellido");
        modelo1.addColumn("Edad");
        modelo1.addColumn("Sexo");
        modelo1.addColumn("Eps");
        modelo1.addColumn("Email");
        modelo1.addColumn("Celular");
        tablaPacientes.setModel(modelo1);
        tablaPacientes.getColumnModel().getColumn(0).setWidth(30);
        tablaPacientes.getColumnModel().getColumn(0).setMinWidth(30);
        tablaPacientes.getColumnModel().getColumn(0).setMaxWidth(30);
        tablaPacientes.getColumnModel().getColumn(1).setWidth(120);
        tablaPacientes.getColumnModel().getColumn(1).setMinWidth(120);
        tablaPacientes.getColumnModel().getColumn(1).setMaxWidth(120);
        tablaPacientes.getColumnModel().getColumn(4).setWidth(50);
        tablaPacientes.getColumnModel().getColumn(4).setMinWidth(50);
        tablaPacientes.getColumnModel().getColumn(4).setMaxWidth(50);
        tablaPacientes.getColumnModel().getColumn(5).setWidth(50);
        tablaPacientes.getColumnModel().getColumn(5).setMinWidth(50);
        tablaPacientes.getColumnModel().getColumn(5).setMaxWidth(50);
        JTableHeader header = tablaPacientes.getTableHeader();
        header.setDefaultRenderer(headerRenderer);
    }

    DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            // Establecer el color de fondo y el color de texto
            setBackground(new Color(232, 230, 229));
            setForeground(Color.BLACK);

            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    };
    
    private void llenarTablaPaciente(){
        java.util.List<Paciente> pacientes = new PacienteDAO().mostrar();
        Object[] obj = new Object[9];
        modelo1.getDataVector().removeAllElements();
        for (Paciente paciente : pacientes) {
            obj[0] = paciente.getTipoDocumento();
            obj[1] = paciente.getNumeroDocumento();
            obj[2] = paciente.getPrimerNombre();
            obj[3] = paciente.getPrimerApellido();
            obj[4] = obtenerEdad(paciente);
            obj[5] = paciente.getSexo();
            obj[6] = paciente.getEps();
            obj[7] = paciente.getEmail();
            obj[8] = paciente.getCelular();
            modelo1.addRow(obj);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNombreRecepcion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblIconRecepcion = new javax.swing.JLabel();
        panelBtnAgregarPaciente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        panelBtnInicio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panelBtnAgendar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelBtnModificarCita = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panelBtnInformes = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        panelBtnModificarPaciente = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelInicio = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCitasHoy = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        panelAgendar1 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        cbbTipo = new javax.swing.JComboBox<>();
        txtDocumentoAgendar = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        cbbEpsAgendar = new javax.swing.JComboBox<>();
        jSeparator15 = new javax.swing.JSeparator();
        txtCelularAgendar = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        txtemail1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        cbbSexo = new javax.swing.JComboBox<>();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        btnSiguienteAgendar = new javax.swing.JButton();
        panelAgendar2 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jdFechaCita = new com.toedter.calendar.JDateChooser();
        cbbTipoCita = new javax.swing.JComboBox<>();
        cbbMedicos = new javax.swing.JComboBox<>();
        jLabel61 = new javax.swing.JLabel();
        cbbHora = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        cbbConsultorio = new javax.swing.JComboBox<>();
        jLabel71 = new javax.swing.JLabel();
        btnCancelarAgenda = new javax.swing.JButton();
        btnAgendarCita = new javax.swing.JButton();
        panelModificarCita = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        cbbModificarHora = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel49 = new javax.swing.JLabel();
        cbbModificarTipo = new javax.swing.JComboBox<>();
        cbbModificarPacienteCita = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        cbbModificarDoctorCita = new javax.swing.JComboBox<>();
        btnCancelarActualizar = new javax.swing.JButton();
        btnActualizarCita = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaListadoCitas = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        panelInformes = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        btnVerHistoria = new javax.swing.JButton();
        btnVerLaboratorio = new javax.swing.JButton();
        btnVerMedicamentos = new javax.swing.JButton();
        btnVerCertificados = new javax.swing.JButton();
        panelGuardarPaciente = new javax.swing.JPanel();
        txtDocumentoR = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtPriNombreR = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        panelBtnGuardar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbTipoDocumento = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        txtSegNombreR = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPriApellidoR = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtSegApellidoR = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        cbEps = new javax.swing.JComboBox<>();
        jSeparator27 = new javax.swing.JSeparator();
        jLabel67 = new javax.swing.JLabel();
        txtEmailR = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        txtCelularR = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        lblImgUser = new javax.swing.JLabel();
        panelModificarPaciente = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        panelBtnExit = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Graphicloads-Medical-Health-Heart-beat.48.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 60, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CarjeSalud");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 170, -1));

        jPanel2.setBackground(new java.awt.Color(19, 28, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreRecepcion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombreRecepcion.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreRecepcion.setText("Recepcionista");
        jPanel2.add(lblNombreRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 230, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 230, 20));

        lblIconRecepcion.setBackground(new java.awt.Color(255, 255, 255));
        lblIconRecepcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(lblIconRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 150, 150));

        panelBtnAgregarPaciente.setBackground(new java.awt.Color(19, 28, 70));
        panelBtnAgregarPaciente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBtnAgregarPacienteMouseMoved(evt);
            }
        });
        panelBtnAgregarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnAgregarPacienteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnAgregarPacienteMouseExited(evt);
            }
        });
        panelBtnAgregarPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar Paciente");
        panelBtnAgregarPaciente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 15, 170, 28));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paciente.png"))); // NOI18N
        panelBtnAgregarPaciente.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel2.add(panelBtnAgregarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 300, 60));

        panelBtnInicio.setBackground(new java.awt.Color(19, 28, 70));
        panelBtnInicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBtnInicioMouseMoved(evt);
            }
        });
        panelBtnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnInicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnInicioMouseExited(evt);
            }
        });
        panelBtnInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inicio");
        panelBtnInicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 15, -1, 28));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagina-de-inicio (1).png"))); // NOI18N
        panelBtnInicio.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel2.add(panelBtnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 300, 60));

        panelBtnAgendar.setBackground(new java.awt.Color(19, 28, 70));
        panelBtnAgendar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBtnAgendarMouseMoved(evt);
            }
        });
        panelBtnAgendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnAgendarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnAgendarMouseExited(evt);
            }
        });
        panelBtnAgendar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Agender cita");
        panelBtnAgendar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 15, 138, 28));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cita-medica.png"))); // NOI18N
        panelBtnAgendar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel2.add(panelBtnAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 300, 60));

        panelBtnModificarCita.setBackground(new java.awt.Color(19, 28, 70));
        panelBtnModificarCita.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBtnModificarCitaMouseMoved(evt);
            }
        });
        panelBtnModificarCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnModificarCitaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnModificarCitaMouseExited(evt);
            }
        });
        panelBtnModificarCita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Modificar cita");
        panelBtnModificarCita.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 15, 138, 28));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        panelBtnModificarCita.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel2.add(panelBtnModificarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 300, 60));

        panelBtnInformes.setBackground(new java.awt.Color(19, 28, 70));
        panelBtnInformes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBtnInformesMouseMoved(evt);
            }
        });
        panelBtnInformes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnInformesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnInformesMouseExited(evt);
            }
        });
        panelBtnInformes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Informes");
        panelBtnInformes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 15, 138, 28));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuidado-de-la-salud.png"))); // NOI18N
        panelBtnInformes.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jPanel2.add(panelBtnInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 300, 60));

        panelBtnModificarPaciente.setBackground(new java.awt.Color(19, 28, 70));
        panelBtnModificarPaciente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBtnModificarPacienteMouseMoved(evt);
            }
        });
        panelBtnModificarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnModificarPacienteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnModificarPacienteMouseExited(evt);
            }
        });
        panelBtnModificarPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paciente.png"))); // NOI18N
        panelBtnModificarPaciente.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Modificar Paciente");
        panelBtnModificarPaciente.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 15, 190, 28));

        jPanel2.add(panelBtnModificarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 300, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 710));

        jPanel3.setBackground(new java.awt.Color(10, 92, 184));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Agendar, Modificaciones, Informes, Pacientes");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 530, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 850, 130));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        panelInicio.setBackground(new java.awt.Color(255, 255, 255));
        panelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(232, 230, 229));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pacientesIcon.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Total Pacientes");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("100");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        panelInicio.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 210, 150));

        jPanel18.setBackground(new java.awt.Color(232, 230, 229));
        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doctorIcon.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Total Doctores");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText("100");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(15, 15, 15)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        panelInicio.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 200, 150));

        jPanel19.setBackground(new java.awt.Color(232, 230, 229));
        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/citasIcon.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Total Citas");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("100");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        panelInicio.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 190, 150));

        tablaCitasHoy.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaCitasHoy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaCitasHoy.getTableHeader().setResizingAllowed(false);
        tablaCitasHoy.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaCitasHoy);

        panelInicio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 720, 230));

        jPanel20.setBackground(new java.awt.Color(232, 230, 229));
        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel69.setBackground(new java.awt.Color(232, 230, 229));
        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("CITAS HOY");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelInicio.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 718, -1));

        jTabbedPane1.addTab("Inicio", panelInicio);

        panelAgendar1.setBackground(new java.awt.Color(255, 255, 255));
        panelAgendar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel70.setText("Documento de Identidad*");
        panelAgendar1.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 220, -1));

        cbbTipo.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RC", "TI", "CC" }));
        panelAgendar1.add(cbbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 70, 30));

        txtDocumentoAgendar.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtDocumentoAgendar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDocumentoAgendar.setBorder(null);
        panelAgendar1.add(txtDocumentoAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, 30));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(10, 92, 184));
        panelAgendar1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 70, 20));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(10, 92, 184));
        panelAgendar1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 160, 20));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Motivo de consulta");
        panelAgendar1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 200, -1));

        txtNombres.setEditable(false);
        txtNombres.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtNombres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombres.setBorder(null);
        panelAgendar1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 240, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("Apellidos");
        panelAgendar1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 220, -1));

        txtApellidos.setEditable(false);
        txtApellidos.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtApellidos.setBorder(null);
        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        panelAgendar1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 240, 30));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(10, 92, 184));
        panelAgendar1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 240, 20));

        cbbEpsAgendar.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbEpsAgendar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbEpsAgendar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<EPS>", "Sura.", "Sanitas.", "Nueva EPS.", "Salud Total.", "Famisanar.", "Compensar.", "Servicio Occidental de Salud.", "Aliansalud.", " " }));
        cbbEpsAgendar.setEnabled(false);
        panelAgendar1.add(cbbEpsAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 210, 30));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator15.setForeground(new java.awt.Color(10, 92, 184));
        panelAgendar1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 210, 20));

        txtCelularAgendar.setEditable(false);
        txtCelularAgendar.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtCelularAgendar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCelularAgendar.setBorder(null);
        panelAgendar1.add(txtCelularAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 210, 30));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Celular");
        panelAgendar1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 190, -1));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator16.setForeground(new java.awt.Color(10, 92, 184));
        panelAgendar1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 210, 20));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Fecha de nacimiento");
        panelAgendar1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 190, -1));

        jSeparator17.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator17.setForeground(new java.awt.Color(10, 92, 184));
        panelAgendar1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 210, 20));

        txtemail1.setEditable(false);
        txtemail1.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtemail1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtemail1.setBorder(null);
        panelAgendar1.add(txtemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 210, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText("Email");
        panelAgendar1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 190, -1));

        jSeparator18.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator18.setForeground(new java.awt.Color(10, 92, 184));
        panelAgendar1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 240, 20));

        cbbSexo.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbSexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Sexo>", "Masculino", "Femenino", " " }));
        cbbSexo.setEnabled(false);
        panelAgendar1.add(cbbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 240, 30));

        jSeparator19.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator19.setForeground(new java.awt.Color(10, 92, 184));
        panelAgendar1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 240, 20));

        jSeparator20.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator20.setForeground(new java.awt.Color(10, 92, 184));
        panelAgendar1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 210, 20));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel63.setText("Nombres");
        panelAgendar1.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 220, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        panelAgendar1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 200, 250));

        jDateChooser3.setEnabled(false);
        panelAgendar1.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 210, 30));

        btnSiguienteAgendar.setBackground(new java.awt.Color(10, 92, 184));
        btnSiguienteAgendar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSiguienteAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguienteAgendar.setText("SIGUIENTE");
        btnSiguienteAgendar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSiguienteAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteAgendarActionPerformed(evt);
            }
        });
        panelAgendar1.add(btnSiguienteAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 200, 50));

        jTabbedPane1.addTab("Agendar datos personales", panelAgendar1);

        panelAgendar2.setBackground(new java.awt.Color(255, 255, 255));
        panelAgendar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel38.setText("Datos de la Cita");
        panelAgendar2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, 40));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario.png"))); // NOI18N
        panelAgendar2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 140, 140));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agenda.png"))); // NOI18N
        panelAgendar2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 80, 70));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setText("Tipo de cita*");
        panelAgendar2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 110, 20));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setText("Fecha de Cita*");
        panelAgendar2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 160, 20));
        panelAgendar2.add(jdFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 192, 180, 30));

        cbbTipoCita.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbTipoCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelAgendar2.add(cbbTipoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 180, 30));

        cbbMedicos.setBackground(new java.awt.Color(0, 0, 0, 0));
        panelAgendar2.add(cbbMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 180, 31));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel61.setText("Medico*");
        panelAgendar2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 100, -1));

        cbbHora.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00" }));
        panelAgendar2.add(cbbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 70, 30));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel62.setText("Hora*");
        panelAgendar2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 64, -1));

        cbbConsultorio.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbConsultorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelAgendar2.add(cbbConsultorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 90, 30));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel71.setText("Consultorio*");
        panelAgendar2.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 110, 20));

        btnCancelarAgenda.setBackground(new java.awt.Color(255, 0, 51));
        btnCancelarAgenda.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnCancelarAgenda.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarAgenda.setText("CANCELAR");
        panelAgendar2.add(btnCancelarAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 90, 40));

        btnAgendarCita.setBackground(new java.awt.Color(10, 92, 184));
        btnAgendarCita.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnAgendarCita.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendarCita.setText("AGENDAR");
        btnAgendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarCitaActionPerformed(evt);
            }
        });
        panelAgendar2.add(btnAgendarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 90, 40));

        jTabbedPane1.addTab("Datos cita", panelAgendar2);

        panelModificarCita.setBackground(new java.awt.Color(255, 255, 255));
        panelModificarCita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setText("Hora:");
        panelModificarCita.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 60, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setText("Paciente:");
        panelModificarCita.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setText("Tipo de cita:");
        panelModificarCita.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        cbbModificarHora.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbModificarHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelModificarCita.add(cbbModificarHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 220, 30));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setText("Doctor:");
        panelModificarCita.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, -1));

        jDateChooser2.setBackground(new java.awt.Color(0, 0, 0, 0));
        panelModificarCita.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 220, 30));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel49.setText("Fecha:");
        panelModificarCita.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 60, -1));

        cbbModificarTipo.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbModificarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Tipo de cita>", "Odontologo", "Medico General", "Radiologia", "Cardiologia", "Psicologo" }));
        panelModificarCita.add(cbbModificarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 220, 30));

        cbbModificarPacienteCita.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbModificarPacienteCita.setEnabled(false);
        panelModificarCita.add(cbbModificarPacienteCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 30));

        jSeparator2.setBackground(new java.awt.Color(10, 92, 184));
        jSeparator2.setForeground(new java.awt.Color(10, 92, 184));
        panelModificarCita.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 220, 10));

        jSeparator3.setBackground(new java.awt.Color(10, 92, 184));
        jSeparator3.setForeground(new java.awt.Color(10, 92, 184));
        panelModificarCita.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 220, 10));

        jSeparator4.setBackground(new java.awt.Color(10, 92, 184));
        jSeparator4.setForeground(new java.awt.Color(10, 92, 184));
        panelModificarCita.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 10));

        jSeparator5.setBackground(new java.awt.Color(10, 92, 184));
        jSeparator5.setForeground(new java.awt.Color(10, 92, 184));
        panelModificarCita.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 220, 10));

        jSeparator6.setBackground(new java.awt.Color(10, 92, 184));
        jSeparator6.setForeground(new java.awt.Color(10, 92, 184));
        panelModificarCita.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 220, 10));

        cbbModificarDoctorCita.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbbModificarDoctorCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Tipo de cita>", "Odontologo", "Medico General", "Radiologia", "Cardiologia", "Psicologo" }));
        panelModificarCita.add(cbbModificarDoctorCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 220, 30));

        btnCancelarActualizar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelarActualizar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnCancelarActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarActualizar.setText("Eliminar");
        panelModificarCita.add(btnCancelarActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 110, 40));

        btnActualizarCita.setBackground(new java.awt.Color(10, 92, 184));
        btnActualizarCita.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnActualizarCita.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarCita.setText("Actualizar");
        panelModificarCita.add(btnActualizarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 110, 40));

        tablaListadoCitas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaListadoCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaListadoCitas.getTableHeader().setResizingAllowed(false);
        tablaListadoCitas.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tablaListadoCitas);

        panelModificarCita.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 570, 410));

        jPanel21.setBackground(new java.awt.Color(232, 230, 229));
        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel44.setText("LISTADO DE CITAS");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        panelModificarCita.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 570, 50));

        jPanel5.setBackground(new java.awt.Color(232, 230, 229));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        panelModificarCita.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 450));

        jTabbedPane1.addTab("Modificar", panelModificarCita);

        panelInformes.setBackground(new java.awt.Color(255, 255, 255));
        panelInformes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelInformes.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 60));

        jPanel6.setBackground(new java.awt.Color(232, 230, 229));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel50.setText("INFORMES");
        jPanel6.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 160, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RC", "TI", "CC" }));
        jPanel6.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 30));
        jPanel6.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 200, 30));

        panelInformes.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 610, 50));

        jPanel7.setBackground(new java.awt.Color(232, 230, 229));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("HISTORIA CLINICA");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel51)
                .addGap(0, 152, Short.MAX_VALUE))
        );

        panelInformes.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, 170));

        jPanel8.setBackground(new java.awt.Color(232, 230, 229));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("LABORATORIO");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel52)
                .addGap(0, 150, Short.MAX_VALUE))
        );

        panelInformes.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 120, 170));

        jPanel10.setBackground(new java.awt.Color(232, 230, 229));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("MEDICAMENTOS");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel53)
                .addGap(0, 150, Short.MAX_VALUE))
        );

        panelInformes.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 120, 170));

        jPanel11.setBackground(new java.awt.Color(232, 230, 229));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("CERTIFICADOS");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel54)
                .addGap(0, 150, Short.MAX_VALUE))
        );

        panelInformes.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 120, 170));

        btnVerHistoria.setBackground(new java.awt.Color(10, 92, 184));
        btnVerHistoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerHistoria.setForeground(new java.awt.Color(255, 255, 255));
        btnVerHistoria.setText("VER");
        btnVerHistoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelInformes.add(btnVerHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 120, 40));

        btnVerLaboratorio.setBackground(new java.awt.Color(10, 92, 184));
        btnVerLaboratorio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerLaboratorio.setForeground(new java.awt.Color(255, 255, 255));
        btnVerLaboratorio.setText("VER");
        btnVerLaboratorio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelInformes.add(btnVerLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 120, 40));

        btnVerMedicamentos.setBackground(new java.awt.Color(10, 92, 184));
        btnVerMedicamentos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerMedicamentos.setText("VER");
        btnVerMedicamentos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnVerMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMedicamentosActionPerformed(evt);
            }
        });
        panelInformes.add(btnVerMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 120, 40));

        btnVerCertificados.setBackground(new java.awt.Color(10, 92, 184));
        btnVerCertificados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerCertificados.setForeground(new java.awt.Color(255, 255, 255));
        btnVerCertificados.setText("VER");
        btnVerCertificados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelInformes.add(btnVerCertificados, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 120, 40));

        jTabbedPane1.addTab("Informes", panelInformes);

        panelGuardarPaciente.setBackground(new java.awt.Color(255, 255, 255));
        panelGuardarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        panelGuardarPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDocumentoR.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtDocumentoR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDocumentoR.setBorder(null);
        txtDocumentoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoRActionPerformed(evt);
            }
        });
        panelGuardarPaciente.add(txtDocumentoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 140, 30));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 60, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Primer Nombre*");
        panelGuardarPaciente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 220, -1));

        txtPriNombreR.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtPriNombreR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPriNombreR.setBorder(null);
        panelGuardarPaciente.add(txtPriNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 215, 30));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 215, 20));

        panelBtnGuardar.setBackground(new java.awt.Color(10, 92, 184));
        panelBtnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnGuardarMouseClicked(evt);
            }
        });
        panelBtnGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("GUARDAR");
        panelBtnGuardar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 129, 30));

        panelGuardarPaciente.add(panelBtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 190, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AGREGAR IMAGEN");
        panelGuardarPaciente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Documento de identidad*");
        panelGuardarPaciente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        cbTipoDocumento.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbTipoDocumento.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RC", "TI", "CC" }));
        panelGuardarPaciente.add(cbTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 60, 30));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 140, 20));

        jSeparator21.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator21.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 215, 20));

        txtSegNombreR.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtSegNombreR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSegNombreR.setBorder(null);
        panelGuardarPaciente.add(txtSegNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 215, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Segundo Nombre");
        panelGuardarPaciente.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 220, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Primer Apellido*");
        panelGuardarPaciente.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 220, -1));

        txtPriApellidoR.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtPriApellidoR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPriApellidoR.setBorder(null);
        panelGuardarPaciente.add(txtPriApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 215, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("Eps*");
        panelGuardarPaciente.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 105, -1));

        txtSegApellidoR.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtSegApellidoR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSegApellidoR.setBorder(null);
        panelGuardarPaciente.add(txtSegApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 215, 30));

        jSeparator22.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator22.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 215, 20));

        jSeparator23.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator23.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 215, 20));

        dcFechaNacimiento.setBackground(new java.awt.Color(0, 0, 0, 0));
        panelGuardarPaciente.add(dcFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 215, 30));

        jSeparator24.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator24.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 105, 10));

        jSeparator25.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator25.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 215, 20));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel64.setText("Segundo Apellido*");
        panelGuardarPaciente.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 220, -1));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel65.setText("Fecha de Nacimiento*");
        panelGuardarPaciente.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 220, -1));

        cbSexo.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        panelGuardarPaciente.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 105, 25));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel66.setText("Sexo*");
        panelGuardarPaciente.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 105, -1));

        cbEps.setBackground(new java.awt.Color(0, 0, 0, 0));
        cbEps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coosalud", "Sanistas", "Comfamiliar", "Nueva Eps" }));
        panelGuardarPaciente.add(cbEps, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 105, 25));

        jSeparator27.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator27.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 105, 10));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel67.setText("Email*");
        panelGuardarPaciente.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 220, -1));

        txtEmailR.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtEmailR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmailR.setBorder(null);
        panelGuardarPaciente.add(txtEmailR, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 215, 25));

        jSeparator28.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator28.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 215, 10));

        txtCelularR.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtCelularR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCelularR.setBorder(null);
        panelGuardarPaciente.add(txtCelularR, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 215, 25));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel68.setText("Celular*");
        panelGuardarPaciente.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 220, -1));

        jSeparator29.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator29.setForeground(new java.awt.Color(10, 92, 184));
        panelGuardarPaciente.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 215, 20));

        lblImgUser.setBackground(new java.awt.Color(232, 230, 229));
        lblImgUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        lblImgUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgUserMouseClicked(evt);
            }
        });
        panelGuardarPaciente.add(lblImgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 150, 150));

        jTabbedPane1.addTab("Pacientes", panelGuardarPaciente);

        panelModificarPaciente.setBackground(new java.awt.Color(255, 255, 255));
        panelModificarPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(232, 230, 229));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("LISTADO DE PACIENTES");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 30));

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RC", "TI", "CC" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 70, 30));
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 200, 30));

        panelModificarPaciente.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 830, 50));

        tablaPacientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaPacientes);

        panelModificarPaciente.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 830, -1));

        jTabbedPane1.addTab("tab7", panelModificarPaciente);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 850, 560));

        panelBtnExit.setBackground(new java.awt.Color(255, 255, 255));
        panelBtnExit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBtnExitMouseMoved(evt);
            }
        });
        panelBtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBtnExitMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBtnExitMouseExited(evt);
            }
        });
        panelBtnExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setText("X");
        panelBtnExit.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 0, 20, 30));

        jPanel1.add(panelBtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelBtnInicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInicioMouseMoved
        panelBtnInicio.setBackground(new Color(29, 64, 92));
    }//GEN-LAST:event_panelBtnInicioMouseMoved

    private void panelBtnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInicioMouseExited
        panelBtnInicio.setBackground(new Color(19, 28, 70));
    }//GEN-LAST:event_panelBtnInicioMouseExited

    private void panelBtnAgendarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnAgendarMouseMoved
        panelBtnAgendar.setBackground(new Color(29, 64, 92));
    }//GEN-LAST:event_panelBtnAgendarMouseMoved

    private void panelBtnAgendarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnAgendarMouseExited
        panelBtnAgendar.setBackground(new Color(19, 28, 70));
    }//GEN-LAST:event_panelBtnAgendarMouseExited

    private void panelBtnModificarCitaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnModificarCitaMouseMoved
        panelBtnModificarCita.setBackground(new Color(29, 64, 92));
    }//GEN-LAST:event_panelBtnModificarCitaMouseMoved

    private void panelBtnModificarCitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnModificarCitaMouseExited
        panelBtnModificarCita.setBackground(new Color(19, 28, 70));
    }//GEN-LAST:event_panelBtnModificarCitaMouseExited

    private void panelBtnInformesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInformesMouseMoved
        panelBtnInformes.setBackground(new Color(29, 64, 92));
    }//GEN-LAST:event_panelBtnInformesMouseMoved

    private void panelBtnInformesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInformesMouseExited
        panelBtnInformes.setBackground(new Color(19, 28, 70));
    }//GEN-LAST:event_panelBtnInformesMouseExited

    private void panelBtnAgregarPacienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnAgregarPacienteMouseMoved
        panelBtnAgregarPaciente.setBackground(new Color(29, 64, 92));
    }//GEN-LAST:event_panelBtnAgregarPacienteMouseMoved

    private void panelBtnAgregarPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnAgregarPacienteMouseExited
        panelBtnAgregarPaciente.setBackground(new Color(19, 28, 70));
    }//GEN-LAST:event_panelBtnAgregarPacienteMouseExited

    private void panelBtnAgendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnAgendarMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_panelBtnAgendarMouseClicked

    private void panelBtnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInicioMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_panelBtnInicioMouseClicked

    private void panelBtnModificarCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnModificarCitaMouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_panelBtnModificarCitaMouseClicked

    private void panelBtnInformesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnInformesMouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_panelBtnInformesMouseClicked

    private void panelBtnAgregarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnAgregarPacienteMouseClicked
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_panelBtnAgregarPacienteMouseClicked

    private void panelBtnExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnExitMouseMoved
        panelBtnExit.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_panelBtnExitMouseMoved

    private void panelBtnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnExitMouseExited
        panelBtnExit.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_panelBtnExitMouseExited

    private void panelBtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnExitMouseClicked
        exit(0);
    }//GEN-LAST:event_panelBtnExitMouseClicked

    private void txtDocumentoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoRActionPerformed

    private void lblImgUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgUserMouseClicked
        // Crea el JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        // Abre el JFileChooser
        int resultado = fileChooser.showOpenDialog(this);

        // Si el usuario seleccionó un archivo
        if (resultado == JFileChooser.APPROVE_OPTION) {
            try {
                // Obtiene el archivo seleccionado
                File file = fileChooser.getSelectedFile();
                String extension = file.getName().substring(file.getName().lastIndexOf(".") + 1);
                if ((file.isFile() && extension.equals("png")) || (file.isFile() && extension.equals("jpg"))) {
                    // Carga la imagen
                    BufferedImage image = ImageIO.read(file);
                    // Crea una ImageIcon a partir de la imagen
                    ImageIcon icon = new ImageIcon(image);
                    // Asigna la ImageIcon ala etiqueta
                    lblImgUser.setIcon(icon);
                }
            } catch (IOException ex) {
                System.err.print(ex);
            }
        }
    }//GEN-LAST:event_lblImgUserMouseClicked

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void panelBtnModificarPacienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnModificarPacienteMouseMoved
        panelBtnModificarPaciente.setBackground(new Color(29, 64, 92));
    }//GEN-LAST:event_panelBtnModificarPacienteMouseMoved

    private void panelBtnModificarPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnModificarPacienteMouseExited
        panelBtnModificarPaciente.setBackground(new Color(19, 28, 70));
    }//GEN-LAST:event_panelBtnModificarPacienteMouseExited

    private void panelBtnModificarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnModificarPacienteMouseClicked
        jTabbedPane1.setSelectedIndex(6);
        llenarTablaPaciente();
    }//GEN-LAST:event_panelBtnModificarPacienteMouseClicked

    private void btnSiguienteAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteAgendarActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnSiguienteAgendarActionPerformed

    private void btnVerMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerMedicamentosActionPerformed

    private void btnAgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendarCitaActionPerformed

    private void panelBtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnGuardarMouseClicked
        if(checkField(txtDocumentoR) || checkField(txtPriNombreR) || checkField(txtPriApellidoR)
                || checkField(txtSegApellidoR) || checkField(txtEmailR) || checkField(txtCelularR)){
            JOptionPane.showMessageDialog(this, "Rellene todos los campos obligatorios");
            return;
        }
        String tipoDocumento,numeroDocumento,primerNombre, segundoNombre, primerApellido, segundoApellido, sexo, eps, celular, email;
        java.sql.Date fechaNacimiento;
        tipoDocumento = String.valueOf(cbbTipo.getSelectedItem());
        numeroDocumento = txtDocumentoR.getText();
        primerNombre = txtPriNombreR.getText();
        segundoNombre = txtSegNombreR.getText();
        primerApellido = txtPriApellidoR.getText();
        segundoApellido = txtSegApellidoR.getText();
        sexo = String.valueOf(cbSexo.getSelectedItem());
        eps = String.valueOf(cbEps.getSelectedItem());
        email = txtEmailR.getText();
        celular = txtCelularR.getText();
        fechaNacimiento = new java.sql.Date(dcFechaNacimiento.getDate().getTime());
        if(!isNumerico(numeroDocumento) || isNumerico(primerNombre) || isNumerico(segundoNombre) || isNumerico(primerApellido) || isNumerico(segundoApellido)
                || isNumerico(email) || !isNumerico(celular)){
            JOptionPane.showMessageDialog(this, "Algunos campos son incorrectos");
            return;
        }
        Paciente paciente = new Paciente(tipoDocumento, numeroDocumento, primerNombre, segundoNombre, primerApellido, segundoApellido, fechaNacimiento, sexo, eps, email, celular);
        new PacienteDAO().registrarPaciente(paciente);
        JOptionPane.showMessageDialog(this, "Paciente Registrado");
        limpiarCampos();
    }//GEN-LAST:event_panelBtnGuardarMouseClicked

    private boolean checkField(JTextField jTextField){
        return jTextField.getText().isBlank();
    }
    
    private boolean isNumerico(String str){
        try{
            Double.parseDouble(str);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    
    private void limpiarCampos(){
        txtDocumentoR.setText("");
        txtPriNombreR.setText("");
        txtSegNombreR.setText("");
        txtPriNombreR.setText("");
        txtSegApellidoR.setText("");
        txtEmailR.setText("");
        txtCelularR.setText("");
        cbbTipo.setSelectedIndex(0);
        cbSexo.setSelectedIndex(0);
        cbEps.setSelectedIndex(0);
        dcFechaNacimiento.setDate(new Date());
    }
    
    private String obtenerEdad(Paciente paciente){
        String sFechaNacimiento = String.valueOf(paciente.getFechaNacimiento());
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.parse(sFechaNacimiento);
        // Calcula la diferencia de años, meses y días
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        // Obtiene la edad en años
        int edad = periodo.getYears();
        String sEdad;
        if (edad < 1) {
            edad = periodo.getMonths();
            sEdad = edad+ "m";
            if (edad < 1) {
                edad = periodo.getDays();
                sEdad = edad+ "d";
            }
        } else {
            sEdad = edad+ "a";
        }
        return sEdad;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCita;
    private javax.swing.JButton btnAgendarCita;
    private javax.swing.JButton btnCancelarActualizar;
    private javax.swing.JButton btnCancelarAgenda;
    private javax.swing.JButton btnSiguienteAgendar;
    private javax.swing.JButton btnVerCertificados;
    private javax.swing.JButton btnVerHistoria;
    private javax.swing.JButton btnVerLaboratorio;
    private javax.swing.JButton btnVerMedicamentos;
    private javax.swing.JComboBox<String> cbEps;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbTipoDocumento;
    private javax.swing.JComboBox<String> cbbConsultorio;
    private javax.swing.JComboBox<String> cbbEpsAgendar;
    private javax.swing.JComboBox<String> cbbHora;
    private javax.swing.JComboBox<String> cbbMedicos;
    private javax.swing.JComboBox<String> cbbModificarDoctorCita;
    private javax.swing.JComboBox<String> cbbModificarHora;
    private javax.swing.JTextField cbbModificarPacienteCita;
    private javax.swing.JComboBox<String> cbbModificarTipo;
    private javax.swing.JComboBox<String> cbbSexo;
    private javax.swing.JComboBox<String> cbbTipo;
    private javax.swing.JComboBox<String> cbbTipoCita;
    private com.toedter.calendar.JDateChooser dcFechaNacimiento;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private com.toedter.calendar.JDateChooser jdFechaCita;
    private javax.swing.JLabel lblIconRecepcion;
    private javax.swing.JLabel lblImgUser;
    private javax.swing.JLabel lblNombreRecepcion;
    private javax.swing.JPanel panelAgendar1;
    private javax.swing.JPanel panelAgendar2;
    private javax.swing.JPanel panelBtnAgendar;
    private javax.swing.JPanel panelBtnAgregarPaciente;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JPanel panelBtnGuardar;
    private javax.swing.JPanel panelBtnInformes;
    private javax.swing.JPanel panelBtnInicio;
    private javax.swing.JPanel panelBtnModificarCita;
    private javax.swing.JPanel panelBtnModificarPaciente;
    private javax.swing.JPanel panelGuardarPaciente;
    private javax.swing.JPanel panelInformes;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelModificarCita;
    private javax.swing.JPanel panelModificarPaciente;
    private javax.swing.JTable tablaCitasHoy;
    private javax.swing.JTable tablaListadoCitas;
    private javax.swing.JTable tablaPacientes;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCelularAgendar;
    private javax.swing.JTextField txtCelularR;
    private javax.swing.JTextField txtDocumentoAgendar;
    private javax.swing.JTextField txtDocumentoR;
    private javax.swing.JTextField txtEmailR;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPriApellidoR;
    private javax.swing.JTextField txtPriNombreR;
    private javax.swing.JTextField txtSegApellidoR;
    private javax.swing.JTextField txtSegNombreR;
    private javax.swing.JTextField txtemail1;
    // End of variables declaration//GEN-END:variables
}
