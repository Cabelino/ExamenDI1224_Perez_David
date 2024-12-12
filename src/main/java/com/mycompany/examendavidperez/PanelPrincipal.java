package com.mycompany.examendavidperez;

import java.awt.Color;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Familia
 */
public class PanelPrincipal extends javax.swing.JFrame {
   
    public PanelPrincipal() {
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

        Clases = new javax.swing.ButtonGroup();
        Nota1 = new javax.swing.JSpinner();
        Nota2 = new javax.swing.JSpinner();
        Nota3 = new javax.swing.JSpinner();
        Nota4 = new javax.swing.JSpinner();
        nombreAlumno = new javax.swing.JTextField();
        BotonMedias = new javax.swing.JButton();
        Crear = new javax.swing.JButton();
        componente21 = new com.mycompany.examendavidperez.Componente2();
        Grafica = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuClases = new javax.swing.JMenu();
        ClaseUno = new javax.swing.JMenu();
        AlumnoUno = new javax.swing.JMenuItem();
        AlumnoDos = new javax.swing.JMenuItem();
        AlumnoTres = new javax.swing.JMenuItem();
        AlumnoCuatro = new javax.swing.JMenuItem();
        ClaseDos = new javax.swing.JMenu();
        AlumnoUno1 = new javax.swing.JMenuItem();
        AlumnoDos1 = new javax.swing.JMenuItem();
        AlumnoTres1 = new javax.swing.JMenuItem();
        AlumnoCuatro1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        Nota1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Nota1.setMaximumSize(new java.awt.Dimension(65, 25));
        Nota1.setMinimumSize(new java.awt.Dimension(65, 25));
        Nota1.setName(""); // NOI18N
        Nota1.setPreferredSize(new java.awt.Dimension(65, 25));

        Nota2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Nota2.setMaximumSize(new java.awt.Dimension(65, 25));
        Nota2.setMinimumSize(new java.awt.Dimension(65, 25));
        Nota2.setPreferredSize(new java.awt.Dimension(65, 25));

        Nota3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Nota3.setMaximumSize(new java.awt.Dimension(65, 25));
        Nota3.setMinimumSize(new java.awt.Dimension(65, 25));
        Nota3.setPreferredSize(new java.awt.Dimension(65, 25));

        Nota4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        Nota4.setMaximumSize(new java.awt.Dimension(65, 25));
        Nota4.setMinimumSize(new java.awt.Dimension(65, 25));
        Nota4.setPreferredSize(new java.awt.Dimension(65, 25));

        nombreAlumno.setText("Nombre Alumno");
        nombreAlumno.setMaximumSize(new java.awt.Dimension(104, 22));
        nombreAlumno.setMinimumSize(new java.awt.Dimension(104, 22));
        nombreAlumno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreAlumnoFocusGained(evt);
            }
        });

        BotonMedias.setText("Medias");
        BotonMedias.setActionCommand("Medias");
        BotonMedias.setMaximumSize(new java.awt.Dimension(85, 25));
        BotonMedias.setMinimumSize(new java.awt.Dimension(85, 25));
        BotonMedias.setPreferredSize(new java.awt.Dimension(85, 25));
        BotonMedias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMediasActionPerformed(evt);
            }
        });

        Crear.setText("CrearExcel");
        Crear.setMaximumSize(new java.awt.Dimension(105, 25));
        Crear.setMinimumSize(new java.awt.Dimension(105, 25));
        Crear.setPreferredSize(new java.awt.Dimension(105, 25));
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        componente21.setBackground(new java.awt.Color(255, 255, 255));
        componente21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        componente21.setText("Evaluacion");
        componente21.setMaximumSize(new java.awt.Dimension(65, 15));
        componente21.setMinimumSize(new java.awt.Dimension(65, 15));
        componente21.setPreferredSize(new java.awt.Dimension(65, 15));

        Grafica.setText("Grafica");
        Grafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficaActionPerformed(evt);
            }
        });

        MenuClases.setText("Clase");

        ClaseUno.setText("Clase 1");

        AlumnoUno.setText("Alumno 1");
        AlumnoUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoUnoActionPerformed(evt);
            }
        });
        ClaseUno.add(AlumnoUno);

        AlumnoDos.setText("Alumno 2");
        AlumnoDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoDosActionPerformed(evt);
            }
        });
        ClaseUno.add(AlumnoDos);

        AlumnoTres.setText("Alumno 3");
        AlumnoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoTresActionPerformed(evt);
            }
        });
        ClaseUno.add(AlumnoTres);

        AlumnoCuatro.setText("Alumno 4");
        AlumnoCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoCuatroActionPerformed(evt);
            }
        });
        ClaseUno.add(AlumnoCuatro);

        MenuClases.add(ClaseUno);

        ClaseDos.setText("Clase 2");

        AlumnoUno1.setText("Alumno 1");
        AlumnoUno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoUno1ActionPerformed(evt);
            }
        });
        ClaseDos.add(AlumnoUno1);

        AlumnoDos1.setText("Alumno 2");
        AlumnoDos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoDos1ActionPerformed(evt);
            }
        });
        ClaseDos.add(AlumnoDos1);

        AlumnoTres1.setText("Alumno 3");
        AlumnoTres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoTres1ActionPerformed(evt);
            }
        });
        ClaseDos.add(AlumnoTres1);

        AlumnoCuatro1.setText("Alumno 4");
        AlumnoCuatro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoCuatro1ActionPerformed(evt);
            }
        });
        ClaseDos.add(AlumnoCuatro1);

        MenuClases.add(ClaseDos);

        jMenuBar1.add(MenuClases);

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Cambiar a 1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Tamaño");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(componente21, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BotonMedias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Grafica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(Nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonMedias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Grafica)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(componente21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        String ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\ExamenDavidPerez\\Informes\\Curso.xlsx";
        FuncionesExcel.crearExcel(ruta,"Clase1","Clase2");
        
    }//GEN-LAST:event_CrearActionPerformed

    private void BotonMediasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMediasActionPerformed
        String ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\ExamenDavidPerez\\Informes\\Curso.xlsx";
        FuncionesExcel.calcularMedias(ruta, "Clase1");
        FuncionesExcel.calcularMedias(ruta, "Clase2");
    }//GEN-LAST:event_BotonMediasActionPerformed

    private void AlumnoUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoUnoActionPerformed
        String ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\ExamenDavidPerez\\Informes\\Curso.xlsx";
        ArrayList<String> datos = new ArrayList();
        ArrayList<Integer> notas = new ArrayList();
        Integer total = 0;
        notas.add((Integer) Nota1.getValue());
        notas.add((Integer) Nota2.getValue());
        notas.add((Integer) Nota3.getValue());
        notas.add((Integer) Nota4.getValue());
        
        for(int nota : notas){
            total += nota;
        }
        
        Integer media = total/4;
        
        if(media >=5){
            componente21.setText("Aprobado");
            componente21.setBackground(Color.GREEN);
        } else {
            componente21.setText("Suspenso");
            componente21.setBackground(Color.RED);
        }
        datos.add(nombreAlumno.getText());
        datos.add(Nota1.getValue().toString());
        datos.add(Nota2.getValue().toString());
        datos.add(Nota3.getValue().toString());
        datos.add(Nota4.getValue().toString());
        datos.add(media.toString());
        
        FuncionesExcel.escribirExcel(ruta, "Clase1", datos,1);
    }//GEN-LAST:event_AlumnoUnoActionPerformed

    private void AlumnoDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoDosActionPerformed
        String ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\ExamenDavidPerez\\Informes\\Curso.xlsx";
        ArrayList<String> datos = new ArrayList();
        ArrayList<Integer> notas = new ArrayList();
        Integer total = 0;
        notas.add((Integer) Nota1.getValue());
        notas.add((Integer) Nota2.getValue());
        notas.add((Integer) Nota3.getValue());
        notas.add((Integer) Nota4.getValue());
        
        for(int nota : notas){
            total += nota;
        }
        
        Integer media = total/4;
        
        if(media >=5){
            componente21.setText("Aprobado");
            componente21.setBackground(Color.GREEN);
        } else {
            componente21.setText("Suspenso");
            componente21.setBackground(Color.RED);
        }
        
        datos.add(nombreAlumno.getText());
        datos.add(Nota1.getValue().toString());
        datos.add(Nota2.getValue().toString());
        datos.add(Nota3.getValue().toString());
        datos.add(Nota4.getValue().toString());
        datos.add(media.toString());
        
        FuncionesExcel.escribirExcel(ruta, "Clase1", datos,2);
    }//GEN-LAST:event_AlumnoDosActionPerformed

    private void AlumnoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoTresActionPerformed
        String ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\ExamenDavidPerez\\Informes\\Curso.xlsx";
        ArrayList<String> datos = new ArrayList();
        ArrayList<Integer> notas = new ArrayList();
        Integer total = 0;
        notas.add((Integer) Nota1.getValue());
        notas.add((Integer) Nota2.getValue());
        notas.add((Integer) Nota3.getValue());
        notas.add((Integer) Nota4.getValue());
        
        for(int nota : notas){
            total += nota;
        }
        
        Integer media = total/4;
        if(media >=5){
            componente21.setText("Aprobado");
            componente21.setBackground(Color.GREEN);
        } else {
            componente21.setText("Suspenso");
            componente21.setBackground(Color.RED);
        }
        
        datos.add(nombreAlumno.getText());
        datos.add(Nota1.getValue().toString());
        datos.add(Nota2.getValue().toString());
        datos.add(Nota3.getValue().toString());
        datos.add(Nota4.getValue().toString());
        datos.add(media.toString());
        
        FuncionesExcel.escribirExcel(ruta, "Clase1", datos,3);
    }//GEN-LAST:event_AlumnoTresActionPerformed

    private void AlumnoCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoCuatroActionPerformed
        String ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\ExamenDavidPerez\\Informes\\Curso.xlsx";
        ArrayList<String> datos = new ArrayList();
        ArrayList<Integer> notas = new ArrayList();
        Integer total = 0;
        notas.add((Integer) Nota1.getValue());
        notas.add((Integer) Nota2.getValue());
        notas.add((Integer) Nota3.getValue());
        notas.add((Integer) Nota4.getValue());
        
        for(int nota : notas){
            total += nota;
        }
        
        Integer media = total/4;
        if(media >=5){
            componente21.setText("Aprobado");
            componente21.setBackground(Color.GREEN);
        } else {
            componente21.setText("Suspenso");
            componente21.setBackground(Color.RED);
        }
        
        datos.add(nombreAlumno.getText());
        datos.add(Nota1.getValue().toString());
        datos.add(Nota2.getValue().toString());
        datos.add(Nota3.getValue().toString());
        datos.add(Nota4.getValue().toString());
        datos.add(media.toString());
        
        FuncionesExcel.escribirExcel(ruta, "Clase1", datos,4);
    }//GEN-LAST:event_AlumnoCuatroActionPerformed

    private void AlumnoUno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoUno1ActionPerformed
        String ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\ExamenDavidPerez\\Informes\\Curso.xlsx";
        ArrayList<String> datos = new ArrayList();
        ArrayList<Integer> notas = new ArrayList();
        Integer total = 0;
        notas.add((Integer) Nota1.getValue());
        notas.add((Integer) Nota2.getValue());
        notas.add((Integer) Nota3.getValue());
        notas.add((Integer) Nota4.getValue());
        
        for(int nota : notas){
            total += nota;
        }
        
        Integer media = total/4;
        if(media >=5){
            componente21.setText("Aprobado");
            componente21.setBackground(Color.GREEN);
        } else {
            componente21.setText("Suspenso");
            componente21.setBackground(Color.RED);
        }
        
        datos.add(nombreAlumno.getText());
        datos.add(Nota1.getValue().toString());
        datos.add(Nota2.getValue().toString());
        datos.add(Nota3.getValue().toString());
        datos.add(Nota4.getValue().toString());
        datos.add(media.toString());
        
        FuncionesExcel.escribirExcel(ruta, "Clase2", datos,1);
    }//GEN-LAST:event_AlumnoUno1ActionPerformed

    private void AlumnoDos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoDos1ActionPerformed
        String ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\ExamenDavidPerez\\Informes\\Curso.xlsx";
        ArrayList<String> datos = new ArrayList();
        ArrayList<Integer> notas = new ArrayList();
        Integer total = 0;
        notas.add((Integer) Nota1.getValue());
        notas.add((Integer) Nota2.getValue());
        notas.add((Integer) Nota3.getValue());
        notas.add((Integer) Nota4.getValue());
        
        for(int nota : notas){
            total += nota;
        }
        
        Integer media = total/4;
        if(media >=5){
            componente21.setText("Aprobado");
            componente21.setBackground(Color.GREEN);
        } else {
            componente21.setText("Suspenso");
            componente21.setBackground(Color.RED);
        }
        
        datos.add(nombreAlumno.getText());
        datos.add(Nota1.getValue().toString());
        datos.add(Nota2.getValue().toString());
        datos.add(Nota3.getValue().toString());
        datos.add(Nota4.getValue().toString());
        datos.add(media.toString());
        
        FuncionesExcel.escribirExcel(ruta, "Clase2", datos,2);
    }//GEN-LAST:event_AlumnoDos1ActionPerformed

    private void AlumnoTres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoTres1ActionPerformed
        String ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\ExamenDavidPerez\\Informes\\Curso.xlsx";
        ArrayList<String> datos = new ArrayList();
        ArrayList<Integer> notas = new ArrayList();
        Integer total = 0;
        notas.add((Integer) Nota1.getValue());
        notas.add((Integer) Nota2.getValue());
        notas.add((Integer) Nota3.getValue());
        notas.add((Integer) Nota4.getValue());
        
        for(int nota : notas){
            total += nota;
        }
        
        Integer media = total/4;
        if(media >=5){
            componente21.setText("Aprobado");
            componente21.setBackground(Color.GREEN);
        } else {
            componente21.setText("Suspenso");
            componente21.setBackground(Color.RED);
        }
        
        datos.add(nombreAlumno.getText());
        datos.add(Nota1.getValue().toString());
        datos.add(Nota2.getValue().toString());
        datos.add(Nota3.getValue().toString());
        datos.add(Nota4.getValue().toString());
        datos.add(media.toString());
        
        FuncionesExcel.escribirExcel(ruta, "Clase2", datos,3);
    }//GEN-LAST:event_AlumnoTres1ActionPerformed

    private void AlumnoCuatro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoCuatro1ActionPerformed
        String ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\ExamenDavidPerez\\Informes\\Curso.xlsx";
        ArrayList<String> datos = new ArrayList();
        ArrayList<Integer> notas = new ArrayList();
        Integer total = 0;
        notas.add((Integer) Nota1.getValue());
        notas.add((Integer) Nota2.getValue());
        notas.add((Integer) Nota3.getValue());
        notas.add((Integer) Nota4.getValue());
        
        for(int nota : notas){
            total += nota;
        }
        
        Integer media = total/4;
        if(media >=5){
            componente21.setText("Aprobado");
            componente21.setBackground(Color.GREEN);
        } else {
            componente21.setText("Suspenso");
            componente21.setBackground(Color.RED);
        }
        
        datos.add(nombreAlumno.getText());
        datos.add(Nota1.getValue().toString());
        datos.add(Nota2.getValue().toString());
        datos.add(Nota3.getValue().toString());
        datos.add(Nota4.getValue().toString());
        datos.add(media.toString());
        
        FuncionesExcel.escribirExcel(ruta, "Clase2", datos,4);
    }//GEN-LAST:event_AlumnoCuatro1ActionPerformed

    private void nombreAlumnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreAlumnoFocusGained
        if (nombreAlumno.getText().equals("Nombre Alumno")) {
            nombreAlumno.setText(""); 
        }
    }//GEN-LAST:event_nombreAlumnoFocusGained

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Nota1.setValue(1);
        Nota2.setValue(1);
        Nota3.setValue(1);
        Nota4.setValue(1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Jframe.setMinimumSize([10,10]);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void GraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficaActionPerformed
        //Ruta archivo
        String ruta = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\ExamenDavidPerez\\Informes\\Curso.xlsx";
        //Ruta imagen
        String ruta2 = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\ExamenDavidPerez\\Informes\\grafico.jpg";
        //Ruta PFD
        String ruta3 = "C:\\Users\\Familia\\Documents\\NetBeansProjects\\ExamenDavidPerez\\Informes\\grafico.pdf";
        
        //Elimino la fila de las medias ya calculadas para que no entren en el grafico
        FuncionesExcel.eliminarUltimaFila(ruta, "Clase1");
        FuncionesExcel.eliminarUltimaFila(ruta, "Clase2");
        //La grafica de la media de cada asignatura
        FuncionesExcel.mostrarGraficoDeBarras(ruta, "clase1", 1);
        FuncionesExcel.guardarGraficoEnPDF(ruta2, ruta3, "Asignatura 1");
        
        FuncionesExcel.mostrarGraficoDeBarras(ruta, "clase1", 2);
        FuncionesExcel.guardarGraficoEnPDF(ruta2, ruta3, "Asignatura 2");
        
        FuncionesExcel.mostrarGraficoDeBarras(ruta, "clase1", 3);
        FuncionesExcel.guardarGraficoEnPDF(ruta2, ruta3, "Asignatura 3");
        
        FuncionesExcel.mostrarGraficoDeBarras(ruta, "clase1", 4);
        FuncionesExcel.guardarGraficoEnPDF(ruta2, ruta3, "Asignatura 4");
        
        //Clase 2
        FuncionesExcel.mostrarGraficoDeBarras(ruta, "clase2", 1);
        FuncionesExcel.guardarGraficoEnPDF(ruta2, ruta3, "Asignatura 1");
        
        FuncionesExcel.mostrarGraficoDeBarras(ruta, "clase2", 2);
        FuncionesExcel.guardarGraficoEnPDF(ruta2, ruta3, "Asignatura 2");
        
        FuncionesExcel.mostrarGraficoDeBarras(ruta, "clase2", 3);
        FuncionesExcel.guardarGraficoEnPDF(ruta2, ruta3, "Asignatura 3");
        
        FuncionesExcel.mostrarGraficoDeBarras(ruta, "clase2", 4);
        FuncionesExcel.guardarGraficoEnPDF(ruta2, ruta3, "Asignatura 4");
        
      
        
        
        
    }//GEN-LAST:event_GraficaActionPerformed

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
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlumnoCuatro;
    private javax.swing.JMenuItem AlumnoCuatro1;
    private javax.swing.JMenuItem AlumnoDos;
    private javax.swing.JMenuItem AlumnoDos1;
    private javax.swing.JMenuItem AlumnoTres;
    private javax.swing.JMenuItem AlumnoTres1;
    private javax.swing.JMenuItem AlumnoUno;
    private javax.swing.JMenuItem AlumnoUno1;
    private javax.swing.JButton BotonMedias;
    private javax.swing.JMenu ClaseDos;
    private javax.swing.JMenu ClaseUno;
    private javax.swing.ButtonGroup Clases;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Grafica;
    private javax.swing.JMenu MenuClases;
    private javax.swing.JSpinner Nota1;
    private javax.swing.JSpinner Nota2;
    private javax.swing.JSpinner Nota3;
    private javax.swing.JSpinner Nota4;
    private com.mycompany.examendavidperez.Componente2 componente21;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField nombreAlumno;
    // End of variables declaration//GEN-END:variables
}
