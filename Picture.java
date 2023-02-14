/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle ball;
    private Circle ball2;
    private Person guy;
    private Square bar;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        ball = new Circle();
        ball2 = new Circle();
        guy = new Person();
        bar = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(0);
            wall.changeSize(400);
            wall.makeVisible();
            
            window.moveHorizontal(10);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(180, 60);
            roof.moveHorizontal(50);
            roof.moveVertical(-20);
            roof.changeColor("green");
            roof.makeVisible();
            
            bar.changeSize(20);
            bar.moveHorizontal(50);
            bar.moveVertical(-10);
            bar.changeColor("red");
            bar.makeVisible();
    
            ball.moveHorizontal(100);
            ball.moveVertical(-40);
            ball.changeSize(80);
            ball.changeColor("blue");
            ball.makeVisible();
            
            ball2.moveHorizontal(0);
            ball2.moveVertical(-40);
            ball2.changeSize(80);
            ball2.changeColor("blue");
            ball2.makeVisible();
            
            guy.changeSize(300,999);
            guy.moveHorizontal(-34);
            guy.moveVertical(1);
            guy.changeColor("purple");
            guy.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        ball.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        ball.changeColor("red");
        ball2.changeColor("red");
    }
    
    public void setColor2()
    {
        window.changeColor("black");
        roof.changeColor("green");
    }
}
