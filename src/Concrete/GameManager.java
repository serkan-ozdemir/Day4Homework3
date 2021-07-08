package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {
    @Override
    public void add(Game game) {
        System.out.println("Game successfully added");
    }

    @Override
    public void update(Game game) {
        System.out.println("Game successfully updated");
    }

    @Override
    public void delete(Game game) {
        System.out.println("Game successfully deleted");
    }
}
