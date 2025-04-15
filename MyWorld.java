import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        abc abc = new abc();
        addObject(abc, 100,100);
        apple apple = new apple();
        addObject(apple, 500,100);
    }
}
