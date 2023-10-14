import javax.swing.JOptionPane;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.MapContext;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.JexlException;


/**
 *
 * @author cdias
 */
public class calculadora extends javax.swing.JFrame {
    public String expressaoString = "";

    public calculadora() {
        initComponents();
        setTitle("Calculadora");
        setLocation(500, 150);
        setResizable(false);
    }

    private void initComponents() {

        painel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        expressao = new javax.swing.JLabel();
        numero2 = new javax.swing.JButton();
        numero3 = new javax.swing.JButton();
        numero1 = new javax.swing.JButton();
        numero5 = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        numero7 = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        numero8 = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        div = new javax.swing.JButton();
        numerozero = new javax.swing.JButton();
        resultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        expressao.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        expressao.setForeground(new java.awt.Color(0, 0, 0));
        expressao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(expressao, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(expressao, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        numero1.setBackground(new java.awt.Color(204, 204, 255));
        numero1.setForeground(new java.awt.Color(0, 0, 0));
        numero1.setText("1");
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });

        numero2.setBackground(new java.awt.Color(204, 204, 255));
        numero2.setForeground(new java.awt.Color(0, 0, 0));
        numero2.setText("2");
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });

        numero3.setBackground(new java.awt.Color(204, 204, 255));
        numero3.setForeground(new java.awt.Color(0, 0, 0));
        numero3.setText("3");
        numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ActionPerformed(evt);
            }
        });

        
        numero4.setBackground(new java.awt.Color(204, 204, 255));
        numero4.setForeground(new java.awt.Color(0, 0, 0));
        numero4.setText("4");
        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });

        numero5.setBackground(new java.awt.Color(204, 204, 255));
        numero5.setForeground(new java.awt.Color(0, 0, 0));
        numero5.setText("5");
        numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero5ActionPerformed(evt);
            }
        });

        numero6.setBackground(new java.awt.Color(204, 204, 255));
        numero6.setForeground(new java.awt.Color(0, 0, 0));
        numero6.setText("6");
        numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero6ActionPerformed(evt);
            }
        });

        numero7.setBackground(new java.awt.Color(204, 204, 255));
        numero7.setForeground(new java.awt.Color(0, 0, 0));
        numero7.setText("7");
        numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ActionPerformed(evt);
            }
        });

        numero8.setBackground(new java.awt.Color(204, 204, 255));
        numero8.setForeground(new java.awt.Color(0, 0, 0));
        numero8.setText("8");
        numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero8ActionPerformed(evt);
            }
        });

        numero9.setBackground(new java.awt.Color(204, 204, 255));
        numero9.setForeground(new java.awt.Color(0, 0, 0));
        numero9.setText("9");
        numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero9ActionPerformed(evt);
            }
        });

        numerozero.setBackground(new java.awt.Color(204, 204, 255));
        numerozero.setForeground(new java.awt.Color(0, 0, 0));
        numerozero.setText("0");
        numerozero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerozeroActionPerformed(evt);
            }
        });

        soma.setBackground(new java.awt.Color(204, 204, 255));
        soma.setForeground(new java.awt.Color(0, 0, 0));
        soma.setText("+");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });


        multi.setBackground(new java.awt.Color(204, 204, 255));
        multi.setForeground(new java.awt.Color(0, 0, 0));
        multi.setText("*");
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });

        
        sub.setBackground(new java.awt.Color(204, 204, 255));
        sub.setForeground(new java.awt.Color(0, 0, 0));
        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        botaoLimpar.setBackground(new java.awt.Color(255, 255, 153));
        botaoLimpar.setForeground(new java.awt.Color(0, 0, 0));
        botaoLimpar.setText("limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });



        div.setBackground(new java.awt.Color(204, 204, 255));
        div.setForeground(new java.awt.Color(0, 0, 0));
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        resultado.setBackground(new java.awt.Color(255, 255, 153));
        resultado.setForeground(new java.awt.Color(0, 0, 0));
        resultado.setText("=");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultado1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numero4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numero7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numerozero, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(numero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numero8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                            .addComponent(numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numero6, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(numero3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numero9, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sub, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(multi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(soma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(div, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(numero6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(multi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numero9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(numero7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numerozero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }           

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(numero1.getText());
        expressao.setText(expressaoString);
    }       
    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(numero2.getText());
        expressao.setText(expressaoString);
    }                                       
    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(numero3.getText());
        expressao.setText(expressaoString);
    }                                       
    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(numero4.getText());
        expressao.setText(expressaoString);
    }                                       
    private void numero5ActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(numero5.getText());
        expressao.setText(expressaoString);
    }                                       
    private void numero6ActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(numero6.getText());
        expressao.setText(expressaoString);
    }                                       
    private void numero7ActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(numero7.getText());
        expressao.setText(expressaoString);
    }                                       
    private void numero8ActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(numero8.getText());
        expressao.setText(expressaoString);
    }                                       
    private void numero9ActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(numero9.getText());
        expressao.setText(expressaoString);
    }                                       
    private void numerozeroActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(numerozero.getText());
        expressao.setText(expressaoString);
    }                                       
    private void somaActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(soma.getText());
        expressao.setText(expressaoString);
    }                                       
    private void subActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(sub.getText());
        expressao.setText(expressaoString);
    }                                       
    private void multiActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(multi.getText());
        expressao.setText(expressaoString);
    }                                       
    private void divActionPerformed(java.awt.event.ActionEvent evt) {
        expressaoString += new String(div.getText());
        expressao.setText(expressaoString);
    }                                       
    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {
        expressao.setText("");
        expressaoString = "";
    }                                       
    private void resultado1ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            double resultado = calcularExpressao(expressaoString);
            int i_resultado = (int)resultado;
            expressao.setText(String.valueOf(i_resultado));
            expressaoString = "";
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Algo deu errado.", "Erro.", JOptionPane.WARNING_MESSAGE);
        }
    }         


    public static double calcularExpressao(String expressao) {
        JexlEngine jexl = new JexlBuilder().create();
        JexlContext contexto = new MapContext();
        
        try {
            JexlExpression jexlExpression = jexl.createExpression(expressao);
            Object resultado = jexlExpression.evaluate(contexto);

            if (resultado instanceof Number) {
                return ((Number) resultado).doubleValue();
            } else {
                throw new IllegalArgumentException("A expressão não retornou um número.");
            }
        } catch (JexlException e) {
            JOptionPane.showMessageDialog(null,"Dígito Inválido" + "\n" + "Código do Erro: " + "\n" + e.getMessage(),"Erro.", JOptionPane.ERROR_MESSAGE);
            return Double.NaN;
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton div;
    private javax.swing.JLabel expressao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multi;
    private javax.swing.JButton numero1;
    private javax.swing.JButton numero2;
    private javax.swing.JButton numero3;
    private javax.swing.JButton numero4;
    private javax.swing.JButton numero5;
    private javax.swing.JButton numero6;
    private javax.swing.JButton numero7;
    private javax.swing.JButton numero8;
    private javax.swing.JButton numero9;
    private javax.swing.JButton numerozero;
    private javax.swing.JPanel painel;
    private javax.swing.JButton resultado;
    private javax.swing.JButton soma;
    private javax.swing.JButton sub;
}
