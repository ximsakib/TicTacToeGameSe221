
//import libary
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZIM
 */
public class Game extends javax.swing.JFrame {

    public static String firstName;
    public  static String SecondName;

    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    
    public Game() {

        initComponents();
        
    }

    //set x and 0 players score
    
    private void gameScore(){
        playerxSc.setText(String.valueOf(": " + xCount));
        playeroSc.setText(String.valueOf(": " + oCount));

        
    }
    public void setFirstPlayer(String name){
        playersTurn.setText(name + "'s Turn");
        
        playerxScore.setText(firstName);
        playeroScore.setText(SecondName);
    }
    private void choose_a_player(){
        if (startGame.equalsIgnoreCase("X")){
            startGame = "O";
            playersTurn.setText(SecondName + "'s Turn");
        }else {
            startGame = "X";
            playersTurn.setText(firstName + "'s Turn");
        }
    }
    
    private void winningGame(){
        String b1 = textbtn1.getText(); 
        String b2 = textbtn2.getText();
        String b3 = textbtn3.getText();        

        String b4 = textbtn4.getText();        
        String b5 = textbtn5.getText();        
        String b6 = textbtn6.getText();        

        String b7 = textbtn7.getText();        
        String b8 = textbtn8.getText();        
        String b9 = textbtn9.getText();        
        
//Player x
if (b1 == ("X") && b2 == ("X") && b3 == ("X")){
    JOptionPane.showMessageDialog(this,firstName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    
    textbtn1.setBackground(Color.GREEN);
    textbtn2.setBackground(Color.GREEN);
    textbtn3.setBackground(Color.GREEN);
}

if (b4 == ("X") && b5 == ("X") && b6 == ("X")){
    JOptionPane.showMessageDialog(this,firstName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    
    textbtn4.setBackground(Color.GREEN);
    textbtn5.setBackground(Color.GREEN);
    textbtn6.setBackground(Color.GREEN);
    
    
}
if (b7 == ("X") && b8 == ("X") && b9 == ("X")){
    JOptionPane.showMessageDialog(this,firstName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    
    textbtn7.setBackground(Color.GREEN);
    textbtn8.setBackground(Color.GREEN);
    textbtn9.setBackground(Color.GREEN);
    
    
}

if (b1 == ("X") && b5 == ("X") && b9 == ("X")){
    JOptionPane.showMessageDialog(this,firstName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    
    textbtn1.setBackground(Color.GREEN);
    textbtn5.setBackground(Color.GREEN);
    textbtn9.setBackground(Color.GREEN);
    
    
}


if (b3 == ("X") && b5 == ("X") && b7 == ("X")){
    JOptionPane.showMessageDialog(this,firstName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    
    textbtn3.setBackground(Color.GREEN);
    textbtn5.setBackground(Color.GREEN);
    textbtn7.setBackground(Color.GREEN);
    
    
}

if (b2 == ("X") && b5 == ("X") && b8 == ("X")){
    JOptionPane.showMessageDialog(this,firstName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    
    textbtn2.setBackground(Color.GREEN);
    textbtn5.setBackground(Color.GREEN);
    textbtn8.setBackground(Color.GREEN);
    
    
}
       
if (b1 == ("X") && b4 == ("X") && b7 == ("X")){
    JOptionPane.showMessageDialog(this,firstName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    
    textbtn1.setBackground(Color.GREEN);
    textbtn4.setBackground(Color.GREEN);
    textbtn7.setBackground(Color.GREEN);
    
    
}

if (b3 == ("X") && b6 == ("X") && b9 == ("X")){
    JOptionPane.showMessageDialog(this,firstName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    xCount++;
    gameScore();
    
    textbtn3.setBackground(Color.GREEN);
    textbtn6.setBackground(Color.GREEN);
    textbtn9.setBackground(Color.GREEN);
    
    
}

//Player o win
if (b1 == ("O") && b2 == ("O") && b3 == ("O")){
    JOptionPane.showMessageDialog(this,SecondName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    
    textbtn1.setBackground(Color.GREEN);
    textbtn2.setBackground(Color.GREEN);
    textbtn3.setBackground(Color.GREEN);
}

if (b4 == ("O") && b5 == ("O") && b6 == ("O")){
    JOptionPane.showMessageDialog(this,SecondName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    
    textbtn4.setBackground(Color.GREEN);
    textbtn5.setBackground(Color.GREEN);
    textbtn6.setBackground(Color.GREEN);
    
    
}
if (b7 == ("O") && b8 == ("O") && b9 == ("O")){
    JOptionPane.showMessageDialog(this,SecondName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    
    textbtn7.setBackground(Color.GREEN);
    textbtn8.setBackground(Color.GREEN);
    textbtn9.setBackground(Color.GREEN);
    
    
}

if (b1 == ("O") && b5 == ("O") && b9 == ("O")){
    JOptionPane.showMessageDialog(this,SecondName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    
    textbtn1.setBackground(Color.GREEN);
    textbtn5.setBackground(Color.GREEN);
    textbtn9.setBackground(Color.GREEN);
    
    
}


if (b3 == ("O") && b5 == ("O") && b7 == ("O")){
    JOptionPane.showMessageDialog(this,SecondName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    
    textbtn3.setBackground(Color.GREEN);
    textbtn5.setBackground(Color.GREEN);
    textbtn7.setBackground(Color.GREEN);
    
    
}

if (b2 == ("O") && b5 == ("O") && b8 == ("O")){
    JOptionPane.showMessageDialog(this,SecondName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    
    textbtn2.setBackground(Color.GREEN);
    textbtn5.setBackground(Color.GREEN);
    textbtn8.setBackground(Color.GREEN);
    
    
}
       
if (b1 == ("O") && b4 == ("O") && b7 == ("O")){
    JOptionPane.showMessageDialog(this,SecondName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    
    textbtn1.setBackground(Color.GREEN);
    textbtn4.setBackground(Color.GREEN);
    textbtn7.setBackground(Color.GREEN);
    
    
}

if (b3 == ("O") && b6 == ("O") && b9 == ("O")){
    JOptionPane.showMessageDialog(this,SecondName + " Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    oCount++;
    gameScore();
    
    textbtn3.setBackground(Color.GREEN);
    textbtn6.setBackground(Color.GREEN);
    textbtn9.setBackground(Color.GREEN);
    
    
}
  /// finish       
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textbtn3 = new javax.swing.JButton();
        textbtn1 = new javax.swing.JButton();
        textbtn2 = new javax.swing.JButton();
        textbtn6 = new javax.swing.JButton();
        textbtn4 = new javax.swing.JButton();
        textbtn5 = new javax.swing.JButton();
        textReset = new javax.swing.JButton();
        textbtn7 = new javax.swing.JButton();
        textbtn8 = new javax.swing.JButton();
        textbtn9 = new javax.swing.JButton();
        textExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerxScore = new javax.swing.JLabel();
        playeroScore = new javax.swing.JLabel();
        playerxSc = new javax.swing.JLabel();
        playeroSc = new javax.swing.JLabel();
        playersTurn = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Ubuntu Medium", 1, 36)); // NOI18N
        jLabel1.setText("TIC TAC TOE");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        jLabel2.setText("Powered By Kernel");

        jLabel3.setText("Version 2.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(235, 235, 235))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                .addContainerGap())
        );

        textbtn3.setFont(new java.awt.Font("Ubuntu Medium", 1, 48)); // NOI18N
        textbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn3ActionPerformed(evt);
            }
        });

        textbtn1.setFont(new java.awt.Font("Ubuntu Medium", 1, 48)); // NOI18N
        textbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn1ActionPerformed(evt);
            }
        });

        textbtn2.setFont(new java.awt.Font("Ubuntu Medium", 1, 48)); // NOI18N
        textbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn2ActionPerformed(evt);
            }
        });

        textbtn6.setFont(new java.awt.Font("Ubuntu Medium", 1, 48)); // NOI18N
        textbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn6ActionPerformed(evt);
            }
        });

        textbtn4.setFont(new java.awt.Font("Ubuntu Medium", 1, 48)); // NOI18N
        textbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn4ActionPerformed(evt);
            }
        });

        textbtn5.setFont(new java.awt.Font("Ubuntu Medium", 1, 48)); // NOI18N
        textbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn5ActionPerformed(evt);
            }
        });

        textReset.setBackground(new java.awt.Color(0, 204, 102));
        textReset.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        textReset.setText("RESET");
        textReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textResetActionPerformed(evt);
            }
        });

        textbtn7.setFont(new java.awt.Font("Ubuntu Medium", 1, 48)); // NOI18N
        textbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn7ActionPerformed(evt);
            }
        });

        textbtn8.setFont(new java.awt.Font("Ubuntu Medium", 1, 48)); // NOI18N
        textbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn8ActionPerformed(evt);
            }
        });

        textbtn9.setFont(new java.awt.Font("Ubuntu Medium", 1, 48)); // NOI18N
        textbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbtn9ActionPerformed(evt);
            }
        });

        textExit.setBackground(new java.awt.Color(255, 0, 0));
        textExit.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        textExit.setText("EXIT");
        textExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textExitActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        playerxScore.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        playerxScore.setText("Player X :");

        playeroScore.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        playeroScore.setText("Player 0 :");

        playerxSc.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        playerxSc.setForeground(new java.awt.Color(0, 102, 102));
        playerxSc.setText(": 0");

        playeroSc.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        playeroSc.setForeground(new java.awt.Color(0, 102, 102));
        playeroSc.setText(": 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(playeroScore, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playeroSc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playerxScore, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerxSc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerxScore, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerxSc, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playeroScore, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playeroSc, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        playersTurn.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        playersTurn.setForeground(new java.awt.Color(0, 153, 102));
        playersTurn.setText("Player X Turn");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textReset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textExit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(playersTurn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playersTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textExit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textReset, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// button choose
    private void textbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn3ActionPerformed
        // TODO add your handling code here:
        textbtn3.setText(startGame);
       if (startGame.equalsIgnoreCase("X")){
            textbtn3.setForeground(Color.red);
        }else {
            textbtn3.setForeground(Color.DARK_GRAY);

        }
        choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_textbtn3ActionPerformed

    private void textbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn1ActionPerformed
        // TODO add your handling code here:
        textbtn1.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            textbtn1.setForeground(Color.red);
        }else {
            textbtn1.setForeground(Color.DARK_GRAY);

        }
        choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_textbtn1ActionPerformed

    private void textbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn2ActionPerformed
        // TODO add your handling code here:
        textbtn2.setText(startGame);
                
        if (startGame.equalsIgnoreCase("X")){
            textbtn2.setForeground(Color.red);
        }else {
            textbtn2.setForeground(Color.DARK_GRAY);

        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_textbtn2ActionPerformed

    private void textbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn6ActionPerformed
        // TODO add your handling code here:
          textbtn6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            textbtn6.setForeground(Color.red);
        }else {
            textbtn6.setForeground(Color.DARK_GRAY);

        }
        choose_a_player();  
        winningGame();
        

    }//GEN-LAST:event_textbtn6ActionPerformed

    private void textbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn4ActionPerformed
        // TODO add your handling code here:
        textbtn4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            textbtn4.setForeground(Color.red);
        }else {
            textbtn4.setForeground(Color.DARK_GRAY);

        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_textbtn4ActionPerformed

    private void textbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn5ActionPerformed
        // TODO add your handling code here:
        textbtn5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            textbtn5.setForeground(Color.red);
        }else {
            textbtn5.setForeground(Color.DARK_GRAY);

        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_textbtn5ActionPerformed

    private void textResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textResetActionPerformed
        // TODO add your handling code here:
        textbtn1.setText(null);
        textbtn2.setText(null);
        textbtn3.setText(null);
        textbtn4.setText(null);
        textbtn5.setText(null);
        textbtn6.setText(null);
        textbtn7.setText(null);
        textbtn8.setText(null);
        textbtn9.setText(null);
        
        textbtn1.setBackground(Color.LIGHT_GRAY);
        textbtn2.setBackground(Color.LIGHT_GRAY);
        textbtn3.setBackground(Color.LIGHT_GRAY);
        textbtn4.setBackground(Color.LIGHT_GRAY);
        textbtn5.setBackground(Color.LIGHT_GRAY);
        textbtn6.setBackground(Color.LIGHT_GRAY);
        textbtn7.setBackground(Color.LIGHT_GRAY);
        textbtn8.setBackground(Color.LIGHT_GRAY);
        textbtn9.setBackground(Color.LIGHT_GRAY);
        
        choose_a_player();
        choose_a_player();
        
        
        
    }//GEN-LAST:event_textResetActionPerformed

    private void textbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn7ActionPerformed
        // TODO add your handling code here:
        textbtn7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            textbtn7.setForeground(Color.red);
        }else {
            textbtn7.setForeground(Color.DARK_GRAY);

        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_textbtn7ActionPerformed

    private void textbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn8ActionPerformed
        // TODO add your handling code here:
        textbtn8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            textbtn8.setForeground(Color.red);
        }else {
            textbtn8.setForeground(Color.DARK_GRAY);

        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_textbtn8ActionPerformed

    private void textbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbtn9ActionPerformed
        // TODO add your handling code here:
        textbtn9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            textbtn9.setForeground(Color.red);
        }else {
            textbtn9.setForeground(Color.DARK_GRAY);

        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_textbtn9ActionPerformed

    private void textExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textExitActionPerformed
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame,"Confirm want to Exit ?","Tic Tac Toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        
        {
            System.exit(0);
        }
    }//GEN-LAST:event_textExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          Welcome menu = new Welcome();
           menu.show();
           dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playeroSc;
    private javax.swing.JLabel playeroScore;
    private javax.swing.JLabel playersTurn;
    private javax.swing.JLabel playerxSc;
    private javax.swing.JLabel playerxScore;
    private javax.swing.JButton textExit;
    private javax.swing.JButton textReset;
    private javax.swing.JButton textbtn1;
    private javax.swing.JButton textbtn2;
    private javax.swing.JButton textbtn3;
    private javax.swing.JButton textbtn4;
    private javax.swing.JButton textbtn5;
    private javax.swing.JButton textbtn6;
    private javax.swing.JButton textbtn7;
    private javax.swing.JButton textbtn8;
    private javax.swing.JButton textbtn9;
    // End of variables declaration//GEN-END:variables
}
