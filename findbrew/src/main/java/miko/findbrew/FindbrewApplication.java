package miko.findbrew;

import miko.findbrew.db.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FindbrewApplication {

    private final BeerRepository beerRepository;

    @Autowired
    public FindbrewApplication(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(FindbrewApplication.class, args);
    }

}
