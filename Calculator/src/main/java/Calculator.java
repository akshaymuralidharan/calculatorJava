import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Calculator implements ActionListener {
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton, eightButton, nineButton, addButton, fourButton, fiveButton, sixButton, minusButton, oneButton, twoButton, threeButton, divideButton, dotButton, zeroButton, equaltoButton, mulButton, clearButton;
    Float currentValue;
    boolean isOperatorClicked = false;
    String operatorClicked;
    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 650);
        jf.setLocation(300, 150);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 550, 80);
        displayLabel.setBackground(Color.lightGray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 150,80,80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 150,80,80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 150,80,80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        addButton = new JButton("+");
        addButton.setBounds(340, 150,180,80);
        addButton.setFont(new Font("Arial", Font.PLAIN, 40));
        addButton.addActionListener(this);
        jf.add(addButton);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 260,80,80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 260,80,80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 260,80,80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        minusButton = new JButton("-");
        minusButton.setBounds(340, 235,180,80);
        minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        minusButton.addActionListener(this);
        jf.add(minusButton);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 380,80,80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 380,80,80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 380,80,80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        divideButton = new JButton("/");
        divideButton.setBounds(340, 320,180,80);
        divideButton.setFont(new Font("Arial", Font.PLAIN, 40));
        divideButton.addActionListener(this);
        jf.add(divideButton);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 490,80,80);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 490,80,80);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equaltoButton = new JButton("=");
        equaltoButton.setBounds(230, 490,80,80);
        equaltoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        equaltoButton.addActionListener(this);
        jf.add(equaltoButton);

        mulButton = new JButton("x");
        mulButton.setBounds(340, 405,180,80);
        mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
        mulButton.addActionListener(this);
        jf.add(mulButton);

        clearButton = new JButton("C");
        clearButton.setBounds(340, 490,180,80);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
        clearButton.addActionListener(this);
        jf.add(clearButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == sevenButton){
            if (isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText()+"7");
            }
        } else if (actionEvent.getSource() == eightButton) {
            if (isOperatorClicked) {
                displayLabel.setText("8");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText()+"8");
            }
        } else if (actionEvent.getSource() == nineButton) {
            if (isOperatorClicked) {
                displayLabel.setText("9");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }  else if (actionEvent.getSource() == fourButton) {
            if (isOperatorClicked) {
                displayLabel.setText("4");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText()+"4");
            }
        } else if (actionEvent.getSource() == fiveButton) {
            if (isOperatorClicked) {
                displayLabel.setText("5");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText()+"5");
            }
        } else if (actionEvent.getSource() == sixButton) {
            if (isOperatorClicked) {
                displayLabel.setText("6");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText()+"6");
            }
        }  else if (actionEvent.getSource() == oneButton) {
            if (isOperatorClicked) {
                displayLabel.setText("1");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText()+"1");
            }
        } else if (actionEvent.getSource() == twoButton) {
            if (isOperatorClicked) {
                displayLabel.setText("2");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText()+"2");
            }
        } else if (actionEvent.getSource() == threeButton) {
            if (isOperatorClicked) {
                displayLabel.setText("3");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }  else if (actionEvent.getSource() == dotButton) {
            if (isOperatorClicked) {
                displayLabel.setText(".");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText()+".");
            }
        } else if (actionEvent.getSource() == zeroButton) {
            if (isOperatorClicked) {
                displayLabel.setText("0");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText()+"0");
            }
        }  else if (actionEvent.getSource() == mulButton) {
            currentValue = Float.parseFloat(displayLabel.getText());
            isOperatorClicked = true;
            operatorClicked = "mul";

        } else if (actionEvent.getSource() == addButton) {
            currentValue = Float.parseFloat(displayLabel.getText());
            isOperatorClicked = true;
            operatorClicked = "add";
//            displayLabel.setText("");
        } else if (actionEvent.getSource() == minusButton) {
            currentValue = Float.parseFloat(displayLabel.getText());
            isOperatorClicked = true;
            operatorClicked = "minus";

        } else if (actionEvent.getSource() == divideButton) {
            currentValue = Float.parseFloat(displayLabel.getText());
            isOperatorClicked = true;
            operatorClicked = "divide";

        } else if (actionEvent.getSource() == equaltoButton) {
            if (Objects.equals(operatorClicked, "add")) {
                displayLabel.setText(String.valueOf(currentValue+Float.parseFloat(displayLabel.getText())));
            } else if (Objects.equals(operatorClicked, "mul")) {
                displayLabel.setText(String.valueOf(currentValue*Float.parseFloat(displayLabel.getText())));
            } else if (Objects.equals(operatorClicked, "minus")) {
                displayLabel.setText(String.valueOf(currentValue-Float.parseFloat(displayLabel.getText())));
            } else if (Objects.equals(operatorClicked, "divide")) {
                displayLabel.setText(String.valueOf(currentValue/Float.parseFloat(displayLabel.getText())));
            }

        } else if (actionEvent.getSource() == clearButton) {
            displayLabel.setText("");
        }
    }
}
