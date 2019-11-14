/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Gabriel
 */
public class ArvoreBinaria extends javax.swing.JFrame {

    /**
     * Creates new form ArvoreBinaria
     */
    public ArvoreBinaria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pathArquivo = new javax.swing.JTextField();
        btnArquivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnConfirma = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tipoDado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleção");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        this.setLocationRelativeTo(null);

        pathArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathArquivoActionPerformed(evt);
            }
        });

        btnArquivo.setText("Arquivo");
        btnArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArquivoActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecionar Arquivo para execução do Programa:");

        btnConfirma.setText("OK");
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecionar qual tipo de dado utilizar:");

        tipoDado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Integer", "String" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tipoDado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pathArquivo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 120, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnArquivo)))
                        .addContainerGap(38, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArquivo))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipoDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnConfirma)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean adicionouArq = false;
    String path;
    private void btnArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArquivoActionPerformed
        JFileChooser file = new JFileChooser();
        file.setDialogTitle("Arquivo");
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Texto", "txt");

        file.setFileFilter(filter);
        int retorno = file.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            File f = file.getSelectedFile();
            path = f.getAbsolutePath();
            pathArquivo.setText(path);
        }
        adicionouArq = true;
    }//GEN-LAST:event_btnArquivoActionPerformed

    private void pathArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathArquivoActionPerformed

    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\p{javaWhitespace}+");

    private static final Pattern EVERYTHING_PATTERN = Pattern.compile("\\A");

    private static String concatenar(String[] a) {
        String str = "";
        for (int i = 0; i < a.length; i++) {
            str += a[i] + "\n";
        }
        return str;
    }

    public static String[] readAllStrings(String str) {
        // we could use readAll.trim().split(), but that's not consistent
        // because trim() uses characters 0x00..0x20 as whitespace
        String[] tokens = WHITESPACE_PATTERN.split(str);

        if (tokens.length == 0 || tokens[0].length() > 0) {
            return tokens;
        }

        // don't include first token if it is leading whitespace
        String[] decapitokens = new String[tokens.length - 1];
        for (int i = 0; i < tokens.length - 1; i++) {
            decapitokens[i] = tokens[i + 1];
        }
        return decapitokens;
    }

    public static int[] readAllInts(String str) {
        String[] fields = readAllStrings(str);
        int[] vals = new int[fields.length];
        for (int i = 0; i < fields.length; i++) {
            try {
                vals[i] = Integer.parseInt(fields[i]);
            } catch (java.lang.NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Arquivo de palavras selecionado como Tipo de dado Integer!", "Error", 0);
                System.exit(0);
            }
        }
        return vals;
    }

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        if (adicionouArq && (!tipoDado.getSelectedItem().equals("Selecione"))) {
            dispose();
            File file = new File(path);
            Scanner lerArq = null;
            try {
                lerArq = new Scanner(file);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Arquivo não existente!", "Error", 0);
            }
            String[] palavras = null;
            int[] numeros = null;
            String str = "";
            if (lerArq.hasNextLine()) {
                str = lerArq.useDelimiter(EVERYTHING_PATTERN).next();
                lerArq.useDelimiter(WHITESPACE_PATTERN);
            }
            BTree arvore = null;
            if (tipoDado.getSelectedItem().equals("Integer")) { //Integer
                numeros = readAllInts(str);
                BTree<Integer> n = new BTree<Integer>();
                for (int i = 0; i < numeros.length; i++) {
                    n.put(numeros[i]);
                }
                arvore = n;
            }

            if (tipoDado.getSelectedItem().equals("String")) { //String
                palavras = readAllStrings(str);
                BTree<String> p = new BTree<String>();
                for (int i = 0; i < palavras.length; i++) {
                    p.put(palavras[i]);
                }
                arvore = p;
            }

            int escolha;
            boolean setDepth = false;
            do {
                escolha = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n1 - Número de elementos da Árvore"
                        + "\n2 - Altura da Árvore"
                        + "\n3 - Definir Profundidade"
                        + "\n4 - Comprimento Interno (Requer definição de profundidade)"
                        + "\n5 - Pré Ordem"
                        + "\n6 - Em Ordem"
                        + "\n7 - Pós Ordem\n0 - Sair"));
                switch (escolha) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Quantidade: " + arvore.size());
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Altura: " + arvore.height());
                        break;
                    case 3:
                        arvore.setDepthField();
                        setDepth = true;
                        JOptionPane.showMessageDialog(null, "Profundidade definida!");
                        break;
                    case 4:
                        if (setDepth) {
                            JOptionPane.showMessageDialog(null, "Comprimento interno: " + arvore.internalPathLength());
                        } else {
                            JOptionPane.showMessageDialog(null, "Profundidade não foi setada!", "Atenção", 2);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Listagem em Pré Ordem:\n" + arvore.PreOrder());
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Listagem Em Ordem:\n" + arvore.InOrder());
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Listagem em Pós Ordem:\n" + arvore.PostOrder());
                        break;
                    default:
                        return;
                }
            } while (escolha != 0);
        } else if (tipoDado.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Tipo de dado não selecionado!", "Error", 0);
        } else {
            JOptionPane.showMessageDialog(null, "Arquivo não adicionado!", "Error", 0);
        }
    }//GEN-LAST:event_btnConfirmaActionPerformed

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
            java.util.logging.Logger.getLogger(ArvoreBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArvoreBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArvoreBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArvoreBinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArvoreBinaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArquivo;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pathArquivo;
    private javax.swing.JComboBox<String> tipoDado;
    // End of variables declaration//GEN-END:variables
}
