package serenitylabs.tutorials.vetclinic.playingball.model;

import java.sql.SQLOutput;

public class Child {

    public void play(Game game){

        try {
            Player player = gameCalled(game);
            player.play();
        }catch ( DontKnowThatGameException exception){
            System.out.println("Game not listed");
        }
    }

    private Player gameCalled(Game game) throws DontKnowThatGameException {
        switch (game){
            case Football:
                return new PlayFootball();
            case  Tennis:
                return new PlayTennis();
            case Cricket:
                return  new PlayCricket();
            case Handball:
                return new PlayHandball();
            case Hockey:
                return new PlayHockey();
            default:
                throw new DontKnowThatGameException("");
        }
    }
}
