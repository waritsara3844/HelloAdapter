public class CatAdapter implements Dog{

    private Cat cat;

    public CatAdapter(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void bark() {
        this.cat.meow();
    }

    @Override
    public void run() {
        this.cat.jump();
    }
}
