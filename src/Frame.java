
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.Image;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Placeholder;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
        this.setSize(600, 320);
        this.setLocationRelativeTo(null);
        Placeholder placeholder = new Placeholder("192.168.10.0/24", ipAdd);
        Icono();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ipBroad = new javax.swing.JTextField();
        calculateBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ipAdd = new javax.swing.JTextField();
        ipNet = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        subMask = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        devCant = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 102, 153));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUBNETING");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 600, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Broadcast IP:");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        ipBroad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ipBroad.setEnabled(false);
        panel.add(ipBroad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 150, -1));

        calculateBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        calculateBtn.setText("Calculate");
        calculateBtn.setFocusPainted(false);
        calculateBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });
        panel.add(calculateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 120, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Insert the IP address: ");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Network IP:");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        ipAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panel.add(ipAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 190, -1));

        ipNet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ipNet.setEnabled(false);
        panel.add(ipNet, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Subnet mask:");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        subMask.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subMask.setEnabled(false);
        panel.add(subMask, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Devices:");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        devCant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        devCant.setEnabled(false);
        panel.add(devCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Icono() {
        Image icon = new ImageIcon(getClass().getResource("/images/router.png")).getImage();
        setIconImage(icon);
    }
    
    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        if (validateInput()) {
            String ipDirection[] = getArrayOfIp();
            String totalBits = "";
            String subnetMask = getSubnetMask(ipDirection[4]);

            for (int i = 0; i < (ipDirection.length) - 1; i++) {
                String ipPart = ipDirection[i]; //Solo obtenemos las 4 partes de la direccion IPv4
                totalBits += getBinary(ipPart);
            }

            String maxIpAdd = limitsOfIp(totalBits, subnetMask, 1);
            String minIpAdd = limitsOfIp(totalBits, subnetMask, 0);

            ipNet.setText(getNewIp(minIpAdd));
            ipBroad.setText(getNewIp(maxIpAdd));
            subMask.setText(getNewIp(subnetMask));
            devCant.setText(String.valueOf(qetQuantityDev(ipDirection[4])));
        }
    }//GEN-LAST:event_calculateBtnActionPerformed

    private String[] getArrayOfIp() {
        String parts[] = new String[5];
        int cont = 0;
        String ip = ipAdd.getText();
        String ipParts[] = ip.split("\\.");
        for (String ipPart : ipParts) {
            if (ipPart.contains("/")) {
                String lastPart[] = ipPart.split("/");
                parts[3] = lastPart[0];
                parts[4] = lastPart[1];
                break;
            }
            parts[cont] = ipPart;
            cont++;
        }
        return parts;
    }

    private String getBinary(String intNumber) {
        String binary = Integer.toBinaryString(Integer.parseInt(intNumber));
        if (binary.length() < 8) {
            int diferencia = 8 - binary.length();
            String stringCero = "";
            for (int i = 0; i < diferencia; i++) {
                stringCero += "0";
            }
            return stringCero + binary;
        }
        return binary;
    }

    private String getSubnetMask(String subnet) {
        String subnetMask = "";
        int prefix = Integer.parseInt(subnet);
        for (int i = 0; i < prefix; i++) {
            subnetMask += "1";
        }
        if (subnetMask.length() < 32) {
            int diferencia = 32 - subnetMask.length();
            String stringCero = "";
            for (int i = 0; i < diferencia; i++) {
                stringCero += "0";
            }
            return subnetMask + stringCero;
        }

        return subnetMask;
    }

    private String limitsOfIp(String ipAdd, String subnet, int max) {
        String maxIP = "";
        for (int i = 0; i < 32; i++) {
            if (subnet.charAt(i) == '1') {
                maxIP += ipAdd.charAt(i);
            } else {
                maxIP += max == 1 ? "1" : "0";
            }
        }
        return maxIP;
    }

    private String getNewIp(String ipAdd) {
        String ipParts[] = new String[4];
        String newIp = "";
        for (int i = 0; i < 4; i++) {
            ipParts[i] = ipAdd.substring(i * 8, (i * 8) + 8);
            newIp += Integer.parseInt(ipParts[i], 2) + (i < 3 ? "." : "");
        }
        return newIp;
    }

    private int qetQuantityDev(String subnetMask) {
        int elevation = 32 - Integer.parseInt(subnetMask);
        double quantity = (Math.pow(2, elevation) - 2);
        return (int) quantity;
    }

    private boolean validateInput() {
        String ip = ipAdd.getText();
        if (ip.length() == 0) {
            JOptionPane.showMessageDialog(null, "You haven't inserted the IP");
            return false;
        }
        String ipParts[] = ip.split("\\.");
        if (ipParts.length != 4 || !ipParts[3].contains("/")) {
            JOptionPane.showMessageDialog(null, "Insert the IP in a correct format");
            return false;
        }
        return true;
    }

    private static void lookAndFeel() {
        Properties props = new Properties();
        props.put("logoString", " Menú");
        GraphiteLookAndFeel.setCurrentTheme(props);
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LookAndFeel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            lookAndFeel();
            new Frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateBtn;
    private javax.swing.JTextField devCant;
    private javax.swing.JTextField ipAdd;
    private javax.swing.JTextField ipBroad;
    private javax.swing.JTextField ipNet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField subMask;
    // End of variables declaration//GEN-END:variables
}
