public class Slice {
    private String colour;
    private int prizeAmount;

    // Creates a slice with color c, and cash prize p
    public Slice(String c, int p) {
        colour = c;
        prizeAmount = p;
    }

    // Returns the cash prize in dollars for this slice
    public int getPrizeAmount() {
        return prizeAmount;
    }

    // Returns the color of this slice as a string
    public String getColour() {
        return colour;
    }

    /* Returns a string representation of the slice in the following format:
     * "Color: red, prize amount: $50".
     */
    public String toString() {
        return "Color: " + colour + ", Prize Amount: $" + prizeAmount;
    }
}