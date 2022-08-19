import java.util.List;

public class Main {
    static CocheCRUDInterface cocheCRUD;

    public static void main(String[] args) {
        CocheCRUDInterface cocheCrud = new CocheCRUDImpl();
        Coche coche1 = new Coche("12313213");
        cocheCrud.save(coche1);
        List<Coche> listadecoches = cocheCrud.findAll();
        System.out.println(listadecoches);
        cocheCrud.delete(coche1);
    }
}