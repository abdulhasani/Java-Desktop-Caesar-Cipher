/*
 * |----------------JMat (Java Master)-------------------------------------|
 * |Setiap Manusia Yang Menata Hidupnya adalah Programmer                  |
 * |Hak Cipta Hanya Milik Allah SWT, Hamba-Nya Hanya Memanfaatkan.         |
 * |Manusia Tidak Bisa Mewujudkan Apa-apa, Manusia Hanya Bisa Merencanakan.| 
 * |----------------JMat (Java Master)-------------------------------------| 
 */
package san.jmat.panel.render;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import san.jmat.frame.Program;

/**
 *
 * @author joker
 */
public class panel extends javax.swing.JPanel {

    /**
     * Creates new form panel
     */
    private Program program;
    private final String[] plainText = {
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
        "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
        "W", "X", "Y", "Z", "A", "B", "C"
    };
    private final int pPlainText=plainText.length;
    private ArrayList enkrip;
    private ArrayList dekrip;
    public panel() {
        initComponents();
        enkrip=new ArrayList();
        dekrip=new ArrayList();
    }
    private ArrayList Enkripsi(){
        ArrayList temp=null;
        String text = areaPlaintext.getText();
        if(!text.trim().isEmpty()){
            temp=new ArrayList();
          for(int i=0;i<text.length();i++){
             temp.add(text.charAt(i));
          }
        }
        return temp;
    }
    private ArrayList Dekripsi(){
        ArrayList temp=null;
        String text = areaCihpertext.getText(); 
        if(!text.trim().isEmpty()){
            temp=new ArrayList();
            for(int i=0;i<text.length();i++){
                temp.add(text.charAt(i));
            }
        }
        return temp; 
    }

    public void setProgram(Program program) {
        this.program = program;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelKupu1 = new san.jmat.panel.render.PanelKupu();
        lblJudul = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaCihpertext = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaPlaintext = new javax.swing.JTextArea();
        buttonDekripsi1 = new san.jmat.button.render.ButtonDekripsi();
        buttonEnkripsi1 = new san.jmat.button.render.ButtonEnkripsi();
        btnClearPlaintext = new san.jmat.button.render.ButtonClear();
        btnClearCihpertext = new san.jmat.button.render.ButtonClear();
        buttonAbout1 = new san.jmat.button.render.ButtonAbout();

        setLayout(new java.awt.BorderLayout());

        lblJudul.setFont(new java.awt.Font("Nakula", 0, 36)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(60, 55, 234));
        lblJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJudul.setText("CAESAR CIPHER");

        jScrollPane1.setBackground(java.awt.Color.lightGray);
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ciphertext :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Salem", 3, 14), java.awt.Color.blue)); // NOI18N
        jScrollPane1.setForeground(java.awt.Color.gray);

        areaCihpertext.setBackground(java.awt.Color.darkGray);
        areaCihpertext.setColumns(20);
        areaCihpertext.setForeground(java.awt.Color.red);
        areaCihpertext.setLineWrap(true);
        areaCihpertext.setRows(5);
        areaCihpertext.setToolTipText("Masukkan Kata atau Kalimat Dengan Huruf Besar");
        areaCihpertext.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(areaCihpertext);

        jScrollPane2.setBackground(java.awt.Color.lightGray);
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plaintext :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Salem", 3, 14), java.awt.Color.blue)); // NOI18N
        jScrollPane2.setForeground(java.awt.Color.gray);

        areaPlaintext.setBackground(java.awt.Color.darkGray);
        areaPlaintext.setColumns(20);
        areaPlaintext.setForeground(java.awt.Color.red);
        areaPlaintext.setLineWrap(true);
        areaPlaintext.setRows(5);
        areaPlaintext.setToolTipText("Masukkan Kata atau Kalimat Dengan Huruf Besar");
        areaPlaintext.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(areaPlaintext);

        buttonDekripsi1.setForeground(java.awt.Color.red);
        buttonDekripsi1.setToolTipText("Dekripsi");
        buttonDekripsi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDekripsi1ActionPerformed(evt);
            }
        });

        buttonEnkripsi1.setToolTipText("Enkripsi");
        buttonEnkripsi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnkripsi1ActionPerformed(evt);
            }
        });

        btnClearPlaintext.setToolTipText("Clear Plaintext");
        btnClearPlaintext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearPlaintextActionPerformed(evt);
            }
        });

        btnClearCihpertext.setToolTipText("Clear Ciphertext");
        btnClearCihpertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearCihpertextActionPerformed(evt);
            }
        });

        buttonAbout1.setToolTipText("About");
        buttonAbout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAbout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKupu1Layout = new javax.swing.GroupLayout(panelKupu1);
        panelKupu1.setLayout(panelKupu1Layout);
        panelKupu1Layout.setHorizontalGroup(
            panelKupu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJudul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelKupu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKupu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKupu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnClearPlaintext, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelKupu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelKupu1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(buttonAbout1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClearCihpertext, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelKupu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDekripsi1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEnkripsi1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        panelKupu1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        panelKupu1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClearCihpertext, btnClearPlaintext});

        panelKupu1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonDekripsi1, buttonEnkripsi1});

        panelKupu1Layout.setVerticalGroup(
            panelKupu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKupu1Layout.createSequentialGroup()
                .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelKupu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKupu1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearPlaintext, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelKupu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClearCihpertext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAbout1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(panelKupu1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(buttonDekripsi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEnkripsi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );

        panelKupu1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        add(panelKupu1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>                        

    private void btnClearPlaintextActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
        areaPlaintext.setText("");
        areaPlaintext.requestFocus();
        
    }                                                 

    private void btnClearCihpertextActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        areaCihpertext.setText("");
        areaCihpertext.requestFocus();
        
    }                                                  

    private void buttonEnkripsi1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
       
        areaCihpertext.setText("");
        ArrayList Enkripsi = Enkripsi();
        if(Enkripsi!=null){
        for(int e=0;e<Enkripsi.size();e++){
            for(int step=0;step<pPlainText;step++){
                if(Enkripsi.get(e).toString().equals(plainText[step])){
                    enkrip.add(plainText[step+3]);
                    break;
                }
            }
        }
        for(Object ektrak:enkrip){
            areaCihpertext.append(ektrak.toString());
        }
        }
    enkrip.removeAll(enkrip);
    }                                               

    private void buttonAbout1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        
        program.getGlassPane().setVisible(true);
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(panel.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    program.getGlassPane().setVisible(false);
                
                }
            }
        }).start();
        
    }                                            

    private void buttonDekripsi1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        areaPlaintext.setText("");
        ArrayList Dekripsi = Dekripsi();
        if(Dekripsi!=null){
            for(int d=0;d<Dekripsi.size();d++){
                for(int step=plainText.length-1;step>=0;step--){
                    if(Dekripsi.get(d).toString().equals(plainText[step])){
                        dekrip.add(plainText[step-3]);
                        break;
                    }
                }
            }
            for(Object ekstrak:dekrip){
                areaPlaintext.append(ekstrak.toString());
            }
        }
        dekrip.removeAll(dekrip);
    }                                               

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea areaCihpertext;
    private javax.swing.JTextArea areaPlaintext;
    private san.jmat.button.render.ButtonClear btnClearCihpertext;
    private san.jmat.button.render.ButtonClear btnClearPlaintext;
    private san.jmat.button.render.ButtonAbout buttonAbout1;
    private san.jmat.button.render.ButtonDekripsi buttonDekripsi1;
    private san.jmat.button.render.ButtonEnkripsi buttonEnkripsi1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblJudul;
    private san.jmat.panel.render.PanelKupu panelKupu1;
    // End of variables declaration                   
}