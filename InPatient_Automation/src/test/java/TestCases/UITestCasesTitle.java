package TestCases;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import com.fasterxml.jackson.core.json.JsonReadContext;

import CMO_Admit_Patient.CMO_Admit_and_Register_Patient;
import CMO_Bed_Availability.Bed_Availability_in_different_bed_classes;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class UITestCasesTitle {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UITestCasesTitle window = new UITestCasesTitle();
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
	public UITestCasesTitle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 839, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		final JRadioButton rdbtnNewRadioButton = new JRadioButton("OP Doctor Refer Patient to Admission");
		rdbtnNewRadioButton.setBounds(0, 33, 350, 16);
		frame.getContentPane().add(rdbtnNewRadioButton);

		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("CMO navigate to login EM");
		rdbtnNewRadioButton_1.setBounds(0, 52, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);

		final JRadioButton rdbtnNewRadioButton_2 = new JRadioButton(
				"CMO verify Bed Availability in different Bed Classes");
		rdbtnNewRadioButton_2.setBounds(0, 78, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);

		final JRadioButton rdbtnNewRadioButton_3 = new JRadioButton(
				"CMO verify Bed Availability in different Bed Types");
		rdbtnNewRadioButton_3.setBounds(0, 104, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);

		final JRadioButton rdbtnNewRadioButton_4 = new JRadioButton(
				"CMO verify Bed Availability in different Nursing Units");
		rdbtnNewRadioButton_4.setBounds(0, 130, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);

		final JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("CMO Admit and Register Patient validation");
		rdbtnNewRadioButton_5.setBounds(0, 156, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);

		final JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("CMO Admit Referrral Patient");
		rdbtnNewRadioButton_7.setBounds(0, 179, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_7);

		final JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("CMO Admit and Register Patient");
		rdbtnNewRadioButton_8.setBounds(0, 205, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_8);

		final JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Accountant Can Place Panel Order");
		rdbtnNewRadioButton_9.setBounds(0, 231, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9);

		final JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("CMOient Arrival");
		rdbtnNewRadioButton_10.setBounds(0, 231, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10);

		JButton btnNewButton = new JButton("Run");
		btnNewButton.setBounds(724, 438, 89, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (rdbtnNewRadioButton.isSelected()) {

					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_002_003_004.class });
					testng.addListener(tla);
					testng.run();

				} else if (rdbtnNewRadioButton_1.isSelected()) {

					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_007.class });
					testng.addListener(tla);
					testng.run();

				} else if (rdbtnNewRadioButton_2.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_013_030_031_036_051.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_3.isSelected()) {

					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_014.class });
					testng.addListener(tla);
					testng.run();

				} else if (rdbtnNewRadioButton_4.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_015_018_020_025_026.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_5.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] {
							IP_TC_053_054_055_056_059_061_070_071_073_074_077_079_081_083_093_094_095_098_099_100_102_110_119_122_127_129.class });
					testng.addListener(tla);
					testng.run();

				} else if (rdbtnNewRadioButton_7.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_139.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_8.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_140.class });
					testng.addListener(tla);
					testng.run();

				} else if (rdbtnNewRadioButton_9.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_879.class });
					testng.addListener(tla);
					testng.run();

				} else if (rdbtnNewRadioButton_10.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_001.class });
					testng.addListener(tla);
					testng.run();

				}
			}
		});

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_3);
		bg.add(rdbtnNewRadioButton_4);
		bg.add(rdbtnNewRadioButton_5);
		bg.add(rdbtnNewRadioButton_7);
		bg.add(rdbtnNewRadioButton_8);
		bg.add(rdbtnNewRadioButton_9);

	}

}
