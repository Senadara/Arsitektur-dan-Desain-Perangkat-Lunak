package view;

import javax.swing.*;
// import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class PersonView extends JFrame {
   private JTextField textFirstName = new JTextField(10);
   private JTextField textLastName = new JTextField(10);
   private JTextField textidNumber = new JTextField(10);
   private JButton btnSave = new JButton("Save");
   private JButton btnDelete = new JButton("Delete");
   private JButton btnUpdate = new JButton("Update");
   private JTable table;
   private DefaultTableModel tableModel;

   public PersonView() {
      setTitle("Java GUI MVC");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(600, 800);
      setLocationRelativeTo(null);
      setLayout(new BorderLayout());

      // Star - Panel Input
      JPanel panelInput = new JPanel(new GridLayout(4, 2, 5, 5));
      panelInput.add(new JLabel("First Name"));
      panelInput.add(textFirstName);

      panelInput.add(new JLabel("Last Name"));
      panelInput.add(textLastName);

      panelInput.add(new JLabel("NIM"));
      panelInput.add(textidNumber);

      JPanel panelButton = new JPanel();
      panelButton.add(btnSave);
      panelButton.add(btnDelete);
      panelButton.add(btnUpdate);
      // End - Panel Input

      // start - Table
      tableModel = new DefaultTableModel(
            new String[] { "First Name", "Last Name", "NIm" },
            0);
      table = new JTable(tableModel);
      JScrollPane tableScrollPane = new JScrollPane(table);
      // end - Table

      //Add Component to JFrame
      add(panelInput, BorderLayout.NORTH); //atas
      add(panelButton, BorderLayout.CENTER); //tengah
      add(tableScrollPane, BorderLayout.SOUTH); //bawah
   }

   //Start - Getter & Setter button
   public String getFirstName() {
      return textFirstName.getText();
   }
   public String getLastName() {
      return textLastName.getText();
   }

   public String getIdNumber() {
      return textidNumber.getText();
   }
   
   public void setFirstName(String firstName) {
      textFirstName.setText(firstName);
   }
   public void setLastName(String lastName) {
      textLastName.setText(lastName);
   }

   public void setIdNumber(String idNumber) {
      textidNumber.setText(idNumber);
   }
   
   public void addPersonToTable(String firstName, String lastName, String idNumber) {
      tableModel.addRow(new Object[] { firstName, lastName, idNumber });
   }
   
   public void addSaveListener(ActionListener listener) {
      btnSave.addActionListener(listener);
   }
   public void addDeleteListener(ActionListener listener) {
      btnDelete.addActionListener(listener);
   }

   public void addUpdateListener(ActionListener listener) {
      btnUpdate.addActionListener(listener);
   }
   
   public int getSelectedRow() {
      return table.getSelectedRow();
   }

   public void removeSelectedRow(int index) {
      tableModel.removeRow(index);
   }
   //End - Getter & Setter button
}
