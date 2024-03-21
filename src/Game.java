
public class Game {
    public static void play(GameWheel g){
        String currentColour = "";
        String lastColor;
        int streak = 0;
        int prize = 0;


        for (int i = 1; i <= 3; i++) {
            Slice slice = g.spinWheel();
            int money = slice.getPrizeAmount();
            lastColor = currentColour;
            currentColour = slice.getColour();

            if (lastColor.equals(currentColour)) {
                streak++; }
            prize += money;

            System.out.printf("Spin %d - Color: %s, Prize Amount: $%d\n", i, currentColour, money);
        }
        if (streak >= 2) {
            prize *= 2;
            System.out.printf("You got a streak of %d! Your money is now doubled!\n", 3);
        }
        System.out.printf("Total Prize Money: $%d\n", prize);
    }

}