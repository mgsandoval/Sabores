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
public class Arqueo extends javax.swing.JFrame {
    int Saldo;
    ImageIcon imagen;
    Icon icono;
    double acumEfectivo=0,saldoI,totalC,totalGeneraCaja,tarjeta,gastos,efectivo,diferencia;
    boolean validar=true;
    Icon icon = new ImageIcon("src/Imagenes/error.png");
    Icon icon1 = new ImageIcon("src/Imagenes/garantia.png");
    
    public Arqueo(double saldolnicial,double totalCaja) {
        initComponents();
        this.setLocationRelativeTo(null);
        cambioImg("BaledasLogo.png",imagenes1);
        this.saldoI= Sabores.saldo; //saldo que viene de afuera
        this.totalC=totalCaja;
        Saldo = Sabores.saldo;
        tarjeta = SaboresH.h_tarjeta;
        jtfTarjeta.setText(""+tarjeta);
        jtfSaldoIni.setText(""+Saldo);
        botCaja.setEnabled(false);
        
    }
    
     public void cambioImg(String nombreImagen,JLabel etiqueta)
    {
        imagen= new ImageIcon("src/imag/"+nombreImagen);
        Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_DEFAULT));
        etiqueta.setIcon(icono);
    } 
     
     public boolean validacion(){
      if(jtfTotalEfectivo.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"DEBE EJECUTAR PRIMERO EL RECUENTO","BALEADAS",0);
        jtfTotalEfectivo.setBackground(Color.red);
        validar=false;
      }     
       return validar;
    }

    String varArqueo = "arqueo";
     
    public void validacion2(){
    if(jtfTarjeta.getText().isEmpty()){
       jtfTarjeta.setText("0");
       tarjeta=0;
     }else{
        tarjeta=Double.parseDouble(jtfTarjeta.getText());
     }
      if(jtfGastos.getText().isEmpty()){
         jtfGastos.setText("0");
         gastos=0;
      }else{
           gastos=Double.parseDouble(jtfGastos.getText());
      }
    } 
    
    public void recuentoEfectivo(){
    if(jtf500.getText().isEmpty())
    {
     jtf500.setText("0");
     
    }else{
        acumEfectivo+=Double.parseDouble(jtf500.getText())*500; //L.500
    }
    if(jtf200.getText().isEmpty())
    {
     jtf200.setText("0");
     
    }else{
        acumEfectivo+=Double.parseDouble(jtf200.getText())*200; //L.200
    }
    if(jtf100.getText().isEmpty())
    {
     jtf100.setText("0");
     
    }else{
        acumEfectivo+=Double.parseDouble(jtf100.getText())* 100; // L.100
    }
    if(jtf50.getText().isEmpty())
    {
     jtf50.setText("0");
     
    }else{
        acumEfectivo+=Double.parseDouble(jtf50.getText())* 50; //L.50
    }
    if(jtf20.getText().isEmpty())
    {
     jtf20.setText("0");
     
    }else{
        acumEfectivo+=Double.parseDouble(jtf20.getText())* 20; //L.20
    }
    if(jtf10.getText().isEmpty())
    {
     jtf10.setText("0");
     
    }else{
        acumEfectivo+=Double.parseDouble(jtf10.getText())* 10; //L.10
    }
     if(jtf5.getText().isEmpty())
    {
     jtf5.setText("0");
     
    }else{
        acumEfectivo+=Double.parseDouble(jtf5.getText())* 5; //L.5
    }
     if(jtf2.getText().isEmpty())
    {
     jtf2.setText("0");
     
    }else{
        acumEfectivo+=Double.parseDouble(jtf2.getText())* 2; //L.2
    }
     if(jtf1.getText().isEmpty())
    {
     jtf1.setText("0");
     
    }else{
        acumEfectivo+=Double.parseDouble(jtf1.getText())* 1; //L.1
     }  
    }
    
    public void Caja(){
        validacion2();
        efectivo=Double.parseDouble(jtfTotalEfectivo.getText());
        totalGeneraCaja=efectivo + tarjeta;
        jtfCajaTotal.setText(""+totalGeneraCaja);
    }
    
    public void diferencia(){
      diferencia = totalGeneraCaja - totalC - saldoI + gastos; 
      jtfDiferencia.setText(""+diferencia);
      if(diferencia < 0){
      informacion.setText("PRESENTA UNA DIFERENCIA QUE TENEMOS QUE PAGAR");
      }else if(diferencia==0){
          informacion.setText("NO PRESENTA DIFERENCIA");
          jtfDiferencia.setForeground(Color.BLACK);
      }else{
          informacion.setText("PRESENTA UNA DIFERENCIA A SU FAVOR");
          jtfDiferencia.setForeground(Color.BLACK);
      }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        imagenes1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        botRecuento = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtf500 = new javax.swing.JTextField();
        jtf200 = new javax.swing.JTextField();
        jtf100 = new javax.swing.JTextField();
        jtf50 = new javax.swing.JTextField();
        jtf20 = new javax.swing.JTextField();
        jtf10 = new javax.swing.JTextField();
        jtf5 = new javax.swing.JTextField();
        jtf2 = new javax.swing.JTextField();
        jtf1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtfSaldoIni = new javax.swing.JTextField();
        jtfCajaTotal = new javax.swing.JTextField();
        botResumen = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtfTotalEfectivo = new javax.swing.JTextField();
        jtfTarjeta = new javax.swing.JTextField();
        jtfGastos = new javax.swing.JTextField();
        botCaja = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtfTotalVenta = new javax.swing.JTextField();
        jlbEfectivo = new javax.swing.JTextField();
        jlbTarjeta = new javax.swing.JTextField();
        jlbGastos = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jtfCajaT = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jtfSaldoI = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jtfDiferencia = new javax.swing.JTextField();
        botCierre = new javax.swing.JButton();
        informacion = new javax.swing.JLabel();

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        jPanel3.setBackground(new java.awt.Color(255, 0, 51));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ARQUEO DE CAJA");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);
        jPanel4.add(imagenes1);
        imagenes1.setBounds(0, 0, 160, 150);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1160, 180);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "EFECTIVO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 0, 0))); // NOI18N

        botRecuento.setBackground(new java.awt.Color(255, 255, 0));
        botRecuento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botRecuento.setText("RECUENTO");
        botRecuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botRecuentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botRecuentoMouseExited(evt);
            }
        });
        botRecuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRecuentoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("500 L.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("200 L.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("100 L.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("50 L.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("20 L.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("10 L.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("5 L.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("2 L.");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("1 L.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf100, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtf20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf50, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf200, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf500)))
                .addGap(135, 135, 135))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(botRecuento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(botRecuento)
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(20, 190, 300, 560);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "CAJA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("SALDO INICIAL L.");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("TOTAL EN CAJA L.");

        botResumen.setBackground(new java.awt.Color(255, 255, 51));
        botResumen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botResumen.setText("EJECUTAR RESUMEN DE CAJA");
        botResumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botResumenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botResumenMouseExited(evt);
            }
        });
        botResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botResumenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfSaldoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfCajaTotal))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(botResumen)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtfSaldoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtfCajaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(botResumen)
                .addContainerGap())
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(340, 200, 340, 190);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "FORMA DE PAGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel7.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("EFECTIVO L.");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(17, 33, 89, 17);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("TARJETA L.");
        jPanel7.add(jLabel16);
        jLabel16.setBounds(20, 90, 80, 17);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("GASTOS L.");
        jPanel7.add(jLabel17);
        jLabel17.setBounds(20, 140, 74, 17);
        jPanel7.add(jtfTotalEfectivo);
        jtfTotalEfectivo.setBounds(111, 31, 142, 22);

        jtfTarjeta.setEnabled(false);
        jPanel7.add(jtfTarjeta);
        jtfTarjeta.setBounds(110, 90, 144, 22);
        jPanel7.add(jtfGastos);
        jtfGastos.setBounds(110, 140, 144, 22);

        botCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/check-mark-8-24.png"))); // NOI18N
        botCaja.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botCajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botCajaMouseExited(evt);
            }
        });
        botCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCajaActionPerformed(evt);
            }
        });
        jPanel7.add(botCaja);
        botCaja.setBounds(310, 130, 30, 30);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(700, 200, 390, 190);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("RESUMEN DE CAJA");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(276, 276, 276))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap())
        );

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("TOTAL VENTA L.");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("EFECTIVO L.");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("TARJETA L.");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("GASTOS DE CAJA L.");

        jtfTotalVenta.setBackground(new java.awt.Color(255, 255, 0));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("TOTAL EN CAJA L.");

        jtfCajaT.setBackground(new java.awt.Color(255, 255, 0));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("SALDO INICIAL L.");

        jtfSaldoI.setBackground(new java.awt.Color(255, 255, 0));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("DIFERENCIA L.");

        jtfDiferencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        botCierre.setBackground(new java.awt.Color(255, 255, 0));
        botCierre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botCierre.setText("EJECUTAR CIERRE");
        botCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botCierreMouseExited(evt);
            }
        });
        botCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCierreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCajaT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfTotalVenta)
                            .addComponent(jlbEfectivo)
                            .addComponent(jlbTarjeta)
                            .addComponent(jlbGastos, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botCierre)
                    .addComponent(jtfSaldoI, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jtfTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jlbEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jlbGastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jtfCajaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jtfSaldoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jtfDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botCierre)))
                .addContainerGap())
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(340, 400, 750, 350);

        informacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(informacion);
        informacion.setBounds(20, 770, 1080, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCajaActionPerformed
        // TODO add your handling code here:
        this.Caja();
    }//GEN-LAST:event_botCajaActionPerformed

    private void botRecuentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botRecuentoMouseEntered
        // TODO add your handling code here:
        informacion.setText("PRESIONE PARA REALIZAR RECUENTO DE EFECTIVO");
        botRecuento.setBackground(Color.green);
    }//GEN-LAST:event_botRecuentoMouseEntered

    private void botRecuentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botRecuentoMouseExited
        // TODO add your handling code here:
        informacion.setText(null);
        botRecuento.setBackground(new Color(255,255,0));
    }//GEN-LAST:event_botRecuentoMouseExited

    private void botCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botCierreMouseEntered
        // TODO add your handling code here:
        informacion.setText("PRESIONE PARA REALIZAR RECUENTO DE EFECTIVO");
        botCierre.setBackground(Color.green);
    }//GEN-LAST:event_botCierreMouseEntered

    private void botCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botCierreMouseExited
        // TODO add your handling code here:
        informacion.setText(null);
        botCierre.setBackground(new Color(255,255,0)); 
    }//GEN-LAST:event_botCierreMouseExited

    private void botResumenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botResumenMouseEntered
        // TODO add your handling code here:
        informacion.setText("PRESIONE PARA REALIZAR RECUENTO DE EFECTIVO");
        botResumen.setBackground(Color.green);
    }//GEN-LAST:event_botResumenMouseEntered

    private void botResumenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botResumenMouseExited
        // TODO add your handling code here:
        informacion.setText(null);
        botResumen.setBackground(new Color(255,255,0));
    }//GEN-LAST:event_botResumenMouseExited

    private void botRecuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRecuentoActionPerformed
        // TODO add your handling code here:
        recuentoEfectivo();
        jtfTotalEfectivo.setText(String.valueOf(acumEfectivo));
        botCaja.setEnabled(true);
    }//GEN-LAST:event_botRecuentoActionPerformed

    private void botResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botResumenActionPerformed
        // TODO add your handling code here:
        if(validacion()){
            jtfTotalVenta.setText(""+totalC);
            jlbEfectivo.setText(""+efectivo);
            jlbTarjeta.setText(""+tarjeta);
            jlbGastos.setText(""+gastos);
            jtfCajaT.setText(""+totalGeneraCaja);
            jtfSaldoI.setText(""+saldoI);
            diferencia();
        }else{
            validar=true;
        }
    }//GEN-LAST:event_botResumenActionPerformed

    private void botCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCierreActionPerformed
        // TODO add your handling code here:
        
   int opcion=JOptionPane.showConfirmDialog(null, "¿Desea realizar el cierre?","Seleccione una opción.",JOptionPane.YES_NO_OPTION);
        if(opcion==0){
            JOptionPane.showMessageDialog(null, "CIERRE REALIZADO CORRECTAMENTE.","CIERRE DE CAJA",2);
        }
          this.limpiar();
        
    }//GEN-LAST:event_botCierreActionPerformed

    private void botCajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botCajaMouseEntered
        // TODO add your handling code here:
        informacion.setText("PRESIONE PARA REALIZAR RECUENTO DE EFECTIVO");
        botCaja.setBackground(Color.green);
    }//GEN-LAST:event_botCajaMouseEntered

    private void botCajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botCajaMouseExited
        // TODO add your handling code here:
        informacion.setText(null);
        botCaja.setBackground(new Color(255,255,0));
    }//GEN-LAST:event_botCajaMouseExited

    
   public void limpiar(){
   this.jtfSaldoIni.setText(null);
   this.jtfCajaTotal.setText(null);
   this.jtfTotalEfectivo.setText(null);
   this.jtfTarjeta.setText(null);
   this.jtfGastos.setText(null);
   this.jtfTotalVenta.setText(null);
   this.jlbEfectivo.setText(null);
   this.jlbTarjeta.setText(null);
   this.jlbGastos.setText(null);
   this.jtfCajaT.setText(null);
   this.jtfSaldoI.setText(null);
   this.jtfDiferencia.setText(null);
   this.jtf500.setText(null);
   this.jtf200.setText(null);
   this.jtf100.setText(null);
   this.jtf50.setText(null);
   this.jtf20.setText(null);
   this.jtf10.setText(null);
   this.jtf5.setText(null);
   this.jtf2.setText(null);
   this.jtf1.setText(null);
       
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
            java.util.logging.Logger.getLogger(Arqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arqueo(1000,2000).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCaja;
    private javax.swing.JButton botCierre;
    private javax.swing.JButton botRecuento;
    private javax.swing.JButton botResumen;
    private javax.swing.JLabel imagenes1;
    private javax.swing.JLabel informacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jlbEfectivo;
    private javax.swing.JTextField jlbGastos;
    private javax.swing.JTextField jlbTarjeta;
    private javax.swing.JTextField jtf1;
    private javax.swing.JTextField jtf10;
    private javax.swing.JTextField jtf100;
    private javax.swing.JTextField jtf2;
    private javax.swing.JTextField jtf20;
    private javax.swing.JTextField jtf200;
    private javax.swing.JTextField jtf5;
    private javax.swing.JTextField jtf50;
    private javax.swing.JTextField jtf500;
    private javax.swing.JTextField jtfCajaT;
    private javax.swing.JTextField jtfCajaTotal;
    private javax.swing.JTextField jtfDiferencia;
    private javax.swing.JTextField jtfGastos;
    private javax.swing.JTextField jtfSaldoI;
    private javax.swing.JTextField jtfSaldoIni;
    private javax.swing.JTextField jtfTarjeta;
    private javax.swing.JTextField jtfTotalEfectivo;
    private javax.swing.JTextField jtfTotalVenta;
    // End of variables declaration//GEN-END:variables

   
}
