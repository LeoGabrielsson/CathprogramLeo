package Client;

public class ClientGrejen {
    public static void main(String[] args) {
        C_Model model = new C_Model(); //10.70.45.159
        C_View view = new C_View();
        C_Controller controller = new C_Controller(model, view);

    }
}
