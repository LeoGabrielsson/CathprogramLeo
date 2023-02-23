package Server;

import javax.swing.*;

public class S_Controller {
    private S_Model model;
    private S_View view;

    public S_Controller(S_Model model, S_View view) {
        this.model = model;
        this.view = view;

        JFrame frame = new JFrame("Server");
        frame.setContentPane(view.getViewPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 400);
        frame.setVisible(true);

    }

    public S_Model getModel() {
        return model;
    }

    public void setModel(S_Model model) {
        this.model = model;

    }

    public S_View getView() {
        return view;
    }

    public void setView(S_View view) {
        this.view = view;
    }
}
