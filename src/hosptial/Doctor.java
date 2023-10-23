/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hosptial;

import java.awt.Color;
import static java.lang.System.exit;
import sombra.TextPrompt;
import javax.swing.table.*;

public class Doctor extends javax.swing.JFrame {

    DefaultTableModel modelodoctor = new DefaultTableModel();
    
    public Doctor() {
        initComponents();
        this.setLocationRelativeTo(null);
        tabledoctorcitas();
        
    }

    private void tabledoctorcitas() {
        modelodoctor.addColumn("Fecha");
        modelodoctor.addColumn("Hora Inicial");
        modelodoctor.addColumn("Modalidad");
        modelodoctor.addColumn("Fecha y Hora\nConfirmacion");
        modelodoctor.addColumn("Asunto");
        modelodoctor.addColumn("Paciente");
        modelodoctor.addColumn("Contrato");
        modelodoctor.addColumn("Procedimiento");
        modelodoctor.addColumn("Tipo de Historia");
        tabladoctor.setModel(modelodoctor);
        tabladoctor.getColumnModel().getColumn(0).setWidth(120);
        tabladoctor.getColumnModel().getColumn(0).setMinWidth(120);
        tabladoctor.getColumnModel().getColumn(0).setMaxWidth(120);
        tabladoctor.getColumnModel().getColumn(1).setWidth(120);
        tabladoctor.getColumnModel().getColumn(1).setMinWidth(120);
        tabladoctor.getColumnModel().getColumn(1).setMaxWidth(120);
        JTableHeader header = tabladoctor.getTableHeader();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        fechaA = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fechaA2 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladoctor = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaDiagnostico = new javax.swing.JTextArea();
        panelHistorias = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        panelExamenes = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jsCantidadMedicamento = new javax.swing.JSpinner();
        jLabel35 = new javax.swing.JLabel();
        btnAddMedicamento = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblPlaquetas = new javax.swing.JLabel();
        lblColesterol = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        fechaA4 = new com.toedter.calendar.JDateChooser();
        fechaA3 = new com.toedter.calendar.JDateChooser();
        jTextField6 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelBtnExit = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(10, 92, 184));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Diagnosticos, revision detal ...");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 350, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/visita-al-doctor.png"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 80, 70));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dentista.png"))); // NOI18N
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 80, 70));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estetoscopio.png"))); // NOI18N
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 70, 70));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equipo-medico.png"))); // NOI18N
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 80, 60));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Tu salud es la nuestra");
        jPanel3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 270, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1320, 130));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ATENDIENDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(fechaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Agenda Medica");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Medico:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("CARLOS MARRUGO VARGAS");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 240, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Estado de Atencion:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 170, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Fecha Inicial:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 110, -1));
        jPanel4.add(fechaA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 150, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Fecha Final:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 110, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por Atender", "Pendientes", "Listas", "Eliminadas" }));
        jComboBox1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 40, 140, -1));

        tabladoctor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tabladoctor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabladoctor);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 930, 370));

        jTabbedPane1.addTab("AGENDA MEDICA", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Diagnostico");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        areaDiagnostico.setColumns(20);
        areaDiagnostico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        areaDiagnostico.setRows(5);
        jScrollPane2.setViewportView(areaDiagnostico);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 320, 240));

        panelHistorias.setBackground(new java.awt.Color(51, 51, 255));
        panelHistorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelHistoriasMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Historia Clinica");

        javax.swing.GroupLayout panelHistoriasLayout = new javax.swing.GroupLayout(panelHistorias);
        panelHistorias.setLayout(panelHistoriasLayout);
        panelHistoriasLayout.setHorizontalGroup(
            panelHistoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelHistoriasLayout.setVerticalGroup(
            panelHistoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(panelHistorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 40));

        panelExamenes.setBackground(new java.awt.Color(51, 51, 255));
        panelExamenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelExamenesMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Examenes");

        javax.swing.GroupLayout panelExamenesLayout = new javax.swing.GroupLayout(panelExamenes);
        panelExamenes.setLayout(panelExamenesLayout);
        panelExamenesLayout.setHorizontalGroup(
            panelExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExamenesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelExamenesLayout.setVerticalGroup(
            panelExamenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExamenesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(panelExamenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 150, 40));

        btnFinalizar.setBackground(new java.awt.Color(51, 51, 255));
        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        jPanel6.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 110, 40));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Ordenes externas");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(200, 200, 200)
                .addComponent(jLabel5)
                .addGap(39, 39, 39))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addGap(38, 38, 38))
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 370, 120));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Medicamentos");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Cant...");

        jsCantidadMedicamento.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Nombre");

        btnAddMedicamento.setBackground(new java.awt.Color(51, 51, 255));
        btnAddMedicamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMedicamento.setText("Agregar");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/medicamento.png"))); // NOI18N

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jsCantidadMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel34)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btnAddMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel34)
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsCantidadMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddMedicamento)
                .addContainerGap())
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 370, 160));

        jTabbedPane1.addTab("DIAGNOSTICO", jPanel6);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPlaquetas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel5.add(lblPlaquetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 70, 25));

        lblColesterol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel5.add(lblColesterol, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 70, 25));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 255));
        jLabel46.setText("Identificacion:");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, -1));

        jComboBox2.setBackground(new java.awt.Color(0, 0, 0, 0));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC - Cedula de Ciudadania", "IT - Tarjeta de Identidad" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 240, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 255));
        jLabel42.setText("Nombre:");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel8.setText("CARLOS JOSE GARCIA ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 180, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 255));
        jLabel44.setText("Correo:");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel9.setText("DIRRECION Y TELEFONO");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 200, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 255));
        jLabel45.setText("Contrato:");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel17.setText("2 RIESGOS CARDIOVASCULAR");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 250, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 255));
        jLabel53.setText("EXAMEN FISICO");
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel21.setText("2 RIESGOS CARDIOVASCULAR");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 250, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 255));
        jLabel48.setText("Dia Nacimiento:");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 255));
        jLabel49.setText("Fecha Nacimiento:");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 255));
        jLabel47.setText("Numero:");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 80, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.setEnabled(false);
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 160, -1));

        fechaA4.setEnabled(false);
        jPanel2.add(fechaA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 160, 30));

        fechaA3.setEnabled(false);
        jPanel2.add(fechaA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 160, 30));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField6.setEnabled(false);
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 120, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 255));
        jLabel43.setText("Hora Atencion:");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 130, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 255));
        jLabel52.setText("Tipo de sangre:");
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 130, -1));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 255));
        jLabel51.setText("Edad: ");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setEnabled(false);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, 50, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 255));
        jLabel50.setText("Sexo:");
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, -1, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField5.setEnabled(false);
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, 130, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField7.setEnabled(false);
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 30, 50, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 80, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagnostico.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 350, 150, 140));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 255));
        jLabel55.setText("Contrato:");
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, -1));

        jScrollPane3.setViewportView(jPanel2);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 490));

        jTabbedPane1.addTab("ATENCION", jPanel5);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1320, 520));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Graphicloads-Medical-Health-Heart-beat.48.png"))); // NOI18N
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("CarjeSalud");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 170, -1));

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

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel54.setText("X");
        panelBtnExit.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        jPanel1.add(panelBtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, 40, 30));

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

    private void panelHistoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHistoriasMouseClicked
        
    }//GEN-LAST:event_panelHistoriasMouseClicked

    private void panelExamenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExamenesMouseClicked
        
    }//GEN-LAST:event_panelExamenesMouseClicked

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void panelBtnExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnExitMouseMoved
        panelBtnExit.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_panelBtnExitMouseMoved

    private void panelBtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnExitMouseClicked
        exit(0);
    }//GEN-LAST:event_panelBtnExitMouseClicked

    private void panelBtnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBtnExitMouseExited
        panelBtnExit.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_panelBtnExitMouseExited

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDiagnostico;
    private javax.swing.JButton btnAddMedicamento;
    private javax.swing.JButton btnFinalizar;
    private com.toedter.calendar.JDateChooser fechaA;
    private com.toedter.calendar.JDateChooser fechaA2;
    private com.toedter.calendar.JDateChooser fechaA3;
    private com.toedter.calendar.JDateChooser fechaA4;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JSpinner jsCantidadMedicamento;
    private javax.swing.JLabel lblColesterol;
    private javax.swing.JLabel lblPlaquetas;
    private javax.swing.JPanel panelBtnExit;
    private javax.swing.JPanel panelExamenes;
    private javax.swing.JPanel panelHistorias;
    private javax.swing.JTable tabladoctor;
    // End of variables declaration//GEN-END:variables
}
