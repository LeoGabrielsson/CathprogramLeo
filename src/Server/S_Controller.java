package Server;

import javax.swing.*;

public class S_Controller {
    private S_Model model;
    private S_View view;

    public S_Controller(S_Model model, S_View view) {
        this.model = model;
        this.view = view;

        JFrame frame = new JFrame("S_View");
        frame.setContentPane(view.getViewPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
