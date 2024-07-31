
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JDesktopPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class Settings extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void window(String[] args) {
		try {
			Settings dialog = new Settings();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Settings() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\Downloads\\pygpt icon.png"));
		setBounds(100, 100, 676, 445);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(10, 11, 638, 384);
		contentPanel.add(panel_1);

		JPanel panel = new JPanel();
		panel.setBounds(10, 337, 617, 32);
		panel.setLayout(new GridLayout(0, 3, 0, 0));

		JButton btnNewButton = new JButton("Undo changes");
		btnNewButton.setBackground(new Color(192, 192, 192));
		panel.add(btnNewButton);

		JButton btnLoadDefaults = new JButton("Load defaults");
		btnLoadDefaults.setBackground(new Color(192, 192, 192));
		panel.add(btnLoadDefaults);

		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(192, 192, 192));
		panel.add(btnSave);
		panel_1.setLayout(null);
		panel_1.add(panel);

		JPanel panel_15 = new JPanel();
		panel_15.setBounds(10, 11, 127, 315);
		panel_1.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));

		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "General", "Layout", "Files and attachments", "Context", "Models",
					"Prompts", "Images", "Vision", "Indexes(llama-index)", "Agents and experts", "Accessibility",
					"Updates", "Developer" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel_15.add(list);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(147, 11, 480, 315);
			panel_1.add(scrollPane);
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBorder(null);
			tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
			scrollPane.setViewportView(tabbedPane);

			JPanel panel_1_1 = new JPanel();
			panel_1_1.setBackground(new Color(192, 192, 192));
			panel_1_1.setBorder(null);
			tabbedPane.addTab("GENERAL", null, panel_1_1, null);

			JLabel lblNewLabel = new JLabel("OpenAI API KEY");

			JTextArea textArea = new JTextArea();

			JLabel lblNewLabel_1 = new JLabel(
					"Required for the OpenAI API. If you wish to use custom endpoints or local APIs,then you may enter any value here.");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 8));

			JTextArea txtrOpenaiOrganizationKey = new JTextArea();
			txtrOpenaiOrganizationKey.setEditable(false);
			txtrOpenaiOrganizationKey.setBackground(new Color(192, 192, 192));
			txtrOpenaiOrganizationKey.setFont(new Font("Tahoma", Font.PLAIN, 13));
			txtrOpenaiOrganizationKey.setText("OpenAI \r\nORGANIZATION KEY");

			JTextArea textArea_1 = new JTextArea();
			textArea_1.setText("        ");

			JLabel lblNewLabel_1_1 = new JLabel("OpenAI API Keys:https://platform.openai.com/account/api-keys");
			lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));

			JLabel lblApiEndpoint = new JLabel("API Endpoint");

			JTextArea textArea_1_1 = new JTextArea();

			JLabel lblNewLabel_1_2 = new JLabel(
					"OpenAI API(or compatible)endpoint URL , default:https:://api.openai.com/v1");
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));

			JLabel lblNumberOfNotepads = new JLabel("Number of notepads");

			JSlider slider = new JSlider();
			slider.setForeground(new Color(192, 192, 192));
			slider.setBorder(null);
			slider.setValue(1);

			JTextArea textArea_2 = new JTextArea();
			textArea_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			textArea_2.setText("1");

			JCheckBox chckbxNewCheckBox = new JCheckBox("Show tray icon");
			chckbxNewCheckBox.setBackground(new Color(192, 192, 192));
			chckbxNewCheckBox.setSelected(true);

			JLabel lblNewLabel_1_2_1 = new JLabel(
					"Restart required.Tray icon provides additional features like \"Ask with screenshot\" or \"Open notepad\".");
			lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 9));

			JCheckBox chckbxMinimizeToTray = new JCheckBox("Minimize to tray on exit");
			chckbxMinimizeToTray.setBackground(new Color(192, 192, 192));

			JLabel lblNewLabel_1_2_1_1 = new JLabel("Tray icon enabled is required for this option to work.");
			lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));

			JLabel lblRenderingEngine = new JLabel("Rendering engine");

			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "WebEngine/Chromium", "Legacy(markdown)" }));

			JLabel lblNewLabel_1_2_1_1_1 = new JLabel(
					"Restart of the application is required for this option to take effect.");
			lblNewLabel_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));

			JCheckBox chckbxOpenglHardwareAcceleration = new JCheckBox("OpenGL hardware acceleration");
			chckbxOpenglHardwareAcceleration.setBackground(new Color(192, 192, 192));

			JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("WebEngine/Chromium rendering engine only.");
			lblNewLabel_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));

			JCheckBox chckbxShowhideAdvancedOptions = new JCheckBox("Show/hide advanced options");
			chckbxShowhideAdvancedOptions.setBackground(new Color(192, 192, 192));
			GroupLayout gl_panel_1_1 = new GroupLayout(panel_1_1);
			gl_panel_1_1.setHorizontalGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1_1
					.createSequentialGroup().addGap(10)
					.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1_1
							.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
							.addGap(16).addComponent(textArea).addContainerGap())
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 453, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_1_1.createSequentialGroup()
									.addComponent(txtrOpenaiOrganizationKey, GroupLayout.PREFERRED_SIZE,
											GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(1).addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
									.addContainerGap())
							.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 453, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_1_1.createSequentialGroup()
									.addComponent(lblApiEndpoint, GroupLayout.PREFERRED_SIZE, 104,
											GroupLayout.PREFERRED_SIZE)
									.addGap(16)
									.addComponent(textArea_1_1, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
									.addContainerGap())
							.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 453, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_1_1.createSequentialGroup()
									.addComponent(lblNumberOfNotepads, GroupLayout.PREFERRED_SIZE, 125,
											GroupLayout.PREFERRED_SIZE)
									.addGap(17)
									.addComponent(slider, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
									.addGap(10).addComponent(textArea_2, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
									.addContainerGap())
							.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 140,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 453,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(chckbxMinimizeToTray, GroupLayout.PREFERRED_SIZE, 201,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_1_2_1_1, GroupLayout.PREFERRED_SIZE, 453,
									GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_1_1.createSequentialGroup()
									.addComponent(lblRenderingEngine, GroupLayout.PREFERRED_SIZE, 104,
											GroupLayout.PREFERRED_SIZE)
									.addGap(16).addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 187,
											GroupLayout.PREFERRED_SIZE))
							.addComponent(lblNewLabel_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 453,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(chckbxOpenglHardwareAcceleration, GroupLayout.PREFERRED_SIZE, 225,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_1_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 453,
									GroupLayout.PREFERRED_SIZE)
							.addComponent(chckbxShowhideAdvancedOptions, GroupLayout.PREFERRED_SIZE, 225,
									GroupLayout.PREFERRED_SIZE))));
			gl_panel_1_1.setVerticalGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1_1
					.createSequentialGroup()
					.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_1_1.createSequentialGroup().addGap(11).addComponent(lblNewLabel))
							.addGroup(gl_panel_1_1.createSequentialGroup().addGap(6).addComponent(textArea,
									GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(8).addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
							.addComponent(txtrOpenaiOrganizationKey, GroupLayout.PREFERRED_SIZE,
									GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_1_1.createSequentialGroup().addGap(14).addComponent(textArea_1,
									GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_1_1.createSequentialGroup().addGap(20).addComponent(lblApiEndpoint))
							.addGroup(gl_panel_1_1.createSequentialGroup().addGap(11).addComponent(textArea_1_1,
									GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1_1
							.createSequentialGroup()
							.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_1_1.createSequentialGroup().addGap(5)
											.addComponent(lblNumberOfNotepads))
									.addGroup(gl_panel_1_1.createSequentialGroup().addGap(5).addComponent(slider,
											GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
							.addGap(18).addComponent(chckbxNewCheckBox))
							.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(7).addComponent(chckbxMinimizeToTray).addGap(7)
					.addComponent(lblNewLabel_1_2_1_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_1_1.createSequentialGroup().addGap(4).addComponent(lblRenderingEngine))
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addComponent(lblNewLabel_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(7).addComponent(chckbxOpenglHardwareAcceleration).addGap(7)
					.addComponent(lblNewLabel_1_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(7).addComponent(chckbxShowhideAdvancedOptions)));
			panel_1_1.setLayout(gl_panel_1_1);

			JPanel panel_2 = new JPanel();
			tabbedPane.addTab("LAYOUT", null, panel_2, null);

			JPanel panel_3 = new JPanel();
			tabbedPane.addTab("FILES AND ATTACHMENTS", null, panel_3, null);

			JPanel panel_4 = new JPanel();
			tabbedPane.addTab("CONTEXT", null, panel_4, null);

			JPanel panel_6 = new JPanel();
			tabbedPane.addTab("CONTEXT", null, panel_6, null);

			JPanel panel_5 = new JPanel();
			tabbedPane.addTab("MODELS", null, panel_5, null);

			JPanel panel_7 = new JPanel();
			tabbedPane.addTab("PROMPTS", null, panel_7, null);

			JPanel panel_8 = new JPanel();
			tabbedPane.addTab("IMAGES", null, panel_8, null);

			JPanel panel_9 = new JPanel();
			tabbedPane.addTab("VISION", null, panel_9, null);

			JPanel panel_10 = new JPanel();
			tabbedPane.addTab("INDEXES(LLAMA-INDEX)", null, panel_10, null);

			JPanel panel_11 = new JPanel();
			tabbedPane.addTab("AGENTS AND EXPERTS", null, panel_11, null);

			JPanel panel_12 = new JPanel();
			tabbedPane.addTab("ACCESSIBILITY", null, panel_12, null);

			JPanel panel_13 = new JPanel();
			tabbedPane.addTab("UPDATES", null, panel_13, null);

			JPanel panel_14 = new JPanel();
			tabbedPane.addTab("DEVELOPER", null, panel_14, null);
		}
	}
}
