package Server;

public class ServerGrejen {
    public static void main(String[] args) {
        S_Model model = new S_Model(8);
        S_View view = new S_View();
        S_Controller controller = new S_Controller(model, view);
    }
}
