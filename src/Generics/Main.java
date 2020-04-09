package Generics;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer ibra  = new SoccerPlayer("Ibra");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(ibra);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer>  baseballPlayerTeam = new Team<>("Chickago Cubs");
        baseballPlayerTeam.addPlayer(pat);

        System.out.println(baseballPlayerTeam.numPlayers());

//        Team<String> brokenTeam = new Team<>("This won't work");
//        brokenTeam.addPlayer("no-oo");
//
//        System.out.println(brokenTeam.numPlayers());

          Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
          brokenTeam.addPlayer(ibra);

    }
}
