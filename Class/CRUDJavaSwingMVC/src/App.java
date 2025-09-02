import view.PersonView;
import controller.PersonController;

public class App {
   public static void main(String[] args) {
      PersonView view = new PersonView();
      new PersonController(view);
      view.setVisible(true);
   }
}