import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


// Klasa Biblioteka
public class Biblioteka extends JFrame {

	private static final long serialVersionUID = 8311299822007325131L;


	/**
	 * Konstruktor
	 */
	public Biblioteka() {
		initUI(this);
	}

	// Metoda inicjalizująca GUI
	public final void initUI(final Biblioteka bib) {
		
        //Tytul okna
        setTitle("Biblioteka");
        
        //Rozmiar okna
        setSize(600, 700);
        
        // Ustawienie lokalizacji okna wzgledem innego komponentu
        setLocationRelativeTo(null);
        
        //Domyslna operacja przy zamykaniu okna - wyjscie z aplikacji przy zamknieciu okna
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Panel
		JPanel panel = new JPanel();
		
        // Dodanie panelu do JFrame (glownego okna aplikacji)
        add(panel);

		//Pole tekstowe
		final JTextArea textArea = new JTextArea("");
		
		//Rozmiar pola tekstowego
        textArea.setPreferredSize(new Dimension(300, 200));
        
        //Czy ma byc edytowalne
        textArea.setEditable(true);
        
        //Dodanie pola tekstowego do panelu
        panel.add(textArea);
     
		// Dostosowanie rozmiaru okna do jego subkomponentow - wywolanie metody pack
        pack();
        
		// Pasek menu
        JMenuBar menubar = new JMenuBar();
        
        // Dodanie paska menu
        setJMenuBar(menubar);
        
		// Menu "Biblioteka"
        JMenu lib = new JMenu("Biblioteka");
        
        // Dodanie menu "Biblioteka" do paska menu
        menubar.add(lib);
        
		//Skrot klawiszowy - VK_B to ALT B
        lib.setMnemonic(KeyEvent.VK_B);
        
        // Pozycja menu: Zakoncz
        JMenuItem eMenuItem = new JMenuItem("Zakoncz");
        
        // Dodanie pozycji do menu "Biblioteka"
        lib.add(eMenuItem);
        
        //Skrot klawiszowy
        eMenuItem.setMnemonic(KeyEvent.VK_Z);
        
        //Podpowiedz po najechaniu myszka
        eMenuItem.setToolTipText("Zakoncz program");
        
        // Podpiecie akcji pod "Zakoncz"
        eMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
        		System.exit(0);
            }
        });

        // Menu "Pomoc"
        JMenu help = new JMenu("Pomoc");
        
        // Dodanie "Pomoc" do paska menu
        menubar.add(help);
        
        //Skrot klawiszowy
        help.setMnemonic(KeyEvent.VK_P);
        
        // Pozycja menu: O programie
        JMenuItem about = new JMenuItem("O programie");
        
        // Dodanie pozycji "O programie" do menu "Pomoc"
        help.add(about);
        
        //Skrot klawiszowy
        about.setMnemonic(KeyEvent.VK_O);
        
        // Podpiecie akcji pod "O programie"
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                AboutDialog ad = new AboutDialog();
                ad.setVisible(true);
            }
        });

    }

}

