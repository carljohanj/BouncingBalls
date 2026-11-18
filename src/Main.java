import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Bouncing balls");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.add(new ParticleAnimation());
        window.setVisible(true);
    }
}
