package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class PersonView extends JFrame {
   private JTextField txtFirstName = new JTextField(15);
   private JTextField txtLastName = new JTextField(15);
   private JTextField txtIdNumber = new JTextField(15);
   private JButton btnSave = new JButton("Save");
   private JButton btnUpdate = new JButton("Update");
   private JButton btnDelete = new JButton("Delete");
   private JTable table;
   private DefaultTableModel tableModel;

   public PersonView() {
      setTitle("CRUD Java Swing MVC");
      setSize(600, 800);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setLayout(new BorderLayout());

      // Panel Input
      JPanel panelInput = new JPanel(new GridLayout(4, 2, 5, 5));
      panelInput.add(new JLabel("First Name"));
      panelInput.add(txtFirstName);
      panelInput.add(new JLabel("Last Name"));
      panelInput.add(txtLastName);
      panelInput.add(new JLabel("NIM"));
      panelInput.add(txtIdNumber);

      JPanel panelButtons = new JPanel();
      panelButtons.add(btnSave);
      panelButtons.add(btnUpdate);
      panelButtons.add(btnDelete);

      // Table
      tableModel = new DefaultTableModel(new String[] { "First Name", "Last Name", "NIM" }, 0);
      table = new JTable(tableModel);
      JScrollPane tableScrollPane = new JScrollPane(table);

      // Add components to Frame
      add(panelInput, BorderLayout.NORTH);
      add(panelButtons, BorderLayout.CENTER);
      add(tableScrollPane, BorderLayout.SOUTH);
   }

   // Getters for fields and buttons
   public String getFirstName() {
      return txtFirstName.getText();
   }

   public String getLastName() {
      return txtLastName.getText();
   }

   public String getIdNumber() {
      return txtIdNumber.getText();
   }

   public void setFirstName(String firstName) {
      txtFirstName.setText(firstName);
   }

   public void setLastName(String lastName) {
      txtLastName.setText(lastName);
   }

   public void setIdNumber(String idNumber) {
      txtIdNumber.setText(idNumber);
   }

   public void addPersonToTable(String firstName, String lastName, String idNumber) {
      tableModel.addRow(new Object[] { firstName, lastName, idNumber });
   }

   public void addSaveListener(ActionListener listener) {
      btnSave.addActionListener(listener);
   }

   public void addUpdateListener(ActionListener listener) {
      btnUpdate.addActionListener(listener);
   }

   public void addDeleteListener(ActionListener listener) {
      btnDelete.addActionListener(listener);
   }

   public int getSelectedRow() {
      return table.getSelectedRow();
   }

   public void removeSelectedRow(int row) {
      tableModel.removeRow(row);
   }
}
