package bilibili;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
@SuppressWarnings("serial")
public class AppStudent extends JFrame {

private JTextField nameField;
private JTextField PriceField;

private JTable table;
private DefaultTableModel model;
private String[] columns = { "菜单", "份量"};
private List data;
private Student tmp;

public AppStudent() {

data = new ArrayList();

getContentPane().setLayout(null);

JLabel lblName = new JLabel("菜单");
lblName.setBounds(12, 10, 50, 13);
getContentPane().add(lblName);

nameField = new JTextField();
nameField.setBounds(74, 7, 96, 19);
getContentPane().add(nameField);
nameField.setColumns(10);

JLabel lblSex = new JLabel("份量");
lblSex.setBounds(182, 10, 150, 13);
getContentPane().add(lblSex);

PriceField = new JTextField();
PriceField.setBounds(280, 7, 130, 19);
getContentPane().add(PriceField);
PriceField.setColumns(10);

JButton btnAdd = new JButton("添加");
btnAdd.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
add();
}
});
btnAdd.setBounds(0, 59, 67, 21);
getContentPane().add(btnAdd);

JButton btnDel = new JButton("删除");
btnDel.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
del();
}
});
btnDel.setBounds(0, 99, 67, 21);
getContentPane().add(btnDel);

JButton btnUpdate = new JButton("修改");
btnUpdate.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
update();
}
});
btnUpdate.setBounds(0, 139, 67, 21);
getContentPane().add(btnUpdate);

JButton btnFind = new JButton("查询");
btnFind.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
find();
}
});
btnFind.setBounds(0, 179, 67, 21);
getContentPane().add(btnFind);

model = new DefaultTableModel(columns, 0);
table = new JTable(model);
table.addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent e) {
int row = table.getSelectedRow();
nameField.setText((String) table.getValueAt(row, 0));
PriceField.setText((String) table.getValueAt(row, 1));
tmp = getInput();
}
});
JScrollPane scrollPane = new JScrollPane(table);
scrollPane.setBounds(69, 59, 460, 280);
getContentPane().add(scrollPane);

setDefaultCloseOperation(EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setSize(601, 380);
setResizable(false);
setTitle("这是一个深夜食堂！");
ImageIcon image=new ImageIcon("fengmian/beijing.jpg");
}

private Student getInput() {
Student stu = new Student();
stu.name = nameField.getText();
stu.Price = PriceField.getText();

return stu;
}

private void add() {
data.add(getInput());
showTable();

}

private void del() {
for (int i = 0; i < data.size(); i++) {
if (tmp.equals(data.get(i))) {
data.remove(i);
break;
}
}
showTable();
}

private void update() {
Student stu = getInput();
for (int i = 0; i < data.size(); i++) {
if (tmp.equals(data.get(i))) {
data.remove(i);
data.add(i, stu);
break;
}
}
showTable();
}

private void find() {
removeRows();
Student stu = getInput();
for (int i = 0; i < data.size(); i++) {
Student tmp = (Student) data.get(i);
if (tmp.equals(stu)) {
model.addRow(tmp.toArray());
break;
}
}
}

private void showTable() {
removeRows();
for (int i = 0; i < data.size(); i++) {
Student stu = (Student) data.get(i);
model.addRow(stu.toArray());
}
}

private void removeRows() {
while (model.getRowCount() > 0) {
model.removeRow(0);
}
}

public static void main(String[] args) {
new AppStudent();
}
}
