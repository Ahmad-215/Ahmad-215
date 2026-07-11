import java.io.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
class Dashboard extends JFrame implements ActionListener{
//    JFrame f2= new JFrame("Dashboard  ");
    Container c2=this.getContentPane();
    JLabel l5= new JLabel("Dashboard");
    SpringLayout s2= new SpringLayout();
    //Setting Buttons with image icons
    //b3
    ImageIcon b3Icon=new ImageIcon("Patient.png");
    Image imp=b3Icon.getImage().getScaledInstance(180, 110, Image.SCALE_SMOOTH);
    ImageIcon imp2= new ImageIcon(imp);
    //b4
    ImageIcon b4Icon= new ImageIcon("Doctor.png");
    Image imd=b4Icon.getImage().getScaledInstance(180, 110, Image.SCALE_SMOOTH);
    ImageIcon imd2= new ImageIcon(imd );
    //b5
    ImageIcon b5Icon=new ImageIcon("Appoitnment.png");
    Image ima=b5Icon.getImage().getScaledInstance(180, 110, Image.SCALE_SMOOTH);
    ImageIcon ima2= new ImageIcon(ima);
    //b6
    ImageIcon b6Icon=new ImageIcon("Billing.png");
    Image imb=b6Icon.getImage().getScaledInstance(180, 110, Image.SCALE_SMOOTH);
    ImageIcon imb2= new ImageIcon(imb);
    //b7
    ImageIcon b7Icon=new ImageIcon("Records.png");
    Image imr=b7Icon.getImage().getScaledInstance(180, 110, Image.SCALE_SMOOTH);
    ImageIcon imr2= new ImageIcon(imr);
    //b8
    ImageIcon b8Icon=new ImageIcon("Logout.png");
    Image iml=b8Icon.getImage().getScaledInstance(180, 110, Image.SCALE_SMOOTH);
    ImageIcon iml2= new ImageIcon(iml);   
    //b9
    ImageIcon b9Icon=new ImageIcon("Exit.png");
    Image ime=b9Icon.getImage().getScaledInstance(180, 110, Image.SCALE_SMOOTH);
    ImageIcon ime2= new ImageIcon(ime);   
    //Buttons and linking the images with buttons
    JButton b3=new JButton(imp2);
    JButton b4=new JButton(imd2);
    JButton b5=new JButton(ima2);
    JButton b6=new JButton(imb2);
    JButton b7=new JButton(imr2);    
    JButton b8=new JButton(iml2);
    JButton b9= new JButton(ime2); 
    //Labels
    JLabel l6= new JLabel("Patient Management");
    JLabel l7= new JLabel("Doctor Management");
    JLabel l8= new JLabel("Appointment Management");
    JLabel l9= new JLabel("Billing System");
    JLabel l10= new JLabel("View Records");
    JLabel l11= new JLabel("Logout");
    JLabel l12= new JLabel("Exit");
    Dashboard(){
      c2.setLayout(s2);
       
      c2.setBackground(new Color(15,23,42));
       

      c2.add(l5);
      s2.putConstraint(SpringLayout.NORTH,l5,40,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,l5,540,SpringLayout.WEST,c2);
      l5.setFont(new Font("Monotype Corsiva", Font.BOLD, 60));
      l5.setForeground(Color.WHITE);

      c2.add(b3);
      s2.putConstraint(SpringLayout.NORTH,b3,160,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,b3,100,SpringLayout.WEST,c2);
      b3.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
      b3.setHorizontalTextPosition(SwingConstants.RIGHT);
      b3.setHorizontalTextPosition(SwingConstants.CENTER);

      c2.add(l6);
      s2.putConstraint(SpringLayout.NORTH,l6,290,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,l6,110,SpringLayout.WEST,c2);
      l6.setFont(new Font("Monotype Corsiva", Font.BOLD, 23));

      l6.setForeground(Color.WHITE);
       
      c2.add(b4);
      s2.putConstraint(SpringLayout.NORTH,b4,160,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,b4,560,SpringLayout.WEST,c2);
      b4.setHorizontalTextPosition(SwingConstants.RIGHT);
      b4.setHorizontalTextPosition(SwingConstants.CENTER);
   
      c2.add(l7);
      s2.putConstraint(SpringLayout.NORTH,l7,290,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,l7,570,SpringLayout.WEST,c2);
      l7.setFont(new Font("Monotype Corsiva", Font.BOLD, 23));
      
      l7.setForeground(Color.WHITE);

      c2.add(b5);
      s2.putConstraint(SpringLayout.NORTH,b5,160,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,b5,1000,SpringLayout.WEST,c2);
      b5.setHorizontalTextPosition(SwingConstants.RIGHT);
      b5.setHorizontalTextPosition(SwingConstants.CENTER);

      c2.add(l8);
      s2.putConstraint(SpringLayout.NORTH,l8,290,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,l8,985,SpringLayout.WEST,c2);
      l8.setFont(new Font("Monotype Corsiva", Font.BOLD, 23));

      l8.setForeground(Color.WHITE);

      c2.add(b6);
      s2.putConstraint(SpringLayout.NORTH,b6,370,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,b6,100,SpringLayout.WEST,c2);
      b6.setHorizontalTextPosition(SwingConstants.RIGHT);
      b6.setHorizontalTextPosition(SwingConstants.CENTER);     

      c2.add(l9);
      s2.putConstraint(SpringLayout.NORTH,l9,500,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,l9,140,SpringLayout.WEST,c2);
      l9.setFont(new Font("Monotype Corsiva", Font.BOLD, 23));
      
      l9.setForeground(Color.WHITE);

      c2.add(b7);
      s2.putConstraint(SpringLayout.NORTH,b7,370,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,b7,560,SpringLayout.WEST,c2);
      b7.setHorizontalTextPosition(SwingConstants.RIGHT);
      b7.setHorizontalTextPosition(SwingConstants.CENTER);

      c2.add(l10);
      s2.putConstraint(SpringLayout.NORTH,l10,500,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,l10,590,SpringLayout.WEST,c2);
      l10.setFont(new Font("Monotype Corsiva", Font.BOLD, 23));

      l10.setForeground(Color.WHITE);

      c2.add(b8);
      s2.putConstraint(SpringLayout.NORTH,b8,370,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,b8,1000,SpringLayout.WEST,c2);
      b8.setHorizontalTextPosition(SwingConstants.RIGHT);
      b8.setHorizontalTextPosition(SwingConstants.CENTER);

      l11.setForeground(Color.WHITE);
       
      c2.add(l11);
      s2.putConstraint(SpringLayout.NORTH,l11,500,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,l11,1065,SpringLayout.WEST,c2);
      l11.setFont(new Font("Monotype Corsiva", Font.BOLD, 23));

      c2.add(b9);
      s2.putConstraint(SpringLayout.NORTH,b9,540,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,b9,560,SpringLayout.WEST,c2);
      b9.setHorizontalTextPosition(SwingConstants.RIGHT);
      b9.setHorizontalTextPosition(SwingConstants.CENTER);

      c2.add(l12);
      s2.putConstraint(SpringLayout.NORTH,l12,670,SpringLayout.NORTH,c2);
      s2.putConstraint(SpringLayout.WEST,l12,620,SpringLayout.WEST,c2);
      l12.setFont(new Font("Monotype Corsiva", Font.BOLD, 23));
 
      l12.setForeground(Color.WHITE);

      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);


      this.setSize(2000,1000);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==b8){
        this.setVisible(false);
        Login lo=new Login();
        lo.setVisible(true);
      }
      else if(e.getSource()==b9){
        this.setVisible(false);
      }
      else if(e.getSource()==b3){
        this.setVisible(false);
        Patient p= new Patient();
        p.setVisible(true);
      }
      else if(e.getSource()==b4){
        this.setVisible(false);
        Doctor d= new Doctor();
        d.setVisible(true);
      }
    else if(e.getSource()==b5){
      this.setVisible(false);
      Appointment a=new Appointment();
      a.setVisible(true);
    }
    else if(e.getSource()==b6){
      this.setVisible(false);
      Billing b=new Billing();
      b.setVisible(true);
    }
    else if(e.getSource()==b7){
     this.setVisible(false);
     Record re=new Record(); 
     re.setVisible(true);
    }

}
    
}
class Patient extends JFrame implements ActionListener{
 Container c=this.getContentPane();
//Buttons
 JButton b1=new JButton("Add Patient");
 JButton b2=new JButton("Update Patient");
 JButton b3=new JButton("Search Patient");
 JButton b4=new JButton("Delete Pateint");
 JButton b5=new JButton("    Clear          ");
 JButton b6=new JButton("    Back           ");
 //Labels
 JLabel head= new JLabel("Patient Management");
 JLabel l1= new JLabel("Patient ID: ");
 JLabel l2= new JLabel("Name: ");
 JLabel l3= new JLabel("Age: ");
 JLabel l4= new JLabel("Gender: ");
 JLabel l5= new JLabel("Diseases: ");
 JLabel l6= new JLabel("Phone: ");
//Text Fields
JTextField t1= new JTextField(26);
JTextField t2= new JTextField(26);
JTextField t3= new JTextField(26);
JTextField t5= new JTextField(26);
JTextField t6= new JTextField(26);
//Layout
SpringLayout s= new SpringLayout();
JRadioButton r1= new JRadioButton("Male");
JRadioButton r2= new JRadioButton("Female");
//Setting with Groupbutton
ButtonGroup g= new ButtonGroup();
//Adding image
ImageIcon i= new ImageIcon("Patient.png");
  Image i2= i.getImage().getScaledInstance(300, 200,Image.SCALE_SMOOTH);
  ImageIcon i3= new ImageIcon(i2);
  JLabel imgl= new JLabel(i3);
Patient(){
   c.setLayout(s);

   c.setBackground(new Color(0,51,102));

   g.add(r1);
   g.add(r2);

   c.add(imgl);
   s.putConstraint(SpringLayout.NORTH,imgl,-55,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,imgl,260,SpringLayout.WEST,c);

   c.add(head);
   s.putConstraint(SpringLayout.NORTH,head,5,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,head,460,SpringLayout.WEST,c);
   head.setFont(new Font("Monotype Corsiva", Font.BOLD, 60));
   head.setForeground(Color.WHITE);

   c.add(b1);
   s.putConstraint(SpringLayout.NORTH,b1,90,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b1,630,SpringLayout.WEST,c);
   b1.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));    
   b1.setBackground(new Color(40,167,69));
   b1.setForeground(Color.WHITE);

   c.add(l1);
   s.putConstraint(SpringLayout.NORTH,l1,130,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l1,410,SpringLayout.WEST,c);
   l1.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l1.setForeground(Color.WHITE);

   c.add(t1);
   s.putConstraint(SpringLayout.NORTH,t1,130,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t1,590,SpringLayout.WEST,c);
   t1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));    
    
   c.add(l2);
   s.putConstraint(SpringLayout.NORTH,l2,180,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l2,410,SpringLayout.WEST,c);
   l2.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l2.setForeground(Color.WHITE);

   c.add(t2);
   s.putConstraint(SpringLayout.NORTH,t2,180,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t2,590,SpringLayout.WEST,c);
   t2.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20)); 

   c.add(l3);
   s.putConstraint(SpringLayout.NORTH,l3,230,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l3,410,SpringLayout.WEST,c);
   l3.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l3.setForeground(Color.WHITE);
   
   c.add(t3);
   s.putConstraint(SpringLayout.NORTH,t3,230,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t3,590,SpringLayout.WEST,c);
   t3.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20)); 

   c.add(l4);
   s.putConstraint(SpringLayout.NORTH,l4,280,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l4,410,SpringLayout.WEST,c);
   l4.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l4.setForeground(Color.WHITE);
   
   c.add(r1);
   s.putConstraint(SpringLayout.NORTH,r1,280,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,r1,610,SpringLayout.WEST,c);
   r1.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   r1.setOpaque(false);
   r1.setForeground(Color.BLACK);

   c.add(r2);
   s.putConstraint(SpringLayout.NORTH,r2,280,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,r2,740,SpringLayout.WEST,c);
   r2.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   r2.setOpaque(false);
   r2.setForeground(Color.BLACK);

   c.add(l5);
   s.putConstraint(SpringLayout.NORTH,l5,330,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l5,410,SpringLayout.WEST,c);
   l5.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l5.setForeground(Color.WHITE);

   c.add(t5);
   s.putConstraint(SpringLayout.NORTH,t5,330,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t5,590,SpringLayout.WEST,c);
   t5.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));

   c.add(l6);
   s.putConstraint(SpringLayout.NORTH,l6,380,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l6,410,SpringLayout.WEST,c);
   l6.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l6.setForeground(Color.WHITE);

   c.add(t6);
   s.putConstraint(SpringLayout.NORTH,t6,380,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t6,590,SpringLayout.WEST,c);
   t6.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));

   c.add(b2);
   s.putConstraint(SpringLayout.NORTH,b2,480,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b2,220,SpringLayout.WEST,c);
   b2.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));    
   b2.setBackground(new Color(255,193,7));
   b2.setForeground(Color.BLACK);

   c.add(b3);
   s.putConstraint(SpringLayout.NORTH,b3,480,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b3,570,SpringLayout.WEST,c);
   b3.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));    
   b3.setBackground(new Color(0,123,255));
   b3.setForeground(Color.WHITE);

   c.add(b4);
   s.putConstraint(SpringLayout.NORTH,b4,480,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b4,920,SpringLayout.WEST,c);
   b4.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));    
   b4.setBackground(new Color(220,53,69));
   b4.setForeground(Color.WHITE);

   c.add(b5);
   s.putConstraint(SpringLayout.NORTH,b5,560,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b5,460,SpringLayout.WEST,c);
   b5.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));    
   b5.setBackground(new Color(108,117,125));
   b5.setForeground(Color.WHITE);

   c.add(b6);
   s.putConstraint(SpringLayout.NORTH,b6,560,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b6,700,SpringLayout.WEST,c);
   b6.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));    
   b6.setBackground(new Color(52,58,64));
   b6.setForeground(Color.WHITE);

   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
   b5.addActionListener(this);
   b6.addActionListener(this);

    this.setSize(2000,1000);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

public void actionPerformed(ActionEvent e){
    String id=t1.getText();
    String name=t2.getText();
    String age=t3.getText();
    String disease=t5.getText();
    String phone=t6.getText();
    
    if(e.getSource()==b3){
        String search=JOptionPane.showInputDialog(this,"Enter the Patient ID to search: ");
        if(search!=null && !search.isEmpty()){
            try{
                File f = new File("Patient.txt");
                if(!f.exists()){
                    JOptionPane.showMessageDialog(this,"No record found!");
                    return;
                }
                BufferedReader br=new BufferedReader(new FileReader(f));
                String line;
                boolean found=false;
                while((line=br.readLine())!= null){
                    String[] data=line.split(",");
                    if(data[0].equals(search)){
                        t1.setText(data[0]);
                        t2.setText(data[1]);
                        t3.setText(data[2]);
                        if(data[3].equalsIgnoreCase("Male")){
                            r1.setSelected(true);
                        }
                        else{
                            r2.setSelected(true);
                        }

                        t5.setText(data[4]);
                        t6.setText(data[5]);

                        found=true;
                        break;
                    }
                }
                br.close();
                if(!found){
                    JOptionPane.showMessageDialog(this,"Patient not found with ID"+search);
                }
            }
            catch(IOException ex){
                JOptionPane.showMessageDialog(this, "Error!");
            }
            
        }
           else{
            JOptionPane.showMessageDialog(this,"Enter the ID first");
           }
        }
        else if(e.getSource()==b4){
       String delete=JOptionPane.showInputDialog(this,"Enter the ID to delete: ");
       
       if(delete!=null && !delete.isEmpty()){
        try{
        File fold= new File("Patient.txt");
         File fnew =new File("Update.txt");
         BufferedReader br= new BufferedReader(new FileReader(fold));
         BufferedWriter br2=new BufferedWriter(new FileWriter(fnew));
        String line;
        boolean deleted=false;
        while((line=br.readLine())!= null){

            String[] data=line.split(",");

            if(!data[0].trim().equals(delete.trim())){
              br2.write(line);
              br2.newLine();
            }
            else{
                deleted=true;
            }
        }
        br.close();
        br2.close();
        fold.delete();
        fnew.renameTo(new File("Patient.txt"));
        if(deleted){
         JOptionPane.showMessageDialog(this, "Patient deleted successfully.");
         //Empty the textfields
         t1.setText("");
         t2.setText("");
         t3.setText("");
         t5.setText("");
         t6.setText("");
        }
        else{
            JOptionPane.showMessageDialog(this,"Patient ID not Found!");
        }
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
        }
       }
        }
        else if(e.getSource()==b5){
         t1.setText("");
         t2.setText("");
         t3.setText("");
         //for radio button
         g.clearSelection();

         t5.setText("");
         t6.setText("");
         t1.requestFocus();
        }
        else if(e.getSource()==b6){
         this.setVisible(false);
         Dashboard d= new Dashboard();
         d.setVisible(true);
        }
    else if(id.isEmpty() || name.isEmpty() || age.isEmpty() || disease.isEmpty() || phone.isEmpty() ){
      JOptionPane.showMessageDialog(this,"Please fill up all the fields!");
    }
    if(e.getSource()==b1){
        try{
         FileWriter w=new FileWriter("Patient.txt",true);
         BufferedWriter bw=new BufferedWriter(w);
         String gender="";
         if(r1.isSelected()){
            gender="Male";
         }
         else if(r2.isSelected()){
            gender="Female";
         }
         String record=t1.getText()+","+t2.getText()+","+t3.getText()+","+gender+","+t5.getText()+","+t6.getText();
         bw.write(record);
         bw.newLine();
         bw.close();
         w.close();
         JOptionPane.showMessageDialog(this, "Data is Saved Successfully");
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Data is Not Saved Successfully");
        }
    }
    else if(e.getSource()==b2){
        try{
            File fold=new File("Patient.txt");
            File fnew=new File("Update.txt");
            BufferedReader br=new BufferedReader(new FileReader(fold));
            BufferedWriter br2=new BufferedWriter(new FileWriter(fnew));
            String line;
         String gender="";
         if(r1.isSelected()){
            gender="Male";
         }
         else if(r2.isSelected()){
            gender="Female";
         }
         String record=t1.getText()+","+t2.getText()+","+t3.getText()+","+gender+","+t5.getText()+","+t6.getText();
            boolean upd=false;
            while((line=br.readLine())!=null){
             String[] data=line.split(",");
             if(data[0].equals(t1.getText())){
                br2.write(record);
                upd=true;
             }
             else{
                br2.write(line);
             }
             br2.newLine();
            }
            
             br.close();
             br2.close();
             //Delete old file and create new file
             fold.delete();
             fnew.renameTo(new File("Patient.txt"));
            if(upd){
                JOptionPane.showMessageDialog(this,"The Data is updated successfully");
            }
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(this,"The Data is not updated successfully.");
        }
    }
}
}
class Doctor extends JFrame implements ActionListener{
      Container c=this.getContentPane();
//Buttons
 JButton b1=new JButton("Add Doctor");
 JButton b2=new JButton("Update Doctor");
 JButton b3=new JButton("Search Doctor");
 JButton b4=new JButton("Delete Doctor");
 JButton b5=new JButton("    Back         ");
 JButton b6= new JButton("   Clear        ");
 //Labels
 JLabel head= new JLabel("Doctor Management");
 JLabel l1= new JLabel("Doctor ID");
 JLabel l2= new JLabel("Name: ");
 JLabel l3= new JLabel("Specialization: ");
 JLabel l4= new JLabel("Timing: ");
 JLabel l5= new JLabel("Contact: ");
//Text Fields
JTextField t1= new JTextField(26);
JTextField t2= new JTextField(26);
JTextField t3= new JTextField(26);
JTextField t4= new JTextField(26);
JTextField t5= new JTextField(26);
//Image
ImageIcon i= new ImageIcon("Doctor.png");
  Image i2= i.getImage().getScaledInstance(300, 200,Image.SCALE_SMOOTH);
  ImageIcon i3= new ImageIcon(i2);
  JLabel imgl= new JLabel(i3);
//Layout
SpringLayout s= new SpringLayout();
       Doctor(){
        c.setLayout(s);

   c.setBackground(new Color(70,130,180));


   c.add(imgl);
   s.putConstraint(SpringLayout.NORTH,imgl,-55,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,imgl,260,SpringLayout.WEST,c);

   c.add(head);
   s.putConstraint(SpringLayout.NORTH,head,5,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,head,460,SpringLayout.WEST,c);
   head.setFont(new Font("Monotype Corsiva", Font.BOLD, 60));
   head.setForeground(Color.WHITE);

   c.add(b1);
   s.putConstraint(SpringLayout.NORTH,b1,80,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b1,630,SpringLayout.WEST,c);
   b1.setFont(new Font("Monotype Corsiva", Font.BOLD, 28));    
   b1.setBackground(new Color(40,167,69));
   b1.setForeground(Color.WHITE);

   c.add(l1);
   s.putConstraint(SpringLayout.NORTH,l1,130,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l1,410,SpringLayout.WEST,c);
   l1.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l1.setForeground(Color.WHITE);

   c.add(t1);
   s.putConstraint(SpringLayout.NORTH,t1,130,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t1,590,SpringLayout.WEST,c);
   t1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));    
    
   c.add(l2);
   s.putConstraint(SpringLayout.NORTH,l2,180,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l2,410,SpringLayout.WEST,c);
   l2.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l2.setForeground(Color.WHITE);

   c.add(t2);
   s.putConstraint(SpringLayout.NORTH,t2,180,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t2,590,SpringLayout.WEST,c);
   t2.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20)); 

   c.add(l3);
   s.putConstraint(SpringLayout.NORTH,l3,230,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l3,410,SpringLayout.WEST,c);
   l3.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l3.setForeground(Color.WHITE);
   
   c.add(t3);
   s.putConstraint(SpringLayout.NORTH,t3,230,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t3,590,SpringLayout.WEST,c);
   t3.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20)); 

   c.add(l4);
   s.putConstraint(SpringLayout.NORTH,l4,280,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l4,410,SpringLayout.WEST,c);
   l4.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l4.setForeground(Color.WHITE);
   
   c.add(t4);
   s.putConstraint(SpringLayout.NORTH,t4,280,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t4,590,SpringLayout.WEST,c);
   t4.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20)); 

   c.add(l5);
   s.putConstraint(SpringLayout.NORTH,l5,330,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l5,410,SpringLayout.WEST,c);
   l5.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l5.setForeground(Color.WHITE);

   c.add(t5);
   s.putConstraint(SpringLayout.NORTH,t5,330,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t5,590,SpringLayout.WEST,c);
   t5.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));


   c.add(b2);
   s.putConstraint(SpringLayout.NORTH,b2,480,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b2,220,SpringLayout.WEST,c);
   b2.setFont(new Font("Monotype Corsiva", Font.BOLD, 28));    
   b2.setBackground(new Color(255,193,7));
   b2.setForeground(Color.BLACK);

   c.add(b3);
   s.putConstraint(SpringLayout.NORTH,b3,480,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b3,590,SpringLayout.WEST,c);
   b3.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));    
   b3.setBackground(new Color(0,123,255));
   b3.setForeground(Color.WHITE);

   c.add(b4);
   s.putConstraint(SpringLayout.NORTH,b4,480,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b4,950,SpringLayout.WEST,c);
   b4.setFont(new Font("Monotype Corsiva", Font.BOLD, 28));    
   b4.setBackground(new Color(220,53,69));
   b4.setForeground(Color.WHITE);

   c.add(b5);
   s.putConstraint(SpringLayout.NORTH,b5,560,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b5,500,SpringLayout.WEST,c);
   b5.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));    
   b5.setBackground(new Color(108,117,125));
   b5.setForeground(Color.WHITE);
  
   c.add(b6);
   s.putConstraint(SpringLayout.NORTH,b6,560,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b6,750,SpringLayout.WEST,c);
   b6.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));    
   b6.setBackground(new Color(120,144,156));
   b6.setForeground(Color.WHITE);
//Adding Action Listener
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
   b5.addActionListener(this);
   b6.addActionListener(this);

   this.setSize(2000,1000);
   this.setVisible(true);
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }

       public void actionPerformed(ActionEvent e){
        String id=t1.getText();
        String name=t2.getText();
        String specify=t3.getText();
        String time=t4.getText();
        String contact=t5.getText();
        if(e.getSource()==b6){
          t1.setText("");
          t2.setText("");
          t3.setText("");
          t4.setText("");
          t5.setText("");
        }
       else if(e.getSource()==b5){
         this.setVisible(false);
         Dashboard d= new Dashboard();
         d.setVisible(true);
       }
       else if(e.getSource()==b3){
        String search=JOptionPane.showInputDialog(null,"Enter the ID of the Doctor to search:");
        if(!search.isEmpty() && search!=null){
            try{
        File f=new File("Doctor.txt");
        BufferedReader br= new BufferedReader(new FileReader(f));
        String line;
        boolean found=false;
        while((line=br.readLine())!=null){
            String[] data=line.split(",");
            if(data[0].equals(search)){
              t1.setText(data[0]);
              t2.setText(data[1]);
              t3.setText(data[2]);
              t4.setText(data[3]);
              t5.setText(data[4]);
              found=true;
            }
        }
        br.close();
        if(!found){
            JOptionPane.showMessageDialog(this,"ID not found");
        }
    }
    catch(IOException ex){
        JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
    }
       }
    }//Else if bracket
     
     else if(e.getSource()==b4){
        String delete=JOptionPane.showInputDialog(this,"Enter the ID to delete: ");
        try {
            File fold= new File("Doctor.txt");
            File fnew =new File("Update.txt");
            BufferedReader br=new BufferedReader(new FileReader(fold));
            BufferedWriter bw=new BufferedWriter(new FileWriter(fnew));
            String line;
            boolean deleted=false;
            while((line=br.readLine())!=null){
                String[] data=line.split(",");
                if(!data[0].equals(delete)){
                 bw.write(line);
                }
                else{
                    deleted=true;
                }
            }
            br.close();
            bw.close();
            fold.delete();
            fnew.renameTo(new File("Doctor.txt"));
            if(deleted){
                JOptionPane.showMessageDialog(this,"The record is deleted successfully.");
            }
            else{
               JOptionPane.showMessageDialog(this,"The ID is not Found");
            }
        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"Error!");
        }
     }//else bracket
     else if(id.isEmpty()  || name.isEmpty() || specify.isEmpty() || time.isEmpty() || contact.isEmpty()){
         JOptionPane.showMessageDialog(this,"Please fill up all the fields.");
     }

         else if(e.getSource()==b1){
        try{
        File f= new File("Doctor.txt");
        BufferedWriter bw= new BufferedWriter(new FileWriter(f,true));
        String record=t1.getText()+","+t2.getText()+","+t3.getText()+","+t4.getText()+","+t5.getText()+",";
         bw.write(record);
         bw.newLine();
         bw.close();
         JOptionPane.showMessageDialog(this, "The data is added successfully");
         
       }
       
       catch(IOException ex){
         JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
         }  
       }//bracket main


else if(e.getSource()==b2){
       try{
            File fold= new File("Doctor.txt");
            File fnew =new File("Update.txt");
            BufferedReader br=new BufferedReader(new FileReader(fold));
            BufferedWriter bw= new BufferedWriter(new FileWriter(fnew,true));
            String line;
            String record=t1.getText()+","+t2.getText()+","+t3.getText()+","+t4.getText()+","+t5.getText()+",";
            boolean update=false;
            while((line=br.readLine())!=null){
               String[] data=line.split(",");
               if(data[0].equals(t1.getText())){
                   bw.write(record);
                   update=true;
               }
               else{     //Copy the data as it is
                 bw.write(line);
               }
               bw.newLine();
            }
            br.close();
            bw.close();
            fold.delete();
            fnew.renameTo(new File("Doctor.txt"));
            if(update){
             JOptionPane.showMessageDialog(this,"The data is updated successfully.");
            }
       }
       catch(IOException ex){
           JOptionPane.showMessageDialog(this,"The data is not updated successfully.");
       }
     }//Bracket main


    }

       }
class Appointment extends JFrame implements ActionListener{
   Container c=this.getContentPane();
//Buttons
 JButton b1=new JButton("Book Appointment");
 JButton b2=new JButton("Search Appointment");
 JButton b3=new JButton("Cancel Appointment");
 JButton b4=new JButton("View Appointment");
 JButton b5=new JButton("    Back         ");
 JButton b6= new JButton("   Clear        ");
 //Labels
 JLabel head= new JLabel("Appointment Management");
 JLabel l1= new JLabel("Appiontment ID: ");
 JLabel l2= new JLabel("Patient ID: ");
 JLabel l3= new JLabel("Doctor ID: ");
 JLabel l4= new JLabel("Date: ");
 JLabel l5= new JLabel("Timing: ");
//Text Fields
JTextField t1= new JTextField(26);
JTextField t2= new JTextField(26);
JTextField t3= new JTextField(26);
JTextField t4= new JTextField(26);
JTextField t5= new JTextField(26);
//Setting table to view appointment
 DefaultTableModel model=new DefaultTableModel();
JTable table=new JTable(model);
JScrollPane sp=new JScrollPane(table);
public void loadTableData(DefaultTableModel modelparam){
model.setRowCount(0); 
   
    try{
        File f=new File("Appointment.txt");
        BufferedReader br=new BufferedReader(new FileReader(f));
        String line;
        while((line=br.readLine())!= null){
            String[] data= line.split(",");
            model.addRow(data);
        }
      br.close();
     }//try
     
     catch(Exception ex){
      JOptionPane.showMessageDialog(this,"Error!"+ex.getMessage());
     }
}
 //Image
ImageIcon i= new ImageIcon("Appoitnment.png");
  Image i2= i.getImage().getScaledInstance(300, 200,Image.SCALE_SMOOTH);
  ImageIcon i3= new ImageIcon(i2);
  JLabel imgl= new JLabel(i3);
//Layout
SpringLayout s= new SpringLayout();

Appointment(){
            c.setLayout(s);

   c.setBackground(new Color(40,54,85));
//Setting table
model.setColumnIdentifiers(new String[]{"Appointment ID","Patient ID","Doctor ID","Date","Time"});
c.add(sp);

sp.setVisible(false);

   c.add(imgl);
   s.putConstraint(SpringLayout.NORTH,imgl,-55,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,imgl,260,SpringLayout.WEST,c);

   c.add(head);
   s.putConstraint(SpringLayout.NORTH,head,5,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,head,460,SpringLayout.WEST,c);
   head.setFont(new Font("Monotype Corsiva", Font.BOLD, 60));
   head.setForeground(Color.WHITE);

   c.add(b1);
   s.putConstraint(SpringLayout.NORTH,b1,80,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b1,630,SpringLayout.WEST,c);
   b1.setFont(new Font("Monotype Corsiva", Font.BOLD, 28));    
   b1.setBackground(new Color(40,167,69));
   b1.setForeground(Color.WHITE);

   c.add(l1);
   s.putConstraint(SpringLayout.NORTH,l1,130,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l1,410,SpringLayout.WEST,c);
   l1.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l1.setForeground(Color.WHITE);

   c.add(t1);
   s.putConstraint(SpringLayout.NORTH,t1,130,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t1,590,SpringLayout.WEST,c);
   t1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));    
    
   c.add(l2);
   s.putConstraint(SpringLayout.NORTH,l2,180,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l2,410,SpringLayout.WEST,c);
   l2.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l2.setForeground(Color.WHITE);

   c.add(t2);
   s.putConstraint(SpringLayout.NORTH,t2,180,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t2,590,SpringLayout.WEST,c);
   t2.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20)); 

   c.add(l3);
   s.putConstraint(SpringLayout.NORTH,l3,230,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l3,410,SpringLayout.WEST,c);
   l3.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l3.setForeground(Color.WHITE);
   
   c.add(t3);
   s.putConstraint(SpringLayout.NORTH,t3,230,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t3,590,SpringLayout.WEST,c);
   t3.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20)); 

   c.add(l4);
   s.putConstraint(SpringLayout.NORTH,l4,280,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l4,410,SpringLayout.WEST,c);
   l4.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l4.setForeground(Color.WHITE);
   
   c.add(t4);
   s.putConstraint(SpringLayout.NORTH,t4,280,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t4,590,SpringLayout.WEST,c);
   t4.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20)); 

   c.add(l5);
   s.putConstraint(SpringLayout.NORTH,l5,330,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l5,410,SpringLayout.WEST,c);
   l5.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l5.setForeground(Color.WHITE);

   c.add(t5);
   s.putConstraint(SpringLayout.NORTH,t5,330,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t5,590,SpringLayout.WEST,c);
   t5.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));


   c.add(b2);
   s.putConstraint(SpringLayout.NORTH,b2,480,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b2,220,SpringLayout.WEST,c);
   b2.setFont(new Font("Monotype Corsiva", Font.BOLD, 28));    
   b2.setBackground(new Color(255,193,7));
   b2.setForeground(Color.BLACK);

   c.add(b3);
   s.putConstraint(SpringLayout.NORTH,b3,480,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b3,590,SpringLayout.WEST,c);
   b3.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));    
   b3.setBackground(new Color(0,123,255));
   b3.setForeground(Color.WHITE);

   c.add(b4);
   s.putConstraint(SpringLayout.NORTH,b4,480,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b4,950,SpringLayout.WEST,c);
   b4.setFont(new Font("Monotype Corsiva", Font.BOLD, 28));    
   b4.setBackground(new Color(220,53,69));
   b4.setForeground(Color.WHITE);

   c.add(b5);
   s.putConstraint(SpringLayout.NORTH,b5,560,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b5,500,SpringLayout.WEST,c);
   b5.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));    
   b5.setBackground(new Color(108,117,125));
   b5.setForeground(Color.WHITE);
  
   c.add(b6);
   s.putConstraint(SpringLayout.NORTH,b6,560,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b6,750,SpringLayout.WEST,c);
   b6.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));    
   b6.setBackground(new Color(120,144,156));
   b6.setForeground(Color.WHITE);
//Adding Action Listener
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);

/*A methood in which use the operation without going to the action class---->b4.addActionListener(ev ->{loadTableData(model);
 sp.setVisible(true); c.revalidate(); c.repaint();});
 in this case compiler will not chcek the action class of b4 block it will execute this thing(Statement)
 */
  
 b5.addActionListener(this);
   b6.addActionListener(this);

   //setting the position of table
   s.putConstraint(SpringLayout.NORTH,sp,100,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,sp,400,SpringLayout.WEST,c);
   table.setBackground(Color.BLACK);
   table.setForeground(Color.WHITE);

   this.setSize(2000,1000);
   this.setVisible(true);
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
    String ap=t1.getText();
    String patientid=t2.getText();
    String docid=t2.getText();
    String date=t4.getText();
    String time=t5.getText(); 
    if(e.getSource()==b2){
        String search=JOptionPane.showInputDialog("Enter the Apointment ID: ");
        try {
            
         if(!(search.isEmpty()) && search!= null){
            File f=new File("Appointment.txt");
            BufferedReader br=new BufferedReader(new FileReader(f));
            
            String line;
            boolean found=false;
            while((line=br.readLine())!=null){
              String[] data=line.split(",");
              if(data[0].equals(search)){
                t1.setText(data[0]);
                t2.setText(data[1]);
                t3.setText(data[2]);
                t4.setText(data[3]);
                t5.setText(data[4]);
                found=true;
                break;
            }
        }
        if(!found){
            JOptionPane.showMessageDialog(this,"Appointment ID not found: ");
           }
          br.close();
            }//if bracket
        } //try bracket
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"Error! "+ex.getMessage());
        }
     }//Else
     else if(e.getSource()==b3){
        String delete=JOptionPane.showInputDialog(this,"Enter the Appointment ID to cancel: ");
          
        try {
            if(!(delete.isEmpty()) && delete!=null){
              File fold=new File("Appointment.txt");
              File fnew =new File("Update.txt");

              BufferedReader br=new BufferedReader(new FileReader(fold));
              BufferedWriter bw=new BufferedWriter(new FileWriter(fnew));
              String line;
            boolean deleted=false;
            while((line=br.readLine()) != null){
           String[]  data=line.split(",");
           if(!(data[0].equals(delete))){
            bw.write(line);
            bw.newLine();
           }
           else{
            deleted=true;
           }

            }
            if(!deleted){
              JOptionPane.showMessageDialog(this,"Appointment ID not found!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Appointment canceled successfully");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");

            }
            br.close();
            bw.close();
            fold.delete();
            fnew.renameTo(new File("Appointment.txt"));
            }//If bracket
          }// try bracket

          catch (IOException ex) {
             JOptionPane.showMessageDialog(this,"Error! "+ex.getMessage());
          }
     }//else
   else if(e.getSource()==b4){
  if(sp.isVisible()){
    sp.setVisible(false);
    b4.setText("View Apointment");
  }
  else{
    loadTableData(model);
    sp.setVisible(true);
    c.revalidate();
    c.repaint();
   b4.setText("Close Table");
  }
   }//else bracket
   else if(e.getSource()==b5){
       this.setVisible(false);
       Dashboard d=new Dashboard();
       d.setVisible(true);
   }
   else if(e.getSource()==b6){
      t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
      t5.setText("");
   }
   else if(ap.isEmpty() || patientid.isEmpty() || docid.isEmpty() || date.isEmpty() || time.isEmpty()){
       JOptionPane.showMessageDialog(this,"Please fill up all the fields!");
   }
  else if(e.getSource()==b1){
         try {
            File f= new  File("Appointment.txt");
            BufferedWriter bw=new BufferedWriter(new FileWriter(f,true));
            String record=t1.getText()+","+t2.getText()+","+t3.getText()+","+t4.getText()+","+t5.getText();
            bw.write(record);
            bw.newLine();
            bw.close();
           JOptionPane.showMessageDialog(this,"The Appointment booked successfully.");
         } 
         
         catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"Apointment is not booked!"+ex.getMessage());
         }
     }//Else bracket

}

}//class bracket

class Billing extends JFrame implements ActionListener{
            Container c=this.getContentPane();
//Buttons
 JButton b1=new JButton("Generate Bill");
 JButton b2=new JButton("Print Bill");
 JButton b3=new JButton("    Clear       ");
 JButton b4=new JButton("    Back        ");
 //Labels
 JLabel head= new JLabel("Billing");
 JLabel l1= new JLabel("Patient ID: ");
 JLabel l2= new JLabel("Doctor Fee: ");
 JLabel l3= new JLabel("Room Charges: ");
 JLabel l4= new JLabel("Medicine Charges: ");
 JLabel l5=new JLabel("Total bill: ");
//Text Fields
JTextField t1= new JTextField(26);
JTextField t2= new JTextField(26);
JTextField t3= new JTextField(26);
JTextField t4= new JTextField(26);
JTextField t5=new JTextField(26);
//Image
  ImageIcon i= new ImageIcon("Billing.png");
  Image i2= i.getImage().getScaledInstance(300, 200,Image.SCALE_SMOOTH);
  ImageIcon i3= new ImageIcon(i2);
  JLabel imgl= new JLabel(i3);
//Layout'
SpringLayout s= new SpringLayout();
Billing(){
   c.setLayout(s);

   c.setBackground(new Color(62,14,80));

   
   c.add(imgl);
   s.putConstraint(SpringLayout.NORTH,imgl,-55,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,imgl,470,SpringLayout.WEST,c);

   c.add(head);
   s.putConstraint(SpringLayout.NORTH,head,5,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,head,670,SpringLayout.WEST,c);
   head.setFont(new Font("Monotype Corsiva", Font.BOLD, 60));
   head.setForeground(Color.WHITE);

   c.add(b1);
   s.putConstraint(SpringLayout.NORTH,b1,110,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b1,630,SpringLayout.WEST,c);
   b1.setFont(new Font("Monotype Corsiva", Font.BOLD, 28));    
   b1.setBackground(new Color(40,167,69));
   b1.setForeground(Color.WHITE);

   c.add(l1);
   s.putConstraint(SpringLayout.NORTH,l1,180,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l1,410,SpringLayout.WEST,c);
   l1.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l1.setForeground(Color.WHITE);

   c.add(t1);
   s.putConstraint(SpringLayout.NORTH,t1,180,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t1,590,SpringLayout.WEST,c);
   t1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));    
    
   c.add(l2);
   s.putConstraint(SpringLayout.NORTH,l2,230,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l2,410,SpringLayout.WEST,c);
   l2.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l2.setForeground(Color.WHITE);

   c.add(t2);
   s.putConstraint(SpringLayout.NORTH,t2,230,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t2,590,SpringLayout.WEST,c);
   t2.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20)); 

   c.add(l3);
   s.putConstraint(SpringLayout.NORTH,l3,280,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l3,410,SpringLayout.WEST,c);
   l3.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l3.setForeground(Color.WHITE);
   
   c.add(t3);
   s.putConstraint(SpringLayout.NORTH,t3,280,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t3,590,SpringLayout.WEST,c);
   t3.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20)); 

   c.add(l4);
   s.putConstraint(SpringLayout.NORTH,l4,330,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l4,410,SpringLayout.WEST,c);
   l4.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l4.setForeground(Color.WHITE);
   
   c.add(t4);
   s.putConstraint(SpringLayout.NORTH,t4,330,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t4,590,SpringLayout.WEST,c);
   t4.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20)); 

   c.add(l5);
   s.putConstraint(SpringLayout.NORTH,l5,380,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,l5,410,SpringLayout.WEST,c);
   l5.setFont(new Font("Monotype Corsiva", Font.BOLD, 25));
   l5.setForeground(Color.WHITE);
   
   c.add(t5);
   s.putConstraint(SpringLayout.NORTH,t5,380,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,t5,590,SpringLayout.WEST,c);
   t5.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));   

   c.add(b2);
   s.putConstraint(SpringLayout.NORTH,b2,480,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b2,220,SpringLayout.WEST,c);
   b2.setFont(new Font("Monotype Corsiva", Font.BOLD, 28));    
   b2.setBackground(new Color(255,193,7));
   b2.setForeground(Color.BLACK);

   c.add(b3);
   s.putConstraint(SpringLayout.NORTH,b3,480,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b3,590,SpringLayout.WEST,c);
   b3.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));    
   b3.setBackground(new Color(0,123,255));
   b3.setForeground(Color.WHITE);

   c.add(b4);
   s.putConstraint(SpringLayout.NORTH,b4,480,SpringLayout.NORTH,c);
   s.putConstraint(SpringLayout.WEST,b4,950,SpringLayout.WEST,c);
   b4.setFont(new Font("Monotype Corsiva", Font.BOLD, 28));    
   b4.setBackground(new Color(220,53,69));
   b4.setForeground(Color.WHITE);  
    
 
   
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);

  this.setVisible(true);
  this.setSize(2000,1000);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e){
    
//String total5=t5.getText();
 if(e.getSource()==b3){
     t1.setText("");
    t2.setText("");
    t3.setText("");
    t4.setText("");
    t5.setText("");
}
else if(e.getSource()==b4){
    this.setVisible(false);
    Dashboard d=new Dashboard();
    d.setVisible(true);    
}    
                
else if(e.getSource()==b1){
    int id=Integer.parseInt(t1.getText());
int doctor=Integer.parseInt(t2.getText());
int medicine=Integer.parseInt(t3.getText());
int room=Integer.parseInt(t4.getText());
     if(t5.getText().length()>0){
       JOptionPane.showMessageDialog(this,"Please keep the "+"\"Total bill field\""+ " empty!","Warning!",JOptionPane.ERROR_MESSAGE);
       return;
    } 
    else{
        int   total=doctor+room+medicine;
       JOptionPane.showMessageDialog(this,"Patient ID: "+id+"\n Total bill: "+total);
       t5.setText(String.valueOf(total));
       try {

        File f=new File("Billing.txt");
           BufferedWriter br=new BufferedWriter(new FileWriter(f,true));
           String line=t1.getText()+","+t2.getText()+","+t3.getText()+","+t4.getText()+","+t5.getText();
          br.write(line);
          br.newLine();
          br.close();
       } 
       catch (IOException ex) {
         JOptionPane.showMessageDialog(this,"Error!"+ex.getMessage());
       }
        
    }
}//else brack
else if(e.getSource()==b2){
int doctor=Integer.parseInt(t2.getText());
int medicine=Integer.parseInt(t3.getText());
int room=Integer.parseInt(t4.getText());
    int   total=doctor+room+medicine;
       t5.setText(String.valueOf(total));
   String receipt=                  "Allied Hospital\n"+"Faisalabad,Pakistan\n"
                                     +"--------------------------------------"+ "\n"+                                          
                                     "Patient ID: "+t1.getText()+"\n"+ 
                                     "Doctor Fee: "+t2.getText()+"\n"+
                                     "Room Fee: "+t3.getText()+"\n"+
                                     "Medicine Charges: "+t4.getText()+"\n"+
                                     "--------------------------------------"+"\n"+
                                     "Total Fee: "+t5.getText()+"\n"+
                                     "--------------------------------------"+"\n"
                                     +"Get Well Soon";
     
JTextArea ta=new JTextArea();
Font receiptFont=new Font("Arial",Font.BOLD,25);
ta.setText(receipt);
ta.setFont(receiptFont);
try{
    ta.print();
}
catch(Exception ex){
JOptionPane.showMessageDialog(this,"Error! "+ex.getMessage());
}

 }

}

}//Class 
class Record extends JFrame implements ActionListener{
   Container c=this.getContentPane();
   //images
    //b1
    ImageIcon b1Icon=new ImageIcon("Patient.png");
    Image imp=b1Icon.getImage().getScaledInstance(180, 110, Image.SCALE_SMOOTH);
    ImageIcon imp2= new ImageIcon(imp);
    //b2
    ImageIcon b2Icon= new ImageIcon("Doctor.png");
    Image imd=b2Icon.getImage().getScaledInstance(180, 110, Image.SCALE_SMOOTH);
    ImageIcon imd2= new ImageIcon(imd );
    //b3
    ImageIcon b3Icon=new ImageIcon("Appoitnment.png");
    Image ima=b3Icon.getImage().getScaledInstance(180, 110, Image.SCALE_SMOOTH);
    ImageIcon ima2= new ImageIcon(ima);
    //b4
    ImageIcon b4Icon=new ImageIcon("Billing.png");
    Image imb=b4Icon.getImage().getScaledInstance(180, 110, Image.SCALE_SMOOTH);
    ImageIcon imb2= new ImageIcon(imb);
    //b5
    ImageIcon b5Icon=new ImageIcon("Exit.png");
    Image imr=b5Icon.getImage().getScaledInstance(180, 110, Image.SCALE_SMOOTH);
    ImageIcon imr2= new ImageIcon(imr);
   //Button 
    JButton b1=new JButton(imp2);
    JButton b2=new JButton(imd2);
    JButton b3=new JButton(ima2);
    JButton b4=new JButton(imb2);
    JButton b5=new JButton(imr2);
    JButton b6=new JButton("Close Table");    
//Labels
JLabel head=new JLabel("Records Management");
   JLabel l1= new JLabel("View Patients");
    JLabel l2= new JLabel("View Doctors");
    JLabel l3= new JLabel("View Appointment");
    JLabel l4= new JLabel("View Billing");
    JLabel l5= new JLabel("   Back       ");
//Layout
SpringLayout s=new SpringLayout();
//Setting the Tables
//for patients
 DefaultTableModel model=new DefaultTableModel();
JTable table=new JTable(model);
JScrollPane sp=new JScrollPane(table);
public void loadTableData(DefaultTableModel targetModel,String filename){
targetModel.setRowCount(0); 
   
    try{
        File f=new File(filename);
        BufferedReader br=new BufferedReader(new FileReader(f));
        String line;
        while((line=br.readLine())!= null){
            String[] data= line.split(",");
            targetModel.addRow(data);
        }
      br.close();
     }//try
     
     catch(Exception ex){
      JOptionPane.showMessageDialog(this,"Error!"+ex.getMessage());
     }
}
   Record(){
     	c.setLayout(s);
 
        c.setBackground(new Color(41,128,185));

        c.add(sp);
        sp.setVisible(false);
        model.setColumnIdentifiers(new String[]{"Appointment ID","Patient ID","Doctor ID","Date","Time"});

      c.add(head);
      s.putConstraint(SpringLayout.NORTH,head,40,SpringLayout.NORTH,c);
      s.putConstraint(SpringLayout.WEST,head,510,SpringLayout.WEST,c);
      head.setFont(new Font("Monotype Corsiva", Font.BOLD, 60));

      c.add(b1);
      s.putConstraint(SpringLayout.NORTH,b1,160,SpringLayout.NORTH,c);
      s.putConstraint(SpringLayout.WEST,b1,100,SpringLayout.WEST,c);
      b1.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
      b1.setHorizontalTextPosition(SwingConstants.RIGHT);
      b1.setHorizontalTextPosition(SwingConstants.CENTER);

      c.add(l1);
      s.putConstraint(SpringLayout.NORTH,l1,290,SpringLayout.NORTH,c);
      s.putConstraint(SpringLayout.WEST,l1,140,SpringLayout.WEST,c);
      l1.setFont(new Font("Monotype Corsiva", Font.BOLD, 23));

      c.add(b2);
      s.putConstraint(SpringLayout.NORTH,b2,160,SpringLayout.NORTH,c);
      s.putConstraint(SpringLayout.WEST,b2,560,SpringLayout.WEST,c);
      b2.setHorizontalTextPosition(SwingConstants.RIGHT);
      b2.setHorizontalTextPosition(SwingConstants.CENTER);
   
      c.add(l2);
      s.putConstraint(SpringLayout.NORTH,l2,290,SpringLayout.NORTH,c);
      s.putConstraint(SpringLayout.WEST,l2,600,SpringLayout.WEST,c);
      l2.setFont(new Font("Monotype Corsiva", Font.BOLD, 23));

      c.add(b3);
      s.putConstraint(SpringLayout.NORTH,b3,160,SpringLayout.NORTH,c);
      s.putConstraint(SpringLayout.WEST,b3,1000,SpringLayout.WEST,c);
      b3.setHorizontalTextPosition(SwingConstants.RIGHT);
      b3.setHorizontalTextPosition(SwingConstants.CENTER);

      c.add(l3);
      s.putConstraint(SpringLayout.NORTH,l3,290,SpringLayout.NORTH,c);
      s.putConstraint(SpringLayout.WEST,l3,1015,SpringLayout.WEST,c);
      l3.setFont(new Font("Monotype Corsiva", Font.BOLD, 23));

      c.add(b4);
      s.putConstraint(SpringLayout.NORTH,b4,370,SpringLayout.NORTH,c);
      s.putConstraint(SpringLayout.WEST,b4,300,SpringLayout.WEST,c);
      b4.setHorizontalTextPosition(SwingConstants.RIGHT);
      b4.setHorizontalTextPosition(SwingConstants.CENTER);     

      c.add(l4);
      s.putConstraint(SpringLayout.NORTH,l4,500,SpringLayout.NORTH,c);
      s.putConstraint(SpringLayout.WEST,l4,340,SpringLayout.WEST,c);
      l4.setFont(new Font("Monotype Corsiva", Font.BOLD, 23));

      c.add(b5);
      s.putConstraint(SpringLayout.NORTH,b5,370,SpringLayout.NORTH,c);
      s.putConstraint(SpringLayout.WEST,b5,760,SpringLayout.WEST,c);
      b5.setHorizontalTextPosition(SwingConstants.RIGHT);
      b5.setHorizontalTextPosition(SwingConstants.CENTER);

      c.add(l5);
      s.putConstraint(SpringLayout.NORTH,l5,500,SpringLayout.NORTH,c);
      s.putConstraint(SpringLayout.WEST,l5,820,SpringLayout.WEST,c);
      l5.setFont(new Font("Monotype Corsiva", Font.BOLD, 26));
     
/*       c.add(b6);
      s.putConstraint(SpringLayout.NORTH,b6,580,SpringLayout.NORTH,c);
      s.putConstraint(SpringLayout.WEST,b6,520,SpringLayout.WEST,c);
      b6.setFont(new Font("Monotype Corsiva", Font.BOLD, 40));
      b6.setBackground(new Color(0,50,100));
      b6.setForeground(Color.WHITE);
   */   
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);

      

    this.setVisible(true);
     this.setSize(2000,1000);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void actionPerformed(ActionEvent e){
     if(e.getSource()==b1){
            
         if(sp.isVisible()){
    sp.setVisible(false);
    
  }
  else{
    loadTableData(model,"Patient.txt");
    sp.setVisible(true);
    c.revalidate();
    c.repaint();
  }
  
  model.setColumnIdentifiers(new String[]{"Patient ID","Name","Age","Gender","Disease","Phone"});
      
  s.putConstraint(SpringLayout.NORTH,sp,120,SpringLayout.NORTH,c);
  s.putConstraint(SpringLayout.WEST,sp,350,SpringLayout.WEST,c);
}     
     else if(e.getSource()==b2){
         
     model.setColumnIdentifiers(new String[]{"Doctor ID","Name","Specialization","Timing","Contact"});
       if(sp.isVisible()){
    sp.setVisible(false);
 
  }
  else{
    loadTableData(model,"Doctor.txt");
    sp.setVisible(true);
    c.revalidate();
    c.repaint();
 
  }   
  s.putConstraint(SpringLayout.NORTH,sp,120,SpringLayout.NORTH,c);
  s.putConstraint(SpringLayout.WEST,sp,100,SpringLayout.WEST,c);
     }
     else if(e.getSource()==b3){

       if(sp.isVisible()){
    sp.setVisible(false);
    
  }
  else{
    loadTableData(model,"Appointment.txt");
    sp.setVisible(true);
    c.revalidate();
    c.repaint();
  }       
  model.setColumnIdentifiers(new String[]{"Appointment ID","Patient ID","Doctor ID","Date","Time"});
     }
     else if(e.getSource()==b4){
       if(sp.isVisible()){
    sp.setVisible(false);
  
  }
       else{
    loadTableData(model,"Billing.txt");
    sp.setVisible(true);
    c.revalidate();
    c.repaint();
  }      
  model.setColumnIdentifiers(new String[]{"Patient ID","Doctor fee","Medicine Charges","Room Charges","Total Bill"});
      s.putConstraint(SpringLayout.NORTH,sp,200,SpringLayout.NORTH,c);
  s.putConstraint(SpringLayout.WEST,sp,550,SpringLayout.WEST,c); 
     }
     else if(e.getSource()==b5){
        this.setVisible(false);
         Dashboard d= new Dashboard();
         d.setVisible(true);
     }
    
   }
}
class Login extends JFrame implements ActionListener{
  Container c= this.getContentPane();
  JPasswordField pass= new JPasswordField(13);
  //Setting Labels
  JLabel l1= new JLabel("Hospital Management System");
  JLabel l2 = new JLabel("Username: ");
  JLabel l3= new JLabel("Password: ");
  JLabel l4= new JLabel("Welcome!");
  JLabel l5= new JLabel("Please login to continue....");
  //Setting Layout
  JButton b1=new JButton("Login");
  JButton b2= new JButton("Exit");
  //Setting Layout
  SpringLayout s= new SpringLayout();
  //Setting Icon
  ImageIcon i= new ImageIcon("10130.jpg");
  Image i2= i.getImage().getScaledInstance(110, 110,Image.SCALE_SMOOTH);
  ImageIcon i3= new ImageIcon(i2);
  JLabel imgl= new JLabel(i3);
  //Setitng TextField
  JTextField t= new JTextField(13);
  //Setting the Login System at which the user can enter the correct password and user name
  String uname="Admin";
  int password=1234;
  //Constructor
  Login(){
    
    c.setLayout(s);
    c.setBackground(Color.GRAY);

    c.add(l1);
    l1.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
    l1.setForeground(Color.BLACK);
    s.putConstraint(SpringLayout.NORTH,l1,5,SpringLayout.NORTH,c);
    s.putConstraint(SpringLayout.WEST,l1,70,SpringLayout.WEST,c);
    
    c.add(l4);
    l4.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
    l4.setForeground(Color.BLACK);
    s.putConstraint(SpringLayout.NORTH,l4,43,SpringLayout.NORTH,c);
    s.putConstraint(SpringLayout.WEST,l4,180,SpringLayout.WEST,c);



    c.add(imgl);
    s.putConstraint(SpringLayout.NORTH,imgl,70,SpringLayout.NORTH,l1);
    s.putConstraint(SpringLayout.WEST,imgl,170,SpringLayout.WEST,c);
    
    c.add(l5);
    l5.setFont(new Font("Arial Black", Font.BOLD, 14));
    l5.setForeground(Color.BLACK);
    s.putConstraint(SpringLayout.NORTH,l5,190,SpringLayout.NORTH,c);
    s.putConstraint(SpringLayout.WEST,l5,140,SpringLayout.WEST,c);


    c.add(l2);
    s.putConstraint(SpringLayout.NORTH,l2,240,SpringLayout.NORTH,c);
    s.putConstraint(SpringLayout.WEST,l2,70,SpringLayout.WEST,c);
    l2.setFont(new Font("Arial Black", Font.BOLD, 12));
    l2.setForeground(Color.BLACK);    
  
    c.add(t);
    s.putConstraint(SpringLayout.NORTH,t,240,SpringLayout.NORTH,c);
    s.putConstraint(SpringLayout.WEST,t,230,SpringLayout.WEST,c);  

    c.add(l3);
    s.putConstraint(SpringLayout.NORTH,l3,300,SpringLayout.NORTH,c);
    s.putConstraint(SpringLayout.WEST,l3,70,SpringLayout.WEST,c);
    l3.setFont(new Font("Arial Black", Font.BOLD, 12));
    l3.setForeground(Color.BLACK);     
    
    c.add(pass);
    s.putConstraint(SpringLayout.NORTH,pass,300,SpringLayout.NORTH,c);
    s.putConstraint(SpringLayout.WEST,pass,230,SpringLayout.WEST,c);

    c.add(b1);
    s.putConstraint(SpringLayout.NORTH,b1,360,SpringLayout.NORTH,c);
    s.putConstraint(SpringLayout.WEST,b1,260,SpringLayout.WEST,c);

    c.add(b2);
    s.putConstraint(SpringLayout.NORTH,b2,360,SpringLayout.NORTH,c);
    s.putConstraint(SpringLayout.WEST,b2,110,SpringLayout.WEST,c);    

    b1.setBackground(new Color(0, 102, 204));
    b1.setForeground(Color.WHITE);

    b2.setBackground(new Color(0, 102, 204));
    b2.setForeground(Color.WHITE);


    b1.addActionListener(this);
    b2.addActionListener(this);
    
    
 
 
    this.setSize(500,500);
    this.setResizable(false);
//Setting the window at center
this.setLocationRelativeTo(c);
    this.setVisible(true);     
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
    String name=t.getText();
    String passText=new String(pass.getPassword());
    if(e.getSource()==b1){
        if(name.isEmpty() || passText.isEmpty()){
        JOptionPane.showMessageDialog(this, "Please enter the username or password first!");
        }
        else if(name.equals("Admin") && passText.equals("1234")){
            this.setVisible(false);
         JOptionPane.showMessageDialog(this, "Login Successfully");
         Dashboard db=new Dashboard();
         db.setVisible(true); 
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid username or Password!","Error",JOptionPane.ERROR_MESSAGE);
        }
    
}
    if(e.getSource()==b2){
        this.setVisible(false);
        System.exit(0);
    }

    
}  
}
public class Hospital_Management_System {
    public static void main(String[] args) {
     new Login();   
    }
}