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

public class UITestCases {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UITestCases window = new UITestCases();
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
	public UITestCases() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1239, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Doctor Refer to Admission");
		rdbtnNewRadioButton.setBounds(0, 33, 144, 16);
		frame.getContentPane().add(rdbtnNewRadioButton);

		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("CMO login EM");
		rdbtnNewRadioButton_1.setBounds(0, 52, 144, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);

		final JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("CMO Verify Bed Availability by bed classes");
		rdbtnNewRadioButton_2.setBounds(0, 78, 144, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);

		final JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("CMO Verify Bed Availability by bed types");
		rdbtnNewRadioButton_3.setBounds(0, 104, 144, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);

		final JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("CMO Verify Bed Availability by Nursing Units");
		rdbtnNewRadioButton_4.setBounds(0, 130, 174, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);

		final JRadioButton rdbtnNewRadioButton_5 = new JRadioButton(" CMO Verify Fields of Admit and Register Patient");
		rdbtnNewRadioButton_5.setBounds(0, 156, 174, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);

		final JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Doctor Submit OP Consultation Form");
		rdbtnNewRadioButton_6.setBounds(0, 7, 144, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_6);

		final JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("CMO Admit Referrral Patient");
		rdbtnNewRadioButton_7.setBounds(0, 179, 144, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_7);

		final JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("CMO Admit and Register Patient");
		rdbtnNewRadioButton_8.setBounds(0, 205, 155, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_8);

		final JRadioButton rdbtnNewRadioButton_9_1 = new JRadioButton("CMO Cancel Admission");
		rdbtnNewRadioButton_9_1.setBounds(176, 7, 185, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1);

		final JRadioButton rdbtnNewRadioButton_9_1_1 = new JRadioButton("CMO Verify Fields of Assign Bed");
		rdbtnNewRadioButton_9_1_1.setBounds(176, 33, 173, 16);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_1);

		final JRadioButton rdbtnNewRadioButton_9_1_2 = new JRadioButton("CMO Assign Bed Mark Patient Arrival");
		rdbtnNewRadioButton_9_1_2.setBounds(176, 52, 185, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_2);

		final JRadioButton rdbtnNewRadioButton_9_1_3 = new JRadioButton("CMO Discharge Patient");
		rdbtnNewRadioButton_9_1_3.setBounds(176, 78, 167, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_3);

		final JRadioButton rdbtnNewRadioButton_9_1_4 = new JRadioButton("Full Scenario Discharge Process");
		rdbtnNewRadioButton_9_1_4.setBounds(176, 104, 167, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_4);

		final JRadioButton rdbtnNewRadioButton_9_1_5 = new JRadioButton("Doctor Place Panel Order");
		rdbtnNewRadioButton_9_1_5.setBounds(176, 130, 167, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_5);

		final JRadioButton rdbtnNewRadioButton_9_1_5_1 = new JRadioButton("CMO Check Panel Order for Patient");
		rdbtnNewRadioButton_9_1_5_1.setBounds(176, 156, 167, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_5_1);

		final JRadioButton rdbtnNewRadioButton_9_1_5_1_1 = new JRadioButton("CMO Generate Bill");
		rdbtnNewRadioButton_9_1_5_1_1.setBounds(176, 179, 167, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_5_1_1);

		final JRadioButton rdbtnNewRadioButton_9_1_5_1_2 = new JRadioButton("CMO Create Consultation Visit");
		rdbtnNewRadioButton_9_1_5_1_2.setBounds(176, 205, 167, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_1_5_1_2);

		final JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Lab Technician Register Lab Order");
		rdbtnNewRadioButton_10.setBounds(363, 7, 153, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10);

		final JRadioButton rdbtnNewRadioButton_10_1 = new JRadioButton("Rad Technician Register Rad Order");
		rdbtnNewRadioButton_10_1.setBounds(363, 33, 153, 16);
		frame.getContentPane().add(rdbtnNewRadioButton_10_1);

		final JRadioButton rdbtnNewRadioButton_10_2 = new JRadioButton("CMO Check Panel Order for Patient Genrate Bill");
		rdbtnNewRadioButton_10_2.setBounds(363, 52, 153, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2);

		final JRadioButton rdbtnNewRadioButton_10_2_1 = new JRadioButton("Nurse View Patient list");
		rdbtnNewRadioButton_10_2_1.setBounds(363, 78, 153, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2_1);

		final JRadioButton rdbtnNewRadioButton_10_2_1_1 = new JRadioButton("Nurse Upload Document");
		rdbtnNewRadioButton_10_2_1_1.setBounds(363, 104, 153, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2_1_1);

		final JRadioButton rdbtnNewRadioButton_10_2_1_1_1 = new JRadioButton("Nurse Check Intra Ward Patient Transfer UI");
		rdbtnNewRadioButton_10_2_1_1_1.setBounds(363, 130, 153, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2_1_1_1);

		final JRadioButton rdbtnNewRadioButton_10_2_1_1_1_1 = new JRadioButton("Nurse Search Intra Ward Patient Transfer by Nursing Unit");
		rdbtnNewRadioButton_10_2_1_1_1_1.setBounds(363, 156, 153, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2_1_1_1_1);

		final JRadioButton rdbtnNewRadioButton_10_2_1_1_1_1_1 = new JRadioButton("Nurse Search Intra Ward Patient Transfer by Patient ID");
		rdbtnNewRadioButton_10_2_1_1_1_1_1.setBounds(363, 179, 144, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2_1_1_1_1_1);

		final JRadioButton rdbtnNewRadioButton_10_2_1_1_1_1_1_1 = new JRadioButton("Nurse Search Intra Ward Patient Transfer by Specialty");
		rdbtnNewRadioButton_10_2_1_1_1_1_1_1.setBounds(363, 205, 153, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_10_2_1_1_1_1_1_1);

		final JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Nurse Search Intra Ward Patient Transfer by Encounter ID");
		rdbtnNewRadioButton_9.setBounds(0, 231, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9);

		final JRadioButton rdbtnNewRadioButton_9_2 = new JRadioButton("Nurse Search Intra Ward Patient Transfer by Admission Date");
		rdbtnNewRadioButton_9_2.setBounds(0, 259, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_2);

		final JRadioButton rdbtnNewRadioButton_9_3 = new JRadioButton("Nurse Search Intra Ward Patient Transfer by Practitioner");
		rdbtnNewRadioButton_9_3.setBounds(0, 285, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_3);

		final JRadioButton rdbtnNewRadioButton_9_4 = new JRadioButton("Nurse Transfer Patients Within The Same Nursing Unit");
		rdbtnNewRadioButton_9_4.setBounds(0, 311, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_4);

		final JRadioButton rdbtnNewRadioButton_9_5 = new JRadioButton("Nurse Check Transfer Patient Out UI");
		rdbtnNewRadioButton_9_5.setBounds(0, 337, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_5);

		final JRadioButton rdbtnNewRadioButton_9_6 = new JRadioButton("Nurse Transfer Patients To Another nursing unit");
		rdbtnNewRadioButton_9_6.setBounds(0, 363, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_6);

		final JRadioButton rdbtnNewRadioButton_9_7 = new JRadioButton("Nurse Check Block Bed UI");
		rdbtnNewRadioButton_9_7.setBounds(0, 389, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_7);

		final JRadioButton rdbtnNewRadioButton_9_8 = new JRadioButton("Nurse Check Block Bed with all data required");
		rdbtnNewRadioButton_9_8.setBounds(0, 415, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_9_8);

		final JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("Nurse Check Unblock Bed UI");
		rdbtnNewRadioButton_11.setBounds(176, 231, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_11);

		final JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Nurse Release Blocked Bed");
		rdbtnNewRadioButton_12.setBounds(176, 259, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_12);

		final JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("Nurse View Clinical Profile");
		rdbtnNewRadioButton_13.setBounds(176, 285, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_13);

		final JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("Nurse View Patient Vitals");
		rdbtnNewRadioButton_14.setBounds(176, 311, 167, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_14);

		final JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("Nurse View Reports");
		rdbtnNewRadioButton_15.setBounds(176, 337, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_15);

		final JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("Nurse View medications");
		rdbtnNewRadioButton_16.setBounds(176, 363, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_16);

		final JRadioButton rdbtnNewRadioButton_17 = new JRadioButton("Nurse View Recent Order");
		rdbtnNewRadioButton_17.setBounds(176, 389, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_17);

		final JRadioButton rdbtnNewRadioButton_18 = new JRadioButton("Nurse Submit Pain Assessment");
		rdbtnNewRadioButton_18.setBounds(176, 415, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_18);

		final JRadioButton rdbtnNewRadioButton_19 = new JRadioButton("IP_TC_627_628_630");
		rdbtnNewRadioButton_19.setBounds(361, 231, 155, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_19);

		final JRadioButton rdbtnNewRadioButton_20 = new JRadioButton("IP_TC_631");
		rdbtnNewRadioButton_20.setBounds(361, 259, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_20);

		final JRadioButton rdbtnNewRadioButton_21 = new JRadioButton("IP_TC_633_751_752_753");
		rdbtnNewRadioButton_21.setBounds(361, 285, 155, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_21);

		final JRadioButton rdbtnNewRadioButton_22 = new JRadioButton("IP_TC_634");
		rdbtnNewRadioButton_22.setBounds(361, 311, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_22);

		final JRadioButton rdbtnNewRadioButton_23 = new JRadioButton("IP_TC_635");
		rdbtnNewRadioButton_23.setBounds(361, 337, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_23);

		final JRadioButton rdbtnNewRadioButton_24 = new JRadioButton("IP_TC_643");
		rdbtnNewRadioButton_24.setBounds(361, 363, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_24);

		final JRadioButton rdbtnNewRadioButton_25 = new JRadioButton("IP_TC_644");
		rdbtnNewRadioButton_25.setBounds(361, 389, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_25);

		final JRadioButton rdbtnNewRadioButton_26 = new JRadioButton("IP_TC_654");
		rdbtnNewRadioButton_26.setBounds(361, 415, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_26);

		final JRadioButton rdbtnNewRadioButton_27 = new JRadioButton("IP_TC_661");
		rdbtnNewRadioButton_27.setBounds(549, 7, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_27);

		final JRadioButton rdbtnNewRadioButton_28 = new JRadioButton("IP_TC_662");
		rdbtnNewRadioButton_28.setBounds(549, 30, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_28);

		final JRadioButton rdbtnNewRadioButton_29 = new JRadioButton("IP_TC_664");
		rdbtnNewRadioButton_29.setBounds(549, 52, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_29);

		final JRadioButton rdbtnNewRadioButton_30 = new JRadioButton("IP_TC_671");
		rdbtnNewRadioButton_30.setBounds(549, 78, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_30);

		final JRadioButton rdbtnNewRadioButton_31 = new JRadioButton("IP_TC_685");
		rdbtnNewRadioButton_31.setBounds(549, 104, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_31);

		final JRadioButton rdbtnNewRadioButton_32 = new JRadioButton("IP_TC_687");
		rdbtnNewRadioButton_32.setBounds(549, 130, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_32);

		final JRadioButton rdbtnNewRadioButton_33 = new JRadioButton("IP_TC_689");
		rdbtnNewRadioButton_33.setBounds(549, 156, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_33);

		final JRadioButton rdbtnNewRadioButton_34 = new JRadioButton("IP_TC_693");
		rdbtnNewRadioButton_34.setBounds(549, 179, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_34);

		final JRadioButton rdbtnNewRadioButton_35 = new JRadioButton("IP_TC_694");
		rdbtnNewRadioButton_35.setBounds(549, 205, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_35);

		final JRadioButton rdbtnNewRadioButton_36 = new JRadioButton("IP_TC_696_701");
		rdbtnNewRadioButton_36.setBounds(549, 231, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_36);

		final JRadioButton rdbtnNewRadioButton_37 = new JRadioButton("IP_TC_697");
		rdbtnNewRadioButton_37.setBounds(549, 259, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_37);

		final JRadioButton rdbtnNewRadioButton_38 = new JRadioButton("IP_TC_700");
		rdbtnNewRadioButton_38.setBounds(549, 285, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_38);

		final JRadioButton rdbtnNewRadioButton_39 = new JRadioButton("IP_TC_707_IP_TC_742");
		rdbtnNewRadioButton_39.setBounds(549, 311, 155, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_39);

		final JRadioButton rdbtnNewRadioButton_40 = new JRadioButton("IP_TC_714");
		rdbtnNewRadioButton_40.setBounds(549, 337, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_40);

		final JRadioButton rdbtnNewRadioButton_41 = new JRadioButton("IP_TC_715");
		rdbtnNewRadioButton_41.setBounds(549, 363, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_41);

		final JRadioButton rdbtnNewRadioButton_42 = new JRadioButton("IP_TC_721");
		rdbtnNewRadioButton_42.setBounds(549, 389, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_42);

		final JRadioButton rdbtnNewRadioButton_43 = new JRadioButton("IP_TC_722_723");
		rdbtnNewRadioButton_43.setBounds(549, 415, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_43);

		final JRadioButton rdbtnNewRadioButton_44 = new JRadioButton("IP_TC_724_754");
		rdbtnNewRadioButton_44.setBounds(720, 7, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_44);

		final JRadioButton rdbtnNewRadioButton_45 = new JRadioButton("IP_TC_725_726_727_728_729_730_755");
		rdbtnNewRadioButton_45.setBounds(720, 30, 189, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_45);

		final JRadioButton rdbtnNewRadioButton_46 = new JRadioButton("IP_TC_733");
		rdbtnNewRadioButton_46.setBounds(720, 52, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_46);

		final JRadioButton rdbtnNewRadioButton_47 = new JRadioButton("IP_TC_734_735_736_737");
		rdbtnNewRadioButton_47.setBounds(720, 78, 189, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_47);

		final JRadioButton rdbtnNewRadioButton_48 = new JRadioButton("IP_TC_756_762_765");
		rdbtnNewRadioButton_48.setBounds(720, 104, 167, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_48);

		final JRadioButton rdbtnNewRadioButton_49 = new JRadioButton("IP_TC_766");
		rdbtnNewRadioButton_49.setBounds(720, 130, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_49);

		final JRadioButton rdbtnNewRadioButton_50 = new JRadioButton("IP_TC_767");
		rdbtnNewRadioButton_50.setBounds(720, 156, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_50);

		final JRadioButton rdbtnNewRadioButton_51 = new JRadioButton("IP_TC_770");
		rdbtnNewRadioButton_51.setBounds(720, 179, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_51);

		final JRadioButton rdbtnNewRadioButton_52 = new JRadioButton("IP_TC_772_773");
		rdbtnNewRadioButton_52.setBounds(720, 205, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_52);

		final JRadioButton rdbtnNewRadioButton_53 = new JRadioButton("IP_TC_779_780");
		rdbtnNewRadioButton_53.setBounds(720, 231, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_53);

		final JRadioButton rdbtnNewRadioButton_54 = new JRadioButton("IP_TC_788");
		rdbtnNewRadioButton_54.setBounds(720, 259, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_54);

		final JRadioButton rdbtnNewRadioButton_55 = new JRadioButton("IP_TC_789");
		rdbtnNewRadioButton_55.setBounds(720, 285, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_55);

		final JRadioButton rdbtnNewRadioButton_56 = new JRadioButton("IP_TC_791_792");
		rdbtnNewRadioButton_56.setBounds(720, 311, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_56);

		final JRadioButton rdbtnNewRadioButton_57 = new JRadioButton("IP_TC_793");
		rdbtnNewRadioButton_57.setBounds(720, 337, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_57);

		final JRadioButton rdbtnNewRadioButton_58 = new JRadioButton("IP_TC_794");
		rdbtnNewRadioButton_58.setBounds(720, 363, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_58);

		final JRadioButton rdbtnNewRadioButton_59 = new JRadioButton("IP_TC_795");
		rdbtnNewRadioButton_59.setBounds(720, 389, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_59);

		final JRadioButton rdbtnNewRadioButton_60 = new JRadioButton("IP_TC_796");
		rdbtnNewRadioButton_60.setBounds(720, 415, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_60);

		final JRadioButton rdbtnNewRadioButton_61 = new JRadioButton("IP_TC_836");
		rdbtnNewRadioButton_61.setBounds(911, 7, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_61);

		final JRadioButton rdbtnNewRadioButton_62 = new JRadioButton("IP_TC_837");
		rdbtnNewRadioButton_62.setBounds(911, 30, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_62);

		final JRadioButton rdbtnNewRadioButton_63 = new JRadioButton("IP_TC_838");
		rdbtnNewRadioButton_63.setBounds(911, 56, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_63);

		final JRadioButton rdbtnNewRadioButton_64 = new JRadioButton("IP_TC_839");
		rdbtnNewRadioButton_64.setBounds(911, 78, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_64);

		final JRadioButton rdbtnNewRadioButton_65 = new JRadioButton("IP_TC_840");
		rdbtnNewRadioButton_65.setBounds(911, 104, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_65);

		final JRadioButton rdbtnNewRadioButton_66 = new JRadioButton("IP_TC_841");
		rdbtnNewRadioButton_66.setBounds(911, 130, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_66);

		final JRadioButton rdbtnNewRadioButton_67 = new JRadioButton("IP_TC_842");
		rdbtnNewRadioButton_67.setBounds(911, 156, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_67);

		final JRadioButton rdbtnNewRadioButton_68 = new JRadioButton("IP_TC_843");
		rdbtnNewRadioButton_68.setBounds(911, 179, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_68);

		final JRadioButton rdbtnNewRadioButton_69 = new JRadioButton("IP_TC_845");
		rdbtnNewRadioButton_69.setBounds(911, 205, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_69);

		final JRadioButton rdbtnNewRadioButton_70 = new JRadioButton("IP_TC_846");
		rdbtnNewRadioButton_70.setBounds(911, 231, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_70);

		final JRadioButton rdbtnNewRadioButton_71 = new JRadioButton("IP_TC_847");
		rdbtnNewRadioButton_71.setBounds(911, 259, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_71);

		final JRadioButton rdbtnNewRadioButton_72 = new JRadioButton("IP_TC_878");
		rdbtnNewRadioButton_72.setBounds(911, 285, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_72);

		final JRadioButton rdbtnNewRadioButton_73 = new JRadioButton("IP_TC_879");
		rdbtnNewRadioButton_73.setBounds(911, 311, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_73);

		final JRadioButton rdbtnNewRadioButton_74 = new JRadioButton("IP_TC_880");
		rdbtnNewRadioButton_74.setBounds(911, 337, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_74);

		final JRadioButton rdbtnNewRadioButton_75 = new JRadioButton("IP_TC_881");
		rdbtnNewRadioButton_75.setBounds(911, 363, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_75);

		final JRadioButton rdbtnNewRadioButton_76 = new JRadioButton("IP_TC_882");
		rdbtnNewRadioButton_76.setBounds(911, 389, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_76);

		final JRadioButton rdbtnNewRadioButton_77 = new JRadioButton("IP_TC_883");
		rdbtnNewRadioButton_77.setBounds(911, 415, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_77);

		final JRadioButton rdbtnNewRadioButton_78 = new JRadioButton("IP_TC_884");
		rdbtnNewRadioButton_78.setBounds(1056, 7, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_78);

		final JRadioButton rdbtnNewRadioButton_79 = new JRadioButton("IP_TC_886");
		rdbtnNewRadioButton_79.setBounds(1056, 30, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_79);

		final JRadioButton rdbtnNewRadioButton_80 = new JRadioButton("IP_TC_887");
		rdbtnNewRadioButton_80.setBounds(1056, 52, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_80);

		final JRadioButton rdbtnNewRadioButton_81 = new JRadioButton("GroupA_01");
		rdbtnNewRadioButton_81.setBounds(1056, 78, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_81);

		final JRadioButton rdbtnNewRadioButton_82 = new JRadioButton("GroupA_02");
		rdbtnNewRadioButton_82.setBounds(1056, 104, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_82);

		final JRadioButton rdbtnNewRadioButton_83 = new JRadioButton("GroupC");
		rdbtnNewRadioButton_83.setBounds(1056, 130, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_83);

		final JRadioButton rdbtnNewRadioButton_84 = new JRadioButton("GroupF");
		rdbtnNewRadioButton_84.setBounds(1056, 156, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_84);

		final JRadioButton rdbtnNewRadioButton_85 = new JRadioButton("GroupHP_01");
		rdbtnNewRadioButton_85.setBounds(1056, 179, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_85);

		final JRadioButton rdbtnNewRadioButton_86 = new JRadioButton("GroupHP_02");
		rdbtnNewRadioButton_86.setBounds(1056, 179, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_86);

		final JRadioButton rdbtnNewRadioButton_87 = new JRadioButton("GroupL");
		rdbtnNewRadioButton_87.setBounds(1056, 205, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_87);

		final JRadioButton rdbtnNewRadioButton_88 = new JRadioButton("GroupM");
		rdbtnNewRadioButton_88.setBackground(SystemColor.menu);
		rdbtnNewRadioButton_88.setBounds(1056, 231, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_88);

		JButton btnNewButton = new JButton("Run");
		btnNewButton.setBounds(1124, 438, 89, 23);
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
