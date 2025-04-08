package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public void empezando () {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFrame frame = new VentanaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 543);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu Tienda");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmInsertar = new JMenuItem("Insertar Móvil");
		mntmInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.MAXIMIZED_BOTH);
				InsertarMovil i = new InsertarMovil();
				nuevoPanel(i);
			}
		});
		mnNewMenu.add(mntmInsertar);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu.add(separator_5);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar Móvil");
		mnNewMenu.add(mntmConsultar);
		
		JSeparator separator_4 = new JSeparator();
		mnNewMenu.add(separator_4);
		
		JMenuItem mntmModifical = new JMenuItem("Modificar Móvil");
		mnNewMenu.add(mntmModifical);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu.add(separator_3);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar Móvil");
		mnNewMenu.add(mntmEliminar);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);
		
		JMenuItem mntmAnadirCliente = new JMenuItem("Añadir Cliente");
		mntmAnadirCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AñadirCliente a = new AñadirCliente();
				nuevoPanel(a);
			}
		});
		mnNewMenu.add(mntmAnadirCliente);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmRealizarVenta = new JMenuItem("Realizar Venta");
		mnNewMenu.add(mntmRealizarVenta);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmInfoCompra = new JMenuItem("Información Compra");
		mnNewMenu.add(mntmInfoCompra);
		
		JMenu mnNewMenu_1 = new JMenu("|");
		menuBar.add(mnNewMenu_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
	}
	
	public void nuevoPanel(JPanel p) {
		contentPane.removeAll();
		contentPane.add(p);
		contentPane.repaint();
		contentPane.revalidate();
	}
}
