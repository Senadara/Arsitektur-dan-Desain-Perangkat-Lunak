package controller;

import view.PersonView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class PersonController {
   private PersonView view;

   public PersonController(PersonView view) {
      this.view = view;

      // Add Event Listener
      this.view.addSaveListener(new SaveListener());
      this.view.addDeleteListener(new DeleteListener());
      this.view.addUpdateListener(new UpdateListener());
   }

   class SaveListener implements ActionListener {
      public void actionPerformed(ActionEvent event) {
         String firstName = view.getFirstName();
         String lastName = view.getLastName();
         String idNumber = view.getIdNumber();

         if (firstName.isEmpty() || lastName.isEmpty() || idNumber.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Field not be empty");
            return;
         }

         view.addPersonToTable(firstName, lastName, idNumber);
         view.setFirstName(" ");
         view.setLastName(" ");
         view.setIdNumber(" ");
      }
   }

   class DeleteListener implements ActionListener {
      public void actionPerformed(ActionEvent event) {
         int selectedRow = view.getSelectedRow();

         // jika data tidak ada
         if (selectedRow == -1) {
            JOptionPane.showMessageDialog(view, "Please Select a row to Delete");
            return;
         }

         view.removeSelectedRow(selectedRow);
      }
   }

   class UpdateListener implements ActionListener {
      public void actionPerformed(ActionEvent event) {
         int selectedRow = view.getSelectedRow();

         // jika data tidak ada
         if (selectedRow == -1) {
            JOptionPane.showMessageDialog(view, "Please Select a row to Update");
            return;
         }

         String firstName = view.getFirstName();
         String lastName = view.getLastName();
         String idNumber = view.getIdNumber();

         view.removeSelectedRow(selectedRow);
         view.addPersonToTable(firstName, lastName, idNumber);
      }
   }

}
