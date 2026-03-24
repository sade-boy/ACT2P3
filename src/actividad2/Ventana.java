package actividad2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ventana extends JFrame{

	public Ventana() {
				
				
				this.setSize(1100,500);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setLocationRelativeTo(null);
				this.setMinimumSize(new Dimension(500,500));
				this.setMaximumSize(new Dimension(1100,500));
				this.setTitle("Tabla");
				this.setLayout(null);
	
	JMenuBar barra = new JMenuBar();
	
	JMenu archivo = new JMenu("ARCHIVO");
	
	JMenu open = new JMenu("Abri");
	JMenu close = new JMenu("Cerrar");
	JMenu save = new JMenu("Guardar");
	JMenu newFile = new JMenu("Nuevo");
	
	archivo.add(open);
	archivo.add(close);
	archivo.add(save);
	archivo.add(newFile)
;	
	barra.add(archivo);
	
	JMenu menuItem = new JMenu("Otros");
	
	archivo.addSeparator();
	
			
	JMenu submenu = new JMenu("Itemsss");
	
	submenu.add(menuItem);
	
	menuItem = new JMenu("Another Item");
	submenu.add(menuItem);
	archivo.add(submenu);
	
	this.setJMenuBar(barra);
	
	this.setVisible(true);
	
	

	JPanel users = new JPanel(); 
	users.setSize(600,600);
	users.setLocation(0,0);
	users.setBackground(Color.decode("#0a1a2f")); 
	users.setLayout(null);
	this.add(users);

	JLabel users_title = new JLabel("Lista de semestres escolares");
	users_title.setBounds(30,20,400,30);
	users_title.setForeground(Color.decode("#e6f0ff")); 
	users_title.setFont(new Font("Arial", Font.BOLD, 22));
	users.add(users_title);

	JLabel total_semestres = new JLabel("Semestres");
	total_semestres.setBounds(30,130,170,70);
	total_semestres.setForeground(Color.decode("#e6f0ff"));
	total_semestres.setBackground(Color.decode("#0a1a2f")); 
	total_semestres.setOpaque(true);
	total_semestres.setFont(new Font("Arial", Font.BOLD, 22));
	users.add(total_semestres);

	JLabel num_semestres = new JLabel("8");
	num_semestres.setBounds(80,170,100,30);
	num_semestres.setForeground(Color.decode("#0a1a2f"));
	num_semestres.setFont(new Font("Arial", Font.BOLD, 22));
	users.add(num_semestres);

	JButton export = new JButton("Exportar");
	export.setBounds(375, 150, 100, 40);
	export.setBackground(Color.decode("#1f4fd8")); 
	export.setForeground(Color.white);
	users.add(export);

	JButton add = new JButton("Añadir");
	add.setBounds(475, 150, 100, 40);
	add.setBackground(Color.decode("#3b82f6")); 
	add.setForeground(Color.white);
	users.add(add);

	String [] table_head = {"semestre", "grupo", "alumnos", "clase"};

	String[][] table_contend = {
	    {"1° semestre", "a", "30", "matematicas"},
	    {"1° semestre", "b", "28", "español"},
	    {"2° semestre", "a", "32", "historia"},
	    {"3° semestre", "a", "27", "quimica"},
	    {"4° semestre", "b", "29", "fisica"},
	    {"5° semestre", "a", "31", "biologia"},
	    {"6° semestre", "b", "26", "ingles"},
	    {"7° semestre", "a", "24", "programacion"},
	    {"8° semestre", "a", "20", "proyecto final"},
	    {"8° semestre", "b", "18", "practicas"}
	};

	JTable table = new JTable(table_contend, table_head);
	table.setBackground(Color.decode("#e6f0ff")); 
	table.setForeground(Color.decode("#0a1a2f"));
	table.getTableHeader().setBackground(Color.decode("#1f4fd8"));
	table.getTableHeader().setForeground(Color.white);

	JScrollPane scrollPane = new JScrollPane(table);
	scrollPane.setBounds(30,215,540,250);
	users.add(scrollPane);

	users.repaint();
	users.revalidate();
	}

}
