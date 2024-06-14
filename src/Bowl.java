public class Bowl {

    private int AmountFood;

    public Bowl(int AmountFood) {
        this.AmountFood = AmountFood;
    }

    public int getAmountFood() {
        return AmountFood;
    }

    public void setAmountFood(int AmountFood) {
        if (AmountFood <= 0 ) System.out.println("ноль");
        this.AmountFood = AmountFood;
    }

    public void addFood(int AmountFood) {
        this.AmountFood += AmountFood;
    }
}
