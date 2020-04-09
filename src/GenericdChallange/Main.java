package GenericdChallange;

import Generics.Team;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");


        hawthorn.matchResult(adelaideCrows,1,0);
        hawthorn.matchResult(melbourne,2,3);
        adelaideCrows.matchResult(melbourne,2,1);


        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);




        footballLeague.showLeagueTable();


     }
}
