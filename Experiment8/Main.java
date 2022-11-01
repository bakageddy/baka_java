import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

class Login extends JFrame implements ActionListener {
    JButton submit;
    JPanel panel;
    JLabel user, pass;
    final JTextField name, password;

    Login() {
        user = new JLabel("Username");
        pass = new JLabel("Password");
        password = new JTextField(30);
        submit = new JButton("Submit");
        name = new JTextField(30);
        panel = new JPanel(new GridLayout(3, 1));

        panel.add(user);
        panel.add(name);
        panel.add(pass);
        panel.add(password);
        panel.add(submit);
        add(panel);

        submit.addActionListener(this);
        setTitle("LOGIN");
    }
    public void actionPerformed(ActionEvent a) {
        String name = user.getText();
        if (name.equals("test@gmail.com") && pass.getText().equals("test")) {
            Welcome page = new Welcome();
            page.setVisible(true);
            JLabel msg = new JLabel("WELCOME USER!");
            page.getContentPane().add(msg);
        } else {
            JLabel msg = new JLabel("Wrong User");
            Welcome page = new Welcome();
            page.setVisible(true);
            page.getContentPane().add(msg);
        }
    }
}

class Welcome extends JFrame {
    Welcome() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello");
        setSize(400, 200);
    }
}

public class Main {
    public static void main(String args[]) {
        try {
            Login form = new Login();
            form.setSize(300, 100);
            form.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
