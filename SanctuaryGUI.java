import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Swing GUI for searching and viewing animals in a sanctuary.
 *
 * Layout:
 *   NORTH:  Search field, type combo box, injured checkbox, search button
 *   CENTER: Scrollable text area showing results
 *   SOUTH:  Status label showing match count
 */
public class SanctuaryGUI extends JFrame {
    // TODO M10: Declare private Sanctuary field
    private Sanctuary sanctuary;

    // TODO M9: Declare GUI components:
    private JTextField nameField;
    private JComboBox<String> typeCombo;
    private JCheckBox injuredCheck;
    private JButton searchButton;
    private JTextArea resultArea;
    private JLabel statusLabel;


    public SanctuaryGUI() {
        super("Caribbean Wildlife Conservation Tracker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);

        // TODO M9: Set layout to BorderLayout
        this.setLayout(new BorderLayout());

        // TODO M9: Build NORTH panel (FlowLayout)
        //   Add JLabel "Search:", JTextField (14 columns), JLabel "Type:",
        //   JComboBox with {"All","Bird","Reptile","Marine"},
        //   JCheckBox "Injured/Critical only", JButton "Search"
        //   Add panel to NORTH
        nameField = new JTextField(14);
        String[] types = {"All", "Bird", "Reptile", "Marine"};
        typeCombo = new JComboBox<>(types);
        injuredCheck = new JCheckBox("Injured/Critical only");
        searchButton = new JButton("Search");

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        topPanel.add(new JLabel("Search:"));
        topPanel.add(nameField);
        topPanel.add(new JLabel("Type:"));
        topPanel.add(typeCombo);
        topPanel.add(injuredCheck);
        topPanel.add(searchButton);

        add(topPanel, BorderLayout.NORTH);

        // TODO M9: Build CENTER
        //   Create JTextArea, set monospaced font, make non-editable
        //   Wrap in JScrollPane, add to CENTER
        resultArea = new JTextArea(15, 60);
        resultArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        resultArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(resultArea);

        add(scrollPane, BorderLayout.CENTER);

        // TODO M9: Build SOUTH
        //   Create JLabel "Ready", add to SOUTH
        statusLabel = new JLabel("Ready");

        add(statusLabel, BorderLayout.SOUTH);

        // TODO M11: Add ActionListener to searchButton that calls runSearch()

        // TODO M11: Add KeyListener to nameField that calls runSearch() on keyReleased

        setLocationRelativeTo(null);
    }

    /**
     * Stores the Sanctuary to search over.
     * TODO M10: Implement setModel
     */
    public void setModel(Sanctuary s) {
        // TODO M10: Store the sanctuary reference
        // TODO M10: Optionally update the window title
        this.sanctuary = s;
        this.setTitle("Caribbean Wildlife Trust - " + s.getName());
    }

    /**
     * Filters the sanctuary's animals based on the GUI controls and
     * displays matching results.
     *
     * TODO M11: Implement runSearch
     *
     * Steps:
     * 1. Get text from nameField (trim, convert to lowercase)
     * 2. Get selected type from typeCombo
     * 3. Get checkbox state from injuredCheck
     * 4. Loop through sanctuary's animals:
     *    - If text is non-empty, keep only animals whose species or nickname
     *      contains the text (case-insensitive)
     *    - If type is not "All", keep only matching type
     *    - If checkbox is selected, keep only "Injured" or "Critical" animals
     * 5. Build result string and set in resultArea
     * 6. Set statusLabel: "No matches", "1 result", or "N results"
     */
    private void runSearch() {
        // TODO M11: Implement filtering and display
    }

    /**
     * Creates a demo sanctuary, populates it, and launches the GUI.
     *
     * TODO M12: Implement main method
     */
    public static void main(String[] args) {
        // TODO M12: Create Sanctuary, add animals, create GUI, wire model, show
    }
}
