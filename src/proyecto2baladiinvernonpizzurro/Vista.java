/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2baladiinvernonpizzurro;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author Invernon
 */
public class Vista extends javax.swing.JFrame {

    
    private Arbol arbol = new Arbol();
    int cont=1;
      
    
    NodoArbol nodoAuxiliar; //para guardar el ultimo nodo en el que se quedo, para poder desconectarlo del arbol
    //y conectarlo de nuevo pero con el arbol actualizado
    
    boolean ultimaOpcionEscogida = false; // true es derecha, false es izquierda
    
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        
        GamejPanel.setVisible(false);
        QuestionNumberjLabel.setText("Pregunta número " + cont);
        
        NodoArbol nodoHijo = new NodoArbol("*Ratón");
        NodoArbol nodoHijo2 = new NodoArbol("*Paloma");
        
        
        /*
        Con esto se empieza a ver que si la respuesta es afirmativa el árbol 
        va a la derecha y si es negativa a la izquierda
        NOTA IMPORTANTE: 0 ES NEGATIVO Y 1 ES AFIRMATIVO
        */
        
        arbol.InsertarNodoRaíz("¿Vuela?");
        arbol.InsertarNodoALaIzquierda(arbol.getNodoRaíz(), nodoHijo);
        arbol.InsertarNodoALaDerecha(arbol.getNodoRaíz(), nodoHijo2);
        
        QuestionsjLabel.setText(arbol.getNodoRaíz().getData());

        nodoAuxiliar = arbol.getNodoRaíz();//inicialmente es la raiz del arbol   
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GamejPanel = new javax.swing.JPanel();
        NojButton = new javax.swing.JButton();
        YesjButton = new javax.swing.JButton();
        QuestionsjLabel = new javax.swing.JLabel();
        QuestionNumberjLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        StartjButton = new javax.swing.JButton();
        SavejButton = new javax.swing.JButton();
        LoadInfojButton = new javax.swing.JButton();
        ExitjButton = new javax.swing.JButton();
        DeletejButton = new javax.swing.JButton();
        ShowjButton = new javax.swing.JButton();
        GamejPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 800));
        setPreferredSize(new java.awt.Dimension(900, 800));
        setResizable(false);

        GamejPanel.setBackground(new java.awt.Color(243, 211, 184));
        GamejPanel.setPreferredSize(new java.awt.Dimension(600, 650));

        NojButton.setBackground(new java.awt.Color(249, 173, 107));
        NojButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NojButton.setText("No");
        NojButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 139, 45), 2, true));
        NojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NojButtonActionPerformed(evt);
            }
        });

        YesjButton.setBackground(new java.awt.Color(202, 221, 70));
        YesjButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        YesjButton.setText("Sí");
        YesjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 168, 2), 2, true));
        YesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesjButtonActionPerformed(evt);
            }
        });

        QuestionsjLabel.setBackground(new java.awt.Color(152, 219, 198));
        QuestionsjLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        QuestionsjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuestionsjLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        QuestionNumberjLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        javax.swing.GroupLayout GamejPanelLayout = new javax.swing.GroupLayout(GamejPanel);
        GamejPanel.setLayout(GamejPanelLayout);
        GamejPanelLayout.setHorizontalGroup(
            GamejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamejPanelLayout.createSequentialGroup()
                .addGroup(GamejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GamejPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(GamejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(GamejPanelLayout.createSequentialGroup()
                                .addComponent(YesjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166)
                                .addComponent(NojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(QuestionsjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(GamejPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(QuestionNumberjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        GamejPanelLayout.setVerticalGroup(
            GamejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GamejPanelLayout.createSequentialGroup()
                .addComponent(QuestionNumberjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QuestionsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295)
                .addGroup(GamejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YesjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        jPanel2.setBackground(new java.awt.Color(243, 211, 184));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menú", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 650));

        StartjButton.setBackground(new java.awt.Color(202, 221, 70));
        StartjButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        StartjButton.setText("Comenzar");
        StartjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 168, 2), 2, true));
        StartjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartjButtonActionPerformed(evt);
            }
        });

        SavejButton.setBackground(new java.awt.Color(202, 221, 70));
        SavejButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SavejButton.setText("Guardar");
        SavejButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 168, 2), 2, true));
        SavejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavejButtonActionPerformed(evt);
            }
        });

        LoadInfojButton.setBackground(new java.awt.Color(202, 221, 70));
        LoadInfojButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LoadInfojButton.setText("Cargar");
        LoadInfojButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 168, 2), 2, true));
        LoadInfojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadInfojButtonActionPerformed(evt);
            }
        });

        ExitjButton.setBackground(new java.awt.Color(249, 173, 107));
        ExitjButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ExitjButton.setText("Salir");
        ExitjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 139, 45), 2, true));
        ExitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitjButtonActionPerformed(evt);
            }
        });

        DeletejButton.setBackground(new java.awt.Color(249, 173, 107));
        DeletejButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DeletejButton.setText("Borrar ");
        DeletejButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(247, 139, 45), 2, true));
        DeletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletejButtonActionPerformed(evt);
            }
        });

        ShowjButton.setBackground(new java.awt.Color(202, 221, 70));
        ShowjButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ShowjButton.setText("Mostrar árbol");
        ShowjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 168, 2), 2, true));
        ShowjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ShowjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoadInfojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SavejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StartjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(StartjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(LoadInfojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(SavejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(DeletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(ShowjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        GamejPanel1.setBackground(new java.awt.Color(243, 211, 184));
        GamejPanel1.setPreferredSize(new java.awt.Dimension(600, 650));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2baladiinvernonpizzurro/roulette.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2baladiinvernonpizzurro/guess.png"))); // NOI18N

        javax.swing.GroupLayout GamejPanel1Layout = new javax.swing.GroupLayout(GamejPanel1);
        GamejPanel1.setLayout(GamejPanel1Layout);
        GamejPanel1Layout.setHorizontalGroup(
            GamejPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamejPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(64, 64, 64))
            .addGroup(GamejPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        GamejPanel1Layout.setVerticalGroup(
            GamejPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GamejPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GamejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GamejPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(GamejPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                    .addComponent(GamejPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
                .addContainerGap(309, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void formarElArbol(boolean ultimaEscogida, int opcionEscogida) {
        
        String texto = arbol.RecorrerPorPreguntas(QuestionsjLabel.getText(), opcionEscogida);
        QuestionsjLabel.setText(texto);
        ultimaOpcionEscogida = ultimaEscogida;
        
        String diferencia, respuestaEscogida, newAnimal;  ;
        boolean animalEncontrado = false, animalPensado = false, diferenciaAnimales = false, verificar4 = false;
        
        
        if (QuestionsjLabel.getText().charAt(0) == '*') {//ese asterico es para verificar si es el ultimo nodo del arbol
            //se puede sustituir por un espacio para que no se vea, pero por ahora le puse eso.
            
            NodoArbol nodo = arbol.Buscar(arbol.getNodoRaíz(), texto);
            
            do{    
                int n = JOptionPane.showConfirmDialog(null, "¿Este es el animal en el que piensas?", "¿Animal encontrado?", YES_NO_OPTION);

                if (n == 1) {

                    /*Cuando responde que No es correcta la respuesta entra aquí y le 
                    pregunta con este JOptionPane de tipo Input cuál es la respuesta correcta*/

                    animalEncontrado = true;

                    do {
                        newAnimal = JOptionPane.showInputDialog( "¿Cuál es el animal en el que pensabas?");


                        if (newAnimal ==  null) {
                            
                            JOptionPane.showMessageDialog(null, "Debes colocar una respuesta para continuar");
                            
                                animalPensado = false;
                        }
                        else if(newAnimal.isEmpty()){

                            JOptionPane.showMessageDialog(null, "No puedes dejar el campo vacío");
                            animalPensado = false;
                        }
                        else {

                            newAnimal = "*"+newAnimal; // aqui le anado el asterico para luego saber que es el ultimo nodo

                            animalPensado= true;
                        }
                    } while (animalPensado == false);

                    do{
                        diferencia = JOptionPane.showInputDialog( "¿Qué diferencia a un " + nodo.getData() + " de un " + newAnimal);

                        if (diferencia ==  null) {

                            JOptionPane.showMessageDialog(null, "Debes colocar una respuesta para continuar");
                            diferenciaAnimales = false;
                        }
                        else if(diferencia.isEmpty()){

                            JOptionPane.showMessageDialog(null, "No puedes dejar el campo vacío");
                            diferenciaAnimales = false;
                        }
                        else {

                            diferenciaAnimales= true;
                        }
                    }while (diferenciaAnimales == false);



                    do{
                        respuestaEscogida = JOptionPane.showInputDialog("Si el animal fuera un " + nodo.getData() + " cuál sería la respuesta?"
                            + " (s para 'si' y n para 'no')");

                        if (respuestaEscogida ==  null) {

                            JOptionPane.showMessageDialog(null, "Debes colocar una respuesta para continuar");
                            verificar4 = false;
                        }
                        else if(respuestaEscogida.isEmpty()){

                            JOptionPane.showMessageDialog(null, "No puedes dejar el campo vacío");
                            verificar4 = false;
                        }
                        else if (respuestaEscogida.equals("s") || respuestaEscogida.equals("n")){


                            verificar4 = true;
                        }
                        else {

                            JOptionPane.showMessageDialog(null, "Respuesta inválida");
                            verificar4 = false;
                        }
                    } while (verificar4 == false);

                    //respuesta escogida puede ser "s" o "n"


                    //ESTO ES UN EJEMPLO DE COMO LO PUEDE RESPONDER EL USUARIO
                    //response = pato
                    //diferencia = puede nadar
                    //respuestaEscogida = n, porque el raton no nada
                    //nodoAuxiliar es la raiz en el primer caso
                    
                    NodoArbol nuevoNodo = new NodoArbol(diferencia);

                    if (ultimaOpcionEscogida == false) {
                        
                        arbol.Buscar(arbol.getNodoRaíz(), nodoAuxiliar.getData()).setHijoIzquierdo(null);
                        arbol.Buscar(arbol.getNodoRaíz(), nodoAuxiliar.getData()).setHijoIzquierdo(nuevoNodo);

                    } else {
                        
                        arbol.Buscar(arbol.getNodoRaíz(), nodoAuxiliar.getData()).setHijoDerecho(null);
                        arbol.Buscar(arbol.getNodoRaíz(), nodoAuxiliar.getData()).setHijoDerecho(nuevoNodo);
                    }

                    if (respuestaEscogida.equals("n")) {
                        
                        nuevoNodo.setHijoIzquierdo(nodo);
                        NodoArbol otroHijo = new NodoArbol(newAnimal);
                        nuevoNodo.setHijoDerecho(otroHijo);

                    } else {
                        
                        NodoArbol otroHijo = new NodoArbol(newAnimal);
                        nuevoNodo.setHijoIzquierdo(otroHijo);
                        nuevoNodo.setHijoDerecho(nodo);    
                    }
                    
                    QuestionsjLabel.setText(arbol.getNodoRaíz().getData());
                    

                } 
                else if (n == 0) {

                    int newGame = JOptionPane.showConfirmDialog(null, "¿Deseas volver a jugar?", "Fin de la partida!", YES_NO_OPTION);
    
                    if (newGame == 0) {
    
                        //Aca deben colocar la funcion para que comience el juego de nuevo (no se si es esa)
                        QuestionsjLabel.setText(arbol.getNodoRaíz().getData());
                    }
                    animalEncontrado = true;
                } 
                else {

                    animalEncontrado = false;

                }
            }while (animalEncontrado == false);        
        }
        else {
        
            nodoAuxiliar = arbol.Buscar(arbol.getNodoRaíz(), texto);
        }
    }
    private void StartjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartjButtonActionPerformed
       
        GamejPanel.setVisible(true);
    }//GEN-LAST:event_StartjButtonActionPerformed

    private void SavejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavejButtonActionPerformed
        
        if (JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas guardar los animales agregados en la partida? " ,
                "Guardar base de conocimientos extendida", YES_NO_OPTION) == 0){
        
            //Acá deben colocar lo de guardar un archivo de texto
        }
    }//GEN-LAST:event_SavejButtonActionPerformed

    private void LoadInfojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadInfojButtonActionPerformed
        
        if (JOptionPane.showConfirmDialog(null, "¿Deseas cargar una base de conocimientos guardada anteriormente? " ,
                "Cargar base de datos extendida", YES_NO_OPTION) == 0){
        
            //Acá deben colocar lo de cargar un archivo de texto
        }
    }//GEN-LAST:event_LoadInfojButtonActionPerformed

    private void ExitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitjButtonActionPerformed
        
        if (JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas salir? " , "Salir", YES_NO_OPTION) == 0){
        
            System.exit(0);
        }
        
    }//GEN-LAST:event_ExitjButtonActionPerformed

    private void DeletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletejButtonActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas borrar la información agregada y volver a la base de conocimientos predeterminada? " ,
                "Borrar base de conocimientos extendida", YES_NO_OPTION) == 0){
        
            //Acá deben colocar lo que debe suceder para borrar todo lo que agregó el usuario
        }
    }//GEN-LAST:event_DeletejButtonActionPerformed

    private void ShowjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowjButtonActionPerformed
        
        CreateLabelDynamically c = new CreateLabelDynamically(arbol);
        c.setTitle("Base de conocimientos completa");
        c.setSize(1000,1000);
        c.setVisible(true);
    }//GEN-LAST:event_ShowjButtonActionPerformed

    private void NojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NojButtonActionPerformed

        formarElArbol(false, 0);
        //QuestionsjLabel.setText(arbol.RecorrerPorPreguntas(QuestionsjLabel.getText(), 0));

        cont ++;

    }//GEN-LAST:event_NojButtonActionPerformed

    private void YesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesjButtonActionPerformed

        formarElArbol(true, 1);
        //QuestionsjLabel.setText(arbol.RecorrerPorPreguntas(QuestionsjLabel.getText(), 1));

        cont ++;
        //aqui

    }//GEN-LAST:event_YesjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeletejButton;
    private javax.swing.JButton ExitjButton;
    private javax.swing.JPanel GamejPanel;
    private javax.swing.JPanel GamejPanel1;
    private javax.swing.JButton LoadInfojButton;
    private javax.swing.JButton NojButton;
    private javax.swing.JLabel QuestionNumberjLabel;
    private javax.swing.JLabel QuestionsjLabel;
    private javax.swing.JButton SavejButton;
    private javax.swing.JButton ShowjButton;
    private javax.swing.JButton StartjButton;
    private javax.swing.JButton YesjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
