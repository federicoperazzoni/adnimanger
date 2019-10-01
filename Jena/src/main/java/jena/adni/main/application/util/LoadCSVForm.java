package jena.adni.main.application.util;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
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
	public final static JButton[] fields = new JButton[7];
	public final static JCheckBox[] fieldsCB = new JCheckBox[7];
	public final static JLabel[] fieldsL = new JLabel[7];
	private static JFrame f = new JFrame("Load CSV form");
	private static final JFileChooser fc = new JFileChooser();

	public static String[] labels = {"CDR", "FAQ", "MMSE", "NEUROBAT", "GDS", "NPI", "NPIQ" };
	public static String[] labelButton = {"             Select file","             Select file","             Select file",
			"             Select file","             Select file","             Select file","             Select file"};
	
	public static File[] files = new File[7];
	public static char[] mnemonics = {'C','G','F','M','N','P','Q'};
	public static int[] widths = { 25, 25, 25, 25, 25, 25 };
	public static String[] descs = {"Clinical dementia rating","Geriatric Depression Scale","Functional assessment question",
			"Mini mental state exam","Neuro Battery","Neuropsychiatric Inventory","Neuropsychiatric Inventory Questionnaire"};
	
	int i = 0;

	private static final LoadCSVForm form = new LoadCSVForm(labels, mnemonics, widths, descs);

	// Create a form with the specified labels, tooltips, and sizes.
	public LoadCSVForm(String[] labels, char[] mnemonics, int[] widths, String[] tips) {
		super(new BorderLayout());
		JPanel labelPanel = new JPanel(new GridLayout(labels.length, 1));
		JPanel cecklPanel = new JPanel(new GridLayout(labels.length, 1));
		JPanel fieldPanel = new JPanel(new GridLayout(labels.length, 1));
		JPanel fileNamePanel = new JPanel(new GridLayout(labels.length, 1));
		JPanel panelCB = new JPanel(new BorderLayout());
		panelCB.add(labelPanel, BorderLayout.WEST);
		panelCB.add(cecklPanel, BorderLayout.CENTER);
		panelCB.setBounds(0, 0, 300, 300);
		add(panelCB, BorderLayout.WEST);
		add(fieldPanel,BorderLayout.CENTER);
		add(fileNamePanel, BorderLayout.EAST);

		for (i = 0; i < labels.length; i += 1) {

			fields[i] = new JButton(labelButton[i]);

			fields[i].addActionListener(new ActionListener(){ 
				
				private int cont = i; 
				
				public void actionPerformed(ActionEvent e){  
					int returnVal = fc.showOpenDialog(LoadCSVForm.this);

					if (returnVal == JFileChooser.APPROVE_OPTION) {
						File file = fc.getSelectedFile();
						files[cont] = file;
						fieldsL[cont].setText(file.getName().length() > 16 ? file.getName().substring(0,15) + "..." : file.getName());
						fieldsL[cont].setToolTipText(file.getName());
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

			JPanel pc = new JPanel(new GridLayout());
			fieldsCB[i].setAlignmentX(100);
			fieldsCB[i].setSelected(true);
			pc.add(fieldsCB[i]);
			cecklPanel.add(pc);

			JPanel p = new JPanel(new CardLayout());
			fields[i].setAlignmentX(100);
			fields[i].setHorizontalAlignment(JButton.LEFT);
			fields[i].setSize(new Dimension(300,80));
			p.add(fields[i]);
			JPanel p2 = new JPanel(new CardLayout());
			fieldPanel.add(p2);
			fieldsL[i] = new JLabel("Default File                                   ");
			fieldsL[i].setBorder(border);
			p2.add(fieldsL[i]);
			fileNamePanel.add(p);
			fileNamePanel.add(p2);
		}
	}

	public static String getText(int i) {
		return (fields[i].getText());
	}

	public static void visualize(Boolean reset, JProgressBar progressBar, JLabel label1) {

		JButton submit = new JButton("Load");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoadCsv.loadPercent = 0;
				if (reset)
					LoadPerformAction.performLoadWithResetActionPerm(ApplicationDesktop.buttonLoadWithReset, progressBar, label1);
				else 
					LoadPerformAction.performLoadWithoutResetActionPerm(ApplicationDesktop.buttonLoadNoReset, progressBar, label1);
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