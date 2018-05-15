package testTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class TestB extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestB frame = new TestB();
					frame.setTitle("Split Chinese Tool");
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//Container container = new Container();
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		//Label is like a text showing to user
		JLabel label1 = new JLabel("Input: ");
		label1.setBounds(30, 10, 100, 20);
		add(label1);
	
		//Label is like a text showing to user
				JLabel label2 = new JLabel("Output: ");
				label2.setBounds(30, 50, 100, 20);
				add(label2);
				
		JTextField text2 = new JTextField();
				text2.setBounds(100, 50, 200, 20);
				add(text2);
		//Button
		JButton btn = new JButton("Start");
		btn.setBounds(300, 10, 80, 20);
		add(btn);
		//Textfield
		JTextField textfield = new JTextField();
		textfield.setBounds(100, 10, 200, 20);
		add(textfield);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text;
				text = textfield.getText();
				SplitChinese2 split = new SplitChinese2();
				
				text2.setText(split.SplitChinese2(text));
				
				
			}
		});
				}

}
