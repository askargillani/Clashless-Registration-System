/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package departmentsystem;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Askar G
 */
public class TeacherUI extends javax.swing.JFrame {

    /**
     * Creates new form TeacherUI
     */
    ControllerClass c;
    Teacher t;
        Color nBlueColor = new Color(41, 54, 63);
    Color orangeColor = new Color (255,165,0);
    Color whiteColor = new Color (255,255,255);
    boolean clicked = false;
    boolean bookSearched=false;
    ArrayList<String> courseNames;
    ArrayList<String> studentNames;
    public TeacherUI(ControllerClass cl,Teacher te) {
        c=cl;
        t=te;
        initComponents();
        markEvaluationsTab.setVisible(false);
        loadTeachingCoursesOnAttendance();
        if(courseNames.size()!=0)
        loadTeachingStudentsOnAttendance(courseNames.get(0));
        if(courseNames.size()!=0)
        loadTeachingCoursesOnEvaluations();
        loadTeachingStudentsOnEvaluations(courseNames.get(0));
    }
    
    public void loadTeachingCoursesOnAttendance()
    {
        courseNames = t.getCourseNames();
        for(int i=0;i<courseNames.size();i++)
        {
            coursesTeachingComboBox.addItem(courseNames.get(i));
        }
        
    }
    
    public void loadTeachingStudentsOnAttendance(String courseName)
    {
        studentNames = t.getStudentsTaught(courseName);
        DefaultListModel<String> model = new DefaultListModel<>();
        studentsList.setModel(model);
        for(int i=0;i<studentNames.size();i++)
        {
            model.addElement( studentNames.get(i) );
        }
        
    }
    
    public void loadTeachingStudentsOnEvaluations(String courseName)
    {
        studentNames = t.getStudentsTaught(courseName);
        DefaultListModel<String> model = new DefaultListModel<>();
        studentsListEvaluated.setModel(model);
        for(int i=0;i<studentNames.size();i++)
        {
            model.addElement( studentNames.get(i) );
        }
        
    }
    
    public void loadTeachingCoursesOnEvaluations()
    {
        courseNames = t.getCourseNames();
        for(int i=0;i<courseNames.size();i++)
        {
            coursesEvaluatingComboBox.addItem(courseNames.get(i));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGround = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        markEvaluationsLabel = new javax.swing.JLabel();
        markAttendanceLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        markAttendanceTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsList = new javax.swing.JList<>();
        attendanceTextField = new javax.swing.JTextField();
        searchBookNameLabel = new javax.swing.JLabel();
        absentButton = new javax.swing.JButton();
        presentButton1 = new javax.swing.JButton();
        coursesTeachingComboBox = new javax.swing.JComboBox<>();
        markEvaluationsTab = new javax.swing.JPanel();
        coursesEvaluatingComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentsListEvaluated = new javax.swing.JList<>();
        marksTextField = new javax.swing.JTextField();
        searchBookNameLabel1 = new javax.swing.JLabel();
        enterMarksButton = new javax.swing.JButton();
        evaluationTextField = new javax.swing.JTextField();
        evaluationNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(41, 54, 63));

        markEvaluationsLabel.setBackground(new java.awt.Color(41, 54, 63));
        markEvaluationsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        markEvaluationsLabel.setForeground(new java.awt.Color(255, 255, 255));
        markEvaluationsLabel.setText("   mark evaluations");
        markEvaluationsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                markEvaluationsLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                markEvaluationsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                markEvaluationsLabelMouseExited(evt);
            }
        });

        markAttendanceLabel.setBackground(new java.awt.Color(41, 54, 63));
        markAttendanceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        markAttendanceLabel.setForeground(new java.awt.Color(255, 255, 255));
        markAttendanceLabel.setText("   mark attendance");
        markAttendanceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                markAttendanceLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                markAttendanceLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                markAttendanceLabelMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Forange.png"))); // NOI18N

        logoutButton.setBackground(new java.awt.Color(255, 165, 0));
        logoutButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("logout");
        logoutButton.setBorder(null);
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(markEvaluationsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addComponent(markAttendanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(78, 78, 78)
                .addComponent(markAttendanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(markEvaluationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );

        backGround.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        markAttendanceTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(studentsList);

        markAttendanceTab.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 290, 300));

        attendanceTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        attendanceTextField.setForeground(new java.awt.Color(41, 54, 63));
        attendanceTextField.setOpaque(false);
        markAttendanceTab.add(attendanceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 179, 30));

        searchBookNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        searchBookNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchBookNameLabel.setForeground(new java.awt.Color(41, 54, 63));
        searchBookNameLabel.setText("Date of attendance");
        markAttendanceTab.add(searchBookNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 170, -1));

        absentButton.setBackground(new java.awt.Color(255, 165, 0));
        absentButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        absentButton.setForeground(new java.awt.Color(255, 255, 255));
        absentButton.setText("absent");
        absentButton.setBorder(null);
        absentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                absentButtonMouseClicked(evt);
            }
        });
        markAttendanceTab.add(absentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 110, 35));

        presentButton1.setBackground(new java.awt.Color(255, 165, 0));
        presentButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        presentButton1.setForeground(new java.awt.Color(255, 255, 255));
        presentButton1.setText("present");
        presentButton1.setBorder(null);
        presentButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                presentButton1MouseClicked(evt);
            }
        });
        presentButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentButton1ActionPerformed(evt);
            }
        });
        markAttendanceTab.add(presentButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 110, 35));

        markAttendanceTab.add(coursesTeachingComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 80, -1));

        backGround.add(markAttendanceTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 470, 600));

        markEvaluationsTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        markEvaluationsTab.add(coursesEvaluatingComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 80, -1));

        jScrollPane2.setViewportView(studentsListEvaluated);

        markEvaluationsTab.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 240, 300));

        marksTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        marksTextField.setForeground(new java.awt.Color(41, 54, 63));
        marksTextField.setOpaque(false);
        markEvaluationsTab.add(marksTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 179, 30));

        searchBookNameLabel1.setBackground(new java.awt.Color(255, 255, 255));
        searchBookNameLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchBookNameLabel1.setForeground(new java.awt.Color(41, 54, 63));
        searchBookNameLabel1.setText("Marks ");
        markEvaluationsTab.add(searchBookNameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 170, -1));

        enterMarksButton.setBackground(new java.awt.Color(255, 165, 0));
        enterMarksButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterMarksButton.setForeground(new java.awt.Color(255, 255, 255));
        enterMarksButton.setText("enter");
        enterMarksButton.setBorder(null);
        enterMarksButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterMarksButtonMouseClicked(evt);
            }
        });
        markEvaluationsTab.add(enterMarksButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 110, 35));

        evaluationTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        evaluationTextField.setForeground(new java.awt.Color(41, 54, 63));
        evaluationTextField.setOpaque(false);
        markEvaluationsTab.add(evaluationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 179, 30));

        evaluationNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        evaluationNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        evaluationNameLabel.setForeground(new java.awt.Color(41, 54, 63));
        evaluationNameLabel.setText("Evaluation name");
        markEvaluationsTab.add(evaluationNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 170, -1));

        backGround.add(markEvaluationsTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 470, 600));

        getContentPane().add(backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void markEvaluationsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markEvaluationsLabelMouseClicked
        // TODO add your handling code here:
        markAttendanceTab.setVisible(false);
        markEvaluationsTab.setVisible(true);
        clicked=true;
        markAttendanceLabel.setForeground(whiteColor);
        markEvaluationsLabel.setForeground(orangeColor);
    }//GEN-LAST:event_markEvaluationsLabelMouseClicked

    private void markEvaluationsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markEvaluationsLabelMouseEntered
        // TODO add your handling code here:
        if(clicked==false)
        markEvaluationsLabel.setForeground(orangeColor);
    }//GEN-LAST:event_markEvaluationsLabelMouseEntered

    private void markEvaluationsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markEvaluationsLabelMouseExited
        // TODO add your handling code here:
        if(clicked==false)
        markEvaluationsLabel.setForeground(whiteColor);
    }//GEN-LAST:event_markEvaluationsLabelMouseExited

    private void markAttendanceLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markAttendanceLabelMouseClicked
        // TODO add your handling code here:
        clicked=true;
        markAttendanceTab.setVisible(true);
        markEvaluationsTab.setVisible(false);
        markAttendanceLabel.setForeground(orangeColor);
        markEvaluationsLabel.setForeground(whiteColor);
    }//GEN-LAST:event_markAttendanceLabelMouseClicked

    private void markAttendanceLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markAttendanceLabelMouseEntered
        // TODO add your handling code here:
        if(clicked==false)
        markAttendanceLabel.setForeground(orangeColor);
    }//GEN-LAST:event_markAttendanceLabelMouseEntered

    private void markAttendanceLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markAttendanceLabelMouseExited
        // TODO add your handling code here:
        if(clicked==false)
        markAttendanceLabel.setForeground(whiteColor);
    }//GEN-LAST:event_markAttendanceLabelMouseExited

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        c.saveCourses();
        c.saveTeachers();
        c.saveStudents();
        c.saveRegistrations();
        c.saveBooks();
        c.saveStudentsAttendance();
        c.saveStudentsEvaluations();
        setVisible(false);
        new loginGui(c);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void absentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_absentButtonMouseClicked
        // TODO add your handling code here:
        String courseName = coursesTeachingComboBox.getSelectedItem().toString();
        String date = attendanceTextField.getText();
        String rollNumber = studentsList.getSelectedValue();
        if(courseName!="" && date!="" && rollNumber!="")
            c.getStudent(rollNumber).addAttendanceEntry(courseName, date, 'A');
        else
            JOptionPane.showMessageDialog(this,"Something is wrong. Please check for unentered data");
    }//GEN-LAST:event_absentButtonMouseClicked

    private void presentButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presentButton1MouseClicked
        // TODO add your handling code here:
        String courseName = coursesTeachingComboBox.getSelectedItem().toString();
        String date = attendanceTextField.getText();
        String rollNumber = studentsList.getSelectedValue();
        if(courseName!="" && date!="" && rollNumber!="")
            c.getStudent(rollNumber).addAttendanceEntry(courseName, date, 'P');
        else
            JOptionPane.showMessageDialog(this,"Something is wrong. Please check for unentered data");
    }//GEN-LAST:event_presentButton1MouseClicked

    private void enterMarksButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMarksButtonMouseClicked
        // TODO add your handling code here:
        String courseName = coursesEvaluatingComboBox.getSelectedItem().toString();
        String evalName = evaluationTextField.getText();
        String marks = marksTextField.getText();
        double m = Double.parseDouble(marks);
        String rollNumber = studentsListEvaluated.getSelectedValue();
                if(courseName!="" && marks!="" && rollNumber!="")
            c.getStudent(rollNumber).addEvaluationEntry(courseName, evalName, m);
        else
            JOptionPane.showMessageDialog(this,"Something is wrong. Please check for unentered data");
    }//GEN-LAST:event_enterMarksButtonMouseClicked

    private void presentButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentButton1ActionPerformed
        // TODO add your handling code here:
        String courseName = coursesTeachingComboBox.getSelectedItem().toString();
        String date = attendanceTextField.getText();
        String rollNumber = studentsList.getSelectedValue();
        if(courseName!="" && date!="" && rollNumber!="")
            c.getStudent(rollNumber).addAttendanceEntry(courseName, date, 'P');
        else
            JOptionPane.showMessageDialog(this,"Something is wrong. Please check for unentered data");
    }//GEN-LAST:event_presentButton1ActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TeacherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TeacherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TeacherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TeacherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TeacherUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton absentButton;
    private javax.swing.JTextField attendanceTextField;
    private javax.swing.JPanel backGround;
    private javax.swing.JComboBox<String> coursesEvaluatingComboBox;
    private javax.swing.JComboBox<String> coursesTeachingComboBox;
    private javax.swing.JButton enterMarksButton;
    private javax.swing.JLabel evaluationNameLabel;
    private javax.swing.JTextField evaluationTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel markAttendanceLabel;
    private javax.swing.JPanel markAttendanceTab;
    private javax.swing.JLabel markEvaluationsLabel;
    private javax.swing.JPanel markEvaluationsTab;
    private javax.swing.JTextField marksTextField;
    private javax.swing.JButton presentButton1;
    private javax.swing.JLabel searchBookNameLabel;
    private javax.swing.JLabel searchBookNameLabel1;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JList<String> studentsList;
    private javax.swing.JList<String> studentsListEvaluated;
    // End of variables declaration//GEN-END:variables
}
