import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTCalculator extends Frame {

    public static void main(String[] args) {
        AWTCalculator c = new AWTCalculator();
    }

    public AWTCalculator() {
        Font f = new Font("SansSerif", Font.BOLD, 40);

        TextField Field = new TextField("2");
        Field.setFont(f);

        Button calcButton = new Button("Suurenda");
        calcButton.setFont(f);
        calcButton.addActionListener(e -> {
            int a = Integer.parseInt(Field.getText());
			a = a + 1;
			Field.setText("" + (a));
        });

        add(Field);
        add(calcButton);

        setLayout(new GridLayout(0, 1));
        setSize(200, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}