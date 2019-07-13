package jena.adni.main.application.util;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.JTextComponent;

import jena.adni.main.LoadCsv;
import jena.adni.main.application.ApplicationDesktop;
import jena.adni.main.application.LoadPerformAction;
import jena.adni.main.application.QueryPerformAction;

public class LoadCSVForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static JButton[] fields = new JButton[3];
	public final static JCheckBox[] fieldsCB = new JCheckBox[3];
	public final static JLabel[] fieldsL = new JLabel[3];
	private static JFrame f = new JFrame("Load CSV form");
	private static final JFileChooser fc = new JFileChooser();

	public static String[] labels = { "CDR", "FAQ", "MMSE" };
	public static String[] labelButton = {"CDR csv","FAQ csv","MMSE csv"};
	
	public static File[] files = new File[3];
	public static char[] mnemonics = { 'C', 'F', 'M'};
	public static int[] widths = { 25, 25, 25 };
	public static String[] descs = { "Clinical dementia rating", "Functional assessment question", "Mini mental state exam"};

	private static final LoadCSVForm form = new LoadCSVForm(labels, mnemonics, widths, descs);

	// Create a form with the specified labels, tooltips, and sizes.
	public LoadCSVForm(String[] labels, char[] mnemonics, int[] widths, String[] tips) {
		super(new BorderLayout());
		JPanel labelPanel = new JPanel(new GridLayout(labels.length, 1));
		JPanel cecklPanel = new JPanel(new GridLayout(labels.length, 1));
		JPanel fieldPanel = new JPanel(new GridLayout(labels.length, 1));
		JPanel fileNamePanel = new JPanel(new GridLayout(labels.length, 1));
		add(labelPanel, BorderLayout.WEST);
		JPanel panelCB = new JPanel(new BorderLayout());
		panelCB.add(cecklPanel, BorderLayout.WEST);
		panelCB.add(fieldPanel, BorderLayout.CENTER);
		panelCB.add(fileNamePanel, BorderLayout.EAST);
		add(panelCB, BorderLayout.CENTER);
		

		for (int i = 0; i < labels.length; i += 1) {

			fields[i] = new JButton(labelButton[i]);

			fields[i].addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
					int returnVal = fc.showOpenDialog(LoadCSVForm.this);

					if (returnVal == JFileChooser.APPROVE_OPTION) {
						File file = fc.getSelectedFile();
						String buttonS = ((JButton)e.getSource()).getText();
						
						if ("CDR csv".equals(buttonS)) {
							files[0] = file;
							fieldsL[0].setText(file.getName());
						} else if ("FAQ csv".equals(buttonS)) {
							files[1] = file;
							fieldsL[1].setText(file.getName());
						} else if ("MMSE csv".equals(buttonS)) {
							files[2] = file;
							fieldsL[2].setText(file.getName());
						}
					}
				}
			});

			if (i < tips.length)
				fields[i].setToolTipText(tips[i]);

			JLabel lab = new JLabel(labels[i], JLabel.CENTER);
			lab.setVerticalAlignment(JLabel.TOP);
			lab.setHorizontalAlignment(JLabel.LEFT);
			Border border = BorderFactory.createEmptyBorder(5, 5, 2, 2);
			lab.setBorder(border);

			lab.setLabelFor(fields[i]);
			//			if (i < mnemonics.length)
			//				lab.setDisplayedMnemonic(mnemonics[i]);

			labelPanel.add(lab);

			fieldsCB[i] = new JCheckBox();

			JPanel pc = new JPanel(new FlowLayout());
			fieldsCB[i].setAlignmentX(100);
			fieldsCB[i].setSelected(true);
			pc.add(fieldsCB[i]);
			cecklPanel.add(pc);

			JPanel p = new JPanel(new BorderLayout());
			fields[i].setAlignmentX(100);
			p.add(fields[i]);
			fieldPanel.add(p,BorderLayout.WEST);
			fieldsL[i] = new JLabel("Default File                                ");
			p.add(fieldsL[i],BorderLayout.EAST);
			fileNamePanel.add(p);
		}
	}

	public static String getText(int i) {
		return (fields[i].getText());
	}

	public static void visualize(JProgressBar progressBar, JLabel label1) {

		JButton submit = new JButton("Load");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoadCsv.loadPercent = 0;
				LoadPerformAction.performLoadWithResetActionPerm(ApplicationDesktop.buttonLoadWithReset, progressBar, label1);
				f.dispose();
			}
		});

		f.getContentPane().add(form, BorderLayout.NORTH);
		JPanel p = new JPanel();
		p.add(submit);
		f.getContentPane().add(p, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
}