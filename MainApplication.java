import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class MainApplication {
    private final JFrame frame;
    private final JComboBox<String> flightComboBox;
    private final JTextField nameField;
    private final JButton bookButton;
    private final JTextArea ticketArea;

    
    public MainApplication() {
        frame = new JFrame("Aplikasi Pemesanan Tiket Pesawat");
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        String[] flightOptions = {"Pilih Tujuan Penerbangan", "Jakarta - Bali", "Jakarta - Surabaya", "Jakarta - Jepang", "Jakarta - Singapura"};
        flightComboBox = new JComboBox<>(flightOptions);

        
        nameField = new JTextField(20);

        
        bookButton = new JButton("Pesan Tiket");

       
        ticketArea = new JTextArea(10, 30);
        ticketArea.setEditable(false);

        
        frame.add(new JLabel("Masukkan Nama Anda:"));
        frame.add(nameField);
        frame.add(new JLabel("Pilih Tujuan Penerbangan:"));
        frame.add(flightComboBox);
        frame.add(bookButton);
        frame.add(new JScrollPane(ticketArea));

        
        bookButton.addActionListener((ActionEvent e) -> {
            bookTicket();
        });

        
        frame.setVisible(true);
    }

    
    private void bookTicket() {
        String passengerName = nameField.getText();
        String selectedFlight = (String) flightComboBox.getSelectedItem();

        
        if (selectedFlight.equals("Pilih Tujuan Penerbangan")) {
            JOptionPane.showMessageDialog(frame, "Silakan pilih tujuan penerbangan yang valid.");
            return;
        }

        
        Flight selectedFlightObj = null;

        switch (selectedFlight) {
            case "Jakarta - Bali":
                selectedFlightObj = new Flight("FL123", "Jakarta", "Bali", 1000000);
                break;
            case "Jakarta - Surabaya":
                selectedFlightObj = new Flight("FL456", "Jakarta", "Surabaya", 800000);
                break;
            case "Jakarta - Jepang":
                selectedFlightObj = new Flight("FL789", "Jakarta", "Tokyo", 5000000);
                break;
            case "Jakarta - Singapura":
                selectedFlightObj = new Flight("FL101", "Jakarta", "Singapore", 2000000);
                break;
            default:
                JOptionPane.showMessageDialog(frame, "Pemilihan tujuan penerbangan tidak valid.");
                return;
        }

        
        Ticket ticket = new Ticket(passengerName, selectedFlightObj);

        
        ticketArea.setText(ticket.getTicketDetails());
    }

   
    public static void main(String[] args) {
        new MainApplication();
    }
}


