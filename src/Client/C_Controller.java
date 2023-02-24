package Client;

import javax.swing.*;

public class C_Controller {
    private C_Model model;
    private C_View view;

    public C_Controller(C_Model model, C_View view) {
        this.model = model;
        this.view = view;

        JFrame frame = new JFrame("Chat-Klient");
        frame.setContentPane(view.getViewPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 400);
        frame.setVisible(true);

        model.getStream();
    }

    public C_Model getModel() {
        return model;
    }

    public void setModel(C_Model model) {
        this.model = model;
    }

    public C_View getView() {
        return view;
    }

    public void setView(C_View view) {
        this.view = view;
    }
}
