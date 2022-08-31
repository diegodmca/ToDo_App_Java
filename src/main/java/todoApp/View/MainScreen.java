/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package todoApp.View;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author diegocarvalho
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        decorateTableTask();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainEmptyList = new javax.swing.JPanel();
        mtpMain = new javax.swing.JPanel();
        mellcon = new javax.swing.JLabel();
        melTitle = new javax.swing.JLabel();
        melSubtitle = new javax.swing.JLabel();
        Banner = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Subtitle = new javax.swing.JLabel();
        newProjectBlock = new javax.swing.JPanel();
        npbTitle = new javax.swing.JLabel();
        npbIcon = new javax.swing.JLabel();
        newTaskBlock = new javax.swing.JPanel();
        ntbTitle = new javax.swing.JLabel();
        ntbIcon = new javax.swing.JLabel();
        listPanel = new javax.swing.JPanel();
        lpList = new javax.swing.JScrollPane();
        lb_List = new javax.swing.JList<>();
        jScrollPaneTasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();

        mainEmptyList.setBackground(new java.awt.Color(255, 255, 255));
        mainEmptyList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mtpMain.setBackground(new java.awt.Color(255, 255, 255));

        mellcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mellcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        melTitle.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        melTitle.setForeground(new java.awt.Color(0, 153, 102));
        melTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        melTitle.setText("Nenhuma tarefa por aqui :D");

        melSubtitle.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        melSubtitle.setForeground(new java.awt.Color(204, 204, 204));
        melSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        melSubtitle.setText("Clique no botão \"+\" para adicionar uma nova tarefa");

        javax.swing.GroupLayout mtpMainLayout = new javax.swing.GroupLayout(mtpMain);
        mtpMain.setLayout(mtpMainLayout);
        mtpMainLayout.setHorizontalGroup(
            mtpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mtpMainLayout.createSequentialGroup()
                .addGroup(mtpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(melSubtitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addComponent(melTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mellcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mtpMainLayout.setVerticalGroup(
            mtpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mtpMainLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(mellcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(melTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(melSubtitle)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainEmptyListLayout = new javax.swing.GroupLayout(mainEmptyList);
        mainEmptyList.setLayout(mainEmptyListLayout);
        mainEmptyListLayout.setHorizontalGroup(
            mainEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainEmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mtpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainEmptyListLayout.setVerticalGroup(
            mainEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainEmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mtpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 800));

        Banner.setBackground(new java.awt.Color(0, 153, 102));

        Title.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        Title.setText(" ToDo App");

        Subtitle.setForeground(new java.awt.Color(255, 255, 255));
        Subtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subtitle.setText("Anote tudo, não esqueça de nada");

        javax.swing.GroupLayout BannerLayout = new javax.swing.GroupLayout(Banner);
        Banner.setLayout(BannerLayout);
        BannerLayout.setHorizontalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title)
                    .addComponent(Subtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        newProjectBlock.setBackground(new java.awt.Color(255, 255, 255));
        newProjectBlock.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        npbTitle.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        npbTitle.setForeground(new java.awt.Color(0, 153, 102));
        npbTitle.setText("Projetos");

        npbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N

        javax.swing.GroupLayout newProjectBlockLayout = new javax.swing.GroupLayout(newProjectBlock);
        newProjectBlock.setLayout(newProjectBlockLayout);
        newProjectBlockLayout.setHorizontalGroup(
            newProjectBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newProjectBlockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(npbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(npbIcon)
                .addContainerGap())
        );
        newProjectBlockLayout.setVerticalGroup(
            newProjectBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newProjectBlockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newProjectBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(npbIcon)
                    .addComponent(npbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        newTaskBlock.setBackground(new java.awt.Color(255, 255, 255));
        newTaskBlock.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ntbTitle.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        ntbTitle.setForeground(new java.awt.Color(0, 153, 102));
        ntbTitle.setText("Tarefas");

        ntbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N

        javax.swing.GroupLayout newTaskBlockLayout = new javax.swing.GroupLayout(newTaskBlock);
        newTaskBlock.setLayout(newTaskBlockLayout);
        newTaskBlockLayout.setHorizontalGroup(
            newTaskBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newTaskBlockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ntbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ntbIcon)
                .addContainerGap())
        );
        newTaskBlockLayout.setVerticalGroup(
            newTaskBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newTaskBlockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newTaskBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ntbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(newTaskBlockLayout.createSequentialGroup()
                        .addComponent(ntbIcon)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        listPanel.setBackground(new java.awt.Color(255, 255, 255));
        listPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_List.setBackground(new java.awt.Color(255, 255, 255));
        lb_List.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lb_List.setForeground(new java.awt.Color(0, 0, 0));
        lb_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lb_List.setFixedCellHeight(50);
        lb_List.setSelectionBackground(new java.awt.Color(0, 153, 102));
        lb_List.setSelectionForeground(new java.awt.Color(255, 255, 255));
        lpList.setViewportView(lb_List);

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpList)
                .addContainerGap())
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpList)
                .addContainerGap())
        );

        jTableTasks.setBackground(new java.awt.Color(255, 255, 255));
        jTableTasks.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTasks.setRowHeight(50);
        jTableTasks.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jTableTasks.setShowVerticalLines(false);
        jScrollPaneTasks.setViewportView(jTableTasks);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newProjectBlock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newTaskBlock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPaneTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newProjectBlock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newTaskBlock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Banner;
    private javax.swing.JLabel Subtitle;
    private javax.swing.JLabel Title;
    private javax.swing.JScrollPane jScrollPaneTasks;
    private javax.swing.JTable jTableTasks;
    private javax.swing.JList<String> lb_List;
    private javax.swing.JPanel listPanel;
    private javax.swing.JScrollPane lpList;
    private javax.swing.JPanel mainEmptyList;
    private javax.swing.JLabel melSubtitle;
    private javax.swing.JLabel melTitle;
    private javax.swing.JLabel mellcon;
    private javax.swing.JPanel mtpMain;
    private javax.swing.JPanel newProjectBlock;
    private javax.swing.JPanel newTaskBlock;
    private javax.swing.JLabel npbIcon;
    private javax.swing.JLabel npbTitle;
    private javax.swing.JLabel ntbIcon;
    private javax.swing.JLabel ntbTitle;
    // End of variables declaration//GEN-END:variables

public void decorateTableTask(){
    
    //Customizando header da task table
    jTableTasks.getTableHeader().setFont(new Font("Serif", Font.BOLD, 14));
    jTableTasks.getTableHeader().setBackground(new Color(0, 153, 102));
    jTableTasks.getTableHeader().setForeground(new Color(255, 255, 255));
    
    // cria o sorter na coluna
    jTableTasks.setAutoCreateRowSorter(true);
    
    
    
}

}