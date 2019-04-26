package jena.adni.main;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.TimerTask;

import javax.swing.*;  
public class ApplicationDesktop {  
	
	public static void main(String[] args) {
		
		final JFrame f = new JFrame("ADNI Ontology Manager");

		final JButton buttonLoadWithReset = new JButton("Load csv with reset TDB");
		buttonLoadWithReset.setSize(200, 40);
		
		final JButton buttonLoadNoReset=new JButton("Load csv without reset TDB");
		buttonLoadNoReset.setSize(200, 40);
		
		final JButton buttonPerformAllItem=new JButton("Export all item");
		buttonPerformAllItem.setSize(200, 40);
		
		final JLabel label1 = new JLabel("-");
		label1.setSize(400,30);  
		
		final JProgressBar progressBar = new JProgressBar();
		progressBar.setSize(300,30); 
		
		progressBar.setStringPainted(true);
		
		buttonPerformAllItem.addActionListener(new ActionListener(){  
			
			public void actionPerformed(ActionEvent e){  
				
				Thread thread = new Thread( new Runnable() {

					@Override
					public void run() {
						
						LoadCsv.loadPercent = 0;
						progressBar.setValue(LoadCsv.loadPercent);
						buttonPerformAllItem.setEnabled(false);
						
						while(true) {
							
							label1.setText(LoadCsv.loadMex);

							progressBar.setValue(LoadCsv.loadPercent);
							
							if (LoadCsv.loadPercent == 100) {
								
								buttonPerformAllItem.setEnabled(true);
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
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						};
					}
					
				});
				thread2.start();
			}
		});
		
		buttonLoadWithReset.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  

				Thread thread = new Thread( new Runnable() {

					@Override
					public void run() {
						
						LoadCsv.loadPercent = 0;
						progressBar.setValue(LoadCsv.loadPercent);
						buttonLoadWithReset.setEnabled(false);
						
						while(true) {
							
							label1.setText(LoadCsv.loadMex);
							
							if (LoadCsv.status == 3) {

								progressBar.setValue(LoadCsv.loadPercent);
							}
							
							
							if (LoadCsv.loadPercent == 100) {
								
								buttonLoadWithReset.setEnabled(true);
								label1.setText("Fine caricamento");
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
						
						LoadCsv.loadCsvWithReset();
					}
					
				});
				thread2.start();
	        }  
	    });  
		
		buttonLoadNoReset.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				
				Thread thread = new Thread( new Runnable() {
				
				@Override
				public void run() {
					
					LoadCsv.loadPercent = 0;
					progressBar.setValue(LoadCsv.loadPercent);
					buttonLoadNoReset.setEnabled(false);
					
					while(true) {
						
						label1.setText(LoadCsv.loadMex);
						
						if (LoadCsv.status == 3) {

							progressBar.setValue(LoadCsv.loadPercent);
						}
						
						
						if (LoadCsv.loadPercent == 100) {
							
							buttonLoadNoReset.setEnabled(true);
							label1.setText("Fine caricamento");
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
					
					LoadCsv.loadCsvNoReset();;
				}
				
			});
			thread2.start();
        }  
	    });  
		
		JPanel jaJPanel = new JPanel();
		JPanel jaJPanel2 = new JPanel();
		JPanel jaJPanel2_2 = new JPanel();
		JPanel jaJPanel3 = new JPanel();

		f.setLayout(new BorderLayout());

		jaJPanel.setLayout(new FlowLayout());
		jaJPanel2.setLayout(new BorderLayout());
		jaJPanel2_2.setLayout(new FlowLayout());
		jaJPanel3.setLayout(new FlowLayout());

        jaJPanel.add(buttonLoadWithReset);
        jaJPanel.add(buttonLoadNoReset);
        jaJPanel.add(buttonPerformAllItem);
        
        f.add(jaJPanel,BorderLayout.NORTH);

        jaJPanel2_2.add(label1,BorderLayout.NORTH);
        jaJPanel2.add(jaJPanel2_2,BorderLayout.NORTH);
        
        f.add(jaJPanel2,BorderLayout.CENTER);
        
        progressBar.setSize(200, 100);
		jaJPanel3.add(progressBar, BorderLayout.NORTH);
		
		jaJPanel2.add(jaJPanel3);
		
		f.setSize(600,150);
		f.setVisible(true);
	} 
	
}  