package progra2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import progra2.desfragmentacion;
        
public class ventana extends javax.swing.JFrame {

    public static ArrayList<String> mem_virtual = new ArrayList<String>();
    public static ArrayList<String> mem_fisica = new ArrayList<String>();
    public static ArrayList<String> valores = new ArrayList<String>();
    
    public ventana() {
        initComponents();
        fetch_policy.add(demand);
        fetch_policy.add(prepaging);
        placement_policy.add(First);
        placement_policy.add(Next);
        replacement_policy.add(lru);
        replacement_policy.add(fifo);
        replacement_policy.add(mru);
        replacement_policy.add(clock);
        resident_set.add(fixed);
        resident_set.add(variable);
        replacement_scope.add(global);
        replacement_scope.add(local);
        cleaning_policy.add(demand_cleaning);
        cleaning_policy.add(precleaning);
        opcion_fp.add(FIFO2);
        opcion_fp.add(prioridad);
        jPanel1.setToolTipText("<html>"
                              + "Fetch Policy."
                              +"<br>"
                              +"Demand: trae las páginas solamente cuando una referencia es hecha a una dirección en la página."
                              +"<br>"
                              + "Prepaging: trae más páginas que las necesarias."
                         + "</html>");
        jPanel3.setToolTipText("<html>"
                              + "Replacement Policy." +"<br>"
                              + "LRU:la página menos recientemente usada será reemplazada." +"<br>"
                              + "FIFO: la página que primero entró será reemplazada." +"<br>"
                              + "MRU: la página más recientemente usada será reemplazada" + "<br>"
                              + "Clock: hace reemplazos de página cada cierto tiempo." 
                         + "</html>");
        jPanel5.setToolTipText("<html>"
                              + "Replacement Scope."
                              +"<br>"
                              +"Global: hace el reemplazo en cualquier frame disponible."
                              +"<br>"
                              + "Local: hace el reemplazo únicamente en los frames de ese proceso."
                         + "</html>");
        jPanel7.setToolTipText("<html>"
                              + "Grado de Multiprogramación."
                              +"<br>"
                              +"Cantidad de procesos que se van a considerar. "
                         + "</html>");
        jPanel2.setToolTipText("<html>"
                              + "Placement Policy."
                              +"<br>"
                              + "First Available: busca el primer espacio disponible en la memoria física."
                              +"<br>"
                              + "Next Available: busca el siguiente espacio disponible en la memoria física."
                         + "</html>");
        jPanel4.setToolTipText("<html>"
                              + "Resident Set Management. "
                              +"<br>"
                              + "Fixed: es el número de frames fijos asignados a un proceso."
                              +"<br>"
                              + "Variable: es el número de frames asignados a un proceso que evoluciona con las necesidades de memoria del proceso."
                         + "</html>");
        jPanel6.setToolTipText("<html>"
                              + "Cleaning Policy. "
                              +"<br>"
                              + "Demand: una página se escribe a memoria física solo cuando se ha seleccionado para un reemplazo."
                              +"<br>"
                              + "Pre-cleaning: se escribe las páginas modificadas antes de que sus frames de páginas se necesiten."
                         + "</html>");
        jLabel3.setToolTipText("Cantidad de memoria física que estará disponible para los procesos.");
        jLabel5.setToolTipText("Cantidad de memoria virtual que estará disponible para los procesos.");
        jLabel6.setToolTipText("Tamaño que tendrán las páginas de cada proceso.");
        jLabel7.setToolTipText("Tamaño que tendrán las direcciones de cada proceso.");
        crear.setToolTipText("Botón para cargar los procesos junto a la información seleccionada.");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        fetch_policy = new javax.swing.ButtonGroup();
        placement_policy = new javax.swing.ButtonGroup();
        replacement_policy = new javax.swing.ButtonGroup();
        resident_set = new javax.swing.ButtonGroup();
        replacement_scope = new javax.swing.ButtonGroup();
        cleaning_policy = new javax.swing.ButtonGroup();
        opcion_fp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        demand = new javax.swing.JRadioButton();
        prepaging = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        First = new javax.swing.JRadioButton();
        Next = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        lru = new javax.swing.JRadioButton();
        fifo = new javax.swing.JRadioButton();
        mru = new javax.swing.JRadioButton();
        clock = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fixed = new javax.swing.JRadioButton();
        variable = new javax.swing.JRadioButton();
        text_fijo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        texto_max = new javax.swing.JTextField();
        texto_crecim = new javax.swing.JTextField();
        texto_min = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        global = new javax.swing.JRadioButton();
        local = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        demand_cleaning = new javax.swing.JRadioButton();
        precleaning = new javax.swing.JRadioButton();
        texto_precl = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        texto_grado = new javax.swing.JTextField();
        FIFO2 = new javax.swing.JRadioButton();
        prioridad = new javax.swing.JRadioButton();
        crear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        m_virtual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t_pags = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t_direc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        offset = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        m_fisica = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fetch Policy"));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        demand.setText("Demand");

        prepaging.setText("Prepaging");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(demand)
                    .addComponent(prepaging))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(demand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prepaging)
                .addGap(15, 15, 15))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Placement Policy"));

        First.setText("First available");

        Next.setText("Next available");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(First)
                    .addComponent(Next))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(First)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Replacement Policy"));

        lru.setText("LRU");

        fifo.setText("FIFO");

        mru.setText("MRU");
        mru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mruActionPerformed(evt);
            }
        });

        clock.setText("Clock");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lru)
                    .addComponent(fifo)
                    .addComponent(mru)
                    .addComponent(clock))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lru)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fifo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mru)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                .addComponent(clock))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resident Set Management"));

        jLabel1.setText("Size");

        fixed.setText("Fixed");

        variable.setText("Variable");

        jLabel8.setText("Minimo");

        jLabel9.setText("Maximo");

        jLabel10.setText("Crecimiento");

        texto_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_minActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto_max, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(texto_min, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_crecim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(variable)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(fixed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_fijo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fixed)
                    .addComponent(text_fijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(variable)
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(texto_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(texto_max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(texto_crecim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Replacement Scope"));

        global.setText("Global");

        local.setText("Local");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(global)
                    .addComponent(local))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(global)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(local)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Cleaning Policy"));

        demand_cleaning.setText("Demand");

        precleaning.setText("Pre-cleaning");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(demand_cleaning)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(precleaning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto_precl, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(demand_cleaning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precleaning)
                    .addComponent(texto_precl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Load Control"));

        jLabel2.setText("Degree of Multiprogramming ");

        FIFO2.setText("FIFO");

        prioridad.setText("Prioridad");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FIFO2)
                    .addComponent(prioridad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(texto_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(FIFO2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(prioridad))
        );

        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        jLabel5.setText("Memoria virtual disponible:");

        jLabel6.setText("Tamaño de páginas:");

        jLabel7.setText("Tamaño de direcciones:");

        jLabel11.setText("bits");

        jLabel12.setText("offset");

        jLabel3.setText("Memoria física disponible:");

        jLabel13.setText("Kb");

        jLabel14.setText("Kb");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)))))
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(m_fisica, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(m_virtual, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel14))
                                    .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(offset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12))
                                    .addComponent(t_pags, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(t_direc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)))
                        .addGap(20, 72, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m_fisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(m_virtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_pags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(t_direc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(offset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.getAccessibleContext().setAccessibleName("Resident Set Management");

        pack();
    }// </editor-fold>                        

    private void mruActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {                                      
                
        String direc = t_direc.getText();
        String pags = t_pags.getText();
        String fijo = text_fijo.getText();
        String grado = texto_grado.getText();
        String preclean = texto_precl.getText();
        String fisica = m_fisica.getText();
        String virtual = m_virtual.getText();
        String off = offset.getText();
        String min = texto_min.getText();
        String max = texto_max.getText();
        String crecim = texto_crecim.getText();

        
        
        if (demand.isSelected()) {
            //valores.add("demand"); // Añade el valor al ArrayList
        }
        if (prepaging.isSelected()) {
            //valores.add("prepaging"); 
        }
        /*if (demand.isSelected() == false && prepaging.isSelected() == false) {
            JOptionPane.showMessageDialog(null,"Debe seleccionar un método de fetch policy.");
        }*/
        if (lru.isSelected()) {
            valores.add("lru"); 
        }
        if (fifo.isSelected()) {
            valores.add("fifo"); 
        }   
        if (mru.isSelected()) {
            valores.add("mru"); 
        }      
        if (clock.isSelected()) {
            valores.add("clock"); 
        }      
        /*if (lru.isSelected() == false && fifo.isSelected() == false && mru.isSelected() == false && clock.isSelected() == false) {
            JOptionPane.showMessageDialog(null,"Debe seleccionar un método de replacement policy.");
        }*/
        if (global.isSelected()) {
            //valores.add("global"); 
        }      
        if (local.isSelected()) {
           // valores.add("local"); 
        }      
        /*if (global.isSelected() == false && local.isSelected() == false) {
            JOptionPane.showMessageDialog(null,"Debe seleccionar un método de replacement scope.");
        }*/
        if (First.isSelected()) {
           // valores.add("first"); 
        }      
        if (Next.isSelected()) {
           // valores.add("next"); 
        }  
        /*if (First.isSelected() == false && Next.isSelected() == false) {
            JOptionPane.showMessageDialog(null,"Debe seleccionar un método de placement policy.");
        }*/
        if (fixed.isSelected()) {
           // valores.add("fixed"); 
            //valores.add(fijo); 
        }      
        if (variable.isSelected()) {
           // valores.add("variable"); 
            //valores.add(min);
            //valores.add(max);
            //valores.add(crecim);
        }      
        /*if (fixed.isSelected() == false && variable.isSelected() == false) {
            JOptionPane.showMessageDialog(null,"Debe seleccionar un método de resident set management.");
        }
        if(fijo.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Debe ingresar un largo de fixed.");
        }*/
        if (demand_cleaning.isSelected()) {
           // valores.add("demand clean"); 
        }      
        if (precleaning.isSelected()) {
           // valores.add("precleaning"); 
           // valores.add(preclean);
        }      
         /*if (demand_cleaning.isSelected() == false && precleaning.isSelected() == false) {
            JOptionPane.showMessageDialog(null,"Debe seleccionar un método de cleaning policy.");
        }
        if(preclean.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Debe ingresar un tiempo para el precleaning.");
        }*/
        /*if (global.isSelected() == true && fixed.isSelected() == true) {
            JOptionPane.showMessageDialog(null,"Esta combinacion no es posible (global y fijo)");
        }
        if (local.isSelected() == true && variable.isSelected() == true) {
            JOptionPane.showMessageDialog(null,"Esta combinacion no es posible (local y variable)");
        }*/
       // valores.add(fisica);
       // valores.add(pags);
       // valores.add(direc);
       // valores.add(off);
       // valores.add(grado);
        
        mem_virtual.add(virtual);
        mem_virtual.add(pags);
        mem_virtual.add(grado);
        mem_virtual.add(fisica);
        mem_virtual.add(fijo);
        
        mem_fisica.add(fisica);
        mem_fisica.add(pags);
        
        // orden mem_virtual [tamano mem, tamano pags, grado multi]
        // orden mem_fisica [tamano mem, pags]
        
        if (FIFO2.isSelected()) {
            //valores.add("fifo"); 
        }    
        if (prioridad.isSelected()) {
            //valores.add("prioridad"); 
        }    
        /*if(fisica.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Debe ingresar una cantidad de memoria fisica.");
        }
        if(pags.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Debe ingresar un tamano de paginas.");
        }
        if(direc.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Debe ingresar un tamano de direcciones.");
        }
        if(off.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Debe ingresar un offset.");
        }
        if(grado.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Debe ingresar un grado de multiprogramacion.");
        }
        */
        /* orden de valores:
        [fetch policy, replacem policy, replacem scope, placement policy, resident set management, 
        cleaning policy, mem fisica, unidad, mem virtual, unidad, tamano pags, tamano direc, bits, offset, 
        grado multiprogramacion]
        */
        System.out.println(valores);
       // System.out.println("mem virtual:" + mem_virtual[0]);
        //System.out.println("mem fisica:" + mem_fisica[0]);
        
        Memorias pruebaMemoria =  new Memorias(Integer.parseInt(virtual), Integer.parseInt(pags), Integer.parseInt (grado), Integer.parseInt(fisica), Integer.parseInt(fijo));
         //Memorias pruebaMemoria =  new Memorias(4, 35, 3, 200, 5);
        //pruebaMemoria.imprimeTablaVirtual();
        try{
        pruebaMemoria.leerArchivo();
        }catch(Exception e)
        {
            System.out.println(e.toString());
        }
        //ventana2.RecibirLista(Memorias.memoriaVirtual);
        //desfragmentacion. ReMemorias.memoriaVirtual
        //pruebaMemoria.imprimeTablaVirtual();
        desfragmentacion ventana2 = new desfragmentacion(); 
        ventana2.RecibirLista(pruebaMemoria.devuelveMV());
        ventana2.show();
        ventana2.setLocationRelativeTo(this);
        
        
//        pruebaMemoria.recibeLista(mem_virtual);
    }                                     

    
    private void texto_minActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton FIFO2;
    private javax.swing.JRadioButton First;
    private javax.swing.JRadioButton Next;
    private javax.swing.ButtonGroup cleaning_policy;
    private javax.swing.JRadioButton clock;
    private javax.swing.JButton crear;
    private javax.swing.JRadioButton demand;
    private javax.swing.JRadioButton demand_cleaning;
    private javax.swing.ButtonGroup fetch_policy;
    private javax.swing.JRadioButton fifo;
    private javax.swing.JRadioButton fixed;
    private javax.swing.JRadioButton global;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JRadioButton local;
    private javax.swing.JRadioButton lru;
    private javax.swing.JTextField m_fisica;
    private javax.swing.JTextField m_virtual;
    private javax.swing.JRadioButton mru;
    private javax.swing.JTextField offset;
    private javax.swing.ButtonGroup opcion_fp;
    private javax.swing.ButtonGroup placement_policy;
    private javax.swing.JRadioButton precleaning;
    private javax.swing.JRadioButton prepaging;
    private javax.swing.JRadioButton prioridad;
    private javax.swing.ButtonGroup replacement_policy;
    private javax.swing.ButtonGroup replacement_scope;
    private javax.swing.ButtonGroup resident_set;
    private javax.swing.JTextField t_direc;
    private javax.swing.JTextField t_pags;
    private javax.swing.JTextField text_fijo;
    private javax.swing.JTextField texto_crecim;
    private javax.swing.JTextField texto_grado;
    private javax.swing.JTextField texto_max;
    private javax.swing.JTextField texto_min;
    private javax.swing.JTextField texto_precl;
    private javax.swing.JRadioButton variable;
    // End of variables declaration                   
}
