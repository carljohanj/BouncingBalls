import java.awt.*;
import java.util.Random;

public class Particle
{
    private int x;
    private int y;
    private int velocityX;
    private int velocityY;
    private final Color color;
    private final int size = 20;

    public Particle(int panelWidth, int panelHeight)
    {
        Random random = new Random();
        x = random.nextInt(panelWidth);
        y = random.nextInt(panelHeight);
        velocityX = random.nextInt(15) - 9;
        velocityY = random.nextInt(15) - 9;
        color = Color.getHSBColor(random.nextFloat(), 0.9f, 1.0f);
    }

    public void update(int panelWidth, int panelHeight)
    {
        x += velocityX;
        y += velocityY;

        if (x < 0 || x > panelWidth - size)
        {
            velocityX = -velocityX;
        }

        if (y < 0 || y > panelHeight - size)
        {
            velocityY = -velocityY;
        }
    }

    public void draw(Graphics2D g2)
    {
        g2.setColor(color);
        g2.fillOval(x, y, size, size);
    }
}