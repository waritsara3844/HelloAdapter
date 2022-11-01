public class BirdAdapter implements Dog{

    private Bird bird;

    @Override
    public void bark() {
        this.bird.sing();
    }

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void run() {
        this.bird.fly();
    }
}
