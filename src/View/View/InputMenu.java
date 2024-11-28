package View;

import Model.*;

import javax.swing.*;
import java.awt.*;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

public class InputMenu {
    // Komponen utama
    private JFrame frame;

    // Form fields
    private JTextField nikField, namaField, tempatLahirField, alamatField, rtRwField,
            kelDesaField, kecamatanField, statusPerkawinanField, pekerjaanField, berlakuHinggaField, kotaPembuatanField, tanggalPembuatanField;
    private JComboBox<String> golDarahBox, agamaBox, kewarganegaraanBox;
    private JLabel fotoLabel, tandaTanganLabel;
    private JButton uploadFotoButton, uploadTandaTanganButton, submitButton, cancelButton;
    private JDatePickerImpl datePicker;

    public InputMenu() {
        initInputMenu();
    }

    private JDatePickerImpl createDatePicker() {
        UtilDateModel model = new UtilDateModel();
        // Setting up properties for date picker
        Properties properties = new Properties();
        properties.put("text.today", "Today");
        properties.put("text.month", "Month");
        properties.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);
        return new JDatePickerImpl(datePanel, new DateLabelFormatter());
    }

    public class DateLabelFormatter extends JFormattedTextField.AbstractFormatter {
        private String datePattern = "yyyy-MM-dd";
        private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

        @Override
        public Object stringToValue(String text) throws ParseException {
            return dateFormatter.parse(text);
        }

        @Override
        public String valueToString(Object value) throws ParseException {
            if (value != null) {
                Calendar cal = (Calendar) value;
                return dateFormatter.format(cal.getTime());
            }
            return "";
        }
    }

    private void initInputMenu() {
        // Inisialisasi JFrame
        frame = new JFrame("Form Input KTP");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLayout(new BorderLayout());

        // Panel utama
        JPanel mainPanel = new JPanel(new GridLayout(20, 2, 10, 5));
        frame.add(mainPanel, BorderLayout.CENTER);

        // Fields
        mainPanel.add(new JLabel("NIK:"));
        nikField = new JTextField();
        mainPanel.add(nikField);

        mainPanel.add(new JLabel("Nama:"));
        namaField = new JTextField();
        mainPanel.add(namaField);

        mainPanel.add(new JLabel("Tempat Lahir:"));
        tempatLahirField = new JTextField();
        mainPanel.add(tempatLahirField);

        // Ubah kode ini untuk menggunakan enum
        mainPanel.add(new JLabel("Jenis Kelamin:"));
        JPanel jenisKelaminPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Membuat radio button berdasarkan enum JenisKelamin
        JRadioButton lakiLakiButton = new JRadioButton(JenisKelamin.LAKI_LAKI.getLabel());
        JRadioButton perempuanButton = new JRadioButton(JenisKelamin.PEREMPUAN.getLabel());
        ButtonGroup jenisKelaminGroup = new ButtonGroup();
        jenisKelaminGroup.add(lakiLakiButton);
        jenisKelaminGroup.add(perempuanButton);
        jenisKelaminPanel.add(lakiLakiButton);
        jenisKelaminPanel.add(perempuanButton);
        mainPanel.add(jenisKelaminPanel);

        mainPanel.add(new JLabel("Golongan Darah:"));
        JPanel golDarahPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JRadioButton aButton = new JRadioButton(GolDarah.A.getLabel());
        JRadioButton bButton = new JRadioButton(GolDarah.B.getLabel());
        JRadioButton abButton = new JRadioButton(GolDarah.AB.getLabel());
        JRadioButton oButton = new JRadioButton(GolDarah.O.getLabel());
        ButtonGroup golDarahGroup = new ButtonGroup();
        golDarahGroup.add(aButton);
        golDarahGroup.add(bButton);
        golDarahGroup.add(abButton);
        golDarahGroup.add(oButton);
        golDarahPanel.add(aButton);
        golDarahPanel.add(bButton);
        golDarahPanel.add(abButton);
        golDarahPanel.add(oButton);
        mainPanel.add(golDarahPanel);

        mainPanel.add(new JLabel("Alamat:"));
        alamatField = new JTextField();
        mainPanel.add(alamatField);

        mainPanel.add(new JLabel("RT/RW:"));
        rtRwField = new JTextField();
        mainPanel.add(rtRwField);

        mainPanel.add(new JLabel("Kelurahan/Desa:"));
        kelDesaField = new JTextField();
        mainPanel.add(kelDesaField);

        mainPanel.add(new JLabel("Kecamatan:"));
        kecamatanField = new JTextField();
        mainPanel.add(kecamatanField);

        // Agama ComboBox using Enum
        mainPanel.add(new JLabel("Agama:"));
        agamaBox = new JComboBox<>();
        for (Agama agama : Agama.values()) {
            agamaBox.addItem(agama.getLabel());
        }
        mainPanel.add(agamaBox);

        // Kewarganegaraan ComboBox using Enum
        mainPanel.add(new JLabel("Kewarganegaraan:"));
        kewarganegaraanBox = new JComboBox<>();
        for (Kewarganegaraan kewarganegaraan : Kewarganegaraan.values()) {
            kewarganegaraanBox.addItem(kewarganegaraan.getLabel());
        }
        mainPanel.add(kewarganegaraanBox);

        mainPanel.add(new JLabel("Status Perkawinan:"));
        statusPerkawinanField = new JTextField();
        mainPanel.add(statusPerkawinanField);

        mainPanel.add(new JLabel("Pekerjaan:"));
        pekerjaanField = new JTextField();
        mainPanel.add(pekerjaanField);

        mainPanel.add(new JLabel("Foto:"));
        fotoLabel = new JLabel("Belum diunggah");
        mainPanel.add(fotoLabel);
        uploadFotoButton = new JButton("Upload Foto");
        mainPanel.add(uploadFotoButton);

        mainPanel.add(new JLabel("Tanda Tangan:"));
        tandaTanganLabel = new JLabel("Belum diunggah");
        mainPanel.add(tandaTanganLabel);
        uploadTandaTanganButton = new JButton("Upload Tanda Tangan");
        mainPanel.add(uploadTandaTanganButton);

        mainPanel.add(new JLabel("Berlaku Hingga:"));
        berlakuHinggaField = new JTextField();
        mainPanel.add(berlakuHinggaField);

        mainPanel.add(new JLabel("Kota Pembuatan:"));
        kotaPembuatanField = new JTextField();
        mainPanel.add(kotaPembuatanField);

        mainPanel.add(new JLabel("Tanggal Pembuatan (YYYY-MM-DD):"));
        tanggalPembuatanField = new JTextField();
        mainPanel.add(tanggalPembuatanField);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        submitButton = new JButton("Submit");
        cancelButton = new JButton("Cancel");
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Action Listeners
        uploadFotoButton.addActionListener(e -> uploadFile(fotoLabel));
        uploadTandaTanganButton.addActionListener(e -> uploadFile(tandaTanganLabel));
        submitButton.addActionListener(e -> handleSubmit());
        cancelButton.addActionListener(e -> frame.dispose());

        // Tampilkan JFrame
        frame.setVisible(true);
    }

    private void uploadFile(JLabel label) {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
            label.setText(fileChooser.getSelectedFile().getName());
        }
    }

    private void handleSubmit() {
        Calendar selectedDate = (Calendar) datePicker.getModel().getValue();
        String formattedDate = "";
        if (selectedDate != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            formattedDate = dateFormat.format(selectedDate.getTime());
        }

        String nik = nikField.getText();
        String nama = namaField.getText();

        JOptionPane.showMessageDialog(frame, "Data berhasil disimpan untuk NIK: " + nik + "\nTanggal Lahir: " + formattedDate);
    }
    
}
