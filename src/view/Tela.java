package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

import control.ReadTxt;
import control.WriteTxt;
import model.Txt;

import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.UIManager;

public class Tela {
	
	static String nome = "";
	static String logs = "";
	
   public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
	  javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
      createWindow();
   }
   
   private static void createWindow() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {    
      JFrame frame = new JFrame("Alterar Log");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      createUI(frame);
      frame.setSize(650, 400);      
      frame.setLocationRelativeTo(null);
      
      JTextArea textArea = new JTextArea();
      textArea.setFont(new Font("Consolas", Font.PLAIN, 16));
      frame.getContentPane().add(textArea, BorderLayout.CENTER);
      frame.setVisible(true);
      textArea.setEditable(false);
   }

   private static void createUI(final JFrame frame) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{  
      JPanel panel = new JPanel();
      panel.setBorder(UIManager.getBorder("TextField.border"));
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);   

      JButton button = new JButton("Abrir");
      final JLabel label = new JLabel();

      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File  
            		(System.getProperty("user.home") + System.getProperty("file.separator")+ "Desktop"));
            int option = fileChooser.showOpenDialog(frame);
            if(option == JFileChooser.APPROVE_OPTION){
              File file = fileChooser.getSelectedFile();
              Txt arquivo = new Txt(file);
              nome = arquivo.getTxt().getName();
              label.setText("Arquivo Selecionado: " + nome);
              JTextArea textArea = new JTextArea();
              textArea.setFont(new Font("Consolas", Font.PLAIN, 16));
              frame.getContentPane().add(textArea, BorderLayout.CENTER);
              frame.setVisible(true);
              textArea.setEditable(false);
              ReadTxt read = new ReadTxt();
              logs = read.leitor(arquivo.getTxt());
              textArea.setText(logs);
            }
            else
            {
               label.setText("");
            }
         }
      });

      panel.add(button);
      
      JButton btnNewButton = new JButton("Salvar");
      panel.add(btnNewButton);
      panel.add(label);
      frame.getContentPane().add(panel, BorderLayout.NORTH);
      
      btnNewButton.addActionListener(new ActionListener() 
      {
          @Override
          public void actionPerformed(ActionEvent e)
          {
        	  WriteTxt write = new WriteTxt();
        	  write.gravador(nome, logs);
          }
      });
   }  
} 