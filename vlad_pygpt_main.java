import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.JSplitPane;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JFormattedTextField;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.JInternalFrame;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import javax.swing.AbstractListModel;
import javax.swing.border.LineBorder;

public class Enache_Vlad_PROIECT1 {

	private JFrame frmPygpt;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enache_Vlad_PROIECT1 window = new Enache_Vlad_PROIECT1();
					window.frmPygpt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Enache_Vlad_PROIECT1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPygpt = new JFrame();
		frmPygpt.setTitle("PyGPT");
		frmPygpt.setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\Downloads\\pygpt icon.png"));
		frmPygpt.getContentPane().setBackground(new Color(192, 192, 192));
		frmPygpt.setBounds(100, 100, 1599, 584);
		frmPygpt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNewButton = new JButton("New...");
		btnNewButton.setBounds(10, 25, 167, 20);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmPygpt.getContentPane().setLayout(null);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmPygpt.getContentPane().add(btnNewButton);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1583, 22);
		menuBar.setBackground(new Color(192, 192, 192));
		menuBar.setForeground(new Color(0, 0, 160));
		frmPygpt.getContentPane().add(menuBar);

		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setBackground(new Color(255, 255, 255));
		mnNewMenu.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("New context...");
		mntmNewMenuItem.setIcon(new ImageIcon("H:\\Downloads\\PLUS(New context).png"));
		mntmNewMenuItem.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New group...");
		mntmNewMenuItem_1.setIcon(new ImageIcon("H:\\Downloads\\FOLDER(NEWGROUP).png"));
		mntmNewMenuItem_1.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_1.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Select current");
		mntmNewMenuItem_2.setIcon(new ImageIcon("H:\\Downloads\\CHENAR(SELECT CURRENT).png"));
		mntmNewMenuItem_2.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_2.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Clear history");
		mntmNewMenuItem_3.setIcon(new ImageIcon("H:\\Downloads\\GUNOI(Clear history).png"));
		mntmNewMenuItem_3.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_3.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Clear history(+groups)");
		mntmNewMenuItem_4.setIcon(new ImageIcon("H:\\Downloads\\GUNOI(Clear history).png"));
		mntmNewMenuItem_4.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_4.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Exit                     CTRL+Q");
		mntmNewMenuItem_5.setIcon(new ImageIcon("H:\\Downloads\\EXIT.png"));
		mntmNewMenuItem_5.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_5.setBackground(new Color(255, 255, 255));
		mnNewMenu.add(mntmNewMenuItem_5);

		JMenu mnNewMenu_1 = new JMenu("Plugins");
		mnNewMenu_1.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_1);

		JMenu mnNewMenu_7 = new JMenu("Presets");
		mnNewMenu_7.setForeground(new Color(0, 0, 0));
		mnNewMenu_7.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(mnNewMenu_7);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("New preset");
		mntmNewMenuItem_6.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_6.setBackground(new Color(255, 255, 255));
		mnNewMenu_7.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Edit preset");
		mntmNewMenuItem_7.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_7.setBackground(new Color(255, 255, 255));
		mnNewMenu_7.add(mntmNewMenuItem_7);

		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Settings");
		mntmNewMenuItem_8.setIcon(new ImageIcon("H:\\Downloads\\SETTINGS.png"));
		mntmNewMenuItem_8.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_8.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(mntmNewMenuItem_8);

		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Voice Control(inline)");
		chckbxmntmNewCheckItem.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(chckbxmntmNewCheckItem);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("Autonomous Agent(Inline)");
		chckbxmntmNewCheckItem_1.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_1.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_1);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_2 = new JCheckBoxMenuItem("Real Time");
		chckbxmntmNewCheckItem_2.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_2.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_2);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_3 = new JCheckBoxMenuItem("Experts(inline)");
		chckbxmntmNewCheckItem_3.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_3.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_3);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_4 = new JCheckBoxMenuItem("System Prompt Extra(append)");
		chckbxmntmNewCheckItem_4.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_4.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_4);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_5 = new JCheckBoxMenuItem("Audio Input");
		chckbxmntmNewCheckItem_5.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_5.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_5);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_6 = new JCheckBoxMenuItem("Audio Output");
		chckbxmntmNewCheckItem_6.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_6.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_6);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_7 = new JCheckBoxMenuItem("Command: Web Search");
		chckbxmntmNewCheckItem_7.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_7.setBackground(new Color(255, 255, 255));
		chckbxmntmNewCheckItem_7.setSelected(true);
		mnNewMenu_1.add(chckbxmntmNewCheckItem_7);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_8 = new JCheckBoxMenuItem("Command:Files I/O");
		chckbxmntmNewCheckItem_8.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_8.setBackground(new Color(255, 255, 255));
		chckbxmntmNewCheckItem_8.setSelected(true);
		mnNewMenu_1.add(chckbxmntmNewCheckItem_8);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_9 = new JCheckBoxMenuItem("Command:Code Interpreter");
		chckbxmntmNewCheckItem_9.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_9.setBackground(new Color(255, 255, 255));
		chckbxmntmNewCheckItem_9.setSelected(true);
		mnNewMenu_1.add(chckbxmntmNewCheckItem_9);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_10 = new JCheckBoxMenuItem("Command:Custom Commands");
		chckbxmntmNewCheckItem_10.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_10.setBackground(new Color(255, 255, 255));
		chckbxmntmNewCheckItem_10.setSelected(true);
		mnNewMenu_1.add(chckbxmntmNewCheckItem_10);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_11 = new JCheckBoxMenuItem("Command:API Calls");
		chckbxmntmNewCheckItem_11.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_11.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_11);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_12 = new JCheckBoxMenuItem("Command:Serial port/USB");
		chckbxmntmNewCheckItem_12.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_12.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_12);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_13 = new JCheckBoxMenuItem("Context history(calendar,inline)");
		chckbxmntmNewCheckItem_13.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_13.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_13);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_14 = new JCheckBoxMenuItem("DALL-E 3: Image Generation(inline)");
		chckbxmntmNewCheckItem_14.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_14.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_14);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_15 = new JCheckBoxMenuItem("GPT-4 Vision(inline)");
		chckbxmntmNewCheckItem_15.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_15.setBackground(new Color(255, 255, 255));
		chckbxmntmNewCheckItem_15.setSelected(true);
		mnNewMenu_1.add(chckbxmntmNewCheckItem_15);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_16 = new JCheckBoxMenuItem("Chat with files(Llama-index,inline)");
		chckbxmntmNewCheckItem_16.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_16.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_16);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_17 = new JCheckBoxMenuItem("Crontab/Task Scheduler");
		chckbxmntmNewCheckItem_17.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_17.setBackground(new Color(255, 255, 255));
		mnNewMenu_1.add(chckbxmntmNewCheckItem_17);

		JMenu mnNewMenu_2 = new JMenu("Audio/Voice");
		mnNewMenu_2.setBackground(new Color(255, 255, 255));
		mnNewMenu_2.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_2);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_18 = new JCheckBoxMenuItem("Input:speech recognition");
		chckbxmntmNewCheckItem_18.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_18.setBackground(new Color(255, 255, 255));
		mnNewMenu_2.add(chckbxmntmNewCheckItem_18);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_19 = new JCheckBoxMenuItem("Output:speech synthesis");
		chckbxmntmNewCheckItem_19.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_19.setBackground(new Color(255, 255, 255));
		mnNewMenu_2.add(chckbxmntmNewCheckItem_19);

		JSeparator separator = new JSeparator();
		mnNewMenu_2.add(separator);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_20 = new JCheckBoxMenuItem("Voice control (inline)");
		chckbxmntmNewCheckItem_20.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_20.setBackground(new Color(255, 255, 255));
		mnNewMenu_2.add(chckbxmntmNewCheckItem_20);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_21 = new JCheckBoxMenuItem("Voice control (global)");
		chckbxmntmNewCheckItem_21.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_21.setBackground(new Color(255, 255, 255));
		mnNewMenu_2.add(chckbxmntmNewCheckItem_21);

		JSeparator separator_1 = new JSeparator();
		mnNewMenu_2.add(separator_1);

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Clear audio cache...");
		mntmNewMenuItem_9.setIcon(new ImageIcon("H:\\Downloads\\GUNOI(Clear history).png"));
		mntmNewMenuItem_9.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_9.setBackground(new Color(255, 255, 255));
		mnNewMenu_2.add(mntmNewMenuItem_9);

		JMenu mnNewMenu_3 = new JMenu("Video");
		mnNewMenu_3.setBackground(new Color(255, 255, 255));
		mnNewMenu_3.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_3);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_22 = new JCheckBoxMenuItem("Input: camera");
		chckbxmntmNewCheckItem_22.setBackground(new Color(255, 255, 255));
		chckbxmntmNewCheckItem_22.setForeground(new Color(0, 0, 0));
		mnNewMenu_3.add(chckbxmntmNewCheckItem_22);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_23 = new JCheckBoxMenuItem("Auto capture");
		chckbxmntmNewCheckItem_23.setBackground(new Color(255, 255, 255));
		chckbxmntmNewCheckItem_23.setForeground(new Color(0, 0, 0));
		mnNewMenu_3.add(chckbxmntmNewCheckItem_23);

		JMenu mnNewMenu_4 = new JMenu("Config");
		mnNewMenu_4.setBackground(new Color(255, 255, 255));
		mnNewMenu_4.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_4);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Settings...");
		mntmNewMenuItem_10.setIcon(new ImageIcon("H:\\Downloads\\SETTINGS.png"));
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Settings opt = new Settings();
				opt.window(null);
			}
		});
		mntmNewMenuItem_10.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_10.setBackground(new Color(255, 255, 255));
		mnNewMenu_4.add(mntmNewMenuItem_10);

		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Models...");
		mntmNewMenuItem_11.setIcon(new ImageIcon("H:\\Downloads\\SETTINGS.png"));
		mntmNewMenuItem_11.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_11.setBackground(new Color(255, 255, 255));
		mnNewMenu_4.add(mntmNewMenuItem_11);

		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Accessibility");
		mntmNewMenuItem_12.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_12.setBackground(new Color(255, 255, 255));
		mnNewMenu_4.add(mntmNewMenuItem_12);

		JMenu mnNewMenu_8 = new JMenu("Theme");
		mnNewMenu_8.setForeground(new Color(0, 0, 0));
		mnNewMenu_8.setBackground(new Color(255, 255, 255));
		mnNewMenu_4.add(mnNewMenu_8);

		JMenu mnNewMenu_13 = new JMenu("Dark color...");
		mnNewMenu_13.setForeground(new Color(0, 0, 0));
		mnNewMenu_13.setBackground(new Color(255, 255, 255));
		mnNewMenu_8.add(mnNewMenu_13);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_26 = new JCheckBoxMenuItem("Dark:Amber");
		chckbxmntmNewCheckItem_26.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_26.setBackground(new Color(255, 255, 255));
		mnNewMenu_13.add(chckbxmntmNewCheckItem_26);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_27 = new JCheckBoxMenuItem("Dark:Blue");
		chckbxmntmNewCheckItem_27.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_27.setBackground(new Color(255, 255, 255));
		mnNewMenu_13.add(chckbxmntmNewCheckItem_27);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_28 = new JCheckBoxMenuItem("Dark:Cyan");
		chckbxmntmNewCheckItem_28.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_28.setBackground(new Color(255, 255, 255));
		mnNewMenu_13.add(chckbxmntmNewCheckItem_28);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_29 = new JCheckBoxMenuItem("Dark:Lightgreen");
		chckbxmntmNewCheckItem_29.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_29.setBackground(new Color(255, 255, 255));
		mnNewMenu_13.add(chckbxmntmNewCheckItem_29);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_30 = new JCheckBoxMenuItem("Dark:Pink");
		chckbxmntmNewCheckItem_30.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_30.setBackground(new Color(255, 255, 255));
		mnNewMenu_13.add(chckbxmntmNewCheckItem_30);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_31 = new JCheckBoxMenuItem("Dark:Purple");
		chckbxmntmNewCheckItem_31.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_31.setBackground(new Color(255, 255, 255));
		mnNewMenu_13.add(chckbxmntmNewCheckItem_31);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_32 = new JCheckBoxMenuItem("Dark:Red");
		chckbxmntmNewCheckItem_32.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_32.setBackground(new Color(255, 255, 255));
		mnNewMenu_13.add(chckbxmntmNewCheckItem_32);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_33 = new JCheckBoxMenuItem("Dark:Teal");
		chckbxmntmNewCheckItem_33.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_33.setBackground(new Color(255, 255, 255));
		mnNewMenu_13.add(chckbxmntmNewCheckItem_33);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_34 = new JCheckBoxMenuItem("Dark:Yellow");
		chckbxmntmNewCheckItem_34.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_34.setBackground(new Color(255, 255, 255));
		mnNewMenu_13.add(chckbxmntmNewCheckItem_34);

		JMenu mnNewMenu_14 = new JMenu("Light color...");
		mnNewMenu_14.setForeground(new Color(0, 0, 0));
		mnNewMenu_14.setBackground(new Color(255, 255, 255));
		mnNewMenu_8.add(mnNewMenu_14);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_35 = new JCheckBoxMenuItem("Light:Amber");
		chckbxmntmNewCheckItem_35.setSelected(true);
		chckbxmntmNewCheckItem_35.setBackground(new Color(255, 255, 255));
		mnNewMenu_14.add(chckbxmntmNewCheckItem_35);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_36 = new JCheckBoxMenuItem("Light:Blue");
		chckbxmntmNewCheckItem_36.setBackground(new Color(255, 255, 255));
		mnNewMenu_14.add(chckbxmntmNewCheckItem_36);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_37 = new JCheckBoxMenuItem("Light:Cyan");
		chckbxmntmNewCheckItem_37.setBackground(new Color(255, 255, 255));
		mnNewMenu_14.add(chckbxmntmNewCheckItem_37);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_38 = new JCheckBoxMenuItem("Light:Cyan 500");
		chckbxmntmNewCheckItem_38.setBackground(new Color(255, 255, 255));
		mnNewMenu_14.add(chckbxmntmNewCheckItem_38);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_39 = new JCheckBoxMenuItem("Light:Lightgreen");
		chckbxmntmNewCheckItem_39.setBackground(new Color(255, 255, 255));
		mnNewMenu_14.add(chckbxmntmNewCheckItem_39);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_40 = new JCheckBoxMenuItem("Light:Pink");
		chckbxmntmNewCheckItem_40.setBackground(new Color(255, 255, 255));
		mnNewMenu_14.add(chckbxmntmNewCheckItem_40);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_41 = new JCheckBoxMenuItem("Light:Purple");
		chckbxmntmNewCheckItem_41.setBackground(new Color(255, 255, 255));
		mnNewMenu_14.add(chckbxmntmNewCheckItem_41);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_42 = new JCheckBoxMenuItem("Light:Red");
		chckbxmntmNewCheckItem_42.setBackground(new Color(255, 255, 255));
		mnNewMenu_14.add(chckbxmntmNewCheckItem_42);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_43 = new JCheckBoxMenuItem("Light:Teal");
		chckbxmntmNewCheckItem_43.setBackground(new Color(255, 255, 255));
		mnNewMenu_14.add(chckbxmntmNewCheckItem_43);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_44 = new JCheckBoxMenuItem("Light:Yellow");
		chckbxmntmNewCheckItem_44.setBackground(new Color(255, 255, 255));
		mnNewMenu_14.add(chckbxmntmNewCheckItem_44);

		JMenu mnNewMenu_15 = new JMenu("Code syntax highlights");
		mnNewMenu_15.setForeground(new Color(0, 0, 0));
		mnNewMenu_15.setBackground(new Color(255, 255, 255));
		mnNewMenu_8.add(mnNewMenu_15);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_45 = new JCheckBoxMenuItem("autumn");
		chckbxmntmNewCheckItem_45.setBackground(new Color(255, 255, 255));
		mnNewMenu_15.add(chckbxmntmNewCheckItem_45);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_46 = new JCheckBoxMenuItem("fruity");
		chckbxmntmNewCheckItem_46.setBackground(new Color(255, 255, 255));
		mnNewMenu_15.add(chckbxmntmNewCheckItem_46);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_47 = new JCheckBoxMenuItem("github-dark");
		chckbxmntmNewCheckItem_47.setBackground(new Color(255, 255, 255));
		chckbxmntmNewCheckItem_47.setSelected(true);
		mnNewMenu_15.add(chckbxmntmNewCheckItem_47);

		JMenu mnNewMenu_16 = new JMenu("Layout size");
		mnNewMenu_16.setForeground(new Color(0, 0, 0));
		mnNewMenu_16.setBackground(new Color(255, 255, 255));
		mnNewMenu_8.add(mnNewMenu_16);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_48 = new JCheckBoxMenuItem("-2");
		chckbxmntmNewCheckItem_48.setBackground(new Color(255, 255, 255));
		mnNewMenu_16.add(chckbxmntmNewCheckItem_48);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_49 = new JCheckBoxMenuItem("-1");
		chckbxmntmNewCheckItem_49.setBackground(new Color(255, 255, 255));
		chckbxmntmNewCheckItem_49.setSelected(true);
		mnNewMenu_16.add(chckbxmntmNewCheckItem_49);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_50 = new JCheckBoxMenuItem("0");
		chckbxmntmNewCheckItem_50.setBackground(new Color(255, 255, 255));
		mnNewMenu_16.add(chckbxmntmNewCheckItem_50);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_51 = new JCheckBoxMenuItem("1");
		chckbxmntmNewCheckItem_51.setBackground(new Color(255, 255, 255));
		mnNewMenu_16.add(chckbxmntmNewCheckItem_51);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_52 = new JCheckBoxMenuItem("2");
		chckbxmntmNewCheckItem_52.setBackground(new Color(255, 255, 255));
		mnNewMenu_16.add(chckbxmntmNewCheckItem_52);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_24 = new JCheckBoxMenuItem("Display blocks");
		chckbxmntmNewCheckItem_24.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_24.setBackground(new Color(255, 255, 255));
		chckbxmntmNewCheckItem_24.setSelected(true);
		mnNewMenu_8.add(chckbxmntmNewCheckItem_24);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_25 = new JCheckBoxMenuItem("Show tooltips");
		chckbxmntmNewCheckItem_25.setForeground(new Color(0, 0, 0));
		chckbxmntmNewCheckItem_25.setBackground(new Color(255, 255, 255));
		chckbxmntmNewCheckItem_25.setSelected(true);
		mnNewMenu_8.add(chckbxmntmNewCheckItem_25);

		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Settings...");
		mntmNewMenuItem_16.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_16.setBackground(new Color(255, 255, 255));
		mnNewMenu_8.add(mntmNewMenuItem_16);

		JMenu mnNewMenu_9 = new JMenu("Language");
		mnNewMenu_9.setForeground(new Color(0, 0, 0));
		mnNewMenu_9.setBackground(new Color(255, 255, 255));
		mnNewMenu_4.add(mnNewMenu_9);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_53 = new JCheckBoxMenuItem("EN");
		chckbxmntmNewCheckItem_53.setSelected(true);
		mnNewMenu_9.add(chckbxmntmNewCheckItem_53);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_54 = new JCheckBoxMenuItem("PL");
		mnNewMenu_9.add(chckbxmntmNewCheckItem_54);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_55 = new JCheckBoxMenuItem("DE");
		mnNewMenu_9.add(chckbxmntmNewCheckItem_55);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_56 = new JCheckBoxMenuItem("ES");
		mnNewMenu_9.add(chckbxmntmNewCheckItem_56);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_57 = new JCheckBoxMenuItem("FR");
		mnNewMenu_9.add(chckbxmntmNewCheckItem_57);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_58 = new JCheckBoxMenuItem("IT");
		mnNewMenu_9.add(chckbxmntmNewCheckItem_58);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_59 = new JCheckBoxMenuItem("UK");
		mnNewMenu_9.add(chckbxmntmNewCheckItem_59);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_60 = new JCheckBoxMenuItem("ZH");
		mnNewMenu_9.add(chckbxmntmNewCheckItem_60);

		JMenu mnNewMenu_10 = new JMenu("Edit CSS stylesheets...");
		mnNewMenu_10.setForeground(new Color(0, 0, 0));
		mnNewMenu_10.setBackground(new Color(255, 255, 255));
		mnNewMenu_4.add(mnNewMenu_10);

		JMenuItem mntmNewMenuItem_17 = new JMenuItem("style.css");
		mnNewMenu_10.add(mntmNewMenuItem_17);

		JMenuItem mntmNewMenuItem_18 = new JMenuItem("style.dark.css");
		mnNewMenu_10.add(mntmNewMenuItem_18);

		JMenuItem mntmNewMenuItem_19 = new JMenuItem("style.light.css");
		mnNewMenu_10.add(mntmNewMenuItem_19);

		JMenuItem mntmNewMenuItem_20 = new JMenuItem("markdown.css");
		mnNewMenu_10.add(mntmNewMenuItem_20);

		JMenuItem mntmNewMenuItem_21 = new JMenuItem("markdown.dark.css");
		mnNewMenu_10.add(mntmNewMenuItem_21);

		JMenuItem mntmNewMenuItem_22 = new JMenuItem("markdown.light.css");
		mnNewMenu_10.add(mntmNewMenuItem_22);

		JMenuItem mntmNewMenuItem_23 = new JMenuItem("web.css");
		mnNewMenu_10.add(mntmNewMenuItem_23);

		JMenuItem mntmNewMenuItem_24 = new JMenuItem("web.dark.css");
		mnNewMenu_10.add(mntmNewMenuItem_24);

		JMenuItem mntmNewMenuItem_25 = new JMenuItem("web.light.css");
		mnNewMenu_10.add(mntmNewMenuItem_25);

		JSeparator separator_2 = new JSeparator();
		mnNewMenu_10.add(separator_2);

		JMenuItem mntmNewMenuItem_26 = new JMenuItem("Restore default CSS...");
		mnNewMenu_10.add(mntmNewMenuItem_26);

		JMenu mnNewMenu_11 = new JMenu("EditJSON configs...");
		mnNewMenu_11.setForeground(new Color(0, 0, 0));
		mnNewMenu_11.setBackground(new Color(255, 255, 255));
		mnNewMenu_4.add(mnNewMenu_11);

		JMenuItem mntmNewMenuItem_27 = new JMenuItem("attachments.json");
		mnNewMenu_11.add(mntmNewMenuItem_27);

		JMenuItem mntmNewMenuItem_28 = new JMenuItem("assistants.json");
		mnNewMenu_11.add(mntmNewMenuItem_28);

		JMenuItem mntmNewMenuItem_29 = new JMenuItem("config.json");
		mnNewMenu_11.add(mntmNewMenuItem_29);

		JMenuItem mntmNewMenuItem_30 = new JMenuItem("models.json");
		mnNewMenu_11.add(mntmNewMenuItem_30);

		JMenuItem mntmNewMenuItem_31 = new JMenuItem("plugin_presets.json");
		mnNewMenu_11.add(mntmNewMenuItem_31);

		JMenu mnNewMenu_12 = new JMenu("Profile");
		mnNewMenu_12.setForeground(new Color(0, 0, 0));
		mnNewMenu_12.setBackground(new Color(255, 255, 255));
		mnNewMenu_4.add(mnNewMenu_12);

		JMenuItem mntmNewMenuItem_32 = new JMenuItem("New profile...");
		mnNewMenu_12.add(mntmNewMenuItem_32);

		JMenuItem mntmNewMenuItem_33 = new JMenuItem("Edit profiles...");
		mnNewMenu_12.add(mntmNewMenuItem_33);

		JSeparator separator_3 = new JSeparator();
		mnNewMenu_12.add(separator_3);

		JCheckBoxMenuItem chckbxmntmNewCheckItem_61 = new JCheckBoxMenuItem("Default(current)");
		chckbxmntmNewCheckItem_61.setSelected(true);
		mnNewMenu_12.add(chckbxmntmNewCheckItem_61);

		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Open working directory...");
		mntmNewMenuItem_13.setIcon(new ImageIcon("H:\\Downloads\\FOLDER(NEWGROUP).png"));
		mntmNewMenuItem_13.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_13.setBackground(new Color(255, 255, 255));
		mnNewMenu_4.add(mntmNewMenuItem_13);

		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Change working directory...");
		mntmNewMenuItem_14.setIcon(new ImageIcon("H:\\Downloads\\SETTINGS.png"));
		mntmNewMenuItem_14.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_14.setBackground(new Color(255, 255, 255));
		mnNewMenu_4.add(mntmNewMenuItem_14);

		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Save config");
		mntmNewMenuItem_15.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_15.setBackground(new Color(255, 255, 255));
		mnNewMenu_4.add(mntmNewMenuItem_15);

		JMenu mnNewMenu_5 = new JMenu("About");
		mnNewMenu_5.setBackground(new Color(255, 255, 255));
		mnNewMenu_5.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_5);

		JMenuItem mntmNewMenuItem_34 = new JMenuItem("About");
		mntmNewMenuItem_34.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_34.setIcon(new ImageIcon("H:\\Downloads\\ABOUT.png"));
		mnNewMenu_5.add(mntmNewMenuItem_34);

		JMenuItem mntmNewMenuItem_35 = new JMenuItem("Changelog");
		mntmNewMenuItem_35.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_35.setIcon(new ImageIcon("H:\\Downloads\\CHANGE LOG.png"));
		mnNewMenu_5.add(mntmNewMenuItem_35);

		JMenuItem mntmNewMenuItem_36 = new JMenuItem("Check for updates...");
		mntmNewMenuItem_36.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_36.setIcon(new ImageIcon("H:\\Downloads\\CHECK FOR UPDATES.png"));
		mnNewMenu_5.add(mntmNewMenuItem_36);

		JMenuItem mntmNewMenuItem_37 = new JMenuItem("Documentation");
		mntmNewMenuItem_37.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_37.setIcon(new ImageIcon("H:\\Downloads\\GLOBU.png"));
		mnNewMenu_5.add(mntmNewMenuItem_37);

		JMenuItem mntmNewMenuItem_38 = new JMenuItem("PyPi");
		mntmNewMenuItem_38.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_38.setIcon(new ImageIcon("H:\\Downloads\\GLOBU.png"));
		mnNewMenu_5.add(mntmNewMenuItem_38);

		JMenuItem mntmNewMenuItem_39 = new JMenuItem("Snap Store");
		mntmNewMenuItem_39.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_39.setIcon(new ImageIcon("H:\\Downloads\\GLOBU.png"));
		mnNewMenu_5.add(mntmNewMenuItem_39);

		JMenuItem mntmNewMenuItem_40 = new JMenuItem("Official website-pygpt.net");
		mntmNewMenuItem_40.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_40.setIcon(new ImageIcon("H:\\Downloads\\GLOBU.png"));
		mnNewMenu_5.add(mntmNewMenuItem_40);

		JMenuItem mntmNewMenuItem_41 = new JMenuItem("GitHub(source code)");
		mntmNewMenuItem_41.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_41.setIcon(new ImageIcon("H:\\Downloads\\GLOBU.png"));
		mnNewMenu_5.add(mntmNewMenuItem_41);

		JMenuItem mntmNewMenuItem_42 = new JMenuItem("License");
		mntmNewMenuItem_42.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_42.setIcon(new ImageIcon("H:\\Downloads\\LICENSE.png"));
		mnNewMenu_5.add(mntmNewMenuItem_42);

		JMenuItem mntmNewMenuItem_43 = new JMenuItem("Support and donate");
		mntmNewMenuItem_43.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_43.setIcon(new ImageIcon("H:\\Downloads\\SUPPORT AND DONATE.png"));
		mnNewMenu_5.add(mntmNewMenuItem_43);

		JMenu mnNewMenu_6 = new JMenu("Tools");
		mnNewMenu_6.setBackground(new Color(255, 255, 255));
		mnNewMenu_6.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_6);

		JMenuItem mntmNewMenuItem_44 = new JMenuItem("Indexer...");
		mntmNewMenuItem_44.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_44.setIcon(new ImageIcon("H:\\Downloads\\INDEXER.png"));
		mnNewMenu_6.add(mntmNewMenuItem_44);

		JMenuItem mntmNewMenuItem_45 = new JMenuItem("Media player");
		mntmNewMenuItem_45.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_45.setIcon(new ImageIcon("H:\\Downloads\\MEDIA PLAYER.png"));
		mnNewMenu_6.add(mntmNewMenuItem_45);

		JMenuItem mntmNewMenuItem_46 = new JMenuItem("Image viewer");
		mntmNewMenuItem_46.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_46.setIcon(new ImageIcon("H:\\Downloads\\IMAGE VIEWER.png"));
		mnNewMenu_6.add(mntmNewMenuItem_46);

		JMenuItem mntmNewMenuItem_47 = new JMenuItem("Text editor");
		mntmNewMenuItem_47.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_47.setIcon(new ImageIcon("H:\\Downloads\\TEXT EDITOR.png"));
		mnNewMenu_6.add(mntmNewMenuItem_47);

		JMenuItem mntmNewMenuItem_48 = new JMenuItem("Transcribe audio/video files");
		mntmNewMenuItem_48.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_48.setIcon(new ImageIcon("H:\\Downloads\\TRANSCRIBE.png"));
		mnNewMenu_6.add(mntmNewMenuItem_48);

		JMenuItem mntmNewMenuItem_49 = new JMenuItem("Python code interpreter");
		mntmNewMenuItem_49.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_49.setIcon(new ImageIcon("H:\\Downloads\\PYTHON.png"));
		mnNewMenu_6.add(mntmNewMenuItem_49);

		JPanel panel = new JPanel();
		panel.setBounds(10, 48, 167, 399);
		panel.setBackground(new Color(255, 255, 255));
		frmPygpt.getContentPane().add(panel);
		panel.setLayout(null);

		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setValueIsAdjusting(true);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(0, 0, 167, 399);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "New(today)", "New(yesterday)", "New(2 days ago)" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(list);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(198, 24, 1024, 325);
		frmPygpt.getContentPane().add(tabbedPane);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Chat", null, panel_5, null);
		panel_5.setLayout(null);

		textField_1 = new JTextField();
		textField_1.setBounds(0, 0, 1019, 297);
		panel_5.add(textField_1);
		textField_1.setColumns(10);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Files", null, panel_4, null);

		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Calendar", null, panel_6, null);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Draw", null, panel_3, null);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Notepad", null, panel_1, null);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(198, 421, 1024, 83);
		frmPygpt.getContentPane().add(tabbedPane_1);

		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Input", null, panel_2, null);
		panel_2.setLayout(null);

		textField = new JTextField();
		textField.setBounds(0, 0, 1019, 55);
		panel_2.add(textField);
		textField.setColumns(10);

		JPanel panel_7 = new JPanel();
		tabbedPane_1.addTab("Attachments", null, panel_7, null);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Show time");
		chckbxNewCheckBox.setBackground(new Color(192, 192, 192));
		chckbxNewCheckBox.setBounds(198, 361, 93, 23);
		frmPygpt.getContentPane().add(chckbxNewCheckBox);

		JCheckBox chckbxEdit = new JCheckBox("Edit");
		chckbxEdit.setBackground(new Color(192, 192, 192));
		chckbxEdit.setBounds(293, 361, 48, 23);
		frmPygpt.getContentPane().add(chckbxEdit);

		JCheckBox chckbxPlainText = new JCheckBox("Plain text");
		chckbxPlainText.setBackground(new Color(192, 192, 192));
		chckbxPlainText.setBounds(355, 361, 89, 23);
		frmPygpt.getContentPane().add(chckbxPlainText);

		JCheckBox chckbxvision = new JCheckBox("+Vision");
		chckbxvision.setBackground(new Color(192, 192, 192));
		chckbxvision.setBounds(446, 361, 80, 23);
		frmPygpt.getContentPane().add(chckbxvision);

		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSend.setForeground(Color.BLACK);
		btnSend.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSend.setBackground(Color.LIGHT_GRAY);
		btnSend.setBounds(1151, 510, 71, 24);
		frmPygpt.getContentPane().add(btnSend);

		JCheckBox chckbxStream = new JCheckBox("Stream");
		chckbxStream.setSelected(true);
		chckbxStream.setBackground(Color.LIGHT_GRAY);
		chckbxStream.setBounds(742, 511, 69, 23);
		frmPygpt.getContentPane().add(chckbxStream);

		JCheckBox chckbxClearOnSend = new JCheckBox("Clear on send");
		chckbxClearOnSend.setSelected(true);
		chckbxClearOnSend.setBackground(Color.LIGHT_GRAY);
		chckbxClearOnSend.setBounds(813, 511, 107, 23);
		frmPygpt.getContentPane().add(chckbxClearOnSend);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Enter");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBackground(new Color(192, 192, 192));
		rdbtnNewRadioButton.setBounds(922, 511, 61, 23);
		frmPygpt.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnShiftenter = new JRadioButton("Shift+Enter");
		rdbtnShiftenter.setBackground(new Color(192, 192, 192));
		rdbtnShiftenter.setBounds(985, 511, 97, 23);
		frmPygpt.getContentPane().add(rdbtnShiftenter);

		JTextPane txtpnSearch = new JTextPane();
		txtpnSearch.setText("Search...");
		txtpnSearch.setBounds(10, 511, 167, 23);
		frmPygpt.getContentPane().add(txtpnSearch);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(1232, 48, 160, 156);
		frmPygpt.getContentPane().add(scrollPane);

		JPanel panel_8 = new JPanel();
		scrollPane.setViewportView(panel_8);
		panel_8.setLayout(new GridLayout(0, 1, 0, 0));

		JButton btnNewButton_4 = new JButton("Chat");
		btnNewButton_4.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8.add(btnNewButton_4);

		JButton btnNewButton_3 = new JButton("Completion");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8.add(btnNewButton_3);

		JButton btnNewButton_2 = new JButton("Image(DALL-E)");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8.add(btnNewButton_2);

		JButton btnNewButton_5 = new JButton("Vision");
		btnNewButton_5.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Assistant");
		btnNewButton_6.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("Langchain");
		btnNewButton_7.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("Chat with files");
		btnNewButton_8.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("Agent(autonomous)");
		btnNewButton_9.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("Experts(co-op)");
		btnNewButton_10.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8.add(btnNewButton_10);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(1413, 48, 160, 156);
		frmPygpt.getContentPane().add(scrollPane_1);

		JPanel panel_8_1 = new JPanel();
		scrollPane_1.setViewportView(panel_8_1);
		panel_8_1.setLayout(new GridLayout(0, 1, 0, 0));

		JButton btnNewButton_4_1 = new JButton("gpt-3.5-turbo");
		btnNewButton_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8_1.add(btnNewButton_4_1);

		JButton btnNewButton_3_1 = new JButton("gpt-3.5-turbo-1106");
		btnNewButton_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8_1.add(btnNewButton_3_1);

		JButton btnNewButton_2_1 = new JButton("gpt-3.5-turbo-16k");
		btnNewButton_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8_1.add(btnNewButton_2_1);

		JButton btnNewButton_5_1 = new JButton("gpt-4");
		btnNewButton_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8_1.add(btnNewButton_5_1);

		JButton btnNewButton_6_1 = new JButton("gpt-4-0125-preview");
		btnNewButton_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8_1.add(btnNewButton_6_1);

		JButton btnNewButton_7_1 = new JButton("gpt-4-1106-preview");
		btnNewButton_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8_1.add(btnNewButton_7_1);

		JButton btnNewButton_8_1 = new JButton("gpt-4-32k");
		btnNewButton_8_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8_1.add(btnNewButton_8_1);

		JButton btnNewButton_9_1 = new JButton("gpt-4-turbo");
		btnNewButton_9_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8_1.add(btnNewButton_9_1);

		JButton btnNewButton_10_1 = new JButton("gpt-4-turbo-2024-04-09");
		btnNewButton_10_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8_1.add(btnNewButton_10_1);

		JButton btnNewButton_11 = new JButton("gpt-4-turbo-preview");
		btnNewButton_11.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8_1.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("gpt-4o");
		btnNewButton_12.setHorizontalAlignment(SwingConstants.LEFT);
		panel_8_1.add(btnNewButton_12);

		JLabel lblNewLabel_1 = new JLabel("Mode");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(1232, 31, 46, 14);
		frmPygpt.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Model");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(1413, 31, 46, 14);
		frmPygpt.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_2 = new JLabel("You can change the working mode and model in real time.");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(1232, 215, 341, 14);
		frmPygpt.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_1_2 = new JLabel("Presets");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(1232, 240, 46, 14);
		frmPygpt.getContentPane().add(lblNewLabel_1_2);

		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setIcon(new ImageIcon("H:\\Downloads\\buton+.png"));
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.setBounds(1542, 240, 31, 23);
		frmPygpt.getContentPane().add(btnNewButton_1_1_1);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 255));
		panel_9.setBounds(1232, 265, 341, 97);
		frmPygpt.getContentPane().add(panel_9);
		panel_9.setLayout(null);

		JButton btnNewButton_13 = new JButton("*");
		btnNewButton_13.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_13.setBounds(0, 0, 414, 23);
		panel_9.add(btnNewButton_13);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(1232, 227, 341, 2);
		frmPygpt.getContentPane().add(separator_4);

		JTextArea txtrCreatePresetsWith = new JTextArea();
		txtrCreatePresetsWith.setEditable(false);
		txtrCreatePresetsWith.setBackground(new Color(192, 192, 192));
		txtrCreatePresetsWith.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtrCreatePresetsWith.setWrapStyleWord(true);
		txtrCreatePresetsWith.setText(
				"Create presets with different configurations to quickly switch \r\nbetween various settings , such as the system prompt and\r\nothers.");
		txtrCreatePresetsWith.setBounds(1232, 373, 341, 52);
		frmPygpt.getContentPane().add(txtrCreatePresetsWith);

		JTextArea txtrCreateAsMany = new JTextArea();
		txtrCreateAsMany.setEditable(false);
		txtrCreateAsMany.setBackground(new Color(192, 192, 192));
		txtrCreateAsMany.setFont(new Font("Tahoma", Font.PLAIN, 8));
		txtrCreateAsMany.setText(
				"Create as many conversation contexts as \r\nyou need; you can return to them at any\r\ntime.");
		txtrCreateAsMany.setBounds(10, 458, 167, 42);
		frmPygpt.getContentPane().add(txtrCreateAsMany);

		JLabel lblNewLabel = new JLabel("Input(Your prompt)");
		lblNewLabel.setBounds(198, 396, 107, 14);
		frmPygpt.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_3 = new JLabel("0+0+15+3=28/4096");
		lblNewLabel_3.setBounds(1105, 396, 117, 14);
		frmPygpt.getContentPane().add(lblNewLabel_3);

		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(198, 386, 1024, 2);
		frmPygpt.getContentPane().add(separator_5);

		JLabel lblSystemPrompt = new JLabel("System prompt");
		lblSystemPrompt.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSystemPrompt.setBounds(1232, 444, 107, 14);
		frmPygpt.getContentPane().add(lblSystemPrompt);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Execute commands");
		chckbxNewCheckBox_1.setBackground(new Color(192, 192, 192));
		chckbxNewCheckBox_1.setBounds(1345, 440, 140, 23);
		frmPygpt.getContentPane().add(chckbxNewCheckBox_1);

		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1_1.setIcon(new ImageIcon("H:\\Downloads\\BUTON X.png"));
		btnNewButton_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1.setBounds(1542, 441, 31, 22);
		frmPygpt.getContentPane().add(btnNewButton_1_1_1_1);

		JTextArea txtrYouAreA = new JTextArea();
		txtrYouAreA.setText("You are a helpful assistant.");
		txtrYouAreA.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtrYouAreA.setBackground(new Color(255, 255, 255));
		txtrYouAreA.setBounds(1232, 466, 341, 15);
		frmPygpt.getContentPane().add(txtrYouAreA);

		JTextArea txtrTheCurrentSystem = new JTextArea();
		txtrTheCurrentSystem.setEditable(false);
		txtrTheCurrentSystem.setForeground(new Color(0, 0, 0));
		txtrTheCurrentSystem.setText(
				"The current system prompt can be modified in real time. To\r\nexecute commands from plugins , enable the option \"Execute\r\ncommands.\"");
		txtrTheCurrentSystem.setBackground(new Color(192, 192, 192));
		txtrTheCurrentSystem.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtrTheCurrentSystem.setBounds(1232, 492, 341, 42);
		frmPygpt.getContentPane().add(txtrTheCurrentSystem);

		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(1232, 423, 341, 2);
		frmPygpt.getContentPane().add(separator_6);

		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.setBorderPainted(false);
		btnNewButton_14.setBackground(new Color(255, 255, 255));
		btnNewButton_14.setIcon(new ImageIcon("H:\\Downloads\\CAMERA_PHOTOROOM.png"));
		btnNewButton_14.setBounds(569, 361, 32, 23);
		frmPygpt.getContentPane().add(btnNewButton_14);

		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.setBorderPainted(false);
		btnNewButton_15.setBackground(new Color(255, 255, 255));
		btnNewButton_15.setIcon(new ImageIcon("H:\\Downloads\\MICROFON.png"));
		btnNewButton_15.setBounds(601, 361, 32, 23);
		frmPygpt.getContentPane().add(btnNewButton_15);

		JButton btnNewButton_16 = new JButton("");
		btnNewButton_16.setBorderPainted(false);
		btnNewButton_16.setBackground(new Color(255, 255, 255));
		btnNewButton_16.setIcon(new ImageIcon("H:\\Downloads\\MUT_PHOTOROOM.png"));
		btnNewButton_16.setBounds(634, 361, 32, 23);
		frmPygpt.getContentPane().add(btnNewButton_16);

		JButton btnNewButton_17 = new JButton("");
		btnNewButton_17.setBorderPainted(false);
		btnNewButton_17.setBackground(new Color(255, 255, 255));
		btnNewButton_17.setIcon(new ImageIcon("H:\\Downloads\\PYTHON_PHOTOROOM.png"));
		btnNewButton_17.setBounds(667, 361, 32, 23);
		frmPygpt.getContentPane().add(btnNewButton_17);

		JButton btnNewButton_18 = new JButton("");
		btnNewButton_18.setBorderPainted(false);
		btnNewButton_18.setBackground(new Color(255, 255, 255));
		btnNewButton_18.setIcon(new ImageIcon("H:\\Downloads\\INDEXER-PHOTOROOM.png"));
		btnNewButton_18.setBounds(700, 361, 32, 23);
		frmPygpt.getContentPane().add(btnNewButton_18);

		JLabel lblReady = new JLabel("Ready");
		lblReady.setBounds(198, 516, 48, 14);
		frmPygpt.getContentPane().add(lblReady);

		JRadioButton rdbtnOff = new JRadioButton("Off");
		rdbtnOff.setBackground(new Color(192, 192, 192));
		rdbtnOff.setBounds(1084, 511, 61, 23);
		frmPygpt.getContentPane().add(rdbtnOff);

		JButton btnNewButton_19 = new JButton("+5 plugin(s)");
		btnNewButton_19.setBorderPainted(false);
		btnNewButton_19.setBackground(new Color(192, 192, 192));
		btnNewButton_19.setBounds(742, 361, 114, 23);
		frmPygpt.getContentPane().add(btnNewButton_19);

		JButton btnNewButton_19_1 = new JButton("1/1-15 token(s)");
		btnNewButton_19_1.setBorderPainted(false);
		btnNewButton_19_1.setBackground(new Color(192, 192, 192));
		btnNewButton_19_1.setBounds(1091, 360, 131, 23);
		frmPygpt.getContentPane().add(btnNewButton_19_1);

		JButton btnNewButton_19_2 = new JButton("Chat(+)");
		btnNewButton_19_2.setBorderPainted(false);
		btnNewButton_19_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_19_2.setBounds(866, 361, 91, 23);
		frmPygpt.getContentPane().add(btnNewButton_19_2);

		JButton btnNewButton_19_2_1 = new JButton("gpt-3.5turbo");
		btnNewButton_19_2_1.setBorderPainted(false);
		btnNewButton_19_2_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_19_2_1.setBounds(967, 360, 115, 23);
		frmPygpt.getContentPane().add(btnNewButton_19_2_1);

		JSeparator separator_7 = new JSeparator();
		separator_7.setBackground(new Color(255, 255, 255));
		separator_7.setBounds(1232, 431, 341, 2);
		frmPygpt.getContentPane().add(separator_7);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
