package memoria;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Paginacion extends javax.swing.JFrame {

    Hashtable<Integer, Integer> v_tiempo = new Hashtable<Integer, Integer>();
    Vector<Integer> v_marco = new Vector<Integer>();
    Vector<Integer> v_Proc_pendientes = new Vector<Integer>();
    Vector<Integer> v_Pags_proc = new Vector<Integer>();
    static Integer cero = new Integer(0);
    static Integer uno = new Integer(1);
    int nveces = 0;
    int pos_tabla_pag = 0;
    String PTexEntra;
    String PTexSale;
    String PTexTiempo;
    String PTexBoton = "";
    Integer TiempoAcumulado = cero;

    public Paginacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setTitle("Paginación");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(251, 249, 252));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ingresar Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Book Antiqua", 1, 15), new java.awt.Color(51, 51, 51))); // NOI18N

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(241, 252, 243));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", new Integer(12), new Integer(4), null},
                {"", new Integer(30), new Integer(6), null},
                {null, new Integer(15), new Integer(3), null},
                {null, new Integer(46), new Integer(6), null},
                {null, new Integer(80), new Integer(9), null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Proceso", "Tamaño(Kb)", "T. Permanencia", "#Páginas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(20);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        jTable1.getColumnModel().getColumn(3).setMinWidth(40);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(60);

        jTextField2.setText("8");

        jTextField1.setText("4");

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Marcos Del S.O:");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Tamaño De Página");

        jTextField3.setText("128");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Tamaño Memoria Física");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("N° De Procesos");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(5), Integer.valueOf(0), null, Integer.valueOf(1)));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(254, 247, 246));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()), "Solución", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 1, 15), new java.awt.Color(51, 51, 51))); // NOI18N

        jTable2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "N° Página", "N° Marco", "Proceso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Memoria Física", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(153, 102, 0))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Tabla De Páginas:");

        jButton1.setBackground(new java.awt.Color(237, 237, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Procesar...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton3.setText("Limpiar todo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "},
                {null, null, " "}
            },
            new String [] {
                "N° Página", "N° Marco", "Proceso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.removeAll();
        clear();
        Paginacion_();
        if (nveces == 0) {
            jButton1.setText(PTexTiempo + "0" + PTexEntra);
        } else {
            jButton1.setText(PTexTiempo + PTexEntra + PTexSale);
        }
        nveces += 1;
        InsertarMarcos(60, 0, jPanel1);
        ObteniendoPaginasTabla();
        InsertandoMarcosNulos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTable3.setVisible(false);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (int i = 0; i < Integer.parseInt(String.valueOf(jSpinner1.getValue())); i++) {
            jTable1.setValueAt("Proc" + (i + 1), i, 0);
       ArrayList<Integer> a= new ArrayList<Integer>();

        }
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        v_tiempo.clear();
        v_marco.clear();
        v_Proc_pendientes.clear();
        v_Pags_proc.clear();
        cero = new Integer(0);
        uno = new Integer(1);
        nveces = 0;
        pos_tabla_pag = 0;
        PTexBoton = "";
        TiempoAcumulado = cero;
        jPanel1.removeAll();
        clear();
        jButton1.setEnabled(false);
        for (int i = 0; i < n_procesos(); i++) {
            jTable1.setValueAt(null, i, 3);
        }
        for (int i = 0; i < jTable2.getRowCount(); i++) {
            jTable2.setValueAt(" ", i, 0);
            jTable2.setValueAt(" ", i, 1);
            jTable2.setValueAt(" ", i, 2);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    public Integer Marcos_so() {
        return Integer.valueOf(jTextField1.getText());
    }

    public Integer TamañoPag() {
        return Integer.valueOf(jTextField2.getText());
    }

    public Integer TamañoMem() {
        return Integer.valueOf(jTextField3.getText());
    }

    public Integer Nmarcos() {
        return (TamañoMem() / TamañoPag());
    }

    public int n_procesos() {
        return Integer.parseInt(String.valueOf(jSpinner1.getValue()));
    }

    public Integer SumaTiempo() {
        Integer suma = new Integer(0);
        for (int j = 0; j < n_procesos(); j++) {
            suma = suma + Integer.parseInt(String.valueOf(jTable1.getValueAt(j, 1)));
        }
        return suma;
    }

    public void Paginacion_() {
        PTexSale = "  Sale el proceso: ";
        PTexTiempo = "  En el tiempo T=";
        //empezamos a llenar la tabla de paginas como es la primera
        ///Como es la primera vez quedaran pendientes los proceso q tengan # de paginas mayor a los marcos disponibles
        if (nveces == 0) {
            for (Integer i = Marcos_so(); i < Nmarcos(); i++) {
                v_marco.add(i);
            }
            for (int i = 0; i < n_procesos(); i++) {
                v_Proc_pendientes.add(Integer.parseInt(String.valueOf(jTable1.getValueAt(i, 1))));
            }
            for (int j = 0; j < n_procesos(); j++) {//guradando el numero de maginas q necesita cada proceso
                Double tamaño_proc, tamaño_pag, ceil;
                tamaño_proc = Double.parseDouble(String.valueOf(jTable1.getValueAt(j, 1)));
                tamaño_pag = TamañoPag().doubleValue();
                ceil = Math.ceil(tamaño_proc / tamaño_pag);
                v_Pags_proc.add(ceil.intValue());
            }
            for (int i = 0; i < v_Pags_proc.size(); i++) {
                jTable1.setValueAt(v_Pags_proc.get(i), i, 3);
            }
        }
        //*******************************************************************************************************************
        if (nveces > 0) {
            v_marco = EliminarOcupados(v_marco);
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////
            //Hallamos el menor tiempo (Proceso q abandora la memoria)
            //los procesos q no son cero falatn entra en la memoria
            //los marcos q no son cero estan libres
            Enumeration<Integer> e = v_tiempo.keys();
            Integer min = new Integer(100000);
            while (e.hasMoreElements()) {
                Integer indice = e.nextElement();
                if (v_tiempo.get(indice) < min && v_tiempo.get(indice) > cero) {
                    min = v_tiempo.get(indice);
                }
            }
            Hashtable<Integer, Integer> tiempos_temporales = new Hashtable<Integer, Integer>();
            Enumeration<Integer> temp = v_tiempo.keys();
            while (temp.hasMoreElements()) {
                Integer i = temp.nextElement();
                if (v_tiempo.get(i).equals(min)) {
                    tiempos_temporales.put(i, v_tiempo.get(i));
                    PTexSale = PTexSale + (i) + ", ";
                }
                if (v_tiempo.get(i) > cero) {
                    v_tiempo.put(i, v_tiempo.get(i) - min);
                }
            }
            TiempoAcumulado = TiempoAcumulado + min;
            //ya tenemos el menor tiempo ahora  volvemos a recorrer los tiempos del vector  v_tiempo
            //comparandolo con el menor tiempo hallado (por si es q hubiera varios tiempos de permanencia iguales)
            //y vamos sacando a los procesos correspondientes y liberando marcos
            //copiamos en una tabla temporal  jtable2 los proceso q aun estan ocuando marcos
            PTexTiempo = PTexTiempo + TiempoAcumulado + " ";
            int pos_tabla_temp = 0;
            Integer FilasNoNulas = Nmarcos() - Marcos_so() - v_marco.size();
            for (int j = 0; j < FilasNoNulas.intValue(); j++) {//recorriendo la tabala 2
                String temp1 = String.valueOf(jTable2.getValueAt(j, 2)).substring(4);
                if (!tiempos_temporales.containsKey(Integer.parseInt(temp1))) {
                    TablaPagina(pos_tabla_temp, Integer.parseInt(String.valueOf(jTable2.getValueAt(j, 0))), Integer.parseInt(String.valueOf(jTable2.getValueAt(j, 1))), String.valueOf(jTable2.getValueAt(j, 2)), jTable3);
                    pos_tabla_temp++;
                    //v_marco.add(Integer.parseInt(String.valueOf(jTable2.getValueAt(j,1))));
                } else {
                    v_marco.add(Integer.parseInt(String.valueOf(jTable2.getValueAt(j, 1))));
                }
            }
            tiempos_temporales.clear();
            //vaciamos la tabla de paginas de paginas y copiamos los datos de la tabla temporal a esta, y guardamos la posision
            //desde donde se volveran a copiar los datos, hecho esto vaciamos tambien la tabal temporal
            for (int i = 0; i < jTable2.getRowCount(); i++) {
                jTable2.setValueAt(" ", i, 0);
                jTable2.setValueAt(" ", i, 1);
                jTable2.setValueAt(" ", i, 2);
            }
            pos_tabla_pag = 0;
            for (int j = 0; j < Nmarcos() - Marcos_so() - v_marco.size(); j++) {

                TablaPagina(j, Integer.parseInt(String.valueOf(jTable3.getValueAt(j, 0))), Integer.parseInt(String.valueOf(jTable3.getValueAt(j, 1))), String.valueOf(jTable3.getValueAt(j, 2)), jTable2);
                pos_tabla_pag = j + 1;
            }
            jTable3.removeRowSelectionInterval(0, 39);
        }
//*******************************************************************************************************************
        PTexEntra = "  Entra el proceso: ";
        for (int i = 0; i < v_Pags_proc.size(); i++) {
            if (!v_Proc_pendientes.get(i).equals(cero)) {///ocupara marcos los proceso diferentes de cero
                if (v_Pags_proc.get(i).intValue() <= MarcosDisponibles(v_marco).intValue()) {
                    PTexEntra = PTexEntra + (i + 1) + ", ";
                    Integer cont = 0;
                    int n_paginas = v_Pags_proc.get(i).intValue();
                    for (int j = 0; j < v_marco.size(); j++) {
                        if (!v_marco.get(j).equals(cero)) {
                            TablaPagina(pos_tabla_pag, cont, v_marco.get(j), "Proc" + (i + 1), jTable2);
                            pos_tabla_pag++;
                            v_marco.set(j, cero);///marco ocupado su valor cera cero
                            cont++;
                            if (cont == n_paginas) {
                                //v_tiempo.add(Integer.parseInt(String.valueOf(jTable1.getValueAt(i,2))));
                                //aca estuvo el error
                                v_tiempo.put(Integer.parseInt(String.valueOf(jTable1.getValueAt(i, 0)).substring(4)), Integer.parseInt(String.valueOf(jTable1.getValueAt(i, 2))));
                                v_Proc_pendientes.set(i, cero);//proceso qque ya ocupo memoria,
                                break;
                            }
                        }
                    }
                }
            }
        }

//*******************************************************************************************************************
        if (PTexEntra.equals("  Entra el proceso: ")) {
            PTexEntra = "";
        } else {
            PTexEntra = PTexEntra.substring(0, PTexEntra.length() - 2) + " ";
        }
        if (PTexSale.equals("  Sale el proceso: ")) {
            PTexSale = "";
        } else {
            PTexSale = PTexSale.substring(0, PTexSale.length() - 2) + " ";
        }
        if (TiempoAcumulado >= new Integer(100000)) {
            PTexTiempo = "Terminó Todo...";
            jButton1.setEnabled(false);
        }
    }

    public Vector<Integer> EliminarOcupados(Vector<Integer> v_marco) {
        for (int i = 0; i < v_marco.size(); i++) {
            if (v_marco.get(i).equals(cero)) {
                v_marco.remove(i);
                i--;
            }
        }
        return v_marco;
    }

    public Integer MarcosDisponibles(Vector<Integer> marco) {
        Integer cont = cero;
        for (Integer o : marco) {
            if (!o.equals(cero)) {
                cont += uno;
            }
        }
        return cont;

    }

    public void TablaPagina(int i, Integer pagina, Integer marco, String proceso, JTable jTable) {
        jTable.setValueAt(pagina, i, 0);
        jTable.setValueAt(marco, i, 1);
        jTable.setValueAt(proceso, i, 2);
    }

    public void InsertarMarcos(int x, int y, JPanel jPanel) {
        for (int i = Marcos_so(); i <= Nmarcos() + 1; i++) {
            y = y + 20;
            JTextField txt = new JTextField();
            //JLabel lbl=new JLabel();
            JLabel marco = new JLabel();
            JSeparator separador = new JSeparator();

            separador.setSize(100, 2);
            //lbl.setSize(30,10);
            marco.setSize(45, 10);
            txt.setBackground(Color.yellow);
            txt.setSize(100, 30 - 5);
            separador.setLocation(x, y);
            separador.setBackground(Color.black);
            if (i == Nmarcos() + 1) {
                jPanel.add(separador);
                continue;
            }
            if (i == Marcos_so()) {//Particion del S.O
                txt.setSize(100, 30 + 10);
                jPanel.add(txt);
                txt.setLocation(x, y + 2);
                txt.setText("             S.O");
                //jPanel.add(lbl);
                //lbl.setLocation(x+105,y+30-5);
                y = y + 2;
            } else {
                jPanel.add(marco);
                marco.setLocation(x - 47, y + 28 - 2);
                marco.setText("Marco #" + String.valueOf(i - 1));
                marco.setFont(new java.awt.Font("Arial", 1, 9));
                // jPanel.add(lbl);
                // lbl.setLocation(x+105,y+30+2);
            }
            jPanel.add(separador);
            //lbl.setText(String.valueOf(i)) ;
        }
        //ultimo separador
        JSeparator separador = new JSeparator();
        y = y + 20;
        separador.setSize(100, 2);
        separador.setLocation(x, y);
        separador.setBackground(Color.black);
        jPanel.add(separador);
    }

    void InsertandoMarcosNulos() {
        for (Integer marco : v_marco) {//for each
            Dibujando("", marco - 4, jPanel1);
        }
    }

    public void ObteniendoPaginasTabla() {
        // JOptionPane.showMessageDialog(null,Nmarcos().intValue()-Marcos_so().intValue()-v_marco.size(),"Alerta",1);
        for (int i = 0; i < jTable2.getRowCount(); i++) {
            if (!jTable2.getValueAt(i, 2).toString().equals(" ")) {
                Dibujando("      Pág#" + jTable2.getValueAt(i, 0) + "   " + jTable2.getValueAt(i, 2), Integer.parseInt(String.valueOf(jTable2.getValueAt(i, 1))) - Marcos_so(), jPanel1);
            } else {
                break;
            }
        }
    }

    public void Dibujando(String pagina, int indice, JPanel jPanel) {
        indice = 44 + 20 * indice;
        int x = 60;
        JTextField txt;
        txt = new JTextField();
        txt.setSize(100, 18);
        txt.setLocation(x, indice + 20);
        txt.setText(pagina);
        txt.setFont(new java.awt.Font("Arial", 1, 9));
        jPanel.add(txt);
        txt.setEditable(false);
    }

    public void clear() {
        if (jPanel1 != null) {
            Graphics gr = jPanel1.getGraphics();
            repaint();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
