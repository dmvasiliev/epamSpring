package inAction4.chapter10.jdbc.spittr.db;

import inAction4.chapter10.jdbc.spittr.domain.Spittle;

import java.util.List;

/**
 * Repository interface with operations for {@link Spittle} persistence.
 *
 * @author habuma
 */
public interface SpittleRepository {

    long count();

    List<Spittle> findRecent();

    List<Spittle> findRecent(int count);

    Spittle findOne(long id);

    Spittle save(Spittle spittle);

    List<Spittle> findBySpitterId(long spitterId);

    void delete(long id);

}
