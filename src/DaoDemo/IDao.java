package DaoDemo;

import java.util.List;

public interface IDao<Type, Primarykey> {

    // Create
    void create(Type obj);

    // Update
    Type update(Type obj);

    // Read all
    List<Type>  findAll();

    // Read one
    Type find(Primarykey id);

    // Delete
    void delete(Primarykey id) throws Exception;
    //Type delete(Primarykey id); Il est préférable d'utiliser celui-ci pour ne pas perdre la donnée qu'on vient de supprimer.
}
