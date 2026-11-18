import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ParticleAnimation extends JPanel
{
    private final ArrayList<Particle> particles = new ArrayList<>();

    public ParticleAnimation()
    {
        setBackground(Color.BLACK);
        int numberOfParticles = 30;

        for (int i = 0; i < numberOfParticles; i++)
        {
            particles.add(new Particle(700, 500));
        }

        Timer timer = new Timer(16, e ->
        {
            updateAnimation();
            repaint();
        });

        timer.start();
    }

    private void updateAnimation()
    {
        for (Particle particle : particles)
        {
            particle.update(getWidth(), getHeight());
        }
    }

    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for (Particle particle : particles)
        {
            particle.draw(g2);
        }
    }
}
