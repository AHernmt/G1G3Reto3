package g1g3carrental.g1g3reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class RepositorioGama {
    @Autowired
    private InterfaceGama crud;
    public List<Gama> getAll(){
        return (List<Gama>) crud.findAll();
    }
    public Optional<Gama> getGama(int id){
        return crud.findById(id);
    }

    public Gama save(Gama Gama){
        return crud.save(Gama);
    }
    public void delete(Gama Gama){
        crud.delete(Gama);
    }
}
