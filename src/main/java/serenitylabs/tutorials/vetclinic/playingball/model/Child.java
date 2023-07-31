package serenitylabs.tutorials.vetclinic.playingball.model;

public class Child {

    public void play(Game game){
        Player player = gameCalled(game);
        player.play();
    }

/*    public void goPlay(Game game) {
        if (game == Football) {
            new PlayFootball().play();
        } else if (game == Tennis) {
            new PlayTennis().play();
        } else if (game == Cricket) {
            new PlayCricket().play();
        } else if (game == Handball) {
            new PlayHandball().play();
        } else if (game == Hockey) {
            new PlayHockey().play();
        }
    }*/

    private Player gameCalled(Game game){
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
                return new DontKnowThatGame();
        }
    }
}
