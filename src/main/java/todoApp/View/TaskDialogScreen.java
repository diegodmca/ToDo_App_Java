
package todoApp.View;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import todoApp.Controller.TaskController;
import todoApp.Model.Project;
import todoApp.Model.Task;

/**
 *
 * @author diegocarvalho
 */
public class TaskDialogScreen extends javax.swing.JDialog {
    
    TaskController controller;
    Project project;
    
    

    /**
     * Creates new form ProjectDialogScreen
     */
    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        hideErrorFields();
        
        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taskBanner = new javax.swing.JPanel();
        tbTitle = new javax.swing.JLabel();
        tbIcon = new javax.swing.JLabel();
        taskPanel = new javax.swing.JPanel();
        tpTitleName = new javax.swing.JLabel();
        tbNameField = new javax.swing.JTextField();
        tpTitleDescription = new javax.swing.JLabel();
        tpScrollField = new javax.swing.JScrollPane();
        tpDescriptionText = new javax.swing.JTextArea();
        tpTitleDeadline = new javax.swing.JLabel();
        tpDeadlineField = new javax.swing.JFormattedTextField();
        tpTitleNotes = new javax.swing.JLabel();
        tpScrollPaneNotes = new javax.swing.JScrollPane();
        tpScrollText = new javax.swing.JTextArea();
        jLabelNameError = new javax.swing.JLabel();
        jLabelDeadlineError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        taskBanner.setBackground(new java.awt.Color(0, 153, 102));
        taskBanner.setMinimumSize(new java.awt.Dimension(0, 475));

        tbTitle.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        tbTitle.setForeground(new java.awt.Color(255, 255, 255));
        tbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tbTitle.setText("Tarefa");

        tbIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        tbIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout taskBannerLayout = new javax.swing.GroupLayout(taskBanner);
        taskBanner.setLayout(taskBannerLayout);
        taskBannerLayout.setHorizontalGroup(
            taskBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, taskBannerLayout.createSequentialGroup()
                .addComponent(tbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321)
                .addComponent(tbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        taskBannerLayout.setVerticalGroup(
            taskBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskBannerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(taskBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        taskPanel.setBackground(new java.awt.Color(255, 255, 255));

        tpTitleName.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        tpTitleName.setForeground(new java.awt.Color(0, 0, 0));
        tpTitleName.setText("Nome");

        tbNameField.setBackground(new java.awt.Color(255, 255, 255));
        tbNameField.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        tbNameField.setForeground(new java.awt.Color(0, 0, 0));

        tpTitleDescription.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        tpTitleDescription.setForeground(new java.awt.Color(0, 0, 0));
        tpTitleDescription.setText("Descri????o");

        tpDescriptionText.setBackground(new java.awt.Color(255, 255, 255));
        tpDescriptionText.setColumns(20);
        tpDescriptionText.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        tpDescriptionText.setForeground(new java.awt.Color(0, 0, 0));
        tpDescriptionText.setRows(5);
        tpScrollField.setViewportView(tpDescriptionText);

        tpTitleDeadline.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        tpTitleDeadline.setForeground(new java.awt.Color(0, 0, 0));
        tpTitleDeadline.setText("Prazo");

        tpDeadlineField.setBackground(new java.awt.Color(255, 255, 255));
        tpDeadlineField.setForeground(new java.awt.Color(0, 0, 0));
        tpDeadlineField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        tpDeadlineField.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N

        tpTitleNotes.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        tpTitleNotes.setForeground(new java.awt.Color(0, 0, 0));
        tpTitleNotes.setText("Notas");

        tpScrollText.setBackground(new java.awt.Color(255, 255, 255));
        tpScrollText.setColumns(20);
        tpScrollText.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        tpScrollText.setRows(5);
        tpScrollPaneNotes.setViewportView(tpScrollText);

        jLabelNameError.setForeground(new java.awt.Color(255, 51, 51));
        jLabelNameError.setText("(Campo nome obrigatorio)");

        jLabelDeadlineError.setForeground(new java.awt.Color(255, 51, 51));
        jLabelDeadlineError.setText("(Campo prazo obrigatorio)");

        javax.swing.GroupLayout taskPanelLayout = new javax.swing.GroupLayout(taskPanel);
        taskPanel.setLayout(taskPanelLayout);
        taskPanelLayout.setHorizontalGroup(
            taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tpScrollPaneNotes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tpScrollField, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addComponent(tbNameField)
                    .addComponent(tpDeadlineField)
                    .addGroup(taskPanelLayout.createSequentialGroup()
                        .addGroup(taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tpTitleDescription)
                            .addGroup(taskPanelLayout.createSequentialGroup()
                                .addComponent(tpTitleDeadline)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDeadlineError, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tpTitleNotes)
                            .addGroup(taskPanelLayout.createSequentialGroup()
                                .addComponent(tpTitleName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        taskPanelLayout.setVerticalGroup(
            taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpTitleName)
                    .addComponent(jLabelNameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tpTitleDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpScrollField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpTitleDeadline)
                    .addComponent(jLabelDeadlineError))
                .addGap(3, 3, 3)
                .addComponent(tpDeadlineField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tpTitleNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpScrollPaneNotes, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(taskBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taskPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(taskBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taskPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbIconMouseClicked
        try {
            
            if(isFieldsValid()){
                
                   Task task = new Task();
            task.setIdproject(project.getId());
           
            task.setName(tbNameField.getText());
            task.setDescription(tpDescriptionText.getText());
            task.setNotes(tpScrollText.getText());
            task.setCompleted(false);
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date deadline = null;
            
            deadline = dateFormat.parse(tpDeadlineField.getText());
            
            task.setDeadline(deadline);
            controller.save(task);
            
            JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso");
            this.dispose();
            
        }else{
                
            hideErrorFields(); 
            
            if(tbNameField.getText().isEmpty()){
                jLabelNameError.setVisible(true);
            }
            if(tpDeadlineField.getText().isEmpty()){
                jLabelDeadlineError.setVisible(true);
            }
             
             
           }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
             }
        
    }//GEN-LAST:event_tbIconMouseClicked

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
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDeadlineError;
    private javax.swing.JLabel jLabelNameError;
    private javax.swing.JPanel taskBanner;
    private javax.swing.JPanel taskPanel;
    private javax.swing.JLabel tbIcon;
    private javax.swing.JTextField tbNameField;
    private javax.swing.JLabel tbTitle;
    private javax.swing.JFormattedTextField tpDeadlineField;
    private javax.swing.JTextArea tpDescriptionText;
    private javax.swing.JScrollPane tpScrollField;
    private javax.swing.JScrollPane tpScrollPaneNotes;
    private javax.swing.JTextArea tpScrollText;
    private javax.swing.JLabel tpTitleDeadline;
    private javax.swing.JLabel tpTitleDescription;
    private javax.swing.JLabel tpTitleName;
    private javax.swing.JLabel tpTitleNotes;
    // End of variables declaration//GEN-END:variables

    public void setProject(Project project) {
        this.project = project;
    }
    
    public void hideErrorFields(){
        jLabelDeadlineError.setVisible(false);
        jLabelNameError.setVisible(false);
        
    }
    
    public boolean isFieldsValid(){
       
        return (!tbNameField.getText().isEmpty())&& (!tpDeadlineField.getText().isEmpty());
    }




}
