package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;

public class QuanLySinhVien {

	private JFrame frmQuanLySinh;
	private JTextField tfStudentID;
	private JTextField tfFullName;
	private JTextField tfAge;
	private JTextField tfAddress;
	private JTextField tfClassID;
	private JTextField tfMaths;
	private JTextField tfPhysics;
	private JTextField tfChemistry;
	private JTextField tfAveScore;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLySinhVien window = new QuanLySinhVien();
					window.frmQuanLySinh.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuanLySinhVien() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuanLySinh = new JFrame();
		frmQuanLySinh.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmQuanLySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmQuanLySinh.setTitle("Quan ly sinh vien");
		frmQuanLySinh.setBounds(100, 100, 800, 700);
		frmQuanLySinh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuanLySinh.getContentPane().setLayout(null);
		
		JLabel lblStudentID = new JLabel("Student ID:");
		lblStudentID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStudentID.setBounds(25, 35, 139, 32);
		frmQuanLySinh.getContentPane().add(lblStudentID);
		
		JLabel lblFullName = new JLabel("Full name:");
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFullName.setBounds(25, 77, 139, 32);
		frmQuanLySinh.getContentPane().add(lblFullName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAge.setBounds(25, 119, 139, 32);
		frmQuanLySinh.getContentPane().add(lblAge);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddress.setBounds(25, 161, 139, 32);
		frmQuanLySinh.getContentPane().add(lblAddress);
		
		JLabel lblClassId = new JLabel("Class ID:");
		lblClassId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblClassId.setBounds(25, 206, 139, 32);
		frmQuanLySinh.getContentPane().add(lblClassId);
		
		JLabel lblMaths = new JLabel("Maths:");
		lblMaths.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMaths.setBounds(452, 35, 139, 32);
		frmQuanLySinh.getContentPane().add(lblMaths);
		
		JLabel lblPhysics = new JLabel("Physics:");
		lblPhysics.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPhysics.setBounds(452, 77, 139, 32);
		frmQuanLySinh.getContentPane().add(lblPhysics);
		
		JLabel lblChemistry = new JLabel("Chemistry:");
		lblChemistry.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblChemistry.setBounds(452, 119, 139, 32);
		frmQuanLySinh.getContentPane().add(lblChemistry);
		
		JLabel lblAve = new JLabel("Average score:");
		lblAve.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAve.setBounds(452, 161, 139, 32);
		frmQuanLySinh.getContentPane().add(lblAve);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGender.setBounds(452, 206, 139, 32);
		frmQuanLySinh.getContentPane().add(lblGender);
		
		tfStudentID = new JTextField();
		tfStudentID.setBounds(142, 35, 219, 32);
		frmQuanLySinh.getContentPane().add(tfStudentID);
		tfStudentID.setColumns(10);
		
		tfFullName = new JTextField();
		tfFullName.setColumns(10);
		tfFullName.setBounds(142, 77, 219, 32);
		frmQuanLySinh.getContentPane().add(tfFullName);
		
		tfAge = new JTextField();
		tfAge.setColumns(10);
		tfAge.setBounds(142, 119, 219, 32);
		frmQuanLySinh.getContentPane().add(tfAge);
		
		tfAddress = new JTextField();
		tfAddress.setColumns(10);
		tfAddress.setBounds(142, 161, 219, 32);
		frmQuanLySinh.getContentPane().add(tfAddress);
		
		tfClassID = new JTextField();
		tfClassID.setColumns(10);
		tfClassID.setBounds(142, 203, 219, 32);
		frmQuanLySinh.getContentPane().add(tfClassID);
		
		tfMaths = new JTextField();
		tfMaths.setBounds(601, 35, 118, 32);
		frmQuanLySinh.getContentPane().add(tfMaths);
		tfMaths.setColumns(10);
		
		tfPhysics = new JTextField();
		tfPhysics.setColumns(10);
		tfPhysics.setBounds(601, 77, 118, 32);
		frmQuanLySinh.getContentPane().add(tfPhysics);
		
		tfChemistry = new JTextField();
		tfChemistry.setColumns(10);
		tfChemistry.setBounds(601, 119, 118, 32);
		frmQuanLySinh.getContentPane().add(tfChemistry);
		
		tfAveScore = new JTextField();
		tfAveScore.setColumns(10);
		tfAveScore.setBounds(601, 161, 118, 32);
		frmQuanLySinh.getContentPane().add(tfAveScore);
		
		JButton btnView = new JButton("VIEW");
		btnView.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnView.setBounds(51, 283, 97, 52);
		frmQuanLySinh.getContentPane().add(btnView);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBounds(242, 283, 97, 52);
		frmQuanLySinh.getContentPane().add(btnSave);
		
		JButton btnFind = new JButton("FIND");
		btnFind.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFind.setBounds(622, 283, 97, 52);
		frmQuanLySinh.getContentPane().add(btnFind);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nu"}));
		comboBoxGender.setBounds(601, 215, 118, 21);
		frmQuanLySinh.getContentPane().add(comboBoxGender);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdd.setBounds(428, 283, 97, 52);
		frmQuanLySinh.getContentPane().add(btnAdd);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 351, 766, 302);
		frmQuanLySinh.getContentPane().add(panel);
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
