package miko.findbrew.db;

import miko.findbrew.entities.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Integer> {

    Beer findBeerById(int id);
//    Beer updateBeer(Beer beer);

}
