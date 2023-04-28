import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTable;

public class LibrarySystem {

	private JFrame frame;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField txtAdminUsername;
	private JPasswordField txtAdminPassword;
	private JTextField txtLibrarianUsername;
	private JPasswordField txtLibrarianPassword;
	private JTextField txtRentedBook;
	
	public static ArrayList<books> Books = new ArrayList<>();{
	
		Books.add(new books("System Analysis and Design", "Gary B. Shelly", 2));
		Books.add(new books("Android Application", "Corine Hosington", 3));
		Books.add(new books("Programming Concepts and Logic Formulation", "Rosauro E. Manuel", 4));
	}
	
	
	public books[] books = {
            new books("System Analysis and Design", "Gary B. Shelly", 2),
            new books("Android Application", "Corine Hosington", 3),
            new books("Programming Concepts and Logic Formulation", "Rosauro E. Manuel", 4)
        };
	
	private JTextField txtBookNum;
	private JTextField txtCopiesAvailable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	 
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarySystem window = new LibrarySystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarySystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("NU Library");
		frame.setBounds(100, 100, 547, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		tabbedPane.setBounds(0, -28, 531, 419);
		frame.getContentPane().add(tabbedPane);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		JPanel Main = new JPanel();
		Main.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, Main, null);
		Main.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 242, 402);
		Main.add(panel_1);
		panel_1.setBackground(new Color(30, 2, 114));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>NU Library");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblNewLabel.setBounds(20, 11, 133, 120);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(239, 0, 32, 391);
		Main.add(panel_1_1);
		panel_1_1.setBackground(new Color(217, 183, 53));
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnAdmin.setBackground(new Color(217, 183, 53));
		btnAdmin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnAdmin.setBounds(300, 150, 204, 29);
		Main.add(btnAdmin);
		
		JButton btnLibrarian = new JButton("LIBRARIAN");
		btnLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnLibrarian.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnLibrarian.setBackground(new Color(217, 183, 53));
		btnLibrarian.setBounds(300, 198, 204, 29);
		Main.add(btnLibrarian);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(300, 66, 106, 14);
		Main.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(217, 183, 53));
		separator.setBounds(300, 91, 198, 2);
		Main.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("<html>Please select your desired login option.");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setForeground(new Color(128, 128, 128));
		lblNewLabel_3.setBounds(300, 103, 198, 36);
		Main.add(lblNewLabel_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(217, 183, 53));
		separator_2.setBounds(300, 246, 198, 2);
		Main.add(separator_2);
		
		JPanel admin = new JPanel();
		admin.setBackground(new Color(255, 255, 255));
		admin.setForeground(new Color(255, 255, 255));
		admin.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 15));
		tabbedPane.addTab("New tab", null, admin, null);
		admin.setLayout(null);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(30, 2, 114));
		panel_1_2.setBounds(0, 0, 242, 402);
		admin.add(panel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("<html>NU Library");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblNewLabel_2.setBounds(20, 11, 133, 120);
		panel_1_2.add(lblNewLabel_2);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(new Color(217, 183, 53));
		panel_1_1_2.setBounds(239, 0, 32, 391);
		admin.add(panel_1_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("<");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		lblNewLabel_4.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblNewLabel_4.setBounds(281, 21, 16, 14);
		admin.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("ADMIN LOGIN");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(297, 64, 138, 14);
		admin.add(lblNewLabel_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(217, 183, 53));
		separator_1.setBounds(297, 89, 198, 2);
		admin.add(separator_1);
		
		JLabel adminUserBg = new JLabel("Username");
		adminUserBg.setForeground(new Color(128, 128, 128));
		adminUserBg.setBounds(303, 122, 74, 14);
		admin.add(adminUserBg);
		
		JLabel adminPassBg = new JLabel("Password");
		adminPassBg.setForeground(new Color(128, 128, 128));
		adminPassBg.setBounds(303, 165, 74, 14);
		admin.add(adminPassBg);
		
		txtAdminUsername = new JTextField();
		txtAdminUsername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				adminUserBg.setText(null);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtAdminUsername.getText().isEmpty()) {
					adminUserBg.setText("Username");
				}
			}
		});
		txtAdminUsername.setBounds(297, 119, 198, 20);
		admin.add(txtAdminUsername);
		txtAdminUsername.setColumns(10);
		
		txtAdminPassword = new JPasswordField();
		txtAdminPassword.setEchoChar('•');
		txtAdminPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				adminPassBg.setText(null);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if (txtAdminPassword.getText().isEmpty()) {
					adminPassBg.setText("Password");
				}
			}
		});
		txtAdminPassword.setBounds(297, 162, 198, 20);
		admin.add(txtAdminPassword);
		txtAdminPassword.setColumns(10);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(new Color(217, 183, 53));
		separator_1_1.setBounds(297, 263, 198, 2);
		admin.add(separator_1_1);
		
		JButton btnAdminLogin = new JButton("LOGIN");
		btnAdminLogin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnAdminLogin.setBackground(new Color(217, 183, 53));
		btnAdminLogin.setForeground(new Color(0, 0, 0));
		btnAdminLogin.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String adminUsername = txtAdminUsername.getText();
				String adminPassword = txtAdminPassword.getText();
				boolean adminLoginSuccess = false;
				String storeLoginInfo = adminUsername+":"+adminPassword;
		        BufferedReader reader = null;
		        
		        if (adminUsername.isEmpty() || adminPassword.isEmpty()) {
		        	txtAdminUsername.setBorder(new LineBorder(new Color(255, 0, 0)));
		        	txtAdminPassword.setBorder(new LineBorder(new Color(255, 0, 0)));
					JOptionPane.showMessageDialog(null,"Please enter your USERNAME or PASSWORD","System Notice",JOptionPane.ERROR_MESSAGE);  
	            }else {
		        try {
		            reader = new BufferedReader(new FileReader("adminUsers.txt"));
		            String line = reader.readLine();
		           
		            while (line != null) {
		                if (line.equals(storeLoginInfo)) {
		                	txtAdminUsername.setBorder(new LineBorder(new Color(0, 0, 0)));
		                	txtAdminUsername.setText("");
		                	adminUserBg.setText("Username");
				        	txtAdminPassword.setBorder(new LineBorder(new Color(0, 0, 0)));
				        	txtAdminPassword.setText("");
				        	adminPassBg.setText("Password");
		                	adminLoginSuccess = true;
		                	tabbedPane.setSelectedIndex(3);
		                	JOptionPane.showMessageDialog(frame, "Login Successfully!");
		                }
		               line = reader.readLine();
		            }
		            if (adminLoginSuccess != true) {
		            	txtAdminUsername.setBorder(new LineBorder(new Color(255, 0, 0)));
			        	txtAdminPassword.setBorder(new LineBorder(new Color(255, 0, 0)));
		            	JOptionPane.showMessageDialog(null,"INCORRECT USERNAME and PASSWORD","System Notice",JOptionPane.ERROR_MESSAGE);
		            }
		           } catch (IOException e1) {
			            e1.printStackTrace();
			        }finally {
			            try {
			                if (reader != null) {
			                    reader.close();
			                }
			            } catch (IOException e1) {
			                e1.printStackTrace();
			            }
			        }
				}
		        
			}
		});
		btnAdminLogin.setBounds(297, 209, 198, 35);
		admin.add(btnAdminLogin);
		
		JRadioButton btnAdminShowPass = new JRadioButton("");
		btnAdminShowPass.setIcon(new ImageIcon(LibrarySystem.class.getResource("/images/show-8-16.png")));
		btnAdminShowPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnAdminShowPass.isSelected()) {
					txtAdminPassword.setEchoChar((char)0);
					btnAdminShowPass.setIcon(new ImageIcon(LibrarySystem.class.getResource("/images/hide-8-16.png")));
				}else {
					txtAdminPassword.setEchoChar('•');
					btnAdminShowPass.setIcon(new ImageIcon(LibrarySystem.class.getResource("/images/show-8-16.png")));
				}
			}
		});
		btnAdminShowPass.setBackground(new Color(255, 255, 255));
		btnAdminShowPass.setBounds(494, 165, 26, 17);
		admin.add(btnAdminShowPass);
		
		JPanel librarian = new JPanel();
		librarian.setLayout(null);
		librarian.setForeground(Color.WHITE);
		librarian.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 15));
		librarian.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, librarian, null);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBackground(new Color(30, 2, 114));
		panel_1_2_1.setBounds(0, 0, 242, 402);
		librarian.add(panel_1_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("<html>NU Library");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblNewLabel_2_1.setBounds(20, 11, 133, 120);
		panel_1_2_1.add(lblNewLabel_2_1);
		
		JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setBackground(new Color(217, 183, 53));
		panel_1_1_2_1.setBounds(239, 0, 32, 391);
		librarian.add(panel_1_1_2_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("<");
		lblNewLabel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		lblNewLabel_4_1.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(281, 21, 16, 14);
		librarian.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("LIBRARIAN LOGIN");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(297, 64, 181, 14);
		librarian.add(lblNewLabel_1_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(new Color(217, 183, 53));
		separator_1_2.setBounds(297, 89, 198, 2);
		librarian.add(separator_1_2);
		
		JLabel librarianUserBg = new JLabel("Username");
		librarianUserBg.setForeground(Color.GRAY);
		librarianUserBg.setBounds(303, 122, 74, 14);
		librarian.add(librarianUserBg);
		
		JLabel librarianPassBg = new JLabel("Password");
		librarianPassBg.setForeground(Color.GRAY);
		librarianPassBg.setBounds(303, 165, 74, 14);
		librarian.add(librarianPassBg);
		
		txtLibrarianUsername = new JTextField();
		txtLibrarianUsername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				librarianUserBg.setText(null);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if (txtLibrarianUsername.getText().isEmpty()) {
					librarianUserBg.setText("Username");	
				}
			}
		});
		txtLibrarianUsername.setColumns(10);
		txtLibrarianUsername.setBounds(297, 119, 198, 20);
		librarian.add(txtLibrarianUsername);
		
		txtLibrarianPassword = new JPasswordField();
		txtLibrarianPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				librarianPassBg.setText(null);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtLibrarianPassword.getText().isEmpty()) {
					librarianPassBg.setText("Password");
				}
			}
		});
		txtLibrarianPassword.setEchoChar('•');
		txtLibrarianPassword.setColumns(10);
		txtLibrarianPassword.setBounds(297, 162, 198, 20);
		librarian.add(txtLibrarianPassword);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(new Color(217, 183, 53));
		separator_1_1_1.setBounds(297, 263, 198, 2);
		librarian.add(separator_1_1_1);
		
		JButton btnLibrarianLogin = new JButton("LOGIN");
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String librarianUsername = txtLibrarianUsername.getText();
				String librarianPassword = txtLibrarianPassword.getText();
				
				boolean librarianLoginSuccess = false;
				String storeLibrarianLoginInfo = librarianUsername+":"+librarianPassword;
		        BufferedReader readers = null;
		        
		        if (librarianUsername.isEmpty() || librarianPassword.isEmpty()) {
		        	txtLibrarianUsername.setBorder(new LineBorder(new Color(255, 0, 0)));
		        	txtLibrarianPassword.setBorder(new LineBorder(new Color(255, 0, 0)));
					JOptionPane.showMessageDialog(null,"Please enter your USERNAME or PASSWORD","System Notice",JOptionPane.ERROR_MESSAGE);
				}else {
		        try {
		            readers = new BufferedReader(new FileReader("librarianUsers.txt"));
		            String line = readers.readLine();
		            while (line != null) {
		                if (line.equals(storeLibrarianLoginInfo)) {
		                	txtLibrarianUsername.setBorder(new LineBorder(new Color(0, 0, 0)));
		                	txtLibrarianUsername.setText("");
		                	librarianUserBg.setText("Username");
				        	txtLibrarianPassword.setBorder(new LineBorder(new Color(0, 0, 0)));
				        	txtLibrarianPassword.setText("");
				        	librarianPassBg.setText("Password");
		                	
		                	librarianLoginSuccess = true;
		                	tabbedPane.setSelectedIndex(4);
		                	JOptionPane.showMessageDialog(frame, "Login Successfully!");
		                } 
		               line = readers.readLine();
		            }
		            if (librarianLoginSuccess != true) {
		            	JOptionPane.showMessageDialog(null,"INCORRECT USERNAME and PASSWORD","System Notice",JOptionPane.ERROR_MESSAGE);
		            }
		           } catch (IOException e1) {
			            e1.printStackTrace();
			        }finally {
			            try {
			                if (readers != null) {
			                    readers.close();
			                }
			            } catch (IOException e1) {
			                e1.printStackTrace();
			            }
			        }
				}
		
			}
		});
		btnLibrarianLogin.setForeground(Color.BLACK);
		btnLibrarianLogin.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnLibrarianLogin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnLibrarianLogin.setBackground(new Color(217, 183, 53));
		btnLibrarianLogin.setBounds(297, 209, 198, 35);
		librarian.add(btnLibrarianLogin);
		
		JRadioButton btnLibrarianShowPass = new JRadioButton("");
		btnLibrarianShowPass.setIcon(new ImageIcon(LibrarySystem.class.getResource("/images/show-8-16.png")));
		btnLibrarianShowPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnLibrarianShowPass.isSelected()) {
					txtLibrarianPassword.setEchoChar((char)0);
					btnLibrarianShowPass.setIcon(new ImageIcon(LibrarySystem.class.getResource("/images/hide-8-16.png")));
				}else {
					txtLibrarianPassword.setEchoChar('•');
					btnLibrarianShowPass.setIcon(new ImageIcon(LibrarySystem.class.getResource("/images/show-8-16.png")));
				}
				
			}
		});
		btnLibrarianShowPass.setBackground(Color.WHITE);
		btnLibrarianShowPass.setBounds(494, 165, 26, 17);
		librarian.add(btnLibrarianShowPass);
		
				JPanel welcomePage = new JPanel();
		tabbedPane.addTab("New tab", null, welcomePage, null);
		welcomePage.setLayout(null);
		
		JPanel panel_1_2_1_1 = new JPanel();
		panel_1_2_1_1.setLayout(null);
		panel_1_2_1_1.setBackground(new Color(30, 2, 114));
		panel_1_2_1_1.setBounds(0, 0, 526, 402);
		welcomePage.add(panel_1_2_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("<html>Welcome to NU Library System!");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblNewLabel_2_1_1.setBounds(32, 79, 463, 120);
		panel_1_2_1_1.add(lblNewLabel_2_1_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(217, 183, 53));
		panel.setBounds(0, 0, 562, 45);
		panel_1_2_1_1.add(panel);
		panel.setLayout(null);
		final JLabel label = new JLabel();
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(427, 11, 89, 23);
		panel.add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			int result = JOptionPane.showConfirmDialog(frame,"Log out of your account?", "Logout",
		               JOptionPane.YES_NO_OPTION,
		               JOptionPane.QUESTION_MESSAGE);
		            if(result == JOptionPane.YES_OPTION){
		               label.setText("You selected: Yes");
		               tabbedPane.setSelectedIndex(1);
		            }else if (result == JOptionPane.NO_OPTION){
		               label.setText("You selected: No");
		            }else {
		               label.setText("None selected");
		            }
			
			}
		});
		btnLogout.setBackground(new Color(162, 135, 30));
		btnLogout.setVisible(false);
		
		
		JLabel adminUserIcon = new JLabel("");
		adminUserIcon.setBounds(494, 11, 22, 23);
		panel.add(adminUserIcon);
		adminUserIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				adminUserIcon.setBounds(405, 11, 22, 23);
				btnLogout.setVisible(true);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				adminUserIcon.setBounds(494, 11, 22, 23);
				btnLogout.setVisible(false);
			}
		});
		adminUserIcon.setIcon(new ImageIcon(LibrarySystem.class.getResource("/images/user.png")));
	
		
		JLabel bulldogIcon = new JLabel("");
		bulldogIcon.setIcon(new ImageIcon(LibrarySystem.class.getResource("/images/bulldoggo.png")));
		bulldogIcon.setBounds(10, 197, 343, 194);
		panel_1_2_1_1.add(bulldogIcon);
		
		JPanel bookRental = new JPanel();
		bookRental.setBackground(new Color(30, 2, 114));
		tabbedPane.addTab("New tab", null, bookRental, null);
		bookRental.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(217, 183, 53));
		panel_2.setBounds(0, 0, 562, 45);
		bookRental.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(LibrarySystem.class.getResource("/images/bulldoggo.png")));
		lblNewLabel_5.setBounds(-82, 0, 263, 111);
		panel_2.add(lblNewLabel_5);
		
		JButton btnLibrarianLogout = new JButton("Logout");
		btnLibrarianLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = JOptionPane.showConfirmDialog(frame,"Log out of your account?", "Logout",
			               JOptionPane.YES_NO_OPTION,
			               JOptionPane.QUESTION_MESSAGE);
			            if(result == JOptionPane.YES_OPTION){
			               label.setText("You selected: Yes");
			               tabbedPane.setSelectedIndex(2);
			            }else if (result == JOptionPane.NO_OPTION){
			               label.setText("You selected: No");
			            }else {
			               label.setText("None selected");
			            }
				
			}
		});
		btnLibrarianLogout.setVisible(false);
		btnLibrarianLogout.setBounds(427, 11, 89, 23);
		btnLibrarianLogout.setBackground(new Color(162, 135, 30));
		panel_2.add(btnLibrarianLogout);
		
	
		
		JLabel librarianUserIcon = new JLabel("");
		librarianUserIcon.setIcon(new ImageIcon(LibrarySystem.class.getResource("/images/user.png")));
		librarianUserIcon.setBounds(494, 11, 22, 23);
		panel_2.add(librarianUserIcon);
		
		JLabel lblNewLabel_6 = new JLabel("Book Rental");
		lblNewLabel_6.setBounds(16, 52, 164, 45);
		bookRental.add(lblNewLabel_6);
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JLabel txtCopies = new JLabel("");
		txtCopies.setForeground(new Color(255, 128, 64));
		txtCopies.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtCopies.setBounds(34, 207, 452, 38);
		bookRental.add(txtCopies);
		
		
		txtBookNum = new JTextField();
		txtBookNum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				int copies = 0;
				
				if (txtBookNum.getText().equals("0")){
					txtCopies.setText("<html>The book System Analysis and Design by Gary B. Shelly has " + books[0].getCopiesAvailable() + " copies left" );
				} else if (txtBookNum.getText().equals("1")){
					txtCopies.setText("<html>The book Android Application by Corine Hosington has " + books[1].getCopiesAvailable() + " left" );
				} else if (txtBookNum.getText().equals("2")){
					txtCopies.setText("<html>The book Programming Concepts and Logic Formulation by Rosauro E. Manuel has " + books[2].getCopiesAvailable() + " copies left" );
				}else if (books[0].getCopiesAvailable() == copies && books[1].getCopiesAvailable() == copies && books[2].getCopiesAvailable() == copies) {
					txtCopies.setText("All copies of the book are currently rented out." );	
				}else {
					txtCopies.setText("Please select 0, 1, and 2 numbers only");
				}
				
			}
			@Override
			public void keyPressed(KeyEvent e) {
				if(txtBookNum.getText().isEmpty()) {
					txtCopies.setText("");
				}
			}
		});
		txtBookNum.setBounds(350, 110, 108, 20);
		bookRental.add(txtBookNum);
		txtBookNum.setColumns(10);
		
		JButton btnRent = new JButton("RENT NOW");
		btnRent.setForeground(new Color(0, 0, 0));
		btnRent.setBackground(new Color(186, 156, 35));
		btnRent.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnRent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int rentBook = Integer.parseInt(txtBookNum.getText());
				int copies = books[rentBook].getCopiesAvailable();
				
				try {
						if (books[rentBook].getCopiesAvailable() > 0) {
							txtRentedBook.setText(books[rentBook].getTitle());
							txtBookNum.setEditable(false);
							txtBookNum.setBackground(new Color(128, 128, 128));
							btnRent.setEnabled(false);
							books[rentBook].setCopiesAvailable(copies -=1 );
							txtCopiesAvailable.setText(Integer.toString(books[rentBook].getCopiesAvailable()));
							JOptionPane.showMessageDialog(null,"Book rented successfully!","System Notice",JOptionPane.PLAIN_MESSAGE);
							
						}
						else {
							JOptionPane.showMessageDialog(null,"Sorry, all copies of the book are currently rented out.","System Notice",JOptionPane.ERROR_MESSAGE);
						}
						 
						if (!txtBookNum.getText().equals("0")  && !txtBookNum.getText().equals("1")  && !txtBookNum.getText().equals("2") ) {
							JOptionPane.showMessageDialog(null,"YOU'VE TYPED AN INVALID CHOICE","System Notice",JOptionPane.ERROR_MESSAGE);
						}
					}catch(IndexOutOfBoundsException ex) {
				JOptionPane.showMessageDialog(null,"YOU'VE TYPED AN INVALID CHOICE","System Notice",JOptionPane.ERROR_MESSAGE);
				
				
			}
					
				
			}
		});
		btnRent.setBounds(63, 247, 388, 29);
		bookRental.add(btnRent);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(new Color(217, 183, 53));
		separator_3.setBounds(16, 95, 489, 2);
		bookRental.add(separator_3);
		
		JLabel lblNewLabel_7 = new JLabel("To rent a book, choose its number from the list below:");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(26, 112, 368, 14);
		bookRental.add(lblNewLabel_7);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBackground(new Color(217, 183, 53));
		separator_3_1.setBounds(16, 287, 489, 2);
		bookRental.add(separator_3_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("YOU RENTED:");
		lblNewLabel_7_1_1.setForeground(Color.WHITE);
		lblNewLabel_7_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_7_1_1.setBounds(16, 302, 108, 14);
		bookRental.add(lblNewLabel_7_1_1);
		
		txtRentedBook = new JTextField();
		txtRentedBook.setEditable(false);
		txtRentedBook.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtRentedBook.setBounds(125, 300, 355, 20);
		bookRental.add(txtRentedBook);
		txtRentedBook.setColumns(10);
		
		JLabel lblNewLabel_7_1 = new JLabel("<html>0 - System Analysis and Design by Gary B. Shelly "
				+ "<br>1 - Android Application by Corine Hosington "
				+ "<br>2 - Programming Concepts and Logic Formulation by Rosauro E. Manuel");
		lblNewLabel_7_1.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_7_1.setBounds(36, 141, 452, 55);
		bookRental.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("COPIES AVAILABLE:");
		lblNewLabel_7_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_7_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_7_1_1_1.setBounds(16, 332, 145, 14);
		bookRental.add(lblNewLabel_7_1_1_1);
		
		txtCopiesAvailable = new JTextField();
		txtCopiesAvailable.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtCopiesAvailable.setEditable(false);
		txtCopiesAvailable.setColumns(10);
		txtCopiesAvailable.setBounds(171, 331, 69, 20);
		bookRental.add(txtCopiesAvailable);
		
		JButton btnRentAgain = new JButton("RENT AGAIN");
		btnRentAgain.setForeground(new Color(0, 0, 0));
		btnRentAgain.setBackground(new Color(186, 156, 35));
		btnRentAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRentedBook.setText("");
				txtBookNum.setEditable(true);
				txtBookNum.setBackground(new Color(255, 255, 255));
				txtBookNum.setText("");
				btnRent.setEnabled(true);
				txtCopiesAvailable.setText("");
				
			}
		});
		btnRentAgain.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnRentAgain.setBounds(299, 351, 189, 29);
		bookRental.add(btnRentAgain);
		
		
		librarianUserIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				librarianUserIcon.setBounds(405, 11, 22, 23);
				btnLibrarianLogout.setVisible(true);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				librarianUserIcon.setBounds(494, 11, 22, 23);
				btnLibrarianLogout.setVisible(false);
			}
		});
		

		
			
	}
}
