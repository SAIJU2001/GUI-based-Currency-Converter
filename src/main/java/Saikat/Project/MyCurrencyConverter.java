/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Saikat.Project;

import javax.swing.JOptionPane;

/**
 *
 * @author Saikat Naskar
 */
public class MyCurrencyConverter extends javax.swing.JFrame {
  
    String[] currencyUnit ={
        "unit",
    "Afghan afghani",
"Albanian lek",
"Algerian dinar",
"Euro",
"Angolan kwanza",
"East Caribbean dollar",
"Argentine peso",
"Armenian dram",
"Australian dollar",
"Euro",
"Azerbaijani manat",
"Bahamian dollar",
"Bahraini dinar",
"Bangladeshi taka",
"Barbadian dollar",
"Belarusian ruble",
"Euro",
"Belize dollar",
"West African CFA franc",
"Bhutanese ngultrum",
"Bolivian boliviano",
"Bosnia and Herzegovina convertible mark",
"Botswana pula",
"Brazilian real",
"Brunei dollar",
"Bulgarian lev",
"West African CFA franc",
"Burundian franc",
"Cambodian riel",
"Central African CFA franc",
"Canadian dollar",
"Cape Verdean escudo",
"Central African CFA franc",
"Central African CFA franc",
"Chilean peso",
"Chinese yuan",
"Colombian peso",
"Comorian franc",
"Costa Rican colón",
"Croatian kuna",
"Cuban peso",
"Euro",
"Czech koruna",
"Congolese franc",
"Danish krone",
"Djiboutian franc",
"East Caribbean dollar",
"Dominican peso",
"United States dollar",
"United States dollar",
"Egyptian pound",
"United States dollar",
"Central African CFA franc",
"Eritrean nakfa",
"Euro",
"Swazi lilangeni",
"Ethiopian birr",
"Fijian dollar",
"Euro",
"Euro",
"Central African CFA franc",
"Gambian dalasi",
"Georgian lari",
"Euro",
"Ghanaian cedi",
"Euro",
"East Caribbean dollar",
"Guatemalan quetzal",
"Guinean franc",
"West African CFA franc",
"Guyanese dollar",
"Haitian gourde",
"Honduran lempira",
"Hungarian forint",
"Icelandic króna",
"Indian rupee",
"Indonesian rupiah",
"Iranian rial",
"Iraqi dinar",
"Euro",
"Israeli new shekel",
"Euro",
"West African CFA franc",
"Jamaican dollar",
"Japanese yen",
"Jordanian dinar",
"Kazakhstani tenge",
"Kenyan shilling",
"Australian dollar",
"North Korean won",
"South Korean won",
"Euro",
"Kuwaiti dinar",
"Kyrgyzstani som",
"Lao kip",
"Euro",
"Lebanese pound",
"Lesotho loti",
"Liberian dollar",
"Libyan dinar",
"Swiss franc",
"Euro",
"Euro",
"Malagasy ariary",
"Malawian kwacha",
"Malaysian ringgit",
"Maldivian rufiyaa",
"West African CFA franc",
"Euro",
"United States dollar",
"Mauritanian ouguiya",
"Mauritian rupee",
"Mexican peso",
"United States dollar",
"Moldovan leu",
"Euro",
"Mongolian tögrög",
"Euro",
"Moroccan dirham",
"Mozambican metical",
"Burmese kyat",
"Namibian dollar",
"Australian dollar",
"Nepalese rupee",
"Euro",
"New Zealand dollar",
"Nicaraguan córdoba",
"West African CFA franc",
"Nigerian naira",
"Macedonian denar",
"Norwegian krone",
"Omani rial",
"Pakistani rupee",
"United States dollar",
"Israeli new shekel",
"Panamanian balboa",
"Papua New Guinean kina",
"Paraguayan guaraní",
"Peruvian sol",
"Philippine peso",
"Polish zloty",
"Euro",
"Qatari riyal",
"Central African CFA franc",
"Romanian leu",
"Russian ruble",
"Rwandan franc",
"East Caribbean dollar",
"East Caribbean dollar",
"East Caribbean dollar",
"Samoan tala",
"Euro",
"São Tomé and Príncipe dobra",
"Saudi riyal",
"West African CFA franc",
"Serbian dinar",
"Seychellois rupee",
"Sierra Leonean leone",
"Singapore dollar",
"Euro",
"Euro",
"Solomon Islands dollar",
"Somali shilling",
"South African rand",
"South Sudanese pound",
"Euro",
"Sri Lankan rupee",
"Sudanese pound",
"Surinamese dollar",
"Swedish krona",
"Swiss franc",
"Syrian pound",
"New Taiwan dollar",
"Tajikistani somoni",
"Tanzanian shilling",
"Thai baht",
"West African CFA franc",
"Tongan pa'anga",
"Trinidad and Tobago dollar",
"Tunisian dinar",
"Turkish lira",
"Turkmenistan manat",
"Australian dollar",
"Ugandan shilling",
"Ukrainian hryvnia",
"United Arab Emirates dirham",
"British pound",
"United States dollar",
"Uruguayan peso",
"Uzbekistani som",
"Vanuatu vatu",
"Euro",
"Venezuelan bolívar",
"Vietnamese dong",
"Yemeni rial",
"Zambian kwacha",
"United States dollar"
    };
    
double Afghan_afghani=106.51;
double Albanian_lek=138.36;
double Algerian_dinar=171.08;
double Euro=1.18;
double Angolan_kwanza=516.48;
double East_Caribbean_dollar=3.25;
double Argentine_peso=163.19;
double Armenian_dram=485.49;
double Australian_dollar=1.74;
double Azerbaijani_manat=2.05;
double Bahamian_dollar=1.20;
double Bahraini_dinar=0.45;
double Bangladeshi_taka=114.23;
double Barbadian_dollar=2.43;
double Belarusian_ruble=3.03;
double Belize_dollar=2.43;
double West_African_CFA_franc=775.07;
double Bhutanese_ngultrum=95.40;
double Bolivian_boliviano=8.31;
double Bosnia_and_Herzegovina_convertible_mark=2.31;
double Botswana_pula=15.12;
double Brazilian_real=6.22;
double Brunei_dollar=1.66;
double Bulgarian_lev=2.31;
double Burundian_franc=2479.41;
double Cambodian_riel=4930.27;
double Central_African_CFA_franc=775.12;
double Canadian_dollar=1.56;
double Cape_Verdean_escudo=130.31;
double Chilean_peso=1106.30;
double Chinese_yuan=8.15;
double Colombian_peso=5274.83;
double Comorian_franc=581.77;
double Costa_Rican_colón=792.86;
double Croatian_kuna=8.90;
double Cuban_peso=28.81;
double Czech_koruna=29.15;
double Congolese_franc=2401.39;
double Danish_krone=8.81;
double Djiboutian_franc=213.78;
double Dominican_peso=64.79;
double United_States_dollar=1.20;
double Egyptian_pound=23.00;
double Eritrean_nakfa=18.06;
double Swazi_lilangeni=20.00;
double Ethiopian_birr=62.81;
double Fijian_dollar=2.64;
double Gambian_dalasi=65.20;
double Georgian_lari=3.33;
double Ghanaian_cedi=11.59;
double Guatemalan_quetzal=9.29;
double Guinean_franc=10356.49;
double Guyanese_dollar=251.05;
double Haitian_gourde=157.80;
double Honduran_lempira=29.48;
double Hungarian_forint=478.25;
double Icelandic_króna=166.04;
double Indian_rupee=95.62;
double Indonesian_rupiah=17780.00;
double Iranian_rial=50698.52;
double Iraqi_dinar=1751.95;
double Israeli_new_shekel=3.90;
double Jamaican_dollar=181.61;
double Japanese_yen=162.17;
double Jordanian_dinar=0.85;
double Kazakhstani_tenge=571.79;
double Kenyan_shilling=143.51;
double North_Korean_won=1082.29;
double South_Korean_won=1591.69;
double Kuwaiti_dinar=0.37;
double Kyrgyzstani_som=97.41;
double Lao_kip=18300.28;
double Lebanese_pound=1819.83;
double Lesotho_loti=19.97;
double Liberian_dollar=184.32;
double Libyan_dinar=5.85;
double Swiss_franc=1.14;
double Malagasy_ariary=4947.55;
double Malawian_kwacha=1226.99;
double Malaysian_ringgit=5.36;
double Maldivian_rufiyaa=18.42;
double Mauritanian_ouguiya=45.14;
double Mauritian_rupee=54.58;
double Mexican_peso=24.07;
double Moldovan_leu=23.08;
double Mongolian_tögrög=3850.3982;
double Moroccan_dirham=12.49;
double Mozambican_metical=76.56;
double Burmese_kyat=2518.53;
double Namibian_dollar=19.97;
double Nepalese_rupee=152.81;
double New_Zealand_dollar=1.91;
double Nicaraguan_córdoba=43.10;
double Nigerian_naira=504.10;
double Macedonian_denar=72.63;
double Norwegian_krone=11.62;
double Omani_rial=0.46;
double Pakistani_rupee=257.97;
double Panamanian_balboa=1.20;
double Papua_New_Guinean_kina=4.21;
double Paraguayan_guaraní=8239.67;
double Peruvian_sol=4.60;
double Philippine_peso=66.96;
double Polish_zloty=5.59;
double Qatari_riyal=4.36;
double Romanian_leu=5.78;
double Russian_ruble=71.84;
double Rwandan_franc=1238.36;
double Samoan_tala=3.21637;
double São_Tomé_and_Príncipe_dobra=27124.20;
double Saudi_riyal=4.50;
double Serbian_dinar=138.96;
double Seychellois_rupee=17.32;
double Sierra_Leonean_leone=16688.63;
double Singapore_dollar=1.66;
double Solomon_Islands_dollar=9.84;
double Somali_shilling=684.08;
double South_African_rand=20.15;
double South_Sudanese_pound=157.69;
double Sri_Lankan_rupee=431.21;
double Sudanese_pound=680.89;
double Surinamese_dollar=29.15;
double Swedish_krona=12.55;
double Syrian_pound=3021.71;
double New_Taiwan_dollar=35.94;
double Tajikistani_somoni=12.24;
double Tanzanian_shilling=2793.00;
double Thai_baht=42.67;
double Tongan_paanga=2.80;
double Trinidad_and_Tobago_dollar=8.11;
double Tunisian_dinar=3.78;
double Turkish_lira=21.64;
double Turkmenistan_manat=4.20;
double Ugandan_shilling=4585.55;
double Ukrainian_hryvnia=44.13;
double United_Arab_Emirates_dirham=4.40;
double British_pound=1.0;
double Uruguayan_peso=48.08;
double Uzbekistani_som=13129.49;
double Vanuatu_vatu=139.695;
double Venezuelan_bolívar=718066.0;
double Vietnamese_dong=28015.23;
double Yemeni_rial=299.53;
double Zambian_kwacha=19.30;



    /**
     * Creates new form MyCurrencyConverter
     */
    public MyCurrencyConverter() {
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
        firstCountry = new javax.swing.JComboBox<>();
        secondCountry = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        secondCurrencyUnit = new javax.swing.JLabel();
        firstCurrencyUnit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Currency Converter");

        firstCountry.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose one...", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Democratic Republic of Congo", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Republic of the Congo", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "São Tomé and Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);
            }
        });

        secondCountry.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose one...", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Democratic Republic of Congo", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea,North", "Korea,South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Republic of the Congo", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "São Tomé and Príncipe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("From Currency of");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("To Currency of");

        secondCurrencyUnit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("unit");

        firstCurrencyUnit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("unit");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel6.setText("Created & Designed by @Saikat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jButton1)
                                .addGap(115, 115, 115)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(firstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2))))
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(secondCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(firstCountry))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(t1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstCurrencyUnit)
                    .addComponent(secondCurrencyUnit))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstCountryItemStateChanged
        // TODO add your handling code here:
        int position=firstCountry.getSelectedIndex();
        firstCurrencyUnit.setText(currencyUnit[position]);
    }//GEN-LAST:event_firstCountryItemStateChanged

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondCountryItemStateChanged
        // TODO add your handling code here:
        int position=secondCountry.getSelectedIndex();
        secondCurrencyUnit.setText(currencyUnit[position]);
    }//GEN-LAST:event_secondCountryItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(firstCountry.getSelectedIndex()==0 || secondCountry.getSelectedIndex()==0 ||t1.getText().equals(" "))
        {
            JOptionPane.showMessageDialog(null,"You must select both the countries and the amount to be convert.","Error Message", JOptionPane.INFORMATION_MESSAGE);
        return;
        }
        
       double amountToChange=Double.parseDouble(t1.getText());
double amountInPounds=0.0;
switch(firstCountry.getSelectedItem().toString())
{
case   "Afghanistan" :
            amountInPounds=amountToChange/Afghan_afghani;
            break;
case   "Albania" :
            amountInPounds=amountToChange/Albanian_lek;
            break;
case   "Algeria" :
            amountInPounds=amountToChange/Algerian_dinar;
            break;
case   "Andorra" :
            amountInPounds=amountToChange/Euro;
            break;
case   "Angola" :
            amountInPounds=amountToChange/Angolan_kwanza;
            break;
case   "Antigua and Barbuda" :
            amountInPounds=amountToChange/East_Caribbean_dollar;
            break;
case   "Argentina" :
            amountInPounds=amountToChange/Argentine_peso;
            break;
case   "Armenia" :
            amountInPounds=amountToChange/Armenian_dram;
            break;
case   "Australia" :
            amountInPounds=amountToChange/Australian_dollar;
            break;
case   "Austria" :
            amountInPounds=amountToChange/Euro;
            break;
case   "Azerbaijan" :
            amountInPounds=amountToChange/Azerbaijani_manat;
            break;
case   "Bahamas" :
            amountInPounds=amountToChange/Bahamian_dollar;
            break;
case   "Bahrain" :
        amountInPounds=amountToChange/Bahraini_dinar;
        break;
case   "Bangladesh" :
        amountInPounds=amountToChange/Bangladeshi_taka;
        break;
case   "Barbados" :
        amountInPounds=amountToChange/Barbadian_dollar;
        break;
case   "Belarus" :
        amountInPounds=amountToChange/Belarusian_ruble;
        break;
case   "Belgium" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Belize" :
        amountInPounds=amountToChange/Belize_dollar;
        break;
case   "Benin" :
        amountInPounds=amountToChange/West_African_CFA_franc;
        break;
case   "Bhutan" :
        amountInPounds=amountToChange/Bhutanese_ngultrum;
        break;
case   "Bolivia" :
        amountInPounds=amountToChange/Bolivian_boliviano;
        break;
case   "Bosnia and Herzegovina" :
        amountInPounds=amountToChange/Bosnia_and_Herzegovina_convertible_mark;
        break;
case   "Botswana" :
        amountInPounds=amountToChange/Botswana_pula;
        break;
case   "Brazil" :
        amountInPounds=amountToChange/Brazilian_real;
        break;
case   "Brunei" :
        amountInPounds=amountToChange/Brunei_dollar;
        break;
case   "Bulgaria" :
        amountInPounds=amountToChange/Bulgarian_lev;
        break;
case   "Burkina Faso" :
        amountInPounds=amountToChange/West_African_CFA_franc;
        break;
case   "Burundi" :
        amountInPounds=amountToChange/Burundian_franc;
        break;
case   "Cambodia" :
        amountInPounds=amountToChange/Cambodian_riel;
        break;
case   "Cameroon" :
        amountInPounds=amountToChange/Central_African_CFA_franc;
        break;
case   "Canada" :
        amountInPounds=amountToChange/Canadian_dollar;
        break;
case   "Cape Verde" :
        amountInPounds=amountToChange/Cape_Verdean_escudo;
        break;
case   "Central African Republic" :
        amountInPounds=amountToChange/Central_African_CFA_franc;
        break;
case   "Chad" :
        amountInPounds=amountToChange/Central_African_CFA_franc;
        break;
case   "Chile" :
        amountInPounds=amountToChange/Chilean_peso;
        break;
case   "China" :
        amountInPounds=amountToChange/Chinese_yuan;
        break;
case   "Colombia" :
        amountInPounds=amountToChange/Colombian_peso;
        break;
case   "Comoros" :
        amountInPounds=amountToChange/Comorian_franc;
        break;
case   "Costa Rica" :
        amountInPounds=amountToChange/Costa_Rican_colón;
        break;
case   "Croatia" :
        amountInPounds=amountToChange/Croatian_kuna;
        break;
case   "Cuba" :
        amountInPounds=amountToChange/Cuban_peso;
        break;
case   "Cyprus" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Czech Republic" :
        amountInPounds=amountToChange/Czech_koruna;
        break;
case   "Democratic Republic of Congo" :
        amountInPounds=amountToChange/Congolese_franc;
        break;
case   "Denmark" :
        amountInPounds=amountToChange/Danish_krone;
        break;
case   "Djibouti" :
        amountInPounds=amountToChange/Djiboutian_franc;
        break;
case   "Dominica" :
        amountInPounds=amountToChange/East_Caribbean_dollar;
        break;
case   "Dominican Republic" :
        amountInPounds=amountToChange/Dominican_peso;
        break;
case   "East Timor" :
        amountInPounds=amountToChange/United_States_dollar;
        break;
case   "Ecuador" :
        amountInPounds=amountToChange/United_States_dollar;
        break;
case   "Egypt" :
        amountInPounds=amountToChange/Egyptian_pound;
        break;
case   "El Salvador" :
        amountInPounds=amountToChange/United_States_dollar;
        break;
case   "Equatorial Guinea" :
        amountInPounds=amountToChange/Central_African_CFA_franc;
        break;
case   "Eritrea" :
        amountInPounds=amountToChange/Eritrean_nakfa;
        break;
case   "Estonia" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Eswatini" :
        amountInPounds=amountToChange/Swazi_lilangeni;
        break;
case   "Ethiopia" :
        amountInPounds=amountToChange/Ethiopian_birr;
        break;
case   "Fiji" :
        amountInPounds=amountToChange/Fijian_dollar;
        break;
case   "Finland" :
        amountInPounds=amountToChange/Euro;
        break;
case   "France" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Gabon" :
        amountInPounds=amountToChange/Central_African_CFA_franc;
        break;
case   "Gambia" :
        amountInPounds=amountToChange/Gambian_dalasi;
        break;
case   "Georgia" :
        amountInPounds=amountToChange/Georgian_lari;
        break;
case   "Germany" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Ghana" :
        amountInPounds=amountToChange/Ghanaian_cedi;
        break;
case   "Greece" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Grenada" :
        amountInPounds=amountToChange/East_Caribbean_dollar;
        break;
case   "Guatemala" :
        amountInPounds=amountToChange/Guatemalan_quetzal;
        break;
case   "Guinea" :
        amountInPounds=amountToChange/Guinean_franc;
        break;
case   "Guinea-Bissau" :
        amountInPounds=amountToChange/West_African_CFA_franc;
        break;
case   "Guyana" :
        amountInPounds=amountToChange/Guyanese_dollar;
        break;
case   "Haiti" :
        amountInPounds=amountToChange/Haitian_gourde;
        break;
case   "Honduras" :
        amountInPounds=amountToChange/Honduran_lempira;
        break;
case   "Hungary" :
        amountInPounds=amountToChange/Hungarian_forint;
        break;
case   "Iceland" :
        amountInPounds=amountToChange/Icelandic_króna;
        break;
case   "India" :
        amountInPounds=amountToChange/Indian_rupee;
        break;
case   "Indonesia" :
        amountInPounds=amountToChange/Indonesian_rupiah;
        break;
case   "Iran" :
        amountInPounds=amountToChange/Iranian_rial;
        break;
case   "Iraq" :
        amountInPounds=amountToChange/Iraqi_dinar;
        break;
case   "Ireland" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Israel" :
        amountInPounds=amountToChange/Israeli_new_shekel;
        break;
case   "Italy" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Ivory Coast" :
        amountInPounds=amountToChange/West_African_CFA_franc;
        break;
case   "Jamaica" :
        amountInPounds=amountToChange/Jamaican_dollar;
        break;
case   "Japan" :
        amountInPounds=amountToChange/Japanese_yen;
        break;
case   "Jordan" :
        amountInPounds=amountToChange/Jordanian_dinar;
        break;
case   "Kazakhstan" :
        amountInPounds=amountToChange/Kazakhstani_tenge;
        break;
case   "Kenya" :
        amountInPounds=amountToChange/Kenyan_shilling;
        break;
case   "Kiribati" :
        amountInPounds=amountToChange/Australian_dollar;
        break;
case   "Korea, North" :
        amountInPounds=amountToChange/North_Korean_won;
        break;
case   "Korea, South" :
        amountInPounds=amountToChange/South_Korean_won;
        break;
case   "Kosovo" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Kuwait" :
        amountInPounds=amountToChange/Kuwaiti_dinar;
        break;
case   "Kyrgyzstan" :
        amountInPounds=amountToChange/Kyrgyzstani_som;
        break;
case   "Laos" :
        amountInPounds=amountToChange/Lao_kip;
        break;
case   "Latvia" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Lebanon" :
        amountInPounds=amountToChange/Lebanese_pound;
        break;
case   "Lesotho" :
        amountInPounds=amountToChange/Lesotho_loti;
        break;
case   "Liberia" :
        amountInPounds=amountToChange/Liberian_dollar;
        break;
case   "Libya" :
        amountInPounds=amountToChange/Libyan_dinar;
        break;
case   "Liechtenstein" :
        amountInPounds=amountToChange/Swiss_franc;
        break;
case   "Lithuania" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Luxembourg" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Madagascar" :
        amountInPounds=amountToChange/Malagasy_ariary;
        break;
case   "Malawi" :
        amountInPounds=amountToChange/Malawian_kwacha;
        break;
case   "Malaysia" :
        amountInPounds=amountToChange/Malaysian_ringgit;
        break;
case   "Maldives" :
        amountInPounds=amountToChange/Maldivian_rufiyaa;
        break;
case   "Mali" :
        amountInPounds=amountToChange/West_African_CFA_franc;
        break;
case   "Malta" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Marshall Islands" :
        amountInPounds=amountToChange/United_States_dollar;
        break;
case   "Mauritania" :
        amountInPounds=amountToChange/Mauritanian_ouguiya;
        break;
case   "Mauritius" :
        amountInPounds=amountToChange/Mauritian_rupee;
        break;
case   "Mexico" :
        amountInPounds=amountToChange/Mexican_peso;
        break;
case   "Micronesia" :
        amountInPounds=amountToChange/United_States_dollar;
        break;
case   "Moldova" :
        amountInPounds=amountToChange/Moldovan_leu;
        break;
case   "Monaco" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Mongolia" :
        amountInPounds=amountToChange/Mongolian_tögrög;
        break;
case   "Montenegro" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Morocco" :
        amountInPounds=amountToChange/Moroccan_dirham;
        break;
case   "Mozambique" :
        amountInPounds=amountToChange/Mozambican_metical;
        break;
case   "Myanmar" :
        amountInPounds=amountToChange/Burmese_kyat;
        break;
case   "Namibia" :
        amountInPounds=amountToChange/Namibian_dollar;
        break;
case   "Nauru" :
        amountInPounds=amountToChange/Australian_dollar;
        break;
case   "Nepal" :
        amountInPounds=amountToChange/Nepalese_rupee;
        break;
case   "Netherlands" :
        amountInPounds=amountToChange/Euro;
        break;
case   "New Zealand" :
        amountInPounds=amountToChange/New_Zealand_dollar;
        break;
case   "Nicaragua" :
        amountInPounds=amountToChange/Nicaraguan_córdoba;
        break;
case   "Niger" :
        amountInPounds=amountToChange/West_African_CFA_franc;
        break;
case   "Nigeria" :
        amountInPounds=amountToChange/Nigerian_naira;
        break;
case   "North Macedonia" :
        amountInPounds=amountToChange/Macedonian_denar;
        break;
case   "Norway" :
        amountInPounds=amountToChange/Norwegian_krone;
        break;
case   "Oman" :
        amountInPounds=amountToChange/Omani_rial;
        break;
case   "Pakistan" :
        amountInPounds=amountToChange/Pakistani_rupee;
        break;
case   "Palau" :
        amountInPounds=amountToChange/United_States_dollar;
        break;
case   "Palestine" :
        amountInPounds=amountToChange/Israeli_new_shekel;
        break;
case   "Panama" :
        amountInPounds=amountToChange/Panamanian_balboa;
        break;
case   "Papua New Guinea" :
        amountInPounds=amountToChange/Papua_New_Guinean_kina;
        break;
case   "Paraguay" :
        amountInPounds=amountToChange/Paraguayan_guaraní;
        break;
case   "Peru" :
        amountInPounds=amountToChange/Peruvian_sol;
        break;
case   "Philippines" :
        amountInPounds=amountToChange/Philippine_peso;
        break;
case   "Poland" :
        amountInPounds=amountToChange/Polish_zloty;
        break;
case   "Portugal" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Qatar" :
        amountInPounds=amountToChange/Qatari_riyal;
        break;
case   "Republic of the Congo" :
        amountInPounds=amountToChange/Central_African_CFA_franc;
        break;
case   "Romania" :
        amountInPounds=amountToChange/Romanian_leu;
        break;
case   "Russia" :
        amountInPounds=amountToChange/Russian_ruble;
        break;
case   "Rwanda" :
        amountInPounds=amountToChange/Rwandan_franc;
        break;
case   "Saint Kitts and Nevis" :
        amountInPounds=amountToChange/East_Caribbean_dollar;
        break;
case   "Saint Lucia" :
        amountInPounds=amountToChange/East_Caribbean_dollar;
        break;
case   "Saint Vincent and the Grenadines" :
        amountInPounds=amountToChange/East_Caribbean_dollar;
        break;
case   "Samoa" :
        amountInPounds=amountToChange/Samoan_tala;
        break;
case   "San Marino" :
        amountInPounds=amountToChange/Euro;
        break;
case   "São Tomé and Príncipe" :
        amountInPounds=amountToChange/São_Tomé_and_Príncipe_dobra;
        break;
case   "Saudi Arabia" :
        amountInPounds=amountToChange/Saudi_riyal;
        break;
case   "Senegal" :
        amountInPounds=amountToChange/West_African_CFA_franc;
        break;
case   "Serbia" :
        amountInPounds=amountToChange/Serbian_dinar;
        break;
case   "Seychelles" :
        amountInPounds=amountToChange/Seychellois_rupee;
        break;
case   "Sierra Leone" :
        amountInPounds=amountToChange/Sierra_Leonean_leone;
        break;
case   "Singapore" :
        amountInPounds=amountToChange/Singapore_dollar;
        break;
case   "Slovakia" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Slovenia" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Solomon Islands" :
        amountInPounds=amountToChange/Solomon_Islands_dollar;
        break;
case   "Somalia" :
        amountInPounds=amountToChange/Somali_shilling;
        break;
case   "South Africa" :
        amountInPounds=amountToChange/South_African_rand;
        break;
case   "South Sudan" :
        amountInPounds=amountToChange/South_Sudanese_pound;
        break;
case   "Spain" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Sri Lanka" :
        amountInPounds=amountToChange/Sri_Lankan_rupee;
        break;
case    "Sudan" :
        amountInPounds=amountToChange/Sudanese_pound;
        break;
case    "Suriname" :
        amountInPounds=amountToChange/Surinamese_dollar;
        break;
case    "Sweden" :
        amountInPounds=amountToChange/Swedish_krona;
        break;
case    "Switzerland" :
        amountInPounds=amountToChange/Swiss_franc;
        break;
case    "Syria" :
        amountInPounds=amountToChange/Syrian_pound;
        break;
case    "Taiwan" :
        amountInPounds=amountToChange/New_Taiwan_dollar;
        break;
case    "Tajikistan" :
        amountInPounds=amountToChange/Tajikistani_somoni;
        break;
case    "Tanzania" :
        amountInPounds=amountToChange/Tanzanian_shilling;
        break;
case    "Thailand" :
        amountInPounds=amountToChange/Thai_baht;
        break;
case    "Togo" :
        amountInPounds=amountToChange/West_African_CFA_franc;
        break;
case    "Tonga" :
        amountInPounds=amountToChange/Tongan_paanga;
        break;
case    "Trinidad and Tobago" :
        amountInPounds=amountToChange/Trinidad_and_Tobago_dollar;
        break;
case    "Tunisia" :
        amountInPounds=amountToChange/Tunisian_dinar;
        break;
case   "Turk" :
        amountInPounds=amountToChange/Turkish_lira;
        break;
case   "Turkmenistan" :
        amountInPounds=amountToChange/Turkmenistan_manat;
        break;
case   "Tuva" :
        amountInPounds=amountToChange/Australian_dollar;
        break;
case   "Ugan" :
        amountInPounds=amountToChange/Ugandan_shilling;
        break;
case   "Ukraine" :
        amountInPounds=amountToChange/Ukrainian_hryvnia;
        break;
case   "United Arab Emirates" :
        amountInPounds=amountToChange/United_Arab_Emirates_dirham;
        break;
case   "United Kingd" :
        amountInPounds=amountToChange/British_pound;
        break;
case   "United State" :
        amountInPounds=amountToChange/United_States_dollar;
        break;
case   "Uruguay" :
        amountInPounds=amountToChange/Uruguayan_peso;
        break;
case   "Uzbekist" :
        amountInPounds=amountToChange/Uzbekistani_som;
        break;
case   "Vanuatu" :
        amountInPounds=amountToChange/Vanuatu_vatu;
        break;
case   "Vatican City" :
        amountInPounds=amountToChange/Euro;
        break;
case   "Venezuela" :
        amountInPounds=amountToChange/Venezuelan_bolívar;
        break;
case   "Vietnam" :
        amountInPounds=amountToChange/Vietnamese_dong;
        break;
case   "Yemen" :
        amountInPounds=amountToChange/Yemeni_rial;
        break;
case   "Zambia" :
        amountInPounds=amountToChange/Zambian_kwacha;
        break;
case   "Zimbabwe" :
        amountInPounds=amountToChange/United_States_dollar;
        break;
default :
        amountInPounds=amountToChange*0.0;
}

double amountChanged=0.0;
switch(secondCountry.getSelectedItem().toString())
{
case   "Afghanistan" :
        amountChanged=amountInPounds*Afghan_afghani;
        break;
case   "Albania" :
        amountChanged=amountInPounds*Albanian_lek;
        break;
case   "Algeria" :
        amountChanged=amountInPounds*Algerian_dinar;
        break;
case   "Andorra" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Angola" :
        amountChanged=amountInPounds*Angolan_kwanza;
        break;
case   "Antigua and Barbuda" :
        amountChanged=amountInPounds*East_Caribbean_dollar;
        break;
case   "Argentina" :
        amountChanged=amountInPounds*Argentine_peso;
        break;
case   "Armenia" :
        amountChanged=amountInPounds*Armenian_dram;
        break;
case   "Australia" :
        amountChanged=amountInPounds*Australian_dollar;
        break;
case   "Austria" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Azerbaijan" :
        amountChanged=amountInPounds*Azerbaijani_manat;
        break;
case   "Bahamas" :
        amountChanged=amountInPounds*Bahamian_dollar;
        break;
case   "Bahrain" :
        amountChanged=amountInPounds*Bahraini_dinar;
        break;
case   "Bangladesh" :
        amountChanged=amountInPounds*Bangladeshi_taka;
        break;
case   "Barbados" :
        amountChanged=amountInPounds*Barbadian_dollar;
        break;
case   "Belarus" :
        amountChanged=amountInPounds*Belarusian_ruble;
        break;
case   "Belgium" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Belize" :
        amountChanged=amountInPounds*Belize_dollar;
        break;
case   "Benin" :
        amountChanged=amountInPounds*West_African_CFA_franc;
        break;
case   "Bhutan" :
        amountChanged=amountInPounds*Bhutanese_ngultrum;
case   "Bolivia" :
        amountChanged=amountInPounds*Bolivian_boliviano;
        break;
case   "Bosnia and Herzegovina" :
        amountChanged=amountInPounds*Bosnia_and_Herzegovina_convertible_mark;
        break;
case   "Botswana" :
        amountChanged=amountInPounds*Botswana_pula;
        break;
case   "Brazil" :
        amountChanged=amountInPounds*Brazilian_real;
        break;
case   "Brunei" :
        amountChanged=amountInPounds*Brunei_dollar;
        break;
case   "Bulgaria" :
        amountChanged=amountInPounds*Bulgarian_lev;
        break;
case   "Burkina Faso" :
        amountChanged=amountInPounds*West_African_CFA_franc;
        break;
case   "Burundi" :
        amountChanged=amountInPounds*Burundian_franc;
        break;
case   "Cambodia" :
        amountChanged=amountInPounds*Cambodian_riel;
        break;
case   "Cameroon" :
        amountChanged=amountInPounds*Central_African_CFA_franc;
        break;
case   "Canada" :
        amountChanged=amountInPounds*Canadian_dollar;
        break;
case   "Cape Verde" :
        amountChanged=amountInPounds*Cape_Verdean_escudo;
        break;
case   "Central African Republic" :
        amountChanged=amountInPounds*Central_African_CFA_franc;
        break;
case   "Chad" :
        amountChanged=amountInPounds*Central_African_CFA_franc;
        break;
case   "Chile" :
        amountChanged=amountInPounds*Chilean_peso;
        break;
case   "China" :
        amountChanged=amountInPounds*Chinese_yuan;
        break;
case   "Colombia" :
        amountChanged=amountInPounds*Colombian_peso;
        break;
case   "Comoros" :
        amountChanged=amountInPounds*Comorian_franc;
        break;
case   "Costa Rica" :
        amountChanged=amountInPounds*Costa_Rican_colón;
        break;
case   "Croatia" :
        amountChanged=amountInPounds*Croatian_kuna;
        break;
case   "Cuba" :
        amountChanged=amountInPounds*Cuban_peso;
        break;
case   "Cyprus" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Czech Republic" :
        amountChanged=amountInPounds*Czech_koruna;
        break;
case   "Democratic Republic of Congo" :
        amountChanged=amountInPounds*Congolese_franc;
        break;
case   "Denmark" :
        amountChanged=amountInPounds*Danish_krone;
        break;
case   "Djibouti" :
        amountChanged=amountInPounds*Djiboutian_franc;
        break;
case   "Dominica" :
        amountChanged=amountInPounds*East_Caribbean_dollar;
        break;
case   "Dominican Republic" :
        amountChanged=amountInPounds*Dominican_peso;
        break;
case   "East Timor" :
        amountChanged=amountInPounds*United_States_dollar;
        break;
case   "Ecuador" :
        amountChanged=amountInPounds*United_States_dollar;
        break;
case   "Egypt" :
        amountChanged=amountInPounds*Egyptian_pound;
        break;
case   "El Salvador" :
        amountChanged=amountInPounds*United_States_dollar;
        break;
case   "Equatorial Guinea" :
        amountChanged=amountInPounds*Central_African_CFA_franc;
        break;
case   "Eritrea" :
        amountChanged=amountInPounds*Eritrean_nakfa;
        break;
case   "Estonia" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Eswatini" :
        amountChanged=amountInPounds*Swazi_lilangeni;
        break;
case   "Ethiopia" :
        amountChanged=amountInPounds*Ethiopian_birr;
        break;
case   "Fiji" :
        amountChanged=amountInPounds*Fijian_dollar;
        break;
case   "Finland" :
        amountChanged=amountInPounds*Euro;
        break;
case   "France" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Gabon" :
        amountChanged=amountInPounds*Central_African_CFA_franc;
        break;
case   "Gambia" :
        amountChanged=amountInPounds*Gambian_dalasi;
        break;
case   "Georgia" :
        amountChanged=amountInPounds*Georgian_lari;
        break;
case   "Germany" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Ghana" :
        amountChanged=amountInPounds*Ghanaian_cedi;
        break;
case   "Greece" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Grenada" :
        amountChanged=amountInPounds*East_Caribbean_dollar;
        break;
case   "Guatemala" :
        amountChanged=amountInPounds*Guatemalan_quetzal;
        break;
case   "Guinea" :
        amountChanged=amountInPounds*Guinean_franc;
        break;
case   "Guinea-Bissau" :
        amountChanged=amountInPounds*West_African_CFA_franc;
        break;
case   "Guyana" :
        amountChanged=amountInPounds*Guyanese_dollar;
        break;
case   "Haiti" :
        amountChanged=amountInPounds*Haitian_gourde;
        break;
case   "Honduras" :
        amountChanged=amountInPounds*Honduran_lempira;
        break;
case   "Hungary" :
        amountChanged=amountInPounds*Hungarian_forint;
        break;
case   "Iceland" :
        amountChanged=amountInPounds*Icelandic_króna;
        break;
case   "India" :
        amountChanged=amountInPounds*Indian_rupee;
        break;
case   "Indonesia" :
        amountChanged=amountInPounds*Indonesian_rupiah;
        break;
case   "Iran" :
        amountChanged=amountInPounds*Iranian_rial;
        break;
case   "Iraq" :
        amountChanged=amountInPounds*Iraqi_dinar;
        break;
case   "Ireland" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Israel" :
        amountChanged=amountInPounds*Israeli_new_shekel;
        break;
case   "Italy" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Ivory Coast" :
        amountChanged=amountInPounds*West_African_CFA_franc;
        break;
case   "Jamaica" :
        amountChanged=amountInPounds*Jamaican_dollar;
        break;
case   "Japan" :
        amountChanged=amountInPounds*Japanese_yen;
        break;
case   "Jordan" :
        amountChanged=amountInPounds*Jordanian_dinar;
        break;
case   "Kazakhstan" :
        amountChanged=amountInPounds*Kazakhstani_tenge;
        break;
case   "Kenya" :
        amountChanged=amountInPounds*Kenyan_shilling;
        break;
case   "Kiribati" :
        amountChanged=amountInPounds*Australian_dollar;
        break;
case   "Korea, North" :
        amountChanged=amountInPounds*North_Korean_won;
        break;
case   "Korea, South" :
        amountChanged=amountInPounds*South_Korean_won;
        break;
case   "Kosovo" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Kuwait" :
        amountChanged=amountInPounds*Kuwaiti_dinar;
        break;
case   "Kyrgyzstan" :
        amountChanged=amountInPounds*Kyrgyzstani_som;
        break;
case   "Laos" :
        amountChanged=amountInPounds*Lao_kip;
        break;
case   "Latvia" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Lebanon" :
        amountChanged=amountInPounds*Lebanese_pound;
        break;
case   "Lesotho" :
        amountChanged=amountInPounds*Lesotho_loti;
        break;
case   "Liberia" :
        amountChanged=amountInPounds*Liberian_dollar;
        break;
case   "Libya" :
        amountChanged=amountInPounds*Libyan_dinar;
        break;
case   "Liechtenstein" :
        amountChanged=amountInPounds*Swiss_franc;
        break;
case   "Lithuania" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Luxembourg" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Madagascar" :
        amountChanged=amountInPounds*Malagasy_ariary;
        break;
case   "Malawi" :
        amountChanged=amountInPounds*Malawian_kwacha;
        break;
case   "Malaysia" :
        amountChanged=amountInPounds*Malaysian_ringgit;
        break;
case   "Maldives" :
        amountChanged=amountInPounds*Maldivian_rufiyaa;
        break;
case   "Mali" :
        amountChanged=amountInPounds*West_African_CFA_franc;
        break;
case   "Malta" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Marshall Islands" :
        amountChanged=amountInPounds*United_States_dollar;
        break;
case   "Mauritania" :
        amountChanged=amountInPounds*Mauritanian_ouguiya;
        break;
case   "Mauritius" :
        amountChanged=amountInPounds*Mauritian_rupee;
        break;
case   "Mexico" :
        amountChanged=amountInPounds*Mexican_peso;
        break;
case   "Micronesia" :
        amountChanged=amountInPounds*United_States_dollar;
        break;
case   "Moldova" :
        amountChanged=amountInPounds*Moldovan_leu;
        break;
case   "Monaco" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Mongolia" :
        amountChanged=amountInPounds*Mongolian_tögrög;
        break;
case   "Montenegro" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Morocco" :
        amountChanged=amountInPounds*Moroccan_dirham;
        break;
case   "Mozambique" :
        amountChanged=amountInPounds*Mozambican_metical;
        break;
case   "Myanmar" :
        amountChanged=amountInPounds*Burmese_kyat;
        break;
case   "Namibia" :
        amountChanged=amountInPounds*Namibian_dollar;
        break;
case   "Nauru" :
        amountChanged=amountInPounds*Australian_dollar;
        break;
case   "Nepal" :
        amountChanged=amountInPounds*Nepalese_rupee;
        break;
case   "Netherlands" :
        amountChanged=amountInPounds*Euro;
        break;
case   "New Zealand" :
        amountChanged=amountInPounds*New_Zealand_dollar;
        break;
case   "Nicaragua" :
        amountChanged=amountInPounds*Nicaraguan_córdoba;
        break;
case   "Niger" :
        amountChanged=amountInPounds*West_African_CFA_franc;
        break;
case   "Nigeria" :
        amountChanged=amountInPounds*Nigerian_naira;
        break;
case   "North Macedonia" :
        amountChanged=amountInPounds*Macedonian_denar;
        break;
case   "Norway" :
        amountChanged=amountInPounds*Norwegian_krone;
        break;
case   "Oman" :
        amountChanged=amountInPounds*Omani_rial;
        break;
case   "Pakistan" :
        amountChanged=amountInPounds*Pakistani_rupee;
        break;
case   "Palau" :
        amountChanged=amountInPounds*United_States_dollar;
        break;
case   "Palestine" :
        amountChanged=amountInPounds*Israeli_new_shekel;
        break;
case   "Panama" :
        amountChanged=amountInPounds*Panamanian_balboa;
        break;
case   "Papua New Guinea" :
        amountChanged=amountInPounds*Papua_New_Guinean_kina;
        break;
case   "Paraguay" :
        amountChanged=amountInPounds*Paraguayan_guaraní;
        break;
case   "Peru" :
        amountChanged=amountInPounds*Peruvian_sol;
        break;
case   "Philippines" :
        amountChanged=amountInPounds*Philippine_peso;
        break;
case   "Poland" :
        amountChanged=amountInPounds*Polish_zloty;
        break;
case   "Portugal" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Qatar" :
        amountChanged=amountInPounds*Qatari_riyal;
        break;
case   "Republic of the Congo" :
        amountChanged=amountInPounds*Central_African_CFA_franc;
        break;
case   "Romania" :
        amountChanged=amountInPounds*Romanian_leu;
        break;
case   "Russia" :
        amountChanged=amountInPounds*Russian_ruble;
        break;
case   "Rwanda" :
        amountChanged=amountInPounds*Rwandan_franc;
        break;
case   "Saint Kitts and Nevis" :
        amountChanged=amountInPounds*East_Caribbean_dollar;
        break;
case   "Saint Lucia" :
        amountChanged=amountInPounds*East_Caribbean_dollar;
        break;
case   "Saint Vincent and the Grenadines" :
        amountChanged=amountInPounds*East_Caribbean_dollar;
        break;
case   "Samoa" :
        amountChanged=amountInPounds*Samoan_tala;
        break;
case   "San Marino" :
        amountChanged=amountInPounds*Euro;
        break;
case   "São Tomé and Príncipe" :
        amountChanged=amountInPounds*São_Tomé_and_Príncipe_dobra;
        break;
case   "Saudi Arabia" :
        amountChanged=amountInPounds*Saudi_riyal;
        break;
case   "Senegal" :
        amountChanged=amountInPounds*West_African_CFA_franc;
        break;
case   "Serbia" :
        amountChanged=amountInPounds*Serbian_dinar;
        break;
case   "Seychelles" :
        amountChanged=amountInPounds*Seychellois_rupee;
        break;
case   "Sierra Leone" :
        amountChanged=amountInPounds*Sierra_Leonean_leone;
        break;
case   "Singapore" :
        amountChanged=amountInPounds*Singapore_dollar;
        break;
case   "Slovakia" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Slovenia" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Solomon Islands" :
        amountChanged=amountInPounds*Solomon_Islands_dollar;
        break;
case   "Somalia" :
        amountChanged=amountInPounds*Somali_shilling;
        break;
case   "South Africa" :
        amountChanged=amountInPounds*South_African_rand;
        break;
case   "South Sudan" :
        amountChanged=amountInPounds*South_Sudanese_pound;
        break;
case   "Spain" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Sri Lanka" :
        amountChanged=amountInPounds*Sri_Lankan_rupee;
        break;
case    "Sudan" :
        amountChanged=amountInPounds*Sudanese_pound;
        break;
case    "Suriname" :
        amountChanged=amountInPounds*Surinamese_dollar;
        break;
case    "Sweden" :
        amountChanged=amountInPounds*Swedish_krona;
        break;
case    "Switzerland" :
        amountChanged=amountInPounds*Swiss_franc;
        break;
case    "Syria" :
        amountChanged=amountInPounds*Syrian_pound;
        break;
case    "Taiwan" :
        amountChanged=amountInPounds*New_Taiwan_dollar;
        break;
case    "Tajikistan" :
        amountChanged=amountInPounds*Tajikistani_somoni;
        break;
case    "Tanzania" :
        amountChanged=amountInPounds*Tanzanian_shilling;
        break;
case    "Thailand" :
        amountChanged=amountInPounds*Thai_baht;
        break;
case    "Togo" :
        amountChanged=amountInPounds*West_African_CFA_franc;
        break;
case    "Tonga" :
        amountChanged=amountInPounds*Tongan_paanga;
        break;
case    "Trinidad and Tobago" :
        amountChanged=amountInPounds*Trinidad_and_Tobago_dollar;
        break;
case    "Tunisia" :
        amountChanged=amountInPounds*Tunisian_dinar;
        break;
case   "Turk" :
        amountChanged=amountInPounds*Turkish_lira;
        break;
case   "Turkmenistan" :
        amountChanged=amountInPounds*Turkmenistan_manat;
        break;
case   "Tuva" :
        amountChanged=amountInPounds*Australian_dollar;
        break;
case   "Ugan" :
        amountChanged=amountInPounds*Ugandan_shilling;
        break;
case   "Ukraine" :
        amountChanged=amountInPounds*Ukrainian_hryvnia;
        break;
case   "United Arab Emirates" :
        amountChanged=amountInPounds*United_Arab_Emirates_dirham;
        break;
case   "United Kingd" :
        amountChanged=amountInPounds*British_pound;
        break;
case   "United State" :
        amountChanged=amountInPounds*United_States_dollar;
        break;
case   "Uruguay" :
        amountChanged=amountInPounds*Uruguayan_peso;
        break;
case   "Uzbekist" :
        amountChanged=amountInPounds*Uzbekistani_som;
        break;
case   "Vanuatu" :
        amountChanged=amountInPounds*Vanuatu_vatu;
        break;
case   "Vatican City" :
        amountChanged=amountInPounds*Euro;
        break;
case   "Venezuela" :
        amountChanged=amountInPounds*Venezuelan_bolívar;
        break;
case   "Vietnam" :
        amountChanged=amountInPounds*Vietnamese_dong;
        break;
case   "Yemen" :
        amountChanged=amountInPounds*Yemeni_rial;
        break;
case   "Zambia" :
        amountChanged=amountInPounds*Zambian_kwacha;
        break;
case   "Zimbabwe" :
        amountChanged=amountInPounds*United_States_dollar;
        break;
default :
        amountChanged=amountInPounds*0.0;
        break;
}
String value=String.format("%.2f",amountChanged);
t2.setText(value);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText(null);
        t2.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
