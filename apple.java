import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class apple extends Actor
{
    /**
     * Act - do whatever the apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(-3);
        if (getX()<=0)
        {
            resetApple();
        }
        if (isTouching(abc.class))
        {
            Sad sad = new Sad();
            getWorld().addObject(sad, 300,300);
            getWorld().removeObject(this);
        }
    }
    public void resetApple()
    {
        if (Greenfoot.getRandomNumber(2)==0)
        {
            setLocation(500,100);
        }
        else
        {
            setLocation(500,300);
        }
        
    }
}
