
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
public class RobotGUI extends javax.swing.JFrame 
{
    private RobotManager rm;
    private Radar radar;
    private int keyCode = -1;
        
    /**
     * Creates new form JFrame
     */
    public RobotGUI(RobotManager rm) 
    {
       initComponents();
       this.rm = rm;
       this.radar = new Radar(RadarPanel);
       this.radar.start();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        CameraPanel = new javax.swing.JPanel();
        RadarPanel = new javax.swing.JPanel();
        StopServerButton = new javax.swing.JButton();
        clearRadarButton = new javax.swing.JButton();
        ConnectButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        jSlider1 = new javax.swing.JSlider();
        IPField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        connectedLabel = new javax.swing.JLabel();
        autoDrawCheckBox = new javax.swing.JCheckBox();
        radarRotateRateTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        xTextField = new javax.swing.JTextField();
        yTextField = new javax.swing.JTextField();
        drawDot = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dotSizeTextField = new javax.swing.JTextField();
        dotSizeLabel = new javax.swing.JLabel();
        ScanButton = new javax.swing.JButton();
        turnHeadTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        leftButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        haltButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CameraPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        CameraPanel.setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout CameraPanelLayout = new javax.swing.GroupLayout(CameraPanel);
        CameraPanel.setLayout(CameraPanelLayout);
        CameraPanelLayout.setHorizontalGroup(
            CameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        CameraPanelLayout.setVerticalGroup(
            CameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        RadarPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        RadarPanel.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout RadarPanelLayout = new javax.swing.GroupLayout(RadarPanel);
        RadarPanel.setLayout(RadarPanelLayout);
        RadarPanelLayout.setHorizontalGroup(
            RadarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        RadarPanelLayout.setVerticalGroup(
            RadarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        StopServerButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StopServerButton.setText("Stop Server");
        StopServerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopServerButtonActionPerformed(evt);
            }
        });

        clearRadarButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearRadarButton.setText("Clear Radar");
        clearRadarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearRadarButtonActionPerformed(evt);
            }
        });

        ConnectButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ConnectButton.setText("Connect");
        ConnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectButtonActionPerformed(evt);
            }
        });

        TextArea1.setEditable(false);
        TextArea1.setColumns(20);
        TextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextArea1.setRows(5);
        TextArea1.setText("w or up arrow        --> Move Forward\na or left arrow       --> Move Left\ns or down arrow    --> Move Backward\nd or right arrow     --> Move Right\nClick me to use Keyboard");
        TextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextArea1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextArea1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(TextArea1);

        jSlider1.setMaximum(180);
        jSlider1.setValue(90);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        IPField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IPField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        IPField.setText("192.168.1.");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Host IP -->");

        connectedLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        connectedLabel.setText("Connected: NO");

        autoDrawCheckBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        autoDrawCheckBox.setSelected(true);
        autoDrawCheckBox.setText("Auto Draw");
        autoDrawCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoDrawCheckBoxActionPerformed(evt);
            }
        });

        radarRotateRateTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radarRotateRateTextField.setText("20");
        radarRotateRateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radarRotateRateTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Radar Rotate rate:");

        xTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        xTextField.setText("20");

        yTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yTextField.setText("20");

        drawDot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        drawDot.setText("Manual Draw Dot (x and y)");
        drawDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawDotActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Dot size:");

        dotSizeTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dotSizeTextField.setText("20");
        dotSizeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotSizeTextFieldActionPerformed(evt);
            }
        });

        dotSizeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dotSizeLabel.setText("20");

        ScanButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ScanButton.setText("send scan command");
        ScanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScanButtonActionPerformed(evt);
            }
        });

        turnHeadTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        turnHeadTextField.setText("20");
        turnHeadTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnHeadTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("turnHead:");

        leftButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        leftButton.setText("←");
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });

        rightButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rightButton.setText("→");
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });

        upButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        upButton.setText("↑");
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });

        downButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        downButton.setText("↓");
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });

        haltButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        haltButton.setText("halt");
        haltButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haltButtonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autoDrawCheckBox)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radarRotateRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dotSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dotSizeLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane2)
                    .addComponent(CameraPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearRadarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drawDot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(turnHeadTextField))
                            .addComponent(ScanButton))
                        .addGap(60, 60, 60)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IPField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ConnectButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(connectedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StopServerButton)))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(upButton)
                                        .addGap(9, 9, 9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(leftButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(downButton))
                                            .addComponent(haltButton))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rightButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CameraPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConnectButton)
                            .addComponent(IPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(connectedLabel)
                            .addComponent(StopServerButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autoDrawCheckBox)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radarRotateRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(dotSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dotSizeLabel)
                    .addComponent(upButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearRadarButton)
                    .addComponent(xTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drawDot)
                    .addComponent(ScanButton)
                    .addComponent(leftButton)
                    .addComponent(rightButton)
                    .addComponent(haltButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(turnHeadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downButton))
                .addGap(13, 13, 13))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void StopServerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        // TODO add your handling code here:
        rm.trySendCommand("stopServer");
        rm.tryDisconnect();
        connectedLabel.setText("Connected: NO");
        rm = new RobotManager();
        rm.pointGUI(this);
    }                                                

    private void ConnectButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        String hostIP = IPField.getText().trim();
        boolean connect = rm.tryConnect(hostIP);
        
        if(connect)
            connectedLabel.setText("Connected: Yes");
        else
            connectedLabel.setText("Connected: NO");
    }                                             

    private void autoDrawCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        if(autoDrawCheckBox.isSelected())
        {
            radar.autoDraw = true;
        }
        else
        {
            radar.autoDraw = false;
            radar.clearAll();
            radar.drawCenterCircle();
        }
    }                                                

    private void radarRotateRateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
        try
        {
            int rotateRate = Integer.parseInt(radarRotateRateTextField.getText());
            radar.spinRate = rotateRate;
        }
        catch(Exception ex)
        {
            System.out.println("Error: Rotate rate must be interger");
        }
        
    }                                                        

    private void clearRadarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        rm.clearDotList();
        radar.dotArray = null;
        radar.clearAll();
        radar.drawCenterCircle();
    }                                                

    private void TextArea1KeyPressed(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        if(keyCode == -1)
        {
            rm.sendCommand(evt);
            keyCode = evt.getKeyCode();
            //System.out.println("Pressed: " + keyCode);
        }
    }                                    

    private void TextArea1KeyReleased(java.awt.event.KeyEvent evt) {                                      
        // TODO add your handling code here:
        if(evt.getKeyCode() == keyCode)
        {
            rm.trySendCommand("halt");
            keyCode = -1;
            //System.out.println("Halting");
        }
    }                                     

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {                                      
        // TODO add your handling code here:
        rm.trySendCommand(String.format("turnScan(%s)", jSlider1.getValue()));
        //System.out.println(jSlider1.getValue());
    }                                     

    private void drawDotActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        int x = Integer.parseInt(xTextField.getText().trim());
        int y = Integer.parseInt(yTextField.getText().trim());
        radar.drawDot(x, y);
    }                                       

    private void dotSizeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        int size = Integer.parseInt(dotSizeTextField.getText().trim());
        radar.dotSize = size;
        dotSizeLabel.setText(size + "");
    }                                                

    private void ScanButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        rm.trySendCommand("scan");
    }                                          

    private void turnHeadTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
        rm.trySendCommand(String.format("turnScan(%s)", turnHeadTextField.getText().trim()));
        jSlider1.setValue(Integer.parseInt(turnHeadTextField.getText().trim()));
    }                                                 

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        rm.trySendCommand("moveForward");
    }                                        

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        rm.trySendCommand("moveBackward");
    }                                          

    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        rm.trySendCommand("rotateRight");
    }                                           

    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        rm.trySendCommand("rotateLeft");
    }                                          

    private void haltButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        rm.trySendCommand("halt");
        
    }                                          
    
    public void updateInterfaceInfo(Dot dots[])
    {
        radar.dotArray = null;
        radar.dotArray = dots;
        
        if(!autoDrawCheckBox.isSelected())
        {
            radar.drawDots();
        }
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
            java.util.logging.Logger.getLogger(RobotGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RobotGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RobotGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RobotGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RobotGUI(new RobotManager()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel CameraPanel;
    private javax.swing.JButton ConnectButton;
    private javax.swing.JTextField IPField;
    private javax.swing.JPanel RadarPanel;
    private javax.swing.JButton ScanButton;
    private javax.swing.JButton StopServerButton;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JCheckBox autoDrawCheckBox;
    private javax.swing.JButton clearRadarButton;
    private javax.swing.JLabel connectedLabel;
    private javax.swing.JLabel dotSizeLabel;
    private javax.swing.JTextField dotSizeTextField;
    private javax.swing.JButton downButton;
    private javax.swing.JButton drawDot;
    private javax.swing.JButton haltButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton leftButton;
    private javax.swing.JTextField radarRotateRateTextField;
    private javax.swing.JButton rightButton;
    private javax.swing.JTextField turnHeadTextField;
    private javax.swing.JButton upButton;
    private javax.swing.JTextField xTextField;
    private javax.swing.JTextField yTextField;
    // End of variables declaration                   

    private class Radar extends Thread
    {
        private Graphics graphic;
        private int width;
        private int height;
        private Point middle;

        //condition
        public boolean autoDraw = true;
        public boolean drawCenterCircle = true;
        public boolean drawRadar = true;
        public boolean drawDot = true;
        public boolean clearEachDraw = true;
        public int refreshRate = 24;
        public int spinRate = 20;
        public int middleCircleW = 20;
        public int middleCircleH = 20;
        public int dotSize = 10;

        //for drawing line
        private Point endPoint = new Point(0, 0);
        private boolean moveRight = true;
        private boolean moveLeft = false;
        private boolean moveUp = false;
        private boolean moveDown = false;
        
        //for drawing dot
        public Dot dotArray[];


        public Radar(JPanel panel)
        {
            this.graphic = panel.getGraphics();
            width = panel.getWidth();
            height = panel.getHeight();
            middle = new Point(width / 2, height / 2);
        }

        @Override
        public void run()
        {
            while(!this.isInterrupted())
            {
                if(autoDraw)
                {
                    try 
                    {
                        if(clearEachDraw)
                            clearAll();

                        if(drawRadar)
                            drawRadar();

                        if(drawCenterCircle)
                            drawCenterCircle();

                        if(drawDot)
                            drawDots();

                        Thread.sleep(refreshRate);

                    } 
                    catch (InterruptedException ex) 
                    {
                        Logger.getLogger(Radar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }


        public void drawDot(int x, int y)
        {
            drawCircle(x, y, dotSize, dotSize);
            fillCircle(x, y, dotSize, dotSize, Color.BLACK);
        }
        
        public void drawDot(Dot dot)
        {
            drawDot((int)dot.getx(),(int)dot.gety());
        }

        public void drawDots()
        {
            if(dotArray == null)
                return;
            if(dotArray.length == 0)
                return;
            
            for(int count = 0; count < dotArray.length; count++)
            {
                drawDot(dotArray[count]);
            }
        }

        public void drawCenterCircle()
        {
            drawCircle(middle, middleCircleW, middleCircleH);
            fillCircle(middle, middleCircleW, middleCircleH, Color.RED);

            drawLine(this.width/2, 0, this.width/2, this.height);
            drawLine(0, this.height/2, this.width, this.height/2);
        }

        public void drawRadar()
        {


            drawLine(middle, endPoint, Color.BLUE);



            if(moveRight)
            {
                endPoint.x += spinRate;
                if(endPoint.x >= this.width - 1)
                {
                    moveRight = false;
                    moveDown = true;
                }
            }

            if(moveDown)
            {
                endPoint.y += spinRate;
                if(endPoint.y >= this.height - 1)
                {
                    moveDown = false;
                    moveLeft = true;
                }
            }

            if(moveLeft)
            {
                endPoint.x -= spinRate;
                if(endPoint.x <= 0)
                {
                    moveLeft = false;
                    moveUp = true;
                }
            }

            if(moveUp)
            {
                endPoint.y -= spinRate;
                if(endPoint.y <= 0)
                {
                    moveUp = false;
                    moveRight = true;
                }
            }
        }



        private void drawLine(Point point1, Point point2, Color color)
        {
            graphic.setColor(color);
            drawLine(point1.x, point1.y, point2.x, point2.y);
            graphic.setColor(Color.BLACK);
        }
        public void drawLine(int x1, int y1, int x2, int y2, Color color)
        {
            graphic.setColor(color);
            graphic.drawLine(x1, y1, x2, y2);
            graphic.setColor(Color.BLACK);
        }

        private void drawLine(Point point1, Point point2)
        {
            drawLine(point1.x, point1.y, point2.x, point2.y);
        }
        public void drawLine(int x1, int y1, int x2, int y2)
        {
            graphic.drawLine(x1, y1, x2, y2);
        }

        private void fillCircle(Point point, int width, int height, Color color)
        {
            fillCircle(point.x, point.y, width, height, color);
        }

        public void fillCircle(int x, int y, int width, int height, Color color)
        {
            if(x > this.width || y > this.height)
                return;

            //make sure it draw correct
            x = x - (width / 2);
            y = y + (height / 2);

            //invert Y
            y = this.height - y;

            graphic.setColor(color);
            graphic.fillOval(x, y, width, height);
            graphic.setColor(Color.BLACK);
        }

        public void drawCircle(int x, int y, int width, int height, Color color)
        {
            if(x > this.width || y > this.height)
                return;

            //make sure it draw correct
            x = x - (width / 2);
            y = y + (height / 2);

            //invert Y
            y = this.height - y;
            graphic.setColor(color);
            graphic.drawOval(x, y, width, height);
            graphic.setColor(Color.BLACK);
        }

        public void drawCircle(int x, int y, int width, int height)
        {
            if(x > this.width || y > this.height)
                return;

            //make sure it draw correct
            x = x - (width / 2);
            y = y + (height / 2);

            //invert Y
            y = this.height - y;

            graphic.drawOval(x, y, width, height);
        }

        private void drawCircle(Point point, int width, int height)
        {
            drawCircle(point.x, point.y, width, height);
        }

        public void clearAll()
        {
            graphic.clearRect(0, 0, width, height);

            drawLine(0, 0, this.width, 0, Color.RED);
            drawLine(0, 0, 0, this.height, Color.RED);
            drawLine(this.width - 1, this.height, this.width - 1, 0, Color.RED);
            drawLine(this.width - 1, this.height - 1, 0, this.height - 1, Color.RED);
        }


    }

    private class Point
    {
        public int x;
        public int y;
        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
