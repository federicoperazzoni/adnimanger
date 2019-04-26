package jena.adni.main.application;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.TimerTask;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.DefaultEditorKit;

import jena.adni.main.LoadCsv;
import jena.adni.query.QueryFactoryADNI;  
public class ApplicationDesktop {  
	
	public static JButton buttonLoadWithReset = null;
	public static JButton buttonLoadNoReset = null;
	public static JButton buttonPerformAllItem = null;
	public static JButton buttonExcuteQuery = null;
	public static JButton buttonExcuteWithoutCostructQuery = null;
	public static JButton saveQuery = null;
	
	public static JTextArea textAreaForQuery = null;
	public static JPopupMenu popup = null;

	public static void main(String[] args) {
		
		final JFrame frameMainAdniManager = new JFrame("ADNI Ontology Manager");
		frameMainAdniManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buttonLoadWithReset = new JButton("Load csv with reset TDB");
		buttonLoadWithReset.setSize(200, 40);
		
		buttonLoadNoReset = new JButton("Load csv without reset TDB");
		buttonLoadNoReset.setSize(200, 40);
		
		buttonPerformAllItem = new JButton("Export all item");
		buttonPerformAllItem.setSize(200, 40);
		
		buttonExcuteQuery = new JButton("Excute query with costruct");
		buttonExcuteQuery.setSize(200, 40);
		
		buttonExcuteWithoutCostructQuery = new JButton("Excute query without costruct");
		buttonExcuteWithoutCostructQuery.setSize(200, 40);
		
		saveQuery =  new JButton("Save query");
		saveQuery.setSize(200, 40);
		
		final JLabel label1 = new JLabel("-");
		label1.setSize(400,30);  
		
		final JProgressBar progressBar = new JProgressBar();
		progressBar.setSize(300,30); 
		
		progressBar.setStringPainted(true);
		
		textAreaForQuery = new JTextArea(10, 30);
		
		popup = new JPopupMenu();
		
		popup.add( new JMenuItem(new DefaultEditorKit.CopyAction()) );
		popup.add( new JMenuItem(new DefaultEditorKit.PasteAction()) );
		popup.add( new JMenuItem(new DefaultEditorKit.CutAction()) );
		
		textAreaForQuery.addMouseListener(new MouseAdapter() {
			  @Override
			  public void mousePressed(MouseEvent e) {
				  
				  if (textAreaForQuery.hasFocus() && e.getButton() == MouseEvent.BUTTON3)
					  popup.show(textAreaForQuery,e.getX(),e.getY());
			  }
		});
		
		AllItemPerformAction.performAllItemAcion(buttonPerformAllItem, progressBar, label1);
		LoadPerformAction.performLoadWithResetAction(buttonLoadWithReset, progressBar, label1);
		LoadPerformAction.performLoadWithoutResetAction(buttonLoadNoReset, progressBar, label1);
		QueryPerformAction.performQueryAcion(buttonExcuteQuery, progressBar, label1, textAreaForQuery);
		QueryPerformAction.performQueryWithoutCostructAcion(buttonExcuteWithoutCostructQuery, progressBar, label1, textAreaForQuery);
		QueryPerformAction.saveQuery(saveQuery, progressBar, label1, textAreaForQuery);
		
		JPanel jaJPanel = new JPanel();
		JPanel jaJPanel2 = new JPanel();
		JPanel jaJPanel2_2 = new JPanel();
		JPanel jaJPanel3 = new JPanel();
		JPanel jaJPanel4 = new JPanel();
		JPanel jaJPanel5 = new JPanel();
		

		frameMainAdniManager.setLayout(new BorderLayout());

		jaJPanel.setLayout(new FlowLayout());
		jaJPanel2.setLayout(new BorderLayout());
		jaJPanel2_2.setLayout(new FlowLayout());
		jaJPanel3.setLayout(new FlowLayout());
		jaJPanel4.setLayout(new BorderLayout());
		jaJPanel5.setLayout(new FlowLayout());

        jaJPanel.add(buttonLoadWithReset);
        jaJPanel.add(buttonLoadNoReset);
        jaJPanel.add(buttonPerformAllItem);
        
        frameMainAdniManager.add(jaJPanel,BorderLayout.NORTH);

        jaJPanel2_2.add(label1,BorderLayout.NORTH);
        jaJPanel2.add(jaJPanel2_2,BorderLayout.CENTER);
        
        frameMainAdniManager.add(jaJPanel2,BorderLayout.CENTER);
        
        progressBar.setSize(200, 100);
		jaJPanel3.add(progressBar, BorderLayout.NORTH);
		
		jaJPanel2.add(jaJPanel3,BorderLayout.SOUTH);
		
		jaJPanel4.add(textAreaForQuery,BorderLayout.NORTH);
		
		jaJPanel5.add(buttonExcuteWithoutCostructQuery);
		jaJPanel5.add(buttonExcuteQuery);
		jaJPanel5.add(saveQuery);
		
		jaJPanel4.add(jaJPanel5,BorderLayout.CENTER);
		
		jaJPanel2.add(jaJPanel4,BorderLayout.NORTH);
		
		jaJPanel4.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		frameMainAdniManager.setSize(1000,350);
		frameMainAdniManager.setVisible(true);
	} 	
}  