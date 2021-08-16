/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalculator;

/**
 *
 * @author OmerFG
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    public calculator() {
        initComponents();
        Off.setSelected(true);
        onOf(false);
    }
    double num,ans;
    int calculation;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Screen = new javax.swing.JTextField();
        On = new javax.swing.JRadioButton();
        Off = new javax.swing.JRadioButton();
        Clear = new javax.swing.JButton();
        Pluss = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Two = new javax.swing.JButton();
        One = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        Multiple = new javax.swing.JButton();
        Subtraction = new javax.swing.JButton();
        Six = new javax.swing.JButton();
        Five = new javax.swing.JButton();
        Four = new javax.swing.JButton();
        Seven = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        Eight = new javax.swing.JButton();
        Equals = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        Dot = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(0, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Screen.setBackground(new java.awt.Color(0, 0, 0));
        Screen.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Screen.setForeground(new java.awt.Color(255, 255, 255));
        Screen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        On.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(On);
        On.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        On.setForeground(new java.awt.Color(255, 255, 255));
        On.setText("ON");
        On.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnActionPerformed(evt);
            }
        });

        Off.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(Off);
        Off.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        Off.setForeground(new java.awt.Color(255, 255, 255));
        Off.setText("OFF");
        Off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OffActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(0, 102, 102));
        Clear.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("c");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Pluss.setBackground(new java.awt.Color(0, 102, 102));
        Pluss.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Pluss.setForeground(new java.awt.Color(255, 255, 255));
        Pluss.setText("+");
        Pluss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlussActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(0, 102, 102));
        Back.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("<--");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Two.setBackground(new java.awt.Color(0, 102, 102));
        Two.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Two.setForeground(new java.awt.Color(255, 255, 255));
        Two.setText("2");
        Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoActionPerformed(evt);
            }
        });

        One.setBackground(new java.awt.Color(0, 102, 102));
        One.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        One.setForeground(new java.awt.Color(255, 255, 255));
        One.setText("1");
        One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneActionPerformed(evt);
            }
        });

        Three.setBackground(new java.awt.Color(0, 102, 102));
        Three.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Three.setForeground(new java.awt.Color(255, 255, 255));
        Three.setText("3");
        Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeActionPerformed(evt);
            }
        });

        Multiple.setBackground(new java.awt.Color(0, 102, 102));
        Multiple.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        Multiple.setForeground(new java.awt.Color(255, 255, 255));
        Multiple.setText("*");
        Multiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultipleActionPerformed(evt);
            }
        });

        Subtraction.setBackground(new java.awt.Color(0, 102, 102));
        Subtraction.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        Subtraction.setForeground(new java.awt.Color(255, 255, 255));
        Subtraction.setText("-");
        Subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtractionActionPerformed(evt);
            }
        });

        Six.setBackground(new java.awt.Color(0, 102, 102));
        Six.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Six.setForeground(new java.awt.Color(255, 255, 255));
        Six.setText("6");
        Six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixActionPerformed(evt);
            }
        });

        Five.setBackground(new java.awt.Color(0, 102, 102));
        Five.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Five.setForeground(new java.awt.Color(255, 255, 255));
        Five.setText("5");
        Five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveActionPerformed(evt);
            }
        });

        Four.setBackground(new java.awt.Color(0, 102, 102));
        Four.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Four.setForeground(new java.awt.Color(255, 255, 255));
        Four.setText("4");
        Four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourActionPerformed(evt);
            }
        });

        Seven.setBackground(new java.awt.Color(0, 102, 102));
        Seven.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Seven.setForeground(new java.awt.Color(255, 255, 255));
        Seven.setText("7");
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenActionPerformed(evt);
            }
        });

        Nine.setBackground(new java.awt.Color(0, 102, 102));
        Nine.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Nine.setForeground(new java.awt.Color(255, 255, 255));
        Nine.setText("9");
        Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineActionPerformed(evt);
            }
        });

        Eight.setBackground(new java.awt.Color(0, 102, 102));
        Eight.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Eight.setForeground(new java.awt.Color(255, 255, 255));
        Eight.setText("8");
        Eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightActionPerformed(evt);
            }
        });

        Equals.setBackground(new java.awt.Color(0, 102, 102));
        Equals.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        Equals.setForeground(new java.awt.Color(255, 255, 255));
        Equals.setText("=");
        Equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsActionPerformed(evt);
            }
        });

        Divide.setBackground(new java.awt.Color(0, 102, 102));
        Divide.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        Divide.setForeground(new java.awt.Color(255, 255, 255));
        Divide.setText("/");
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });

        Dot.setBackground(new java.awt.Color(0, 102, 102));
        Dot.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        Dot.setForeground(new java.awt.Color(255, 255, 255));
        Dot.setText(".");
        Dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DotActionPerformed(evt);
            }
        });

        Zero.setBackground(new java.awt.Color(0, 102, 102));
        Zero.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Zero.setForeground(new java.awt.Color(255, 255, 255));
        Zero.setText("0");
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });

        Label.setForeground(new java.awt.Color(255, 255, 255));
        Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Two, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Subtraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Off, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(On, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Pluss, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Four, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Five, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Multiple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Dot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(Screen))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 447, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(Screen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(On)
                            .addGap(8, 8, 8)
                            .addComponent(Off))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(Pluss, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Two, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Subtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Four, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Five, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Multiple, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void operations(){
        switch(calculation)
        {
            case 1:
                ans = num+Double.parseDouble(Screen.getText());
                Screen.setText(Double.toString(ans));
                break;
            case 2:
                ans = num-Double.parseDouble(Screen.getText());
                Screen.setText(Double.toString(ans));
                break;
            case 3:
                ans = num*Double.parseDouble(Screen.getText());
                Screen.setText(Double.toString(ans));
                break;
            case 4:
                ans = num/Double.parseDouble(Screen.getText());
                Screen.setText(Double.toString(ans));
                break;
        }
    }
    private void OneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneActionPerformed
        Screen.setText(Screen.getText()+"1");
    }//GEN-LAST:event_OneActionPerformed

    private void ThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeActionPerformed
          Screen.setText(Screen.getText()+"3");
    }//GEN-LAST:event_ThreeActionPerformed

    private void TwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoActionPerformed
          Screen.setText(Screen.getText()+"2");
    }//GEN-LAST:event_TwoActionPerformed

    private void FourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourActionPerformed
      Screen.setText(Screen.getText()+"4");
    }//GEN-LAST:event_FourActionPerformed

    private void FiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveActionPerformed
        Screen.setText(Screen.getText()+"5");
    }//GEN-LAST:event_FiveActionPerformed

    private void SixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixActionPerformed
        Screen.setText(Screen.getText()+"6");
    }//GEN-LAST:event_SixActionPerformed

    private void SevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenActionPerformed
       Screen.setText(Screen.getText()+"7");
    }//GEN-LAST:event_SevenActionPerformed

    private void EightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EightActionPerformed
     Screen.setText(Screen.getText()+"8");
    }//GEN-LAST:event_EightActionPerformed

    private void NineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineActionPerformed
       Screen.setText(Screen.getText()+"9");
    }//GEN-LAST:event_NineActionPerformed

    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroActionPerformed
        Screen.setText(Screen.getText()+"0");
    }//GEN-LAST:event_ZeroActionPerformed

    private void PlussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlussActionPerformed

        if (Label.getText().length()>0) {
            num = Double.parseDouble(Label.getText());
            operations();
            Label.setText(ans+"");
        }
        else{
         num = Double.parseDouble(Screen.getText());
         Label.setText(num+"");
        }
        Screen.setText("");
        calculation = 1;
       
    }//GEN-LAST:event_PlussActionPerformed

    private void SubtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtractionActionPerformed
         if (Label.getText().length()>0) {
            num = Double.parseDouble(Label.getText());
            operations();
            Label.setText(ans+"");
        }
        else{
         num = Double.parseDouble(Screen.getText());
         Label.setText(num+"");
        }
        Screen.setText("");
        calculation = 2;
    }//GEN-LAST:event_SubtractionActionPerformed

    private void MultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultipleActionPerformed
          if (Label.getText().length()>0) {
            num = Double.parseDouble(Label.getText());
            operations();
            Label.setText(ans+"");
        }
        else{
         num = Double.parseDouble(Screen.getText());
         Label.setText(num+"");
        }
        Screen.setText("");
        calculation = 3;
    }//GEN-LAST:event_MultipleActionPerformed

    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideActionPerformed
           if (Label.getText().length()>0) {
            num = Double.parseDouble(Label.getText());
            operations();
            Label.setText(ans+"");
        }
        else{
         num = Double.parseDouble(Screen.getText());
         Label.setText(num+"");
        }
        Screen.setText("");
        calculation = 4;
    }//GEN-LAST:event_DivideActionPerformed

    private void EqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsActionPerformed
       operations();
       Label.setText("");
    }//GEN-LAST:event_EqualsActionPerformed

    private void DotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DotActionPerformed
       Screen.setText(Screen.getText()+".");
    }//GEN-LAST:event_DotActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        Screen.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void OffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OffActionPerformed
       onOf(false);
    }//GEN-LAST:event_OffActionPerformed

    private void OnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnActionPerformed
        onOf(true);
    }//GEN-LAST:event_OnActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        int length = Screen.getText().length();
        int num = Screen.getText().length()-1;
        String store;
        if (length>0) {
            StringBuilder back = new StringBuilder(Screen.getText());
            back.deleteCharAt(num);
            store = back.toString();
            Screen.setText(store);
            
        }
    }//GEN-LAST:event_BackActionPerformed
    public void onOf(boolean value){
        Screen.setEnabled(value);
         One.setEnabled(value);
          Two.setEnabled(value);
           Three.setEnabled(value);
            Four.setEnabled(value);
             Five.setEnabled(value);
              Six.setEnabled(value); 
              Seven.setEnabled(value);
               Eight.setEnabled(value);
                Nine.setEnabled(value);
                 Zero.setEnabled(value);
                  Dot.setEnabled(value);
                   Pluss.setEnabled(value);
                    Subtraction.setEnabled(value);
                     Multiple.setEnabled(value);
                      Divide.setEnabled(value);
                       Clear.setEnabled(value);
                        Back.setEnabled(value);
                          Equals.setEnabled(value);
              
    }
    
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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Divide;
    private javax.swing.JButton Dot;
    private javax.swing.JButton Eight;
    private javax.swing.JButton Equals;
    private javax.swing.JButton Five;
    private javax.swing.JButton Four;
    private javax.swing.JLabel Label;
    private javax.swing.JButton Multiple;
    private javax.swing.JButton Nine;
    private javax.swing.JRadioButton Off;
    private javax.swing.JRadioButton On;
    private javax.swing.JButton One;
    private javax.swing.JButton Pluss;
    private javax.swing.JTextField Screen;
    private javax.swing.JButton Seven;
    private javax.swing.JButton Six;
    private javax.swing.JButton Subtraction;
    private javax.swing.JButton Three;
    private javax.swing.JButton Two;
    private javax.swing.JButton Zero;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
