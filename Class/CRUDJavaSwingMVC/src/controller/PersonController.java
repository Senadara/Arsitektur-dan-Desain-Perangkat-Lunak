package controller;

// import model.Person;
import view.PersonView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class PersonController {
   private PersonView view;

   public PersonController(PersonView view) {
      this.view = view;

      // Event listeners
      this.view.addSaveListener(new SaveListener());
      this.view.addUpdateListener(new UpdateListener());
      this.view.addDeleteListener(new DeleteListener());
   }

   class SaveListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String firstName = view.getFirstName();
         String lastName = view.getLastName();
         String idNumber = view.getIdNumber();

         if (firstName.isEmpty() || lastName.isEmpty() || idNumber.isEmpty()) {
            JOptionPane.showMessageDialog(view, "All fields must be filled!");
            return;
         }

         view.addPersonToTable(firstName, lastName, idNumber);
         view.setFirstName("");
         view.setLastName("");
         view.setIdNumber("");
      }
   }

   class UpdateListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         int selectedRow = view.getSelectedRow();
         if (selectedRow == -1) {
            JOptionPane.showMessageDialog(view, "Please select a row to update!");
            return;
         }

         String firstName = view.getFirstName();
         String lastName = view.getLastName();
         String idNumber = view.getIdNumber();

         view.removeSelectedRow(selectedRow);
         view.addPersonToTable(firstName, lastName, idNumber);
      }
   }

   class DeleteListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         int selectedRow = view.getSelectedRow();
         if (selectedRow == -1) {
            JOptionPane.showMessageDialog(view, "Please select a row to delete!");
            return;
         }

         view.removeSelectedRow(selectedRow);
      }
   }
}
