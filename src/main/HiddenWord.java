package main;

public class HiddenWord {
    private String hidden;

    public HiddenWord(String hidden) {
        this.hidden = hidden;
    }

    public String getHint(String guess) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < hidden.length(); i++) {
            char currentChar = hidden.charAt(i);
            if (currentChar == guess.charAt(i)) {
                output.append(currentChar);
            } else if (guess.indexOf(currentChar) != -1) {
                output.append("+");
            } else {
                output.append("*");
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
        System.out.println(puzzle.getHint("HELLO") + " it should print H****");
        System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
        System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
        System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");
    }
}
