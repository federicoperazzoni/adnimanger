package jena.adni.main.application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.opencsv.CSVReader;

import jena.adni.constants.ADNIExternalResource;
import jena.adni.main.LoadCsv;
import jena.adni.main.application.util.ApplicationUtil;
import jena.adni.main.application.util.LoadCSVForm;

public class LoadPerformAction {

	public static void performLoadWithResetAction(JButton buttonLoadWithReset, final JProgressBar progressBar, final JLabel label1) {

		buttonLoadWithReset.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				LoadCSVForm.visualize(true,progressBar, label1);
			}
		});
	}

	public static void performLoadWithoutResetAction(JButton buttonLoadWithReset, final JProgressBar progressBar, final JLabel label1) {

		buttonLoadWithReset.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				LoadCSVForm.visualize(false,progressBar, label1);
			}
		});
	}

	public static void performLoadWithResetActionPerm(JButton buttonLoadWithReset, final JProgressBar progressBar, final JLabel label1) {

		Thread thread = new Thread( new Runnable() {

			@Override
			public void run() {

				LoadCsv.loadPercent = 0;
				progressBar.setValue(LoadCsv.loadPercent);
				ApplicationUtil.disableButton();

				while(true) {

					label1.setText(LoadCsv.loadMex);

					if (LoadCsv.status == 1) {

						progressBar.setValue(LoadCsv.loadPercent);
					}


					if (LoadCsv.loadPercent == 100) {

						ApplicationUtil.enableButton();
						label1.setText("End load");
						break;
					}

					try {

						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		});
		thread.start();

		Thread thread2 = new Thread( new Runnable() {

			@Override
			public void run() {

				LoadCsv.loadCsvWithReset();
			}

		});
		thread2.start();
	}

	public static void performLoadWithoutResetActionPerm(JButton buttonLoadNoReset, final JProgressBar progressBar, final JLabel label1) {

		Thread thread = new Thread( new Runnable() {

			@Override
			public void run() {

				LoadCsv.loadPercent = 0;
				progressBar.setValue(LoadCsv.loadPercent);
				ApplicationUtil.disableButton();

				while(true) {

					label1.setText(LoadCsv.loadMex);

					if (LoadCsv.status == 1) {

						progressBar.setValue(LoadCsv.loadPercent);
					}


					if (LoadCsv.loadPercent == 100) {

						ApplicationUtil.enableButton();
						label1.setText("Fine caricamento");
						break;
					}

					try {

						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		});
		thread.start();

		Thread thread2 = new Thread( new Runnable() {

			@Override
			public void run() {

				LoadCsv.loadCsvNoReset();;
			}

		});
		thread2.start();
	}  
}
