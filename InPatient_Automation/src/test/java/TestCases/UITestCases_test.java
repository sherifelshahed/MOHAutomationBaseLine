package TestCases;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class UITestCases_test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UITestCases_test window = new UITestCases_test();
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
	public UITestCases_test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 400, 1539, 711);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Doctor Refer to Admission");
		rdbtnNewRadioButton.setBounds(0, 33, 350, 16);
		frame.getContentPane().add(rdbtnNewRadioButton);

		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("CMO login EM");
		rdbtnNewRadioButton_1.setBounds(0, 52, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);

		final JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("CMO Verify Bed Availability by bed classes");
		rdbtnNewRadioButton_2.setBounds(0, 78, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);

		final JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("CMO Verify Bed Availability by bed types");
		rdbtnNewRadioButton_3.setBounds(0, 104, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);

		final JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("CMO Verify Bed Availability by Nursing Units");
		rdbtnNewRadioButton_4.setBounds(0, 130, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);

		final JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("CMO Verify Fields of Admit and Register Patient");
		rdbtnNewRadioButton_5.setBounds(0, 156, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);

		final JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Doctor OutPatient Submit OP Consultation Form");
		rdbtnNewRadioButton_6.setBounds(0, 7, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_6);

		final JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("CMO Admit Referrral Patient");
		rdbtnNewRadioButton_7.setBounds(0, 179, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_7);

		final JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("CMO Admit and Register Patient");
		rdbtnNewRadioButton_8.setBounds(0, 205, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_8);

		final JRadioButton rdbtnNewRadioButton_9_1 = new JRadioButton("CMO Cancel Admission");
		rdbtnNewRadioButton_9_1.setBounds(0, 649, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1);

		final JRadioButton rdbtnNewRadioButton_9_1_1 = new JRadioButton("CMO Verify Fields of Assign Bed");
		rdbtnNewRadioButton_9_1_1.setBounds(355, 33, 250, 16);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_1);

		final JRadioButton rdbtnNewRadioButton_9_1_2 = new JRadioButton("CMO Assign Bed Mark Patient Arrival");
		rdbtnNewRadioButton_9_1_2.setBounds(355, 52, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_2);

		final JRadioButton rdbtnNewRadioButton_9_1_3 = new JRadioButton("CMO Discharge Patient");
		rdbtnNewRadioButton_9_1_3.setBounds(355, 78, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_3);

		final JRadioButton rdbtnNewRadioButton_9_1_4 = new JRadioButton("Full Scenario Discharge Process");
		rdbtnNewRadioButton_9_1_4.setBounds(355, 104, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_4);

		final JRadioButton rdbtnNewRadioButton_9_1_5 = new JRadioButton("Doctor Place Panel Order");
		rdbtnNewRadioButton_9_1_5.setBounds(355, 130, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_5);

		final JRadioButton rdbtnNewRadioButton_9_1_5_1 = new JRadioButton("CMO Check Panel Order for Patient");
		rdbtnNewRadioButton_9_1_5_1.setBounds(355, 156, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_5_1);

		final JRadioButton rdbtnNewRadioButton_9_1_5_1_1 = new JRadioButton("CMO Generate Bill");
		rdbtnNewRadioButton_9_1_5_1_1.setBounds(355, 179, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_5_1_1);

		final JRadioButton rdbtnNewRadioButton_9_1_5_1_2 = new JRadioButton("CMO Create Consultation Visit");
		rdbtnNewRadioButton_9_1_5_1_2.setBounds(355, 205, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_5_1_2);

		final JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Lab Technician Register Lab Order");
		rdbtnNewRadioButton_10.setBounds(355, 7, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10);

		final JRadioButton rdbtnNewRadioButton_10_1 = new JRadioButton("Rad Technician Register Rad Order");
		rdbtnNewRadioButton_10_1.setBounds(355, 33, 250, 16);
		frame.getContentPane().add(rdbtnNewRadioButton_10_1);

		final JRadioButton rdbtnNewRadioButton_10_2 = new JRadioButton(
				"CMO Check Panel Order for Patient Genrate Bill");
		rdbtnNewRadioButton_10_2.setBounds(355, 52, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2);

		final JRadioButton rdbtnNewRadioButton_10_2_1 = new JRadioButton("Nurse View Patient list");
		rdbtnNewRadioButton_10_2_1.setBounds(355, 78, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2_1);

		final JRadioButton rdbtnNewRadioButton_10_2_1_1 = new JRadioButton("Nurse Upload Document");
		rdbtnNewRadioButton_10_2_1_1.setBounds(355, 104, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2_1_1);

		final JRadioButton rdbtnNewRadioButton_10_2_1_1_1 = new JRadioButton(
				"Nurse Check Intra Ward Patient Transfer UI");
		rdbtnNewRadioButton_10_2_1_1_1.setBounds(355, 130, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2_1_1_1);

		final JRadioButton rdbtnNewRadioButton_10_2_1_1_1_1 = new JRadioButton(
				"Nurse Search Intra Ward Transfer by Nursing Unit");
		rdbtnNewRadioButton_10_2_1_1_1_1.setBounds(355, 156, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2_1_1_1_1);

		final JRadioButton rdbtnNewRadioButton_10_2_1_1_1_1_1 = new JRadioButton(
				"Nurse Search Intra Ward Transfer by Patient ID");
		rdbtnNewRadioButton_10_2_1_1_1_1_1.setBounds(355, 179, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2_1_1_1_1_1);

		final JRadioButton rdbtnNewRadioButton_10_2_1_1_1_1_1_1 = new JRadioButton(
				"Nurse Search Intra Ward Transfer by Specialty");
		rdbtnNewRadioButton_10_2_1_1_1_1_1_1.setBounds(355, 205, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2_1_1_1_1_1_1);

		final JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Nurse Search Intra Ward Transfer by Encounter ID");
		rdbtnNewRadioButton_9.setBounds(0, 231, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9);

		final JRadioButton rdbtnNewRadioButton_9_2 = new JRadioButton(
				"Nurse Search Intra Ward Transfer by Admission Date");
		rdbtnNewRadioButton_9_2.setBounds(0, 259, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_2);

		final JRadioButton rdbtnNewRadioButton_9_3 = new JRadioButton(
				"Nurse Search Intra Ward Transfer by Practitioner");
		rdbtnNewRadioButton_9_3.setBounds(0, 285, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_3);

		final JRadioButton rdbtnNewRadioButton_9_4 = new JRadioButton(
				"Nurse Transfer Patients Within The Same Nursing Unit");
		rdbtnNewRadioButton_9_4.setBounds(0, 311, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_4);

		final JRadioButton rdbtnNewRadioButton_9_5 = new JRadioButton("Nurse Check Transfer Patient Out UI");
		rdbtnNewRadioButton_9_5.setBounds(0, 337, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_5);

		final JRadioButton rdbtnNewRadioButton_9_6 = new JRadioButton(
				"Nurse Transfer Patients To Another nursing unit");
		rdbtnNewRadioButton_9_6.setBounds(0, 363, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_6);

		final JRadioButton rdbtnNewRadioButton_9_7 = new JRadioButton("Nurse Check Block Bed UI");
		rdbtnNewRadioButton_9_7.setBounds(0, 389, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_7);

		final JRadioButton rdbtnNewRadioButton_9_8 = new JRadioButton("Nurse Check Block Bed with all data required");
		rdbtnNewRadioButton_9_8.setBounds(0, 415, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_8);

		final JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("Nurse Check Unblock Bed UI");
		rdbtnNewRadioButton_11.setBounds(0, 441, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_11);

		final JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Nurse Release Blocked Bed");
		rdbtnNewRadioButton_12.setBounds(0, 467, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_12);

		final JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("Nurse View Clinical Profile");
		rdbtnNewRadioButton_13.setBounds(650, 493, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_13);

		final JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("Nurse View Patient Vitals");
		rdbtnNewRadioButton_14.setBounds(650, 30, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_14);

		final JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("Nurse View Reports");
		rdbtnNewRadioButton_15.setBounds(650, 78, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_15);

		final JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("Nurse View medications");
		rdbtnNewRadioButton_16.setBounds(650, 205, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_16);

		final JRadioButton rdbtnNewRadioButton_17 = new JRadioButton("Nurse View Recent Order");
		rdbtnNewRadioButton_17.setBounds(0, 597, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_17);

		final JRadioButton rdbtnNewRadioButton_18 = new JRadioButton("Nurse Submit Pain Assessment");
		rdbtnNewRadioButton_18.setBounds(0, 623, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_18);

		final JRadioButton rdbtnNewRadioButton_19 = new JRadioButton("Nurse Place Order");
		rdbtnNewRadioButton_19.setBounds(355, 231, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_19);

		final JRadioButton rdbtnNewRadioButton_20 = new JRadioButton("Nurse Submit after save as draft Order");
		rdbtnNewRadioButton_20.setBounds(355, 259, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_20);

		final JRadioButton rdbtnNewRadioButton_21 = new JRadioButton("Doctor Approve Order");
		rdbtnNewRadioButton_21.setBounds(355, 285, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_21);

		final JRadioButton rdbtnNewRadioButton_22 = new JRadioButton("Nurse Transfer Practitioner");
		rdbtnNewRadioButton_22.setBounds(355, 311, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_22);

		final JRadioButton rdbtnNewRadioButton_23 = new JRadioButton("Nurse Transfer Bulk practitioner");
		rdbtnNewRadioButton_23.setBounds(355, 337, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_23);

		final JRadioButton rdbtnNewRadioButton_24 = new JRadioButton("Nurse Prepare Discharge Advice UI");
		rdbtnNewRadioButton_24.setBounds(355, 363, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_24);

		final JRadioButton rdbtnNewRadioButton_25 = new JRadioButton("Nurse Prepare Discharge Advice");
		rdbtnNewRadioButton_25.setBounds(355, 389, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_25);

		final JRadioButton rdbtnNewRadioButton_26 = new JRadioButton("Nurse Cancel Discharge Advice UI");
		rdbtnNewRadioButton_26.setBounds(355, 415, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_26);

		final JRadioButton rdbtnNewRadioButton_27 = new JRadioButton("Nurse Cancel Discharge Advice Form UI");
		rdbtnNewRadioButton_27.setBounds(355, 441, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_27);

		final JRadioButton rdbtnNewRadioButton_28 = new JRadioButton("Nurse Cancel Discharge Advice");
		rdbtnNewRadioButton_28.setBounds(355, 467, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_28);

		final JRadioButton rdbtnNewRadioButton_29 = new JRadioButton("Nurse Newborn Registration for Inpatient UI");
		rdbtnNewRadioButton_29.setBounds(355, 493, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_29);

		final JRadioButton rdbtnNewRadioButton_30 = new JRadioButton(
				"Nurse Newborn Registration for Inpatient form UI");
		rdbtnNewRadioButton_30.setBounds(355, 493, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_30);

		final JRadioButton rdbtnNewRadioButton_31 = new JRadioButton("Nurse Record Administer Medication");
		rdbtnNewRadioButton_31.setBounds(355, 519, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_31);

		final JRadioButton rdbtnNewRadioButton_32 = new JRadioButton("Nurse View MAR Chart");
		rdbtnNewRadioButton_32.setBounds(355, 545, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_32);

		final JRadioButton rdbtnNewRadioButton_33 = new JRadioButton("Nurse Record Stock Consumption");
		rdbtnNewRadioButton_33.setBounds(355, 571, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_33);

		final JRadioButton rdbtnNewRadioButton_34 = new JRadioButton("Doctor Place Lab Order");
		rdbtnNewRadioButton_34.setBounds(355, 597, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_34);

		final JRadioButton rdbtnNewRadioButton_35 = new JRadioButton("Doctor Place Rad Order");
		rdbtnNewRadioButton_35.setBounds(355, 623, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_35);

		final JRadioButton rdbtnNewRadioButton_36 = new JRadioButton("Nurse Dispense Medication");
		rdbtnNewRadioButton_36.setBounds(355, 649, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_36);

		final JRadioButton rdbtnNewRadioButton_37 = new JRadioButton("Doctor View Reports");
		rdbtnNewRadioButton_37.setBounds(355, 675, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_37);

		final JRadioButton rdbtnNewRadioButton_38 = new JRadioButton("Nurse Check Dispense Medication UI");
		rdbtnNewRadioButton_38.setBounds(650, 519, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_38);

		final JRadioButton rdbtnNewRadioButton_39 = new JRadioButton("Nurse Change Password");
		rdbtnNewRadioButton_39.setBounds(0, 678, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_39);

		final JRadioButton rdbtnNewRadioButton_40 = new JRadioButton("Doctor Prescribe Medications");
		rdbtnNewRadioButton_40.setBounds(355, 337, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_40);

		final JRadioButton rdbtnNewRadioButton_41 = new JRadioButton("Doctor login HP");
		rdbtnNewRadioButton_41.setBounds(650, 441, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_41);

		final JRadioButton rdbtnNewRadioButton_42 = new JRadioButton("Doctor Submit Progress Notes");
		rdbtnNewRadioButton_42.setBounds(650, 467, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_42);

		final JRadioButton rdbtnNewRadioButton_43 = new JRadioButton(
				"Doctor Submit after save as draft Progress Notes");
		rdbtnNewRadioButton_43.setBounds(0, 493, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_43);

		final JRadioButton rdbtnNewRadioButton_44 = new JRadioButton("Doctor Reject Order");
		rdbtnNewRadioButton_44.setBounds(650, 7, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_44);

		final JRadioButton rdbtnNewRadioButton_45 = new JRadioButton("Doctor InPatient Submit OP Consultation Form");
		rdbtnNewRadioButton_45.setBounds(0, 519, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_45);

		final JRadioButton rdbtnNewRadioButton_46 = new JRadioButton("Doctor Submit Operation Note");
		rdbtnNewRadioButton_46.setBounds(650, 52, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_46);

		final JRadioButton rdbtnNewRadioButton_47 = new JRadioButton(
				"Doctor Submit after save as draft Operation Note");
		rdbtnNewRadioButton_47.setBounds(0, 545, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_47);

		final JRadioButton rdbtnNewRadioButton_48 = new JRadioButton("Doctor Refer to Admission");
		rdbtnNewRadioButton_48.setBounds(650, 104, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_48);

		final JRadioButton rdbtnNewRadioButton_49 = new JRadioButton("Doctor Initiate Discharge");
		rdbtnNewRadioButton_49.setBounds(650, 130, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_49);

		final JRadioButton rdbtnNewRadioButton_50 = new JRadioButton("Doctor Cancel Initiate Discharge");
		rdbtnNewRadioButton_50.setBounds(650, 156, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_50);

		final JRadioButton rdbtnNewRadioButton_51 = new JRadioButton("Doctor Discharge Summary");
		rdbtnNewRadioButton_51.setBounds(650, 179, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_51);

		final JRadioButton rdbtnNewRadioButton_52 = new JRadioButton(
				"Doctor Submit after save as draft Discharge Summary");
		rdbtnNewRadioButton_52.setBounds(0, 571, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_52);

		final JRadioButton rdbtnNewRadioButton_53 = new JRadioButton("Doctor Change Password");
		rdbtnNewRadioButton_53.setBounds(650, 231, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_53);

		final JRadioButton rdbtnNewRadioButton_54 = new JRadioButton("Doctor Place Order");
		rdbtnNewRadioButton_54.setBounds(650, 259, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_54);

		final JRadioButton rdbtnNewRadioButton_55 = new JRadioButton("Doctor Cancel Order");
		rdbtnNewRadioButton_55.setBounds(650, 285, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_55);

		final JRadioButton rdbtnNewRadioButton_56 = new JRadioButton("Doctor view Clinical Profile");
		rdbtnNewRadioButton_56.setBounds(650, 311, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_56);

		final JRadioButton rdbtnNewRadioButton_57 = new JRadioButton("Doctor View Reports");
		rdbtnNewRadioButton_57.setBounds(650, 337, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_57);

		final JRadioButton rdbtnNewRadioButton_58 = new JRadioButton("Doctor view Medications");
		rdbtnNewRadioButton_58.setBounds(650, 363, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_58);

		final JRadioButton rdbtnNewRadioButton_59 = new JRadioButton("Doctor View Visit Summary");
		rdbtnNewRadioButton_59.setBounds(650, 389, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_59);

		final JRadioButton rdbtnNewRadioButton_60 = new JRadioButton("Doctor View Patient list");
		rdbtnNewRadioButton_60.setBounds(650, 415, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_60);

		final JRadioButton rdbtnNewRadioButton_61 = new JRadioButton("Pharmacist Stock Item Consumption");
		rdbtnNewRadioButton_61.setBounds(911, 7, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_61);

		final JRadioButton rdbtnNewRadioButton_62 = new JRadioButton(
				"Pharmacist Verify Transfer Stock Across Facilities");
		rdbtnNewRadioButton_62.setBounds(911, 30, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_62);

		final JRadioButton rdbtnNewRadioButton_63 = new JRadioButton("Pharmacist Issues Return Across Facilities");
		rdbtnNewRadioButton_63.setBounds(911, 56, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_63);

		final JRadioButton rdbtnNewRadioButton_64 = new JRadioButton("Pharmacist Scrappes Medicine");
		rdbtnNewRadioButton_64.setBounds(911, 78, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_64);

		final JRadioButton rdbtnNewRadioButton_65 = new JRadioButton("Pharmacist Accept Return Medication");
		rdbtnNewRadioButton_65.setBounds(911, 104, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_65);

		final JRadioButton rdbtnNewRadioButton_66 = new JRadioButton("Pharmacist Reject Return Medication");
		rdbtnNewRadioButton_66.setBounds(911, 130, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_66);

		final JRadioButton rdbtnNewRadioButton_67 = new JRadioButton(
				"Pharmacist Dispense Medication Verification Step");
		rdbtnNewRadioButton_67.setBounds(911, 156, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_67);

		final JRadioButton rdbtnNewRadioButton_68 = new JRadioButton("Pharmacist Dispense Medication Fill Step");
		rdbtnNewRadioButton_68.setBounds(911, 179, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_68);

		final JRadioButton rdbtnNewRadioButton_69 = new JRadioButton("Pharmacist Dispense Medication Deliver Step");
		rdbtnNewRadioButton_69.setBounds(911, 205, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_69);

		final JRadioButton rdbtnNewRadioButton_70 = new JRadioButton(
				"Pharmacist View Stock Availability of Medications");
		rdbtnNewRadioButton_70.setBounds(911, 231, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_70);

		final JRadioButton rdbtnNewRadioButton_71 = new JRadioButton("Nurse Receive Patient From Another Nursing Unit");
		rdbtnNewRadioButton_71.setBounds(911, 259, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_71);

		final JRadioButton rdbtnNewRadioButton_72 = new JRadioButton("CMO Add Separate Service");
		rdbtnNewRadioButton_72.setBounds(650, 571, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_72);

		final JRadioButton rdbtnNewRadioButton_73 = new JRadioButton("CMO Place Panel Order");
		rdbtnNewRadioButton_73.setBounds(650, 597, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_73);

		final JRadioButton rdbtnNewRadioButton_74 = new JRadioButton("CMO Cancel Service");
		rdbtnNewRadioButton_74.setBounds(650, 623, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_74);

		final JRadioButton rdbtnNewRadioButton_75 = new JRadioButton("CMO Cancel Panel Order");
		rdbtnNewRadioButton_75.setBounds(650, 649, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_75);

		final JRadioButton rdbtnNewRadioButton_76 = new JRadioButton("CMO Cancel Discharge From Nurse Unit");
		rdbtnNewRadioButton_76.setBounds(911, 285, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_76);

		final JRadioButton rdbtnNewRadioButton_77 = new JRadioButton("Nurse Check Ward Occupancy");
		rdbtnNewRadioButton_77.setBounds(650, 545, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_77);

		final JRadioButton rdbtnNewRadioButton_78 = new JRadioButton("Nurse Register NewBorn to Admitted Mother");
		rdbtnNewRadioButton_78.setBounds(911, 311, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_78);

		final JRadioButton rdbtnNewRadioButton_79 = new JRadioButton("Pharmacist Create Review Request");
		rdbtnNewRadioButton_79.setBounds(911, 337, 350, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_79);
//
		final JRadioButton rdbtnNewRadioButton_80 = new JRadioButton("Pharmacist Cancel Request");
		rdbtnNewRadioButton_80.setBounds(911, 363, 250, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_80);

		final JRadioButton rdbtnNewRadioButton_81 = new JRadioButton("GroupA_01");
		rdbtnNewRadioButton_81.setBounds(911, 389, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_81);

		final JRadioButton rdbtnNewRadioButton_82 = new JRadioButton("GroupA_02");
		rdbtnNewRadioButton_82.setBounds(911, 415, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_82);

		final JRadioButton rdbtnNewRadioButton_83 = new JRadioButton("GroupC");
		rdbtnNewRadioButton_83.setBounds(911, 441, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_83);

		final JRadioButton rdbtnNewRadioButton_84 = new JRadioButton("GroupF");
		rdbtnNewRadioButton_84.setBounds(911, 467, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_84);

		final JRadioButton rdbtnNewRadioButton_85 = new JRadioButton("GroupHP_01");
		rdbtnNewRadioButton_85.setBounds(911, 493, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_85);

		final JRadioButton rdbtnNewRadioButton_86 = new JRadioButton("GroupHP_02");
		rdbtnNewRadioButton_86.setBounds(911, 519, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_86);

		final JRadioButton rdbtnNewRadioButton_87 = new JRadioButton("GroupL");
		rdbtnNewRadioButton_87.setBounds(911, 545, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_87);

		final JRadioButton rdbtnNewRadioButton_88 = new JRadioButton("GroupM");
		rdbtnNewRadioButton_88.setBackground(SystemColor.menu);
		rdbtnNewRadioButton_88.setBounds(911, 571, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_88);

		JButton btnNewButton = new JButton("Run");
		btnNewButton.setBounds(1260, 670, 89, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton_6.isSelected()) {

					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_001.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton.isSelected()) {

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
				} else if (rdbtnNewRadioButton_9_1.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_141_149_153_156_172_187.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_1_1.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_188_197_218.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_1_2.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_270.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_1_3.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_278_287_309.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_1_4.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_351.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_1_5.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_409_790_877_790.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_1_5_1.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_410.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_1_5_1_1.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_446.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_1_5_1_2.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_519.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_10.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_520.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_10_1.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_522.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_10_2.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_524.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_10_2_1.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_546.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_10_2_1_1.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_570.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_10_2_1_1_1.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_577.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_10_2_1_1_1_1.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_578.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_10_2_1_1_1_1_1.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_579.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_10_2_1_1_1_1_1_1.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_580.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_581.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_2.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_582.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_3.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_583.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_4.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_584.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_5.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_591.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_6.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_598.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_7.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_605.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_9_8.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_606.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_11.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_615.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_12.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_616.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_13.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_619.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_14.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_620_624_625.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_15.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_621.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_16.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_622.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_17.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_623.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_18.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_626.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_19.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_627_628_630.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_20.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_631.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_21.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_633_751_752_753.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_22.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_634.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_23.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_635.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_24.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_643.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_25.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_644.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_26.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_654.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_27.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_661.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_28.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_662.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_29.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_664.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_30.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_671.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_31.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_685.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_32.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_687.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_33.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_689.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_34.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_693.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_35.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_694.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_36.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_696_701.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_37.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_697.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_38.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_700.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_39.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_707_742.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_40.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_714.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_41.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_715.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_42.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_721.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_43.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_722_723.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_44.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_724_754.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_45.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_725_726_727_728_729_730_755.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_46.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_733.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_47.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_734_735_736_737.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_48.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_756_762_765.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_49.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_766.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_50.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_767.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_51.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_770.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_52.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_772_773.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_53.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_779_780.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_54.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_788.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_55.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_789.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_56.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_791_792.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_57.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_793.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_58.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_794.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_59.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_795.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_60.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_796.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_61.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_836.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_62.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_837.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_63.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_838.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_64.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_839.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_65.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_840.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_66.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_841.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_67.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_842.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_68.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_843.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_69.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_845.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_70.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_846.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_71.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_847.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_72.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_878.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_73.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_879.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_74.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_880.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_75.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_881.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_76.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_882.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_77.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_883.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_78.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_884.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_79.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_886.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_80.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { IP_TC_887.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_81.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { GroupA_01.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_82.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { GroupA_02.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_83.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { GroupC.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_84.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { GroupF.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_85.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { GroupHP_01.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_86.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { GroupHP_02.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_87.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { GroupL.class });
					testng.addListener(tla);
					testng.run();
				} else if (rdbtnNewRadioButton_88.isSelected()) {
					TestListenerAdapter tla = new TestListenerAdapter();
					TestNG testng = new TestNG();
					testng.setTestClasses(new Class[] { GroupM.class });
					testng.addListener(tla);
					testng.run();

				}
			}
		});

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_6);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_3);
		bg.add(rdbtnNewRadioButton_4);
		bg.add(rdbtnNewRadioButton_5);
		bg.add(rdbtnNewRadioButton_7);
		bg.add(rdbtnNewRadioButton_8);
		bg.add(rdbtnNewRadioButton_9_1);
		bg.add(rdbtnNewRadioButton_9_1_1);
		bg.add(rdbtnNewRadioButton_9_1_2);
		bg.add(rdbtnNewRadioButton_9_1_3);
		bg.add(rdbtnNewRadioButton_9_1_4);
		bg.add(rdbtnNewRadioButton_9_1_5);
		bg.add(rdbtnNewRadioButton_9_1_5_1);
		bg.add(rdbtnNewRadioButton_9_1_5_1_1);
		bg.add(rdbtnNewRadioButton_9_1_5_1_2);
		bg.add(rdbtnNewRadioButton_10);
		bg.add(rdbtnNewRadioButton_10_1);
		bg.add(rdbtnNewRadioButton_10_2);
		bg.add(rdbtnNewRadioButton_10_2_1);
		bg.add(rdbtnNewRadioButton_10_2_1_1);
		bg.add(rdbtnNewRadioButton_10_2_1_1_1);
		bg.add(rdbtnNewRadioButton_10_2_1_1_1_1);
		bg.add(rdbtnNewRadioButton_10_2_1_1_1_1_1);
		bg.add(rdbtnNewRadioButton_10_2_1_1_1_1_1_1);
		bg.add(rdbtnNewRadioButton_9);
		bg.add(rdbtnNewRadioButton_9_2);
		bg.add(rdbtnNewRadioButton_9_3);
		bg.add(rdbtnNewRadioButton_9_4);
		bg.add(rdbtnNewRadioButton_9_5);
		bg.add(rdbtnNewRadioButton_9_6);
		bg.add(rdbtnNewRadioButton_9_7);
		bg.add(rdbtnNewRadioButton_9_8);
		bg.add(rdbtnNewRadioButton_11);
		bg.add(rdbtnNewRadioButton_12);
		bg.add(rdbtnNewRadioButton_13);
		bg.add(rdbtnNewRadioButton_14);
		bg.add(rdbtnNewRadioButton_15);
		bg.add(rdbtnNewRadioButton_16);
		bg.add(rdbtnNewRadioButton_17);
		bg.add(rdbtnNewRadioButton_18);
		bg.add(rdbtnNewRadioButton_19);
		bg.add(rdbtnNewRadioButton_20);
		bg.add(rdbtnNewRadioButton_21);
		bg.add(rdbtnNewRadioButton_22);
		bg.add(rdbtnNewRadioButton_23);
		bg.add(rdbtnNewRadioButton_24);
		bg.add(rdbtnNewRadioButton_25);
		bg.add(rdbtnNewRadioButton_26);
		bg.add(rdbtnNewRadioButton_27);
		bg.add(rdbtnNewRadioButton_28);
		bg.add(rdbtnNewRadioButton_29);
		bg.add(rdbtnNewRadioButton_30);
		bg.add(rdbtnNewRadioButton_31);
		bg.add(rdbtnNewRadioButton_32);
		bg.add(rdbtnNewRadioButton_33);
		bg.add(rdbtnNewRadioButton_34);
		bg.add(rdbtnNewRadioButton_35);
		bg.add(rdbtnNewRadioButton_36);
		bg.add(rdbtnNewRadioButton_37);
		bg.add(rdbtnNewRadioButton_38);
		bg.add(rdbtnNewRadioButton_39);
		bg.add(rdbtnNewRadioButton_40);
		bg.add(rdbtnNewRadioButton_41);
		bg.add(rdbtnNewRadioButton_42);
		bg.add(rdbtnNewRadioButton_43);
		bg.add(rdbtnNewRadioButton_44);
		bg.add(rdbtnNewRadioButton_45);
		bg.add(rdbtnNewRadioButton_46);
		bg.add(rdbtnNewRadioButton_47);
		bg.add(rdbtnNewRadioButton_48);
		bg.add(rdbtnNewRadioButton_49);
		bg.add(rdbtnNewRadioButton_50);
		bg.add(rdbtnNewRadioButton_51);
		bg.add(rdbtnNewRadioButton_52);
		bg.add(rdbtnNewRadioButton_53);
		bg.add(rdbtnNewRadioButton_54);
		bg.add(rdbtnNewRadioButton_55);
		bg.add(rdbtnNewRadioButton_56);
		bg.add(rdbtnNewRadioButton_57);
		bg.add(rdbtnNewRadioButton_58);
		bg.add(rdbtnNewRadioButton_59);
		bg.add(rdbtnNewRadioButton_60);
		bg.add(rdbtnNewRadioButton_61);
		bg.add(rdbtnNewRadioButton_62);
		bg.add(rdbtnNewRadioButton_63);
		bg.add(rdbtnNewRadioButton_64);
		bg.add(rdbtnNewRadioButton_65);
		bg.add(rdbtnNewRadioButton_66);
		bg.add(rdbtnNewRadioButton_67);
		bg.add(rdbtnNewRadioButton_68);
		bg.add(rdbtnNewRadioButton_69);
		bg.add(rdbtnNewRadioButton_70);
		bg.add(rdbtnNewRadioButton_71);
		bg.add(rdbtnNewRadioButton_72);
		bg.add(rdbtnNewRadioButton_73);
		bg.add(rdbtnNewRadioButton_74);
		bg.add(rdbtnNewRadioButton_75);
		bg.add(rdbtnNewRadioButton_76);
		bg.add(rdbtnNewRadioButton_77);
		bg.add(rdbtnNewRadioButton_78);
		bg.add(rdbtnNewRadioButton_79);
		bg.add(rdbtnNewRadioButton_80);
		bg.add(rdbtnNewRadioButton_81);
		bg.add(rdbtnNewRadioButton_82);
		bg.add(rdbtnNewRadioButton_83);
		bg.add(rdbtnNewRadioButton_84);
		bg.add(rdbtnNewRadioButton_85);
		bg.add(rdbtnNewRadioButton_86);
		bg.add(rdbtnNewRadioButton_87);
		bg.add(rdbtnNewRadioButton_88);

	}
}
