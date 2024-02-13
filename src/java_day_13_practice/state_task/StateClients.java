package java_day_13_practice.state_task;

public class StateClients {
    public static void main(String[] args) {

        final String CYAN_BOLD = "\033[1;36m";
        final String YELLOW_BOLD = "\033[1;33m";
        final String BLUE_BOLD = "\033[1;34m";
        final String RED_BOLD = "\033[1;31m";
        final String RESET = "\033[0m";


        Virginia virginia = new Virginia("Virginia", "VA", "Republicans", "Glenn Youngkin",
                "Tim Kaine", 8_626_210);
        California california = new California("California", "CA", "Democratic", "Gavin Newsom",
                "Alex Padilla", 4_162_685);
        Texas texas = new Texas("Texas", "TX", "Republicans", "Greg Abbott",
                "John Cornyn", 39_956_000);
        Florida florida = new Florida("Florida", "FL", "Republicans", "Ron DeSantis",
                "Marco Rubio", 20_271_272);

        System.out.println(CYAN_BOLD + virginia + RESET);
        System.out.println(YELLOW_BOLD + california + RESET);
        System.out.println(BLUE_BOLD + texas + RESET);
        System.out.println(RED_BOLD + florida + RESET);


    }
}
