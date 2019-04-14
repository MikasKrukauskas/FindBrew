package miko.findbrew.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import miko.findbrew.db.BeerRepository;
import miko.findbrew.entities.Beer;
import miko.findbrew.entities.RequestBeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

@RestController
public class MainController {

    private final BeerRepository repository;

    @Autowired
    public MainController(BeerRepository repository) {
        this.repository = repository;
    }

    private final String API_BASE_URL = "https://api.punkapi.com";

    @GetMapping(path = "/beer/{id}")
    Beer getBrew(@PathVariable int id) {
        return repository.findBeerById(id);

    }

    @PostMapping(path = "/beer")
    Beer createBeer(@RequestBody RequestBeer body) {
        Beer beer = new Beer(body.getId(), body.getName(), body.getDescription(), body.getFirst_brewed(), body.getAbv()
                , body.getVolume(), body.getTagLine(), body.getIngredients());
        return repository.save(beer);
    }

    @GetMapping(path = "/beers")
    List<Beer> beers() {
        return repository.findAll();
    }

    @DeleteMapping(path = "/beer/{id}")
    String deleteBeer(@PathVariable int id) {
        repository.deleteById(id);
        return "beer is deleted";
    }

    @PutMapping(path = "/beer/{id}")
    Beer updateBeer(@RequestBody RequestBeer body, @PathVariable int id) {
        Beer beer = repository.findBeerById(id);
        beer.setName(body.getName());
        repository.save(beer);
        return beer;
    }

    @GetMapping(path = "/beer/test")
    Beer testResponse() {
        return getBeers();
    }

    Beer getBeers() {
//        final String url = "https://api.punkapi.com/v2/beers";
        final String url = "https://api.punkapi.com/v2/beers/random";
        RestTemplate restTemplate = new RestTemplate();
        Beer response = restTemplate.getForObject(url, Beer.class);
        Gson json = new Gson();
        JsonParser parser = new JsonParser();
        JsonObject object = (JsonObject) parser.parse(response);
        Beer beers = json.fromJson(response, Beer.class);
        return response;

    }

}
