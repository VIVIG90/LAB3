import javax.swing.SwingUtilities;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
      			Biblioteka bib = new Biblioteka();
                bib.setVisible(true);
            }
        });
	}
}
