package View;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Model.Bebida;
import Model.Comida;
import Model.Produto;

public class MainFrame extends JFrame {

    //linkar com Model bebida e comida.//
    private Bebida objBebida; 
    private Comida objComida;
    
    public MainFrame(){
       this.objBebida = new Bebida();
       this.objComida = new Comida();
       this.carregaTabela();
       iniciar();
    }


    /* Configurações da tela */

    public void iniciar() {
 
        jFrame1 = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Edit_bebida = new javax.swing.JButton();
        Nome_Bebida = new javax.swing.JTextField();
        Preco_bebida = new javax.swing.JTextField();
        Qtd_bebida = new javax.swing.JTextField();
        Add_bebida = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabela_Bebida = new javax.swing.JTable();
        Remove_bebida = new javax.swing.JButton();
        descricao_bebida = new javax.swing.JTextField();
        Add_comida = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Nome_comida = new javax.swing.JTextField();
        Preco_comida = new javax.swing.JTextField();
        Quantidade_comida = new javax.swing.JTextField();
        Editar_comida = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabela_Comida = new javax.swing.JTable();
        Remover_comida = new javax.swing.JButton();
        Descricao_comida = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(15, 4, 55));
        setPreferredSize(new java.awt.Dimension(200, 667));
        setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(15, 4, 55));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 667));
        jPanel4.setRequestFocusEnabled(false);

        jLabel4.setFont(new java.awt.Font("Z003", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(185, 21, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bebidas");

        Edit_bebida.setBackground(new java.awt.Color(15, 4, 55));
        Edit_bebida.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Edit_bebida.setForeground(new java.awt.Color(200, 200, 200));
        Edit_bebida.setText("Editar");
        Edit_bebida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));

        Nome_Bebida.setBackground(new java.awt.Color(15, 4, 55));
        Nome_Bebida.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Nome_Bebida.setForeground(new java.awt.Color(200, 200, 200));
        Nome_Bebida.setText("Item 1");
        Nome_Bebida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Nome", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Z003", 0, 18), new java.awt.Color(0, 194, 186))); // NOI18N
        Nome_Bebida.setSelectionColor(new java.awt.Color(10, 3, 36));

        Preco_bebida.setBackground(new java.awt.Color(15, 4, 55));
        Preco_bebida.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Preco_bebida.setForeground(new java.awt.Color(200, 200, 200));
        Preco_bebida.setText("1.99");
        Preco_bebida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Preco", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Z003", 0, 18), new java.awt.Color(0, 194, 186))); // NOI18N
        Preco_bebida.setSelectionColor(new java.awt.Color(10, 3, 36));

        Qtd_bebida.setBackground(new java.awt.Color(15, 4, 55));
        Qtd_bebida.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Qtd_bebida.setForeground(new java.awt.Color(200, 200, 200));
        Qtd_bebida.setText("25");
        Qtd_bebida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Qtd", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Z003", 0, 18), new java.awt.Color(0, 194, 186))); // NOI18N
        Qtd_bebida.setSelectionColor(new java.awt.Color(10, 3, 36));
        Qtd_bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Qtd_bebidaActionPerformed(evt);
            }
        });

        Add_bebida.setBackground(new java.awt.Color(10, 3, 36));
        Add_bebida.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Add_bebida.setForeground(new java.awt.Color(200, 200, 200));
        Add_bebida.setText("Adicionar Bebidas");
        Add_bebida.setToolTipText("");
        Add_bebida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        Add_bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_bebidaActionPerformed(evt);
            }
        });

        Tabela_Bebida.setAutoCreateRowSorter(true);
        Tabela_Bebida.setBackground(new java.awt.Color(10, 3, 36));
        Tabela_Bebida.setForeground(new java.awt.Color(200, 200, 200));
        Tabela_Bebida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Nome", "Descricao", "Valor", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_Bebida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabela_Bebida.setGridColor(new java.awt.Color(35, 24, 75));
        Tabela_Bebida.setName(""); // NOI18N
        Tabela_Bebida.setOpaque(false);
        Tabela_Bebida.setSelectionBackground(new java.awt.Color(15, 4, 55));
        Tabela_Bebida.setSelectionForeground(new java.awt.Color(185, 21, 204));
        Tabela_Bebida.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        Tabela_Bebida.setShowGrid(true);
        jScrollPane3.setViewportView(Tabela_Bebida);

        Remove_bebida.setBackground(new java.awt.Color(15, 4, 55));
        Remove_bebida.setForeground(new java.awt.Color(200, 200, 200));
        Remove_bebida.setText("Remover");
        Remove_bebida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));

        descricao_bebida.setBackground(new java.awt.Color(15, 4, 55));
        descricao_bebida.setForeground(new java.awt.Color(200, 200, 200));
        descricao_bebida.setText("jTextField7");
        descricao_bebida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Descricao", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Z003", 0, 18), new java.awt.Color(0, 194, 186))); // NOI18N
        descricao_bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricao_bebidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(Nome_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Preco_bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Qtd_bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Remove_bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Edit_bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Add_bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(descricao_bebida)
                            .addComponent(jScrollPane3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(descricao_bebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Qtd_bebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Preco_bebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit_bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Remove_bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel4, java.awt.BorderLayout.CENTER);

        Add_comida.setBackground(new java.awt.Color(15, 4, 55));
        Add_comida.setPreferredSize(new java.awt.Dimension(470, 667));

        jLabel5.setFont(new java.awt.Font("Z003", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(185, 21, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Comidas");

        Nome_comida.setBackground(new java.awt.Color(15, 4, 55));
        Nome_comida.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Nome_comida.setForeground(new java.awt.Color(200, 200, 200));
        Nome_comida.setText("Item 1");
        Nome_comida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Nome", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Z003", 0, 18), new java.awt.Color(0, 194, 186))); // NOI18N
        Nome_comida.setSelectionColor(new java.awt.Color(10, 3, 36));
        Nome_comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nome_comidaActionPerformed(evt);
            }
        });

        Preco_comida.setBackground(new java.awt.Color(15, 4, 55));
        Preco_comida.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Preco_comida.setForeground(new java.awt.Color(200, 200, 200));
        Preco_comida.setText("2.99");
        Preco_comida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Preco", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Z003", 0, 18), new java.awt.Color(0, 194, 186))); // NOI18N
        Preco_comida.setSelectionColor(new java.awt.Color(10, 3, 36));

        Quantidade_comida.setBackground(new java.awt.Color(15, 4, 55));
        Quantidade_comida.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Quantidade_comida.setForeground(new java.awt.Color(200, 200, 200));
        Quantidade_comida.setText("30");
        Quantidade_comida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Qtd", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Z003", 0, 18), new java.awt.Color(0, 194, 186))); // NOI18N
        Quantidade_comida.setSelectionColor(new java.awt.Color(10, 3, 36));

        Editar_comida.setBackground(new java.awt.Color(15, 4, 55));
        Editar_comida.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        Editar_comida.setForeground(new java.awt.Color(200, 200, 200));
        Editar_comida.setText("Editar");
        Editar_comida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        Editar_comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editar_comidaActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(10, 3, 36));
        jButton2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(200, 200, 200));
        jButton2.setText("Adicionar Comidas");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));

        Tabela_Comida.setAutoCreateRowSorter(true);
        Tabela_Comida.setBackground(new java.awt.Color(10, 3, 36));
        Tabela_Comida.setForeground(new java.awt.Color(200, 200, 200));
        Tabela_Comida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Nome", "Descricao", "Valor", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_Comida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabela_Comida.setGridColor(new java.awt.Color(35, 24, 75));
        Tabela_Comida.setOpaque(false);
        Tabela_Comida.setSelectionBackground(new java.awt.Color(15, 4, 55));
        Tabela_Comida.setSelectionForeground(new java.awt.Color(185, 21, 204));
        Tabela_Comida.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        Tabela_Comida.setShowGrid(true);
        jScrollPane4.setViewportView(Tabela_Comida);

        Remover_comida.setBackground(new java.awt.Color(15, 4, 55));
        Remover_comida.setForeground(new java.awt.Color(200, 200, 200));
        Remover_comida.setText("Remover");
        Remover_comida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        Remover_comida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Descricao_comida.setBackground(new java.awt.Color(15, 4, 55));
        Descricao_comida.setForeground(new java.awt.Color(200, 200, 200));
        Descricao_comida.setText("jTextField8");
        Descricao_comida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Descricao", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Z003", 0, 18), new java.awt.Color(0, 194, 186))); // NOI18N

        javax.swing.GroupLayout Add_comidaLayout = new javax.swing.GroupLayout(Add_comida);
        Add_comida.setLayout(Add_comidaLayout);
        Add_comidaLayout.setHorizontalGroup(
            Add_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_comidaLayout.createSequentialGroup()
                .addGroup(Add_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Add_comidaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(Add_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Add_comidaLayout.createSequentialGroup()
                                .addComponent(Nome_comida, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Preco_comida, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Quantidade_comida, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Add_comidaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Descricao_comida, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Add_comidaLayout.createSequentialGroup()
                        .addComponent(Editar_comida, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Remover_comida, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        Add_comidaLayout.setVerticalGroup(
            Add_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_comidaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Descricao_comida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Add_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome_comida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Preco_comida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quantidade_comida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(Add_comidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Editar_comida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Remover_comida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(Add_comida, java.awt.BorderLayout.EAST);

        jPanel3.setBackground(new java.awt.Color(10, 3, 36));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 667));

        jLabel1.setFont(new java.awt.Font("Z003", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(185, 21, 204));
        jLabel1.setText("Neon Knight Club");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setIconTextGap(5);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("NeonKnight2.png"))); // NOI18N
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2.setName(""); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel3.setFont(new java.awt.Font("Z003", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(185, 21, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("We Fight Through Dancing");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(476, Short.MAX_VALUE))
        );

        add(jPanel3, java.awt.BorderLayout.WEST);
        carregaTabela();
    }// </editor-fold>                        

    private void Nome_comidaActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void Editar_comidaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void Qtd_bebidaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void descricao_bebidaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }   

    private void Add_bebidaActionPerformed(java.awt.event.ActionEvent evt) {                                           

            
            String nome = "";
            String descricao = "";
            float valor = 0;
            int quantidadeEstoque = 0;
            
            //coleta as informações escritas
            nome = this.Nome_Bebida.getText();
            quantidadeEstoque = Integer.parseInt(this.Qtd_bebida.getText());
            descricao = this.descricao_bebida.getText();
            valor = Float.parseFloat(this.Preco_bebida.getText());

            // envia os dados para o Controlador cadastrar
            if (this.objBebida.addBebida(nome, descricao, valor, quantidadeEstoque)) {
                JOptionPane.showMessageDialog(rootPane, "Bebida cadastrada");

                // limpa campos da interface
                this.Nome_Bebida.setText("");
                this.Qtd_bebida.setText("");
                this.descricao_bebida.setText("");
                this.Preco_bebida.setText("");

            }

    }  

        @SuppressWarnings("unchecked")
        public void carregaTabela() {
        if(Tabela_Bebida!= null){    
            DefaultTableModel modelo = (DefaultTableModel) this.Tabela_Bebida.getModel();
            modelo.setNumRows(0);
            System.out.println(objBebida.getLista().size());
            System.out.println(Tabela_Bebida.getModel());
            ArrayList<Object> minhalistaBebida = new ArrayList<>();
            minhalistaBebida = objBebida.getLista();

            for (Object a : minhalistaBebida) {
                modelo.addRow(new Object[]{
                    ((Produto) a).getNome(),
                    ((Produto) a).getDescricao(),
                    ((Produto) a).getValor(),
                    ((Produto) a).getQuantidadeEstoque()
                });
        }
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Add_bebida;
    private javax.swing.JPanel Add_comida;
    private javax.swing.JTextField Descricao_comida;
    private javax.swing.JButton Edit_bebida;
    private javax.swing.JButton Editar_comida;
    private javax.swing.JTextField Nome_Bebida;
    private javax.swing.JTextField Nome_comida;
    private javax.swing.JTextField Preco_bebida;
    private javax.swing.JTextField Preco_comida;
    private javax.swing.JTextField Qtd_bebida;
    private javax.swing.JTextField Quantidade_comida;
    private javax.swing.JButton Remove_bebida;
    private javax.swing.JButton Remover_comida;
    private javax.swing.JTable Tabela_Bebida;
    private javax.swing.JTable Tabela_Comida;
    private javax.swing.JTextField descricao_bebida;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration        
}



