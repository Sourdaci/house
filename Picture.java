/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private Circle floor;
    private Person habitant;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        sun2 = new Circle();
        sun2.changeColor("green");
        sun2.moveHorizontal(180);
        sun2.moveVertical(-20);
        sun2.changeSize(80);
        sun2.makeVisible();
        
        floor = new Circle();
        floor.changeColor("green");
        floor.moveHorizontal(-1000);
        floor.moveVertical(160);
        floor.changeSize(2000);
        floor.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            sun2.changeColor("black");
            floor.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
    /**
     * Make suns move
     */
    public void moveSun()
    {
        sun.slowMoveVertical(180);
        sun2.slowMoveVertical(180);
        setBlackAndWhite();
    }
    
    /**
     * A person approaches house from left
     */
    public void habitantGetCloser()
    {
        habitant = new Person();
        habitant.moveHorizontal(-300);
        habitant.moveVertical(20);
        habitant.makeVisible();
        habitant.slowMoveHorizontal(160);
    }
}
