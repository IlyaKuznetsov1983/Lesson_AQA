public abstract class Animals {
    private static int animalsCount = 0;
     String name;

    public Animals() {
        animalsCount++;
    }

    protected abstract void running (int distance);
    protected abstract void swimming (int distance);
}
