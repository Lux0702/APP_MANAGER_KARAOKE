package gui;

import entity.NhanVien;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThongTinCaNhan_GUI extends JDialog implements ActionListener {
    private JTextField tfMaNV, tfTenNV, tfNgaySinh, tfSDT, tfGioiTinh, tfMaCV;
    private JButton btnSave, btnCancel;

    public ThongTinCaNhan_GUI(Frame parent, NhanVien nhanVien) {
        super(parent, "Thông Tin Cá Nhân", true);

        // Cài đặt giao diện
        setLayout(new GridLayout(7, 2, 10, 10));

        JLabel lblMaNV = new JLabel("Mã nhân viên:");
        tfMaNV = new JTextField(nhanVien.getMaNV());
        tfMaNV.setEditable(false); // Không cho chỉnh sửa mã nhân viên

        JLabel lblTenNV = new JLabel("Tên nhân viên:");
        tfTenNV = new JTextField(nhanVien.getTenNV());

        JLabel lblNgaySinh = new JLabel("Ngày sinh:");
        tfNgaySinh = new JTextField(nhanVien.getNgaySinh().toString());

        JLabel lblSDT = new JLabel("Số điện thoại:");
        tfSDT = new JTextField(nhanVien.getSdt());

        JLabel lblGioiTinh = new JLabel("Giới tính:");
        tfGioiTinh = new JTextField(nhanVien.getGioiTinh());

        JLabel lblMaCV = new JLabel("Mã công việc:");
        tfMaCV = new JTextField(nhanVien.getMaNV());

        btnSave = new JButton("Lưu");
        btnCancel = new JButton("Hủy");

        // Thêm các thành phần vào giao diện
        add(lblMaNV);
        add(tfMaNV);
        add(lblTenNV);
        add(tfTenNV);
        add(lblNgaySinh);
        add(tfNgaySinh);
        add(lblSDT);
        add(tfSDT);
        add(lblGioiTinh);
        add(tfGioiTinh);
        add(lblMaCV);
        add(tfMaCV);
        add(btnSave);
        add(btnCancel);
        // Cài đặt hành động khi bấm nút
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Xử lý lưu thông tin vào cơ sở dữ liệu hoặc hệ thống
                String tenNV = tfTenNV.getText();
                String ngaySinh = tfNgaySinh.getText();
                String sdt = tfSDT.getText();
                String gioiTinh = tfGioiTinh.getText();
                String maCV = tfMaCV.getText();

                // Gọi phương thức lưu dữ liệu vào hệ thống (giả sử có hàm saveData())
                // saveData(maNV, tenNV, ngaySinh, sdt, gioiTinh, maCV);

                JOptionPane.showMessageDialog(null, "Cập nhật thông tin thành công!");
                dispose(); // Đóng cửa sổ modal
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Đóng cửa sổ modal
            }
        });

        // Cài đặt kích thước và hiển thị
        setSize(400, 300);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);

    }



    private void setLocationRelativeTo(Frame parent) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
