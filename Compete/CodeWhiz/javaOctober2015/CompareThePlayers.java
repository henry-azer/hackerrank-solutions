package Compete.CodeWhiz.javaOctober2015;

import java.io.*;
import java.util.*;

class Checker {

    // lambda expression
    public Comparator<Player> desc = (o1, o2) -> {
        if (o1.score < o2.score) return 1;
        else if (o1.score > o2.score) return -1;
        else return o2.name.compareTo(o1.name);
    };

    // java 7, 8
//    public Comparator<Player> desc = new Comparator<Player>() {
//        @Override
//        public int compare(Player o1, Player o2) {
//            if (o1.score < o2.score) return 1;
//            else if (o1.score > o2.score) return -1;
//            else return o2.name.compareTo(o1.name);
//        }
//    };

}

class Player {
    String name;
    int score;
}

public class CompareThePlayers {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        String s;
        StringTokenizer st;
        Player[] Player = new Player[N];
        Checker check = new Checker();
        for (int i = 0; i < N; i++) {
            s = br.readLine().trim();
            st = new StringTokenizer(s);
            Player[i] = new Player();
            Player[i].name = st.nextToken();
            Player[i].score = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(Player, check.desc);
        for (Compete.CodeWhiz.javaOctober2015.Player player : Player) {
            System.out.printf("%s %s\n", player.name, player.score);
        }


    }
}

