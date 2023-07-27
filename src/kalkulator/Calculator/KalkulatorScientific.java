/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kalkulator.Calculator;

import java.text.DecimalFormat;
import java.util.Stack;

/**
 *
 * @author asus
 */
public class KalkulatorScientific extends javax.swing.JFrame {
    double result=0,temp=0,input=0;
    String inputNumber = "", sign = "", op = "";
    
    /**
     * Creates new form KalkulatorScientific
     */
    public KalkulatorScientific() {
        initComponents();
    }
    
    
    public void input(String ans){
        
            if(ans.equals("0") || ans.equals("1")|| ans.equals("2")|| ans.equals("3")|| ans.equals("4")|| ans.equals("5")|| ans.equals("6")|| ans.equals("7")|| ans.equals("8")|| ans.equals("9")){
                totField.setText(totField.getText()+ans);
                inputNumber+=ans;
            }
            else if(ans.equals("mod") || ans.equals("+") || ans.equals("-") || ans.equals("*") || ans.equals("/") || ans.equals("=")){
                if(!inputNumber.equals("")){
                    opCalculate();
                    tabakaku();
                }
                totField.setText(totField.getText()+ ans);
                inputNumber = "";
                op = "";
                totField.setText(totField.getText()+"");
                outField.setText(Double.toString(result));
                sign = ans;
                if(ans.equals("=")){
                    totField.setText("");
                }
            }
        
            else if(ans.equals("asin(") || ans.equals("acos(") || ans.equals("atan(") || ans.equals("√") || ans.equals("^2") || ans.equals("^") || ans.equals("log(") || ans.equals("ln(") || ans.equals("%")|| ans.equals("!") || ans.equals("e^") || ans.equals("sin(")|| ans.equals("cos(") || ans.equals("tan(")){
                op = ans;
                totField.setText(totField.getText()+ ans);
            }   
          
        
            else if(ans.equals(".")){
                    totField.setText(totField.getText()+ans);
                    inputNumber+=ans;
            }
            else if(ans.equals("+/-")){
                totField.setText(totField.getText()+"");
                op = ans;
            } 
            
            else if(ans.equals("π")){
                totField.setText(totField.getText()+Math.PI);
                inputNumber+=Math.PI;
            } 
            
            else if(ans.equals("e")){
                totField.setText(totField.getText()+Math.E);
                inputNumber+=Math.E;
            } 
            
        }
        
    void opCalculate(){
        if(op.equals("√")){
            input = Double.parseDouble(inputNumber);
            temp = Math.sqrt(input);
        }
        else if(op.equals("^2")){
            input = Double.parseDouble(inputNumber);
            temp = input*input;
        }
        else if(op.equals("+/-")){
            input = Double.parseDouble(inputNumber);
            temp = input*-1;
        }
        else if(op.equals("atan(")){
            input = Double.parseDouble(inputNumber);
            temp = Math.atan(input);
        }
        else if(op.equals("^")){
            input = Double.parseDouble(inputNumber);
            temp = Math.pow(result, input);
        }
        else if(op.equals("log(")){
            input = Double.parseDouble(inputNumber);
            temp = Math.log10(input);
        }
        else if(op.equals("ln(")){
            input = Double.parseDouble(inputNumber);
            temp = Math.log(input);
        }
        else if(op.equals("%")){
            input = Double.parseDouble(inputNumber);
            temp = input/100;
        }
        else if(op.equals("acos(")){
            input = Double.parseDouble(inputNumber);
            temp = Math.acos(input);
        }
        else if(op.equals("asin(")){
            input = Double.parseDouble(inputNumber);
            temp = Math.asin(input);
        }
        else if(op.equals("!")){
            input = Double.parseDouble(inputNumber);
            temp = factorial((int)input);
        }
        else if(op.equals("e^")){
            input = Double.parseDouble(inputNumber);
            temp = Math.exp(input);
        }
        else if(op.equals("sin(")){
            input = Double.parseDouble(inputNumber);
            temp = Math.sin(Math.toRadians(input));
        }
        else if(op.equals("cos(")){
            input = Double.parseDouble(inputNumber);
            temp = Math.cos(Math.toRadians(input));
        }
        else if(op.equals("tan(")){
            input = Double.parseDouble(inputNumber);
            temp = Math.tan(Math.toRadians(input));
        }
        else{
            temp = Double.parseDouble(inputNumber);
        }
    }
    
    void tabakaku(){
        if(sign.equals("+")){
            result+=temp;
        }
        else if(sign.equals("-")){
            result-=temp;
        }
        else if(sign.equals("*")){
            result*=temp;
        }
        else if(sign.equals("/")){
            result/=temp;
        }
        else if(sign.equals("mod")){
            result = result % temp;
        }
        else{
            result = temp;
        }
    }
     
    void ac(){
        result = 0;
        temp = 0;
        input = 0;
        inputNumber = "";
        sign = ""; 
        op = "";
        outField.setText("");
        totField.setText("");
        
    }
    
    public static String removeCharAt(String ans, int pos) {
      return ans.substring(0, pos) + ans.substring(pos + 1);
   }
        void del(){
        String ans = totField.getText();
        if(ans.length()>0){
            ans = removeCharAt(ans,ans.length()-1);
            totField.setText(ans);
        }
        if(inputNumber.length()>0){
            inputNumber = removeCharAt(inputNumber,inputNumber.length()-1);
        }
    }
    
    
    long factorial(int N)
    {
        long multi = 1;
        for (int i = 1; i <= N; i++) {
            multi = multi * i;
        }
        return multi;
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
        outField = new javax.swing.JTextField();
        totField = new javax.swing.JTextField();
        cButton = new javax.swing.JButton();
        percentButton = new javax.swing.JButton();
        factorButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        akarButton = new javax.swing.JButton();
        tanButton = new javax.swing.JButton();
        cosButton = new javax.swing.JButton();
        sinButton = new javax.swing.JButton();
        minButton = new javax.swing.JButton();
        n3Button = new javax.swing.JButton();
        n2Button = new javax.swing.JButton();
        n1Button = new javax.swing.JButton();
        n4Button = new javax.swing.JButton();
        n7Button = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        n0Button = new javax.swing.JButton();
        n8Button = new javax.swing.JButton();
        n5Button = new javax.swing.JButton();
        n6Button = new javax.swing.JButton();
        n9Button = new javax.swing.JButton();
        komaButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        divButton = new javax.swing.JButton();
        mulButton = new javax.swing.JButton();
        lnButton = new javax.swing.JButton();
        exButton = new javax.swing.JButton();
        modButton = new javax.swing.JButton();
        phiButton = new javax.swing.JButton();
        x2Button = new javax.swing.JButton();
        logButton = new javax.swing.JButton();
        plusminButton = new javax.swing.JButton();
        xyButton = new javax.swing.JButton();
        ansButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        arcsinButton = new javax.swing.JButton();
        arctanButton = new javax.swing.JButton();
        arccosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setPreferredSize(new java.awt.Dimension(655, 477));

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kalkulator Scientific");

        cButton.setBackground(new java.awt.Color(255, 0, 0));
        cButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cButton.setText("C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        percentButton.setText("%");
        percentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentButtonActionPerformed(evt);
            }
        });

        factorButton.setText("!");
        factorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorButtonActionPerformed(evt);
            }
        });

        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        akarButton.setText("√");
        akarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akarButtonActionPerformed(evt);
            }
        });

        tanButton.setText("tan");
        tanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanButtonActionPerformed(evt);
            }
        });

        cosButton.setText("cos");
        cosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosButtonActionPerformed(evt);
            }
        });

        sinButton.setText("sin");
        sinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinButtonActionPerformed(evt);
            }
        });

        minButton.setText("-");
        minButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minButtonActionPerformed(evt);
            }
        });

        n3Button.setText("3");
        n3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ButtonActionPerformed(evt);
            }
        });

        n2Button.setText("2");
        n2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ButtonActionPerformed(evt);
            }
        });

        n1Button.setText("1");
        n1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ButtonActionPerformed(evt);
            }
        });

        n4Button.setText("4");
        n4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ButtonActionPerformed(evt);
            }
        });

        n7Button.setText("7");
        n7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ButtonActionPerformed(evt);
            }
        });

        delButton.setText("del");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        n0Button.setText("0");
        n0Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ButtonActionPerformed(evt);
            }
        });

        n8Button.setText("8");
        n8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ButtonActionPerformed(evt);
            }
        });

        n5Button.setText("5");
        n5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ButtonActionPerformed(evt);
            }
        });

        n6Button.setText("6");
        n6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ButtonActionPerformed(evt);
            }
        });

        n9Button.setText("9");
        n9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ButtonActionPerformed(evt);
            }
        });

        komaButton.setText(",");
        komaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komaButtonActionPerformed(evt);
            }
        });

        eButton.setText("e");
        eButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eButtonActionPerformed(evt);
            }
        });

        divButton.setText("/");
        divButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divButtonActionPerformed(evt);
            }
        });

        mulButton.setText("*");
        mulButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulButtonActionPerformed(evt);
            }
        });

        lnButton.setText("ln");
        lnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnButtonActionPerformed(evt);
            }
        });

        exButton.setText("e^x");
        exButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exButtonActionPerformed(evt);
            }
        });

        modButton.setText("mod");
        modButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modButtonActionPerformed(evt);
            }
        });

        phiButton.setText("π");
        phiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phiButtonActionPerformed(evt);
            }
        });

        x2Button.setText("x^2");
        x2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2ButtonActionPerformed(evt);
            }
        });

        logButton.setText("log");
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });

        plusminButton.setText("+/-");
        plusminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminButtonActionPerformed(evt);
            }
        });

        xyButton.setText("x^y");
        xyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xyButtonActionPerformed(evt);
            }
        });

        ansButton.setBackground(new java.awt.Color(51, 153, 255));
        ansButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ansButton.setText("=");
        ansButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Create by : Rifqi, Ikhsan, Zidan & Faris");

        arcsinButton.setText("sin^-1");
        arcsinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcsinButtonActionPerformed(evt);
            }
        });

        arctanButton.setText("tan^-1");
        arctanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arctanButtonActionPerformed(evt);
            }
        });

        arccosButton.setText("cos^-1");
        arccosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arccosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(96, 96, 96)
                                            .addComponent(n9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33)
                                            .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(n7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(33, 33, 33)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(n8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(n0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(32, 32, 32)
                                            .addComponent(komaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33)
                                            .addComponent(eButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(96, 96, 96)
                                            .addComponent(n6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33)
                                            .addComponent(mulButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(n4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(33, 33, 33)
                                                    .addComponent(n5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(n1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(33, 33, 33)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(n2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(percentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGap(32, 32, 32)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(n3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(factorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(33, 33, 33)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(minButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(exButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(modButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(40, 40, 40)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(x2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(phiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(21, 21, 21))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(arcsinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(arccosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(arctanButton)
                                            .addComponent(plusminButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(xyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ansButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(akarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(outField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(totField))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arctanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arcsinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arccosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(akarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mulButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(komaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ansButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        del();
    }//GEN-LAST:event_delButtonActionPerformed

    private void eButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eButtonActionPerformed
        input("e");
    }//GEN-LAST:event_eButtonActionPerformed

    private void phiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phiButtonActionPerformed
        input("π");
    }//GEN-LAST:event_phiButtonActionPerformed

    private void n1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ButtonActionPerformed
        input("1");
    }//GEN-LAST:event_n1ButtonActionPerformed

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        ac();
    }//GEN-LAST:event_cButtonActionPerformed

    private void percentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentButtonActionPerformed
        input("%");
    }//GEN-LAST:event_percentButtonActionPerformed

    private void factorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorButtonActionPerformed
        input("!");
    }//GEN-LAST:event_factorButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        input("+");
    }//GEN-LAST:event_plusButtonActionPerformed

    private void akarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akarButtonActionPerformed
        input("√");
    }//GEN-LAST:event_akarButtonActionPerformed

    private void n2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ButtonActionPerformed
        input("2");
    }//GEN-LAST:event_n2ButtonActionPerformed

    private void n3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ButtonActionPerformed
        input("3");
    }//GEN-LAST:event_n3ButtonActionPerformed

    private void n4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ButtonActionPerformed
        input("4");
    }//GEN-LAST:event_n4ButtonActionPerformed

    private void n5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ButtonActionPerformed
        input("5");
    }//GEN-LAST:event_n5ButtonActionPerformed

    private void n6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ButtonActionPerformed
        input("6");
    }//GEN-LAST:event_n6ButtonActionPerformed

    private void n7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ButtonActionPerformed
        input("7");
    }//GEN-LAST:event_n7ButtonActionPerformed

    private void n8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ButtonActionPerformed
        input("8");
    }//GEN-LAST:event_n8ButtonActionPerformed

    private void n9ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ButtonActionPerformed
        input("9");
    }//GEN-LAST:event_n9ButtonActionPerformed

    private void n0ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ButtonActionPerformed
        input("0");
    }//GEN-LAST:event_n0ButtonActionPerformed

    private void komaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komaButtonActionPerformed
        input(".");
    }//GEN-LAST:event_komaButtonActionPerformed

    private void minButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minButtonActionPerformed
        input("-");
    }//GEN-LAST:event_minButtonActionPerformed

    private void mulButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulButtonActionPerformed
        input("*");
    }//GEN-LAST:event_mulButtonActionPerformed

    private void divButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButtonActionPerformed
        input("/");
    }//GEN-LAST:event_divButtonActionPerformed

    private void sinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinButtonActionPerformed
        input("sin(");
    }//GEN-LAST:event_sinButtonActionPerformed

    private void cosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosButtonActionPerformed
        input("cos(");
    }//GEN-LAST:event_cosButtonActionPerformed

    private void tanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanButtonActionPerformed
        input("tan(");
    }//GEN-LAST:event_tanButtonActionPerformed

    private void lnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnButtonActionPerformed
        input("ln(");
    }//GEN-LAST:event_lnButtonActionPerformed

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
        input("log(");
    }//GEN-LAST:event_logButtonActionPerformed

    private void plusminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminButtonActionPerformed
        input("+/-");
    }//GEN-LAST:event_plusminButtonActionPerformed

    private void exButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exButtonActionPerformed
        input("e^");
    }//GEN-LAST:event_exButtonActionPerformed

    private void x2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2ButtonActionPerformed
        input("^2");
    }//GEN-LAST:event_x2ButtonActionPerformed

    private void xyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xyButtonActionPerformed
        input("^");
    }//GEN-LAST:event_xyButtonActionPerformed

    private void ansButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansButtonActionPerformed
        input("=");
    }//GEN-LAST:event_ansButtonActionPerformed

    private void modButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modButtonActionPerformed
        input("mod");
    }//GEN-LAST:event_modButtonActionPerformed

    private void arcsinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcsinButtonActionPerformed
        input("asin(");
    }//GEN-LAST:event_arcsinButtonActionPerformed

    private void arctanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arctanButtonActionPerformed
        input("acos(");
    }//GEN-LAST:event_arctanButtonActionPerformed

    private void arccosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arccosButtonActionPerformed
        input("atan(");
    }//GEN-LAST:event_arccosButtonActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorScientific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorScientific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorScientific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorScientific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorScientific().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akarButton;
    private javax.swing.JButton ansButton;
    private javax.swing.JButton arccosButton;
    private javax.swing.JButton arcsinButton;
    private javax.swing.JButton arctanButton;
    private javax.swing.JButton cButton;
    private javax.swing.JButton cosButton;
    private javax.swing.JButton delButton;
    private javax.swing.JButton divButton;
    private javax.swing.JButton eButton;
    private javax.swing.JButton exButton;
    private javax.swing.JButton factorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton komaButton;
    private javax.swing.JButton lnButton;
    private javax.swing.JButton logButton;
    private javax.swing.JButton minButton;
    private javax.swing.JButton modButton;
    private javax.swing.JButton mulButton;
    private javax.swing.JButton n0Button;
    private javax.swing.JButton n1Button;
    private javax.swing.JButton n2Button;
    private javax.swing.JButton n3Button;
    private javax.swing.JButton n4Button;
    private javax.swing.JButton n5Button;
    private javax.swing.JButton n6Button;
    private javax.swing.JButton n7Button;
    private javax.swing.JButton n8Button;
    private javax.swing.JButton n9Button;
    private javax.swing.JTextField outField;
    private javax.swing.JButton percentButton;
    private javax.swing.JButton phiButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton plusminButton;
    private javax.swing.JButton sinButton;
    private javax.swing.JButton tanButton;
    private javax.swing.JTextField totField;
    private javax.swing.JButton x2Button;
    private javax.swing.JButton xyButton;
    // End of variables declaration//GEN-END:variables
}
