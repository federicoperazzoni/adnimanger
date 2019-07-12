package jena.adni.main.application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import jena.adni.constants.ADNIExternalResource;
import jena.adni.main.LoadCsv;
import jena.adni.main.application.util.ApplicationUtil;
import jena.adni.query.QueryFactoryADNI;

public class QueryPerformAction {

	public static void performQueryAcion(JButton buttonExcuteQuery, final JProgressBar progressBar, final JLabel label1, final JTextArea queryTextArea) {

		buttonExcuteQuery.addActionListener(new ActionListener(){  

			public void actionPerformed(ActionEvent e){  

				Thread thread = new Thread( new Runnable() {

					@Override
					public void run() {

						progressBar.setValue(LoadCsv.loadPercent);
						ApplicationUtil.disableButton();

						while(true) {

							label1.setText(LoadCsv.loadMex);

							progressBar.setValue(LoadCsv.loadPercent);

							if (LoadCsv.loadPercent == 100) {

								ApplicationUtil.enableButton();
								return;
							}

							try {

								Thread.sleep(100);
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

						try {

							QueryFactoryADNI.executeQuery(queryTextArea.getText());
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						};
					}

				});
				thread2.start();
			}
		});
	}

	public static void performQueryWithoutConstructAcion(JButton buttonExcuteQuery, final JProgressBar progressBar,
			final JLabel label1, final JTextArea queryTextArea) {
		buttonExcuteQuery.addActionListener(new ActionListener(){  

			public void actionPerformed(ActionEvent e){  

				Thread thread = new Thread( new Runnable() {

					@Override
					public void run() {

						ApplicationUtil.disableButton();
						progressBar.setValue(LoadCsv.loadPercent);

						while(true) {

							label1.setText(LoadCsv.loadMex);

							progressBar.setValue(LoadCsv.loadPercent);

							if (LoadCsv.loadPercent == 100) {

								ApplicationUtil.enableButton();

								if (ADNIExternalResource.MEX_EXTRACTION_COMPLETED.equals(LoadCsv.loadMex))
									ApplicationUtil.openFrameCsv();

								return;
							}

							try {

								Thread.sleep(100);
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

						try {

							QueryFactoryADNI.executeQueryWithoutConstruct(queryTextArea.getText());
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						};
					}

				});
				thread2.start();
			}
		});

	}

	public static void saveQuery(JButton saveQuery, final JProgressBar progressBar, final JLabel label1,
			final JTextArea textAreaForQuery) {
		saveQuery.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ApplicationUtil.openFrameSaveQuery(progressBar, label1);
			}  
		});
	}

	public static void saveQueryPerm(JButton saveQuery, final JProgressBar progressBar, final JLabel label1,
			final JTextArea textAreaForQuery, JTextComponent[] fields) {


		Thread thread = new Thread( new Runnable() {

			@Override
			public void run() {

				progressBar.setValue(LoadCsv.loadPercent);
				ApplicationUtil.disableButton();

				while(true) {

					label1.setText(LoadCsv.loadMex);

					progressBar.setValue(LoadCsv.loadPercent);

					if (LoadCsv.loadPercent == 100) {

						ApplicationUtil.enableButton();
						return;
					}

					try {

						Thread.sleep(100);
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

				try 	{

					LoadCsv.loadPercent = 0;

					FileWriter fileWriter = new FileWriter(ADNIExternalResource.getInstance().getADNI_HOME() + "\\SAVED_QUERY\\Saved_Query.csv", true);

					CSVWriter cSVFileWriter;
					cSVFileWriter = new CSVWriter(fileWriter,
							CSVWriter.DEFAULT_SEPARATOR,
							CSVWriter.NO_QUOTE_CHARACTER,
							CSVWriter.DEFAULT_ESCAPE_CHARACTER,
							CSVWriter.DEFAULT_LINE_END);

					if (!textAreaForQuery.getText().isEmpty())
						cSVFileWriter.writeNext(new String[]{fields[0].getText(), fields[1].getText(), textAreaForQuery.getText()});
					cSVFileWriter.flush();
					cSVFileWriter.close();
					fileWriter.close();

					LoadCsv.loadMex = "Query salvata";
					LoadCsv.loadPercent = 100;	
				} catch (IOException e) {
					LoadCsv.loadMex = "Errore nel salvataggio: " + e.getLocalizedMessage();
					LoadCsv.loadPercent = 100;
				}

			}

		});
		thread2.start();


	}

	public static void loadQuery(JButton buttonLoadQuery, JProgressBar progressBar, JLabel label1) {
		buttonLoadQuery.addActionListener(new ActionListener(){  

			public void actionPerformed(ActionEvent e){  
				ApplicationUtil.openFrameCsvLoadQuery();
			}
		});
		
	}
}
