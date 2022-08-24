
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    
    
    Project(){
        
       setSize(1540 ,840);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500 ,750 , Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
          add(image);
          
          
          JMenuBar mb = new JMenuBar();
         //info
          JMenu newInformation = new JMenu("New Information");
          newInformation.setForeground(Color.BLUE);
          mb.add(newInformation);
          
          JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
          facultyInfo.setBackground(Color.WHITE);
          facultyInfo.addActionListener(this);
          newInformation.add(facultyInfo);
          
           JMenuItem studentInfo = new JMenuItem("New Student Information");
          studentInfo.setBackground(Color.WHITE);
           studentInfo.addActionListener(this);
          newInformation.add(studentInfo);
          
          //details 
          JMenu details = new JMenu("View Details");
          details.setForeground(Color.BLUE);
          mb.add(details);
          
          JMenuItem facultydetails = new JMenuItem("View Faculty Details");
          facultydetails.setBackground(Color.WHITE);
           facultydetails.addActionListener(this);
          details.add(facultydetails);
          
           JMenuItem studentdetails = new JMenuItem("View Student Details");
          studentdetails.setBackground(Color.WHITE);
           studentdetails.addActionListener(this);
          details.add(studentdetails);
          
          //Leave
          
          JMenu Leave = new JMenu("Apply Leave");
          Leave.setForeground(Color.RED);
          mb.add(Leave);
          
          JMenuItem facultyleave = new JMenuItem("Faculty Leave");
          facultyleave.setBackground(Color.WHITE);
           facultyleave.addActionListener(this);
          Leave.add(facultyleave);
          
           JMenuItem studentleave = new JMenuItem("Student Leave");
          studentleave.setBackground(Color.WHITE);
           studentleave.addActionListener(this);
          Leave.add(studentleave);
          
          
          //Leave details 
          
          JMenu Leavedetails = new JMenu("Leave Details");
          Leavedetails.setForeground(Color.BLUE);
          mb.add(Leavedetails);
          
          JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
          facultyleavedetails.setBackground(Color.WHITE);
          facultyleavedetails.addActionListener(this);
          Leavedetails.add(facultyleavedetails);
          
           JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
          studentleavedetails.setBackground(Color.WHITE);
          studentleavedetails.addActionListener(this);
          Leavedetails.add(studentleavedetails);
          
          
          //exam details 
          
          JMenu exam = new JMenu("Examination");
          exam.setForeground(Color.BLUE);
          mb.add(exam);
          
          JMenuItem examinationdetails = new JMenuItem("Examination Results");
          examinationdetails.setBackground(Color.WHITE);
           examinationdetails.addActionListener(this);
          exam.add(examinationdetails);
          
           JMenuItem entermarks = new JMenuItem("Marks Register");
          entermarks.setBackground(Color.WHITE);
           entermarks.addActionListener(this);
          exam.add(entermarks);
          
          
           //update
          
          JMenu update = new JMenu("Update Details");
          update.setForeground(Color.BLUE);
          mb.add(update);
          
          JMenuItem updatefacultyInfo = new JMenuItem("Update Faculty Details");
          updatefacultyInfo.setBackground(Color.WHITE);
           updatefacultyInfo.addActionListener(this);
          update.add(updatefacultyInfo);
          
           JMenuItem updatestudentInfo = new JMenuItem("Update Student Details");
          updatestudentInfo.setBackground(Color.WHITE);
           updatestudentInfo.addActionListener(this);
          update.add(updatestudentInfo);
          
           //fees
          
          JMenu fee = new JMenu("Fee Details");
          fee.setForeground(Color.GREEN);
          mb.add(fee);
          
          JMenuItem feeStructure = new JMenuItem("Fee Structure");
          feeStructure.setBackground(Color.WHITE);
          feeStructure.addActionListener(this);
          fee.add(feeStructure);
          
           JMenuItem feeform = new JMenuItem("Student Fee Form");
          feeform.setBackground(Color.WHITE);
          feeform.addActionListener(this);
          fee.add(feeform);
          
          //utility
          
          JMenu utility = new JMenu("Utility");
          utility.setForeground(Color.BLUE);
          mb.add(utility);
          
          JMenuItem notepad = new JMenuItem("Notepad");
           notepad.addActionListener(this);
          notepad.setBackground(Color.WHITE);
          utility.add(notepad);
          
           JMenuItem calc = new JMenuItem("Calculator");
           calc.addActionListener(this);
           calc.setBackground(Color.WHITE);
          utility.add(calc);
          
          
           //exit
          
          JMenu about = new JMenu("About");
          about.setForeground(Color.RED);
          mb.add(about);
          
          JMenuItem ab = new JMenuItem("About");
          ab.addActionListener(this);
          ab.setBackground(Color.WHITE);
          about.add(ab);
          
           //exit
          
          JMenu exit = new JMenu("Exit");
          exit.setForeground(Color.RED);
          mb.add(exit);
          
          JMenuItem ex = new JMenuItem("Exit");
          ex.addActionListener(this);
          ex.setBackground(Color.WHITE);
          exit.add(ex);
          
        
          
          setJMenuBar(mb);
            
                  
          setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
       String msg = ae.getActionCommand();
       
       if(msg.equals("Exit")){
           setVisible(false);
       }else if(msg.equals("Calculator")){
           
           try{
               Runtime.getRuntime().exec("calc.exe");
           } catch (Exception e){
               
           }
       }else if(msg.equals("Notepad")){
           
           try{
               Runtime.getRuntime().exec("notepad.exe");
           } catch (Exception e){
               
           }
       }else if(msg.equals("New Faculty Information")){
           new AddTeacher();
       }else if(msg.equals("New Student Information")){
           new AddStudent();
       }else if(msg.equals("View Faculty Details")){
           new TeacherDetails();
       }else if(msg.equals("View Student Details")){
           new StudentDetails();
       }else if(msg.equals("Faculty Leave")){
           new TeacherLeave();
       }else if(msg.equals("Student Leave")){
           new StudentLeave();
       }else if(msg.equals("Faculty Leave Details")){
           new TeacherLeaveDetails();
       }else if(msg.equals("Student Leave Details")){
           new StudentLeaveDetails();
       }else if(msg.equals("Update Faculty Details")){
           new UpdateTeacher();
       }else if(msg.equals("Update Student Details")){
           new UpdateStudent();
       }else if(msg.equals("Marks Register")){
           new EnterMarks();
       }else if(msg.equals("Examination Results")){
           new ExaminationDetails();
       }else if(msg.equals("Fee Structure")){
           new FeeStructure();
       }else if(msg.equals("About")){
           new About();
       }else if(msg.equals("Student Fee Form")){
           new StudentFeeForm();
       }
       
          
     }
    public static void main(String[] args){
        
        new Project();
        
    }
}
