package jena.adni.main.application.util;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import com.opencsv.CSVReader;

import jena.adni.constants.ADNIExternalResource;
import jena.adni.main.LoadCsv;
import jena.adni.main.application.ApplicationDesktop;
import jena.adni.main.application.QueryPerformAction;

public class ApplicationUtil {

	public static void disableButton() {

		ApplicationDesktop.buttonLoadWithReset.setEnabled(false);
		ApplicationDesktop.buttonLoadNoReset.setEnabled(false);
		ApplicationDesktop.buttonPerformAllItem.setEnabled(false);
		ApplicationDesktop.buttonExcuteQuery.setEnabled(false);
		ApplicationDesktop.buttonExcuteWithoutCostructQuery.setEnabled(false);
		ApplicationDesktop.saveQuery.setEnabled(false);
	}

	public static void enableButton() {

		if(LoadCsv.status != 3) {

			ApplicationDesktop.buttonLoadWithReset.setEnabled(true);
			ApplicationDesktop.buttonLoadNoReset.setEnabled(true);
		}

		ApplicationDesktop.buttonPerformAllItem.setEnabled(true);
		ApplicationDesktop.buttonExcuteQuery.setEnabled(true);
		ApplicationDesktop.buttonExcuteWithoutCostructQuery.setEnabled(true);
		ApplicationDesktop.saveQuery.setEnabled(true);
	}
	
	public static void openFrameCsvLoadQuery() {

		try {

			JFrame frame = new JFrame("Saved query" );
			frame.setSize( 1000,400 );
			frame.setLocationRelativeTo( null ); 
			frame.setLayout(new BorderLayout());
			
			JButton loadQueryButton = new JButton("Load query");
			
			JPanel container = new JPanel();
			container.setLayout(new BorderLayout());
			JScrollPane scrPane = new JScrollPane(container);

			Object[] columnnames;
			CSVReader CSVFileReader;
			CSVFileReader = new CSVReader(new FileReader(ADNIExternalResource.getInstance().getADNI_HOME() + "\\SAVED_QUERY\\Saved_Query.csv"));
			List myEntries = CSVFileReader.readAll();
			columnnames = (String[]) myEntries.get(0);
			DefaultTableModel tableModel = new DefaultTableModel(columnnames, myEntries.size()); 
			int rowcount = tableModel.getRowCount();
			for (int x = 0; x<rowcount; x++)
			{
				int columnnumber = 0;

				if (x>=0)
				{
					for (String thiscellvalue : (String[])myEntries.get(x))
					{
						if (columnnumber != 2)
							tableModel.setValueAt(thiscellvalue.replaceAll(ADNIExternalResource.getInstance().getPrefix(), ""), x, columnnumber);
						else
							tableModel.setValueAt(getDate(thiscellvalue), x, columnnumber);
						columnnumber++;
					}
				}
			}

			JTable csvAdniTable = new JTable(tableModel);
			csvAdniTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			csvAdniTable.getColumnModel().getColumn(0).setWidth(100);
			csvAdniTable.getColumnModel().getColumn(1).setWidth(120);
			csvAdniTable.getColumnModel().getColumn(2).setWidth(0);
			csvAdniTable.setFont(new Font("", Font.ITALIC, 20));
			csvAdniTable.setRowHeight(20);
			
			QueryPerformAction.loadQuery(loadQueryButton,ApplicationDesktop.textAreaForQuery,csvAdniTable,frame);

			container.add(csvAdniTable,BorderLayout.CENTER);
			container.add(loadQueryButton,BorderLayout.SOUTH);
			frame.getContentPane().add(scrPane,BorderLayout.CENTER);
			frame.setVisible( true );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Object getDate(String thiscellvalue) {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
			Date date=simpleDateFormat.parse(thiscellvalue.split("_")[1]);
			SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			return simpleDateFormat2.format(date);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		return null;
	}

	public static void openFrameCsv() {

		try {

			JFrame frame = new JFrame("Search Window" );
			frame.setSize( 1000,400 );
			frame.setLocationRelativeTo( null ); 
			frame.setLayout(new BorderLayout());

			JPanel container = new JPanel();
			container.setLayout(new BorderLayout());
			JScrollPane scrPane = new JScrollPane(container);

			Object[] columnnames;
			CSVReader CSVFileReader;
			CSVFileReader = new CSVReader(new FileReader(ADNIExternalResource.getInstance().getADNI_HOME() + "\\EXPORT\\Export_SimpleQuery_Adni.csv"));
			List myEntries = CSVFileReader.readAll();
			columnnames = (String[]) myEntries.get(0);
			DefaultTableModel tableModel = new DefaultTableModel(columnnames, myEntries.size()); 
			int rowcount = tableModel.getRowCount();
			for (int x = 0; x<rowcount; x++)
			{
				int columnnumber = 0;

				if (x>=0)
				{
					for (String thiscellvalue : (String[])myEntries.get(x))
					{
						tableModel.setValueAt(thiscellvalue.replaceAll(ADNIExternalResource.getInstance().getPrefix(), ""), x, columnnumber);
						columnnumber++;
					}
				}
			}

			JTable csvAdniTable = new JTable(tableModel);
			csvAdniTable.setFont(new Font("", Font.ITALIC, 20));
			csvAdniTable.setRowHeight(20);

			container.add(csvAdniTable,BorderLayout.CENTER);
			frame.getContentPane().add(scrPane,BorderLayout.CENTER);
			frame.setVisible( true );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void openFrameSaveQuery(JProgressBar progressBar, JLabel label1) {

		try {

			SaveQueryForm.visualize(progressBar, label1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
