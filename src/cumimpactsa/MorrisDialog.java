/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cumimpactsa;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author andy
 */
public class MorrisDialog extends javax.swing.JDialog {

    boolean isCanceled=true;
    MorrisFactor selectedFactor=null;
    static int sampleSize=1000;
    
    /**
     * Creates new form MorrisDialog
     */
    public MorrisDialog(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        
        //fill factor list
        updateFactorList();
        
        //update other fields
        this.textFieldFilterDistance.setText(GlobalResources.lowPassFilterDistance+"");
        this.textFieldSampleSize.setText(sampleSize+"");
        this.textFieldThreads.setText(GlobalResources.nrOfThreads+"");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listFactors = new javax.swing.JList<>();
        comboBoxAddValue = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        buttonAddLevel = new javax.swing.JButton();
        buttonRemoveLevel = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        buttonLoad = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        buttonCalculate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textFieldThreads = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldFilterDistance = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldOutputFolder = new javax.swing.JTextField();
        buttonSelectOutputFolder = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textFieldSampleSize = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jLabel1.setText("Factors and levels");

        listFactors.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listFactors.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listFactorsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listFactors);

        comboBoxAddValue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxAddValueItemStateChanged(evt);
            }
        });

        jLabel2.setText("Select level:");

        buttonAddLevel.setText("Add");
        buttonAddLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddLevelActionPerformed(evt);
            }
        });

        buttonRemoveLevel.setText("Remove");
        buttonRemoveLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveLevelActionPerformed(evt);
            }
        });

        buttonSave.setText("Save...");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonLoad.setText("Load...");
        buttonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoadActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonCalculate.setText("Calculate elementary effects...");
        buttonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateActionPerformed(evt);
            }
        });

        jLabel3.setText("Threads");

        textFieldThreads.setText("1");
        textFieldThreads.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldThreadsFocusLost(evt);
            }
        });

        jLabel4.setText("Low pass filter distance");

        textFieldFilterDistance.setText("25000");
        textFieldFilterDistance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFilterDistanceFocusLost(evt);
            }
        });

        jLabel5.setText("Output folder");

        textFieldOutputFolder.setEditable(false);

        buttonSelectOutputFolder.setText("...");
        buttonSelectOutputFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelectOutputFolderActionPerformed(evt);
            }
        });

        jLabel6.setText("Sample size");

        textFieldSampleSize.setText("100");
        textFieldSampleSize.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldSampleSizeFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboBoxAddValue, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(textFieldOutputFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonSelectOutputFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(45, 45, 45))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textFieldThreads, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(322, 322, 322)
                                    .addComponent(buttonAddLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buttonRemoveLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(textFieldFilterDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textFieldSampleSize, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxAddValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddLevel)
                    .addComponent(buttonRemoveLevel))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldOutputFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSelectOutputFolder))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldThreads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldFilterDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(textFieldSampleSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSave)
                    .addComponent(buttonLoad)
                    .addComponent(buttonCancel)
                    .addComponent(buttonCalculate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateActionPerformed
        File outputFolder = new File(this.textFieldOutputFolder.getText());
        if(!outputFolder.exists() || !outputFolder.isDirectory())
        {
            JOptionPane.showMessageDialog(this, "Please select a valid output folder.");
        }
        else
        {
            isCanceled=false;
            this.setVisible(false);
            MorrisFactor.saveFactorsToCsv(new File(outputFolder,"levels.csv").getAbsolutePath());
        }
    }//GEN-LAST:event_buttonCalculateActionPerformed

    private void listFactorsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listFactorsValueChanged
        //get factor object
        String factorString=listFactors.getSelectedValue();
        if(factorString==null) return;
        for(int i=0; i<GlobalResources.mappingProject.morrisFactors.length; i++)
        {
            if(factorString.equals(GlobalResources.mappingProject.morrisFactors[i].toString())) selectedFactor=GlobalResources.mappingProject.morrisFactors[i];
        }
        //set up combo box
        if(selectedFactor==null) return;
        else if(selectedFactor.isQualitative())
        {
            this.comboBoxAddValue.setEditable(false);
            this.comboBoxAddValue.removeAllItems();
            for(int i=0; i<selectedFactor.getNrOfPossibleLevels();i++)
            {
                comboBoxAddValue.addItem(selectedFactor.getPossibleLevels()[i]);
            }
        }
        else //quantitative
        {
            this.comboBoxAddValue.setEditable(true);
            this.comboBoxAddValue.removeAllItems();
            for(int i=0; i<selectedFactor.getLevelNames().size();i++)
            {
                comboBoxAddValue.addItem(selectedFactor.getLevelNames().get(i));
            }
        }
        
    }//GEN-LAST:event_listFactorsValueChanged

    private void comboBoxAddValueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxAddValueItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxAddValueItemStateChanged

    private void buttonAddLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddLevelActionPerformed
        if(selectedFactor==null) return;
        int index=listFactors.getSelectedIndex();
        selectedFactor.addLevel(comboBoxAddValue.getSelectedItem().toString());
        this.updateFactorList();
        listFactors.setSelectedIndex(index);
        this.update(this.getGraphics());
    }//GEN-LAST:event_buttonAddLevelActionPerformed

    private void buttonRemoveLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveLevelActionPerformed
        if(selectedFactor==null) return;
        int index=listFactors.getSelectedIndex();
        selectedFactor.removeLevel(comboBoxAddValue.getSelectedItem().toString());
        this.updateFactorList();
        listFactors.setSelectedIndex(index);
        this.update(this.getGraphics());
    }//GEN-LAST:event_buttonRemoveLevelActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setCurrentDirectory(new File(GlobalResources.lastUsedFolder));
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            MorrisFactor.saveFactorsToCsv(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void textFieldThreadsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldThreadsFocusLost
        try
        {
            int nr=Integer.parseInt(textFieldThreads.getText());
            if(nr<1 || nr>32) throw new Exception();
            GlobalResources.nrOfThreads=nr;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please enter an integer between 1 and 32.");
            textFieldThreads.setText(GlobalResources.nrOfThreads+"");
        }
    }//GEN-LAST:event_textFieldThreadsFocusLost

    private void textFieldFilterDistanceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFilterDistanceFocusLost
        try
        {
            float nr=Float.parseFloat(textFieldFilterDistance.getText());
            if(nr<0) throw new Exception();
            GlobalResources.lowPassFilterDistance=nr;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please enter a number greater than or equal to 0.");
            textFieldFilterDistance.setText(GlobalResources.lowPassFilterDistance+"");
        }
    }//GEN-LAST:event_textFieldFilterDistanceFocusLost

    private void buttonSelectOutputFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelectOutputFolderActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setCurrentDirectory(new File(GlobalResources.lastUsedFolder));
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            this.textFieldOutputFolder.setText(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_buttonSelectOutputFolderActionPerformed

    private void buttonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoadActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setCurrentDirectory(new File(GlobalResources.lastUsedFolder));
        int result = fileChooser.showOpenDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            CsvTableGeneral table = new CsvTableGeneral();
            try
            {
                table.readFromFile(selectedFile);
                MorrisFactor.setFactorLevelsFromTable(table);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Could not read CSV file: "+selectedFile.getAbsolutePath());
                GlobalResources.statusWindow.systemOutPrintln(e);
                
            }
            finally
            {
                this.updateFactorList();
            }
        }             
    }//GEN-LAST:event_buttonLoadActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void textFieldSampleSizeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldSampleSizeFocusLost
       try
        {
            int nr=Integer.parseInt(textFieldSampleSize.getText());
            if(nr<1) throw new Exception();
            sampleSize=nr;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please enter an integer greater than 0.");
            this.textFieldSampleSize.setText(sampleSize+"");
        }
    }//GEN-LAST:event_textFieldSampleSizeFocusLost

    public boolean isCanceled()
    {
        return isCanceled;
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
            java.util.logging.Logger.getLogger(MorrisDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MorrisDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MorrisDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MorrisDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MorrisDialog dialog = new MorrisDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonAddLevel;
    private javax.swing.JButton buttonCalculate;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonLoad;
    private javax.swing.JButton buttonRemoveLevel;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSelectOutputFolder;
    private javax.swing.JComboBox<String> comboBoxAddValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listFactors;
    private javax.swing.JTextField textFieldFilterDistance;
    private javax.swing.JTextField textFieldOutputFolder;
    private javax.swing.JTextField textFieldSampleSize;
    private javax.swing.JTextField textFieldThreads;
    // End of variables declaration//GEN-END:variables

    private void updateFactorList() 
    {
        DefaultListModel model = new DefaultListModel();
        for(int i=0; i<GlobalResources.mappingProject.morrisFactors.length; i++) {model.addElement(GlobalResources.mappingProject.morrisFactors[i].toString());}
        this.listFactors.setModel(model);
    }

    public int getSampleSize() 
    {
        return sampleSize;
    }

    public String getOutputFolder() 
    {
        return this.textFieldOutputFolder.getText();
    }
}
