import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
//okno dialogowe dziedziczy z klasy JDialog

// Okno "About"
class AboutDialog extends JDialog {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 8169178928427118906L;

	//Konstruktor
	public AboutDialog() {

        initUI();
    }

    public final void initUI() {
    	
    	//Tytul okna
        setTitle("O programie");
        
        //Rozmiar okna
        setSize(300, 200);
        
        //Domyslna operacja przy zamykaniu okna
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        // Ustawienie lokalizacji okna wzgledem innego komponentu
        setLocationRelativeTo(null);
        
        // Blokuje glowne okno po otwarciu dialogu
        setModalityType(ModalityType.APPLICATION_MODAL);
        
        //Layout z ulozeniem komponentow wzdloz osi Y
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        //Odstep
        add(Box.createRigidArea(new Dimension(0, 10)));

        //Etykieta
        JLabel name = new JLabel("Biblioteka, 1.00");
        
        //Czcionka
    	name.setFont(new Font("Serif", Font.BOLD, 12));
    	
        //Ulozenie w poziomie
        name.setAlignmentX(0.5f);
    	
        //Dodanie etykiety do okna dialogowego
        add(name);

        //Odstep
        add(Box.createRigidArea(new Dimension(0, 50)));

        //Przycisk "Zamknij"
        JButton close = new JButton("Zamknij");
        
        //Ulozenie w poziomie
        close.setAlignmentX(0.5f);
        
        //Dodanie przycisku do okna dialogowego
        add(close);

        // Akcja podpieta pod przycisk "Zamknij"
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose();
            }
        });

    }
}

