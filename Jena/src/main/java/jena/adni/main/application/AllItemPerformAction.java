package jena.adni.main.application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import jena.adni.main.LoadCsv;
import jena.adni.main.application.util.ApplicationUtil;
import jena.adni.query.QueryFactoryADNI;

public class AllItemPerformAction {


	public static void performAllItemAcion(JButton buttonPerformAllItem, final JProgressBar progressBar, final JLabel label1) {

		buttonPerformAllItem.addActionListener(new ActionListener(){  

			public void actionPerformed(ActionEvent e){  

				Thread thread = new Thread( new Runnable() {

					@Override
					public void run() {

						LoadCsv.loadPercent = 0;
						progressBar.setValue(LoadCsv.loadPercent);
						ApplicationUtil.disableButton();

						while(true) {

							label1.setText(LoadCsv.loadMex);

							progressBar.setValue(LoadCsv.loadPercent);

							if (LoadCsv.loadPercent == 100) {

								ApplicationUtil.enableButton();
								break;
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

							QueryFactoryADNI.allItem();
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
}
