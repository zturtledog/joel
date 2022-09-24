import java.awt.Graphics;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        renderer rndr = (new renderer("WOW a Window!") {
            @Override
            public void print(Graphics g) {
                super.print(g);
            }
        }).setsize(400, 400);

        rndr.setVisible(true);
    }
}
