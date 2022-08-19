import java.util.List;

public interface CocheCRUDInterface {
    void save(Coche coche);
    void delete(Coche coche);
    List<Coche> findAll();
}
