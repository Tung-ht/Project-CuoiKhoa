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
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class QuanLySinhVien {

	private JFrame frmQuanLySinhVien;
	private JTextField tfStudentID;
	private JTextField tfFullName;
	private JTextField tfAge;
	private JTextField tfAddress;
	private JTextField tfClassID;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLySinhVien window = new QuanLySinhVien();
					window.frmQuanLySinhVien.setVisible(true);
					window.frmQuanLySinhVien.setLocationRelativeTo(null);
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
		frmQuanLySinhVien = new JFrame();
		frmQuanLySinhVien.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmQuanLySinhVien.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frmQuanLySinhVien.setTitle("Quan ly sinh vien");
		frmQuanLySinhVien.setBounds(100, 100, 800, 520);
		frmQuanLySinhVien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuanLySinhVien.getContentPane().setLayout(null);
		
		JLabel lblStudentID = new JLabel("Student ID:");
		lblStudentID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStudentID.setBounds(25, 35, 139, 32);
		frmQuanLySinhVien.getContentPane().add(lblStudentID);
		
		JLabel lblFullName = new JLabel("Full name:");
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFullName.setBounds(25, 77, 139, 32);
		frmQuanLySinhVien.getContentPane().add(lblFullName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAge.setBounds(428, 35, 139, 32);
		frmQuanLySinhVien.getContentPane().add(lblAge);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddress.setBounds(428, 77, 139, 32);
		frmQuanLySinhVien.getContentPane().add(lblAddress);
		
		JLabel lblClassId = new JLabel("Class ID:");
		lblClassId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblClassId.setBounds(25, 122, 139, 32);
		frmQuanLySinhVien.getContentPane().add(lblClassId);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGender.setBounds(428, 119, 139, 32);
		frmQuanLySinhVien.getContentPane().add(lblGender);
		
		tfStudentID = new JTextField();
		tfStudentID.setForeground(Color.LIGHT_GRAY);
		tfStudentID.setBounds(142, 35, 219, 32);
		frmQuanLySinhVien.getContentPane().add(tfStudentID);
		tfStudentID.setColumns(10);
		
		tfFullName = new JTextField();
		tfFullName.setColumns(10);
		tfFullName.setBounds(142, 77, 219, 32);
		frmQuanLySinhVien.getContentPane().add(tfFullName);
		
		tfAge = new JTextField();
		tfAge.setColumns(10);
		tfAge.setBounds(545, 35, 219, 32);
		frmQuanLySinhVien.getContentPane().add(tfAge);
		
		tfAddress = new JTextField();
		tfAddress.setColumns(10);
		tfAddress.setBounds(545, 77, 219, 32);
		frmQuanLySinhVien.getContentPane().add(tfAddress);
		
		tfClassID = new JTextField();
		tfClassID.setColumns(10);
		tfClassID.setBounds(142, 119, 219, 32);
		frmQuanLySinhVien.getContentPane().add(tfClassID);
		
		JButton btnView = new JButton("VIEW");
		btnView.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnView.setBounds(51, 186, 97, 52);
		frmQuanLySinhVien.getContentPane().add(btnView);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSave.setBounds(242, 186, 97, 52);
		frmQuanLySinhVien.getContentPane().add(btnSave);
		
		JButton btnFind = new JButton("FIND");
		btnFind.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnFind.setBounds(622, 186, 97, 52);
		frmQuanLySinhVien.getContentPane().add(btnFind);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nu"}));
		comboBoxGender.setBounds(545, 119, 63, 29);
		frmQuanLySinhVien.getContentPane().add(comboBoxGender);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdd.setBounds(428, 186, 97, 52);
		frmQuanLySinhVien.getContentPane().add(btnAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 272, 766, 201);
		frmQuanLySinhVien.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"No.", "Student ID", "Fullname", "Age", "Gender", "Address", "Class ID"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
	}
}
