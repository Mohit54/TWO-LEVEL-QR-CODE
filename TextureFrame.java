/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qrcode;
import javax.swing.ImageIcon;
import java.io.File;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.PixelGrabber;
import java.awt.image.BufferedImage;
import java.awt.image.ImageProducer;
import java.awt.image.MemoryImageSource;
import java.awt.image.ImageObserver;
import java.awt.image.VolatileImage;
import javax.imageio.ImageIO;
import java.util.Random;
import java.util.Vector;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;

import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
/**
 *
 * @author admin
 */
public class TextureFrame extends javax.swing.JFrame {

    /**
     * Creates new form TextureFrame
     */
    public TextureFrame() {
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 28)); // NOI18N
        jLabel1.setText("Textured Pattern");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton1.setText("Print & Scan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton2.setText("Correlation");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(25, 25, 25)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(114, 114, 114)))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jButton1)))
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(426, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            ImageIcon ic=new ImageIcon("gr.jpg");
            ImageIcon ic1=new ImageIcon("P1.jpg");
            ImageIcon ic2=new ImageIcon("P2.jpg");
            ImageIcon ic3=new ImageIcon("P3.jpg");

            Image grimg=ic.getImage();
            Image img1=ic1.getImage();
            Image img2=ic2.getImage();
            Image img3=ic3.getImage();

            int w=ic.getIconWidth();
            int h=ic.getIconHeight();

            int pel[]=new int[h*w];
            int pel1[]=new int[h*w];
            int pel2[]=new int[h*w];
            int pel3[]=new int[h*w];

            PixelGrabber pg = new PixelGrabber(grimg,0,0,w,h,pel,0,w);
            pg.grabPixels();

            PixelGrabber pg1 = new PixelGrabber(img1,0,0,w,h,pel1,0,w);
            pg1.grabPixels();

            PixelGrabber pg2 = new PixelGrabber(img2,0,0,w,h,pel2,0,w);
            pg2.grabPixels();

            PixelGrabber pg3 = new PixelGrabber(img3,0,0,w,h,pel3,0,w);
            pg3.grabPixels();

            int newpix1[]=new int[h*w];

            int ct1=0;
            int c1=0;
            for(int i=0;i<pel.length;i++)
            {

                newpix1[ct1]=pel[c1] & pel1[c1]; // corr
                c1++;
                ct1++;
            }

            ImageProducer ip1= new MemoryImageSource(w, h, newpix1, 0, w);

            Image iim1=createImage(ip1);

            BufferedImage rd1=toBufferedImage(iim1,1); // method call
            ImageIO.write(rd1, "jpg", new File("ps1.jpg"));

            int newpix2[]=new int[h*w];

            int ct2=0;
            int c2=0;
            for(int i=0;i<pel.length;i++)
            {

                newpix2[ct2]=pel[c2] & pel2[c2]; // corr
                c2++;
                ct2++;
            }

            ImageProducer ip2= new MemoryImageSource(w, h, newpix2, 0, w);

            Image iim2=createImage(ip2);

            BufferedImage rd2=toBufferedImage(iim2,1);  // method call
            ImageIO.write(rd2, "jpg", new File("ps2.jpg"));

            int newpix3[]=new int[h*w];

            int ct3=0;
            int c3=0;
            for(int i=0;i<pel.length;i++)
            {

                newpix3[ct3]=pel[c3] & pel3[c3]; // corr
                c3++;
                ct3++;
            }

            ImageProducer ip3= new MemoryImageSource(w, h, newpix3, 0, w);

            Image iim3=createImage(ip3);   

            BufferedImage rd3=toBufferedImage(iim3,1);  // method call
            ImageIO.write(rd3, "jpg", new File("ps3.jpg"));

            jLabel5.setIcon(new ImageIcon("ps1.jpg"));
            jLabel6.setIcon(new ImageIcon("ps2.jpg"));
            jLabel7.setIcon(new ImageIcon("ps3.jpg"));

            jButton2.setEnabled(true);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            // Compute Correlation

            BufferedImage bimg1=ImageIO.read(new File("P1.jpg"));
            int w=bimg1.getWidth();
            int h=bimg1.getHeight();

            BufferedImage bimg2=ImageIO.read(new File("P2.jpg"));
            BufferedImage bimg3=ImageIO.read(new File("P3.jpg"));

            BufferedImage psimg1=ImageIO.read(new File("ps1.jpg"));
            BufferedImage psimg2=ImageIO.read(new File("ps2.jpg"));
            BufferedImage psimg3=ImageIO.read(new File("ps3.jpg"));

            double b1[]=new double[w*h];
            double b2[]=new double[w*h];
            double b3[]=new double[w*h];

            double ps1[]=new double[w*h];
            double ps2[]=new double[w*h];
            double ps3[]=new double[w*h];

            int k=0;
            for(int i=0;i<w;i++)
            {
                for(int j=0;j<h;j++)
                {
                    b1[k]=bimg1.getRGB(i, j);
                    b2[k]=bimg2.getRGB(i, j);
                    b3[k]=bimg3.getRGB(i, j);

                    ps1[k]=psimg1.getRGB(i, j);
                    ps2[k]=psimg2.getRGB(i, j);
                    ps3[k]=psimg3.getRGB(i, j);

                    k++;
                }
            }

            PearsonsCorrelation pc=new PearsonsCorrelation();
            double v11=pc.correlation(b1, ps1);
            double v12=pc.correlation(b1, ps2);
            double v13=pc.correlation(b1, ps3);

            double v21=pc.correlation(b2, ps1);
            double v22=pc.correlation(b2, ps2);
            double v23=pc.correlation(b2, ps3);

            double v31=pc.correlation(b3, ps1);
            double v32=pc.correlation(b3, ps2);
            double v33=pc.correlation(b3, ps3);

            double min1=Math.min(v11-v12,v11-v13);
            min1=Math.min(min1, v11-v21);
            min1=Math.min(min1, v11-v31);

            if(min1>1)
            min1=1;

            double min2=Math.min(v22-v12,v22-v32);
            min2=Math.min(min2, v22-v21);
            min2=Math.min(min2, v22-v23);

            if(min2>1)
            min2=1;

            double min3=Math.min(v33-v13,v33-v23);
            min3=Math.min(min3, v33-v31);
            min3=Math.min(min3, v33-v32);

            if(min3>1)
            min3=1;

            System.out.println(v11+" : "+v12+" : "+v13);
            System.out.println(v21+" : "+v22+" : "+v23);
            System.out.println(v31+" : "+v32+" : "+v33);

            DecimalFormat df=new DecimalFormat("#.####");

            CorrelationFrame cf=new CorrelationFrame();
            DefaultTableModel dm=(DefaultTableModel)cf.jTable1.getModel();
            Vector v1=new Vector();
            v1.add("S1");
            v1.add(df.format(v11));
            v1.add(df.format(v12));
            v1.add(df.format(v13));
            dm.addRow(v1);

            Vector v2=new Vector();
            v2.add("S2");
            v2.add(df.format(v21));
            v2.add(df.format(v22));
            v2.add(df.format(v23));
            dm.addRow(v2);

            Vector v3=new Vector();
            v3.add("S3");
            v3.add(df.format(v31));
            v3.add(df.format(v32));
            v3.add(df.format(v33));
            dm.addRow(v3);

            Vector v4=new Vector();
            v4.add("min{ei1,ei2}");
            v4.add(df.format(min1));
            v4.add(df.format(min2));
            v4.add(df.format(min3));
            dm.addRow(v4);

            cf.setVisible(true);
            cf.setTitle("Correlation");
            cf.setResizable(false);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public BufferedImage toBufferedImage(final Image image, final int type)
    {
        if (image instanceof BufferedImage)
            return (BufferedImage) image;
        if (image instanceof VolatileImage)
            return ((VolatileImage) image).getSnapshot();
        loadImage(image);  // method call
        final BufferedImage buffImg = new BufferedImage(image.getWidth(null), image.getHeight(null), type);
        final Graphics2D g2 = buffImg.createGraphics();
        g2.drawImage(image, null, null);
        g2.dispose();
      return buffImg;
    }

    private void loadImage(final Image image)
    {
        class StatusObserver implements ImageObserver
        {
            boolean imageLoaded = false;
            public boolean imageUpdate(final Image img, final int infoflags,
          final int x, final int y, final int width, final int height)
            {
              
                if (infoflags == ALLBITS)
                {
                    synchronized (this)
                    {
                        imageLoaded = true;
                        notify();
                    }
                    return true;
                }
                return false;
            }
        }
        final StatusObserver imageStatus = new StatusObserver();
        synchronized (imageStatus) {
        if (image.getWidth(imageStatus) == -1 || image.getHeight(imageStatus) == -1)
        {
            while (!imageStatus.imageLoaded)
            {
                try
                {
                    imageStatus.wait();
                } catch (InterruptedException ex) {}
            }
        }
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
            java.util.logging.Logger.getLogger(TextureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextureFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
