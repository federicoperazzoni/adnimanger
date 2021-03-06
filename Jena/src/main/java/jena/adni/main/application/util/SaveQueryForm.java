package jena.adni.main.application.util;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
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
import jena.adni.main.application.QueryPerformAction;

public class SaveQueryForm extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static JTextComponent[] fields = new JTextComponent[2];
	private static JFrame f = new JFrame("Save query form");

	private static String[] labels = { "Query name", "Query description" };
	private static char[] mnemonics = { 'N', 'D'};
	private static int[] widths = { 25, 25};
	private static String[] descs = { "Name of query", "Description of query"};

	private static final SaveQueryForm form = new SaveQueryForm(labels, mnemonics, widths, descs);

	// Create a form with the specified labels, tooltips, and sizes.
	public SaveQueryForm(String[] labels, char[] mnemonics, int[] widths, String[] tips) {
		super(new BorderLayout());
		JPanel labelPanel = new JPanel(new GridLayout(labels.length, 1));
		JPanel fieldPanel = new JPanel(new GridLayout(labels.length, 1));
		add(labelPanel, BorderLayout.WEST);
		add(fieldPanel, BorderLayout.CENTER);

		for (int i = 0; i < labels.length; i += 1) {
			if (mnemonics[i] == 'N')
				fields[i] = new JTextField();
			else
				fields[i] = new JTextArea();
			if (i < tips.length)
				fields[i].setToolTipText(tips[i]);
			if (i < widths.length) {
				if (mnemonics[i] == 'N')
					((JTextField) fields[i]).setColumns(widths[i]);
				else {
					((JTextArea) fields[i]).setColumns(widths[i]);
					((JTextArea) fields[i]).setRows(4);
				}
			}


			JLabel lab = new JLabel(labels[i], JLabel.CENTER);
			lab.setVerticalAlignment(JLabel.TOP);
			lab.setHorizontalAlignment(JLabel.LEFT);
			Border border = BorderFactory.createEmptyBorder(5, 5, 2, 2);
			lab.setBorder(border);

			lab.setLabelFor(fields[i]);
			//			if (i < mnemonics.length)
			//				lab.setDisplayedMnemonic(mnemonics[i]);

			labelPanel.add(lab);
			JPanel p = new JPanel(new FlowLayout());
			fields[i].setAlignmentX(100);
			p.add(fields[i]);
			fieldPanel.add(p);
		}
	}

	public static String getText(int i) {
		return (fields[i].getText());
	}

	public static void visualize(JProgressBar progressBar, JLabel label1) {

		JButton submit = new JButton("Save query");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoadCsv.loadPercent = 0;
				if (!ApplicationDesktop.textAreaForQuery.getText().isEmpty()) {
					QueryPerformAction.saveQueryPerm(ApplicationDesktop.saveQuery, progressBar, label1, ApplicationDesktop.textAreaForQuery);
					f.dispose();
				}
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