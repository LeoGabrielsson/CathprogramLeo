package Client;

import javax.swing.*;

public class ClientGrejen {
    public static void main(String[] args) {
        C_Model model = new C_Model(Integer.parseInt(JOptionPane.showInputDialog("What port do you wish to connect to?"))); //10.70.45.159
        C_View view = new C_View();
        C_Controller controller = new C_Controller(model, view);

    }
}
