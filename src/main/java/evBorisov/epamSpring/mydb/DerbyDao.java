package evBorisov.epamSpring.mydb;

import org.springframework.stereotype.Repository;

/**
 * Created by Dmitry on 03.08.2016.
 */
@Repository
public class DerbyDao implements Dao {
    public void crud() {
        System.out.println("I'm derby dao");
    }
}