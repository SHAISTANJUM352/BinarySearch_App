import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BinarySearch extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BinarySearch frame = new BinarySearch();
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
	public BinarySearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("BINARY  SEARCH");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(153, 23, 236, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter 5 Numbers");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_1.setBounds(22, 64, 177, 24);
		contentPane.add(lblNewLabel_1);
		
		JTextArea ta1 = new JTextArea();
		ta1.setForeground(new Color(0, 0, 0));
		ta1.setFont(new Font("Cambria", Font.BOLD, 22));
		ta1.setBackground(new Color(245, 245, 245));
		ta1.setBounds(212, 67, 196, 22);
		contentPane.add(ta1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Key to Search");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(22, 127, 255, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("RESULT");
		lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(200, 181, 179, 24);
		contentPane.add(lblNewLabel_1_2);
		
		JTextArea ta2 = new JTextArea();
		ta2.setForeground(new Color(0, 0, 0));
		ta2.setFont(new Font("Cambria", Font.BOLD, 22));
		ta2.setBackground(new Color(245, 245, 245));
		ta2.setBounds(213, 127, 196, 22);
		contentPane.add(ta2);
		
		JTextArea tar = new JTextArea();
		tar.setForeground(new Color(0, 0, 0));
		tar.setFont(new Font("Cambria", Font.BOLD, 22));
		tar.setBackground(new Color(245, 245, 245));
		tar.setBounds(93, 216, 315, 24);
		contentPane.add(tar);
		
		JButton btnNewButton = new JButton("BINARY SEARCH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to Binary search
				String data1=ta1.getText();
				String key=ta2.getText();
				String arr[]=data1.split(" ");				
				int low=0, high=arr.length-1, mid;				
				while(low<=high)
				{
					mid=(low+high)/2;
					if(Integer.valueOf(key) == Integer.valueOf(arr[mid]))
					{					
						tar.setText("key found at the index "+mid);
						break;
					}
					else if(Integer.valueOf(key)>Integer.valueOf(arr[mid]))
					{
						low=mid+1;
						high=high;
					}
					else
					{
						high=mid-1;
						low=low;
					}				
				tar.setText("Key not found");
				}
			}
		});
		btnNewButton.setBackground(new Color(220, 220, 220));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 18));
		btnNewButton.setBounds(128, 278, 251, 41);
		contentPane.add(btnNewButton);
	}

	}

