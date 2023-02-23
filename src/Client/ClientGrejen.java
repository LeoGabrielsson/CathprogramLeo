package Client;

public class ClientGrejen {
    public static void main(String[] args) {
        C_Model model = new C_Model();
        C_View view = new C_View();
        C_Controller controller = new C_Controller(model, view);
    }
}
