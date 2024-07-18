/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabores;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @author lizandro garcia
 */
public class SaboresH extends javax.swing.JFrame {
    static  int h_tarjeta=0;
    SaboresH2 sa;
    ImageIcon imagen;
    Icon icono;
    int cantidad;
    double tamanio, complemento = 0, totalP = 0, totalVentas = 0, tarjeta,acumTarjeta=0;

    public SaboresH() {
        initComponents();
        this.setLocationRelativeTo(null);
        cambioImg("BaledasLogo.png", imagenes1);
        cambioImg("BaledasLogo.png", imagenes2);
        cambioImg("ARA.png", jblFondo);
        sa = new SaboresH2(1000, 0);
    }

    public void cambioImg(String nombreImagen, JLabel etiqueta) {
        imagen = new ImageIcon("src/imag/" + nombreImagen);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_DEFAULT));
        etiqueta.setIcon(icono);
    }

    public void calculos() {
        if (!rbPersonal.isSelected() && rbMediana.isSelected() && rbFamiliar.isSelected() && rbGigante.isSelected()) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN TAMAÑO", "BALEADAS", 0);
        } else if (jtfCantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN COMPLEMENTO", "BALEADAS", 0);
            jtfCantidad.setBackground(Color.red);
            jtfCantidad.requestFocus();
        } else {
            cantidad = Integer.parseInt(jtfCantidad.getText());
            if (rbPersonal.isSelected()) {
                tamanio = 15;
            }
            if (rbMediana.isSelected()) {
                tamanio = 40;
            }
            if (rbFamiliar.isSelected()) {
                tamanio = 100;
            }
            if (rbGigante.isSelected()) {
                tamanio = 200;
            }
            if (ckJamon.isSelected()) {
                complemento += 30;
            }
            if (ckHuevo.isSelected()) {
                complemento += 60;
            }
            if (ckCarneRes.isSelected()) {
                complemento += 90;
            }
            if (ckContodo.isSelected()) {
                complemento += 220;
            }
            this.totalP = (tamanio + complemento) * cantidad;
            this.totalVentas += this.totalP;
            this.jtfTotal.setText("" + totalP);
            jtfCantidad.setEnabled(false);
            botCalcular.setEnabled(false);
        }
    }

    public void dinero() {
        // Declaración de variables locales...
        int billete;
        double cambio;

        if (botTarjeta.isSelected()) {
            JOptionPane.showMessageDialog(this, "Pago con tarjeta seleccionado. No es necesario calcular el cambio.", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            
            jtfEfectivo.setEnabled(false);
            jtfcambio.setEnabled(false);
            return;
        }

        if (jtfEfectivo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Debe ingresar el EFECTIVO!", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            jtfEfectivo.setBackground(Color.red);
            jtfEfectivo.setEnabled(true);
            jtfcambio.setEnabled(true);
            jtfEfectivo.requestFocus();

        } else {
            billete = Integer.parseInt(this.jtfEfectivo.getText());
            cambio = billete - totalP;
            jtfcambio.setText("" + cambio);

            if (cambio >= 0) {
                JOptionPane.showMessageDialog(this, "¡Pago exitoso! Cambio a devolver: Lps" + String.format("%.2f", cambio), "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                jtfcambio.setText(String.format("%.2f", cambio));

                if (cambio > 0) {
                    JOptionPane.showMessageDialog(this, "¡Cambio entregado correctamente!", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "¡No se requiere cambio!", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "¡Dinero insuficiente para pagar!", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                jtfcambio.setText("0.00"); // Resetear el campo de cambio si no hay suficiente dinero
            }
        }
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jpanel = new javax.swing.JPanel();
        imagenes1 = new javax.swing.JLabel();
        jpanel2 = new javax.swing.JPanel();
        imagenes2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rbPersonal = new javax.swing.JRadioButton();
        rbMediana = new javax.swing.JRadioButton();
        rbFamiliar = new javax.swing.JRadioButton();
        rbGigante = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        ckJamon = new javax.swing.JCheckBox();
        ckHuevo = new javax.swing.JCheckBox();
        ckCarneRes = new javax.swing.JCheckBox();
        ckContodo = new javax.swing.JCheckBox();
        fondo = new javax.swing.JPanel();
        jblFondo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfcambio = new javax.swing.JTextField();
        rbEfectivo = new javax.swing.JRadioButton();
        jtfEfectivo = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        botTarjeta = new javax.swing.JButton();
        jtfEnvio = new javax.swing.JTextField();
        rbTarjeta = new javax.swing.JRadioButton();
        botNuevaVenta = new javax.swing.JButton();
        botArqueo = new javax.swing.JButton();
        botSalir = new javax.swing.JButton();
        botCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jpanel.setBackground(new java.awt.Color(255, 0, 0));
        jpanel.setLayout(null);
        jpanel.add(imagenes1);
        imagenes1.setBounds(10, 10, 190, 190);

        jpanel2.setBackground(new java.awt.Color(255, 0, 0));
        jpanel2.setLayout(null);
        jpanel2.add(imagenes2);
        imagenes2.setBounds(10, 20, 190, 180);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "TAMAÑO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 0, 0))); // NOI18N

        rbPersonal.setBackground(new java.awt.Color(255, 255, 255));
        grupoBotones.add(rbPersonal);
        rbPersonal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbPersonal.setText("PERSONAL                       L.15.00");

        rbMediana.setBackground(new java.awt.Color(255, 255, 255));
        grupoBotones.add(rbMediana);
        rbMediana.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbMediana.setText("MEDIANA                          L.40.00");

        rbFamiliar.setBackground(new java.awt.Color(255, 255, 255));
        grupoBotones.add(rbFamiliar);
        rbFamiliar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbFamiliar.setText("FAMILIAR                       L.100.00");

        rbGigante.setBackground(new java.awt.Color(255, 255, 255));
        grupoBotones.add(rbGigante);
        rbGigante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbGigante.setText("GIGANTE                          L.200.00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbMediana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbFamiliar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbGigante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(rbPersonal)
                .addGap(18, 18, 18)
                .addComponent(rbMediana)
                .addGap(18, 18, 18)
                .addComponent(rbFamiliar)
                .addGap(18, 18, 18)
                .addComponent(rbGigante)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "COMPLEMENTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 0, 0))); // NOI18N

        ckJamon.setBackground(new java.awt.Color(255, 255, 255));
        ckJamon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ckJamon.setText("JAMON   L.30.00");
        ckJamon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ckJamonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ckJamonMouseExited(evt);
            }
        });

        ckHuevo.setBackground(new java.awt.Color(255, 255, 255));
        ckHuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ckHuevo.setText("HUEVO Y AGUACATE L.60.00");
        ckHuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ckHuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ckHuevoMouseExited(evt);
            }
        });

        ckCarneRes.setBackground(new java.awt.Color(255, 255, 255));
        ckCarneRes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ckCarneRes.setText("CARNE DE RES ASADA  L.90.00");
        ckCarneRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ckCarneResMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ckCarneResMouseExited(evt);
            }
        });

        ckContodo.setBackground(new java.awt.Color(255, 255, 255));
        ckContodo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ckContodo.setText("CON TODO  L.220.00");
        ckContodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ckContodoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ckContodoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckJamon)
                    .addComponent(ckHuevo)
                    .addComponent(ckCarneRes)
                    .addComponent(ckContodo))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(ckJamon)
                .addGap(18, 18, 18)
                .addComponent(ckHuevo)
                .addGap(18, 18, 18)
                .addComponent(ckCarneRes)
                .addGap(18, 18, 18)
                .addComponent(ckContodo)
                .addContainerGap())
        );

        fondo.setBackground(new java.awt.Color(255, 255, 102));
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        fondo.setLayout(null);
        fondo.add(jblFondo);
        jblFondo.setBounds(10, 10, 480, 330);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CANTIDAD:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("TOTAL A PAGAR:");

        jtfTotal.setBackground(new java.awt.Color(255, 255, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CAMBIO:");

        rbEfectivo.setBackground(new java.awt.Color(255, 255, 255));
        rbEfectivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbEfectivo.setText("Efectivo");
        rbEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEfectivoActionPerformed(evt);
            }
        });

        Calcular.setBackground(new java.awt.Color(255, 255, 255));
        Calcular.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Calcular.setText("Calcular");
        Calcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        botTarjeta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        botTarjeta.setText("(>>>)");
        botTarjeta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botTarjetaActionPerformed(evt);
            }
        });

        rbTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        rbTarjeta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbTarjeta.setText("Tarjeta");
        rbTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(rbEfectivo)
                            .addComponent(rbTarjeta))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfcambio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtfEnvio, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfEfectivo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90)
                        .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTarjeta)
                    .addComponent(botTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rbEfectivo))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jtfEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfcambio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        botNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/add-list-481.png"))); // NOI18N
        botNuevaVenta.setToolTipText("PRESIONE PARA NUEVA VENTA");
        botNuevaVenta.setBorder(null);
        botNuevaVenta.setBorderPainted(false);
        botNuevaVenta.setContentAreaFilled(false);
        botNuevaVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/add-list-648.png"))); // NOI18N
        botNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNuevaVentaActionPerformed(evt);
            }
        });

        botArqueo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/banknotes-48.png"))); // NOI18N
        botArqueo.setToolTipText("PRESIONE PARA ARQUEO");
        botArqueo.setBorder(null);
        botArqueo.setBorderPainted(false);
        botArqueo.setContentAreaFilled(false);
        botArqueo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/banknotes-64.png"))); // NOI18N
        botArqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botArqueoActionPerformed(evt);
            }
        });

        botSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/x-mark-2-48.png"))); // NOI18N
        botSalir.setToolTipText("PRESIONE PARA SALIR");
        botSalir.setBorder(null);
        botSalir.setBorderPainted(false);
        botSalir.setContentAreaFilled(false);
        botSalir.setFocusPainted(false);
        botSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/x-mark-2-64.png"))); // NOI18N
        botSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSalirActionPerformed(evt);
            }
        });

        botCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/bill-481.png"))); // NOI18N
        botCalcular.setToolTipText("PRESIONE PARA CALCULAR");
        botCalcular.setBorderPainted(false);
        botCalcular.setContentAreaFilled(false);
        botCalcular.setFocusPainted(false);
        botCalcular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/bill2-64.png"))); // NOI18N
        botCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(botCalcular)
                .addGap(59, 59, 59)
                .addComponent(botNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(578, 578, 578)
                        .addComponent(botArqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(botSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botArqueo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckJamonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckJamonMouseEntered
        // TODO add your handling code here:
        cambioImg("BaleadaConJamon.jpg", imagenes2);
    }//GEN-LAST:event_ckJamonMouseEntered

    private void ckJamonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckJamonMouseExited
        // TODO add your handling code here:
        cambioImg("BaledasLogo.png", imagenes2);
    }//GEN-LAST:event_ckJamonMouseExited

    private void ckHuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckHuevoMouseEntered
        // TODO add your handling code here:
        cambioImg("BaleadaHuevoAguacate.jpg", imagenes2);
    }//GEN-LAST:event_ckHuevoMouseEntered

    private void ckHuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckHuevoMouseExited
        // TODO add your handling code here:
        cambioImg("BaledasLogo.png", imagenes2);
    }//GEN-LAST:event_ckHuevoMouseExited

    private void ckCarneResMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckCarneResMouseEntered
        // TODO add your handling code here:
        cambioImg("BaleadaConCarne.jpg", imagenes2);
    }//GEN-LAST:event_ckCarneResMouseEntered

    private void ckCarneResMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckCarneResMouseExited
        // TODO add your handling code here:
        cambioImg("BaledasLogo.png", imagenes2);
    }//GEN-LAST:event_ckCarneResMouseExited

    private void ckContodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckContodoMouseEntered
        // TODO add your handling code here:
        cambioImg("BaleadaConTodo.jpg", imagenes2);
    }//GEN-LAST:event_ckContodoMouseEntered

    private void ckContodoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckContodoMouseExited
        // TODO add your handling code here:
        cambioImg("BaledasLogo.png", imagenes2);
    }//GEN-LAST:event_ckContodoMouseExited

    private void botSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botSalirActionPerformed

    private void botCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCalcularActionPerformed
        // TODO add your handling code here:
        calculos();
        sa.setTotalV(this.totalVentas);
    }//GEN-LAST:event_botCalcularActionPerformed

    private void botNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botNuevaVentaActionPerformed
        // TODO add your handling code here:
        grupoBotones.clearSelection();
        ckJamon.setSelected(false);
        ckHuevo.setSelected(false);
        ckCarneRes.setSelected(false);
        ckContodo.setSelected(false);
        jtfCantidad.setText(null);
        jtfTotal.setText(null);
        jtfcambio.setText(null);
        botCalcular.setEnabled(true);
        tamanio = 0;
        complemento = 0;
        totalP = 0;
    }//GEN-LAST:event_botNuevaVentaActionPerformed

    private void botArqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botArqueoActionPerformed

        new Arqueo(1000, 2000).setVisible(true);

    }//GEN-LAST:event_botArqueoActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
        dinero();
    }//GEN-LAST:event_CalcularActionPerformed

    private void botTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botTarjetaActionPerformed
        // TODO add your handling code here:
        SaboresH.h_tarjeta  = Integer.parseInt(jtfEnvio.getText());
    }//GEN-LAST:event_botTarjetaActionPerformed

    private void rbTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTarjetaActionPerformed
        // TODO add your handling code here:
         jtfEfectivo.setEnabled(false);
         jtfcambio.setEnabled(false);
         jtfEnvio.setEnabled(true);
         botTarjeta.setEnabled(true);
    }//GEN-LAST:event_rbTarjetaActionPerformed

    private void rbEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEfectivoActionPerformed
        // TODO add your handling code here:
        jtfEnvio.setEnabled(false);
        botTarjeta.setEnabled(false);
        jtfEfectivo.setEnabled(true);
        jtfcambio.setEnabled(true);
    }//GEN-LAST:event_rbEfectivoActionPerformed

             
             
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
            java.util.logging.Logger.getLogger(SaboresH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaboresH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaboresH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaboresH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaboresH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton botArqueo;
    private javax.swing.JButton botCalcular;
    private javax.swing.JButton botNuevaVenta;
    private javax.swing.JButton botSalir;
    private javax.swing.JButton botTarjeta;
    private javax.swing.JCheckBox ckCarneRes;
    private javax.swing.JCheckBox ckContodo;
    private javax.swing.JCheckBox ckHuevo;
    private javax.swing.JCheckBox ckJamon;
    private javax.swing.JPanel fondo;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel imagenes1;
    private javax.swing.JLabel imagenes2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jblFondo;
    private javax.swing.JPanel jpanel;
    private javax.swing.JPanel jpanel2;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfEfectivo;
    private javax.swing.JTextField jtfEnvio;
    private javax.swing.JTextField jtfTotal;
    private javax.swing.JTextField jtfcambio;
    private javax.swing.JRadioButton rbEfectivo;
    private javax.swing.JRadioButton rbFamiliar;
    private javax.swing.JRadioButton rbGigante;
    private javax.swing.JRadioButton rbMediana;
    private javax.swing.JRadioButton rbPersonal;
    private javax.swing.JRadioButton rbTarjeta;
    // End of variables declaration//GEN-END:variables

}
