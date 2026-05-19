import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;

public class MainGUI extends Frame implements ActionListener {

    Label l1, l2, l3, l4;

    TextField tfName, tfRoll, tfGrade, tfDept;

    TextArea output;

    Button addBtn, displayBtn, searchBtn,
            updateBtn, deleteBtn, clearBtn;

    ArrayList<Student> students = new ArrayList<>();

    MainGUI() {

        setTitle("Student Management System");

        setLayout(new BorderLayout());

        // -------- TOP PANEL --------

        Panel topPanel = new Panel();

        topPanel.setLayout(
                new GridLayout(5, 2, 5, 5));

        l1 = new Label("Name:");
        l2 = new Label("Roll:");
        l3 = new Label("Grade:");
        l4 = new Label("Department:");

        tfName = new TextField();
        tfRoll = new TextField();
        tfGrade = new TextField();
        tfDept = new TextField();

        topPanel.add(l1);
        topPanel.add(tfName);

        topPanel.add(l2);
        topPanel.add(tfRoll);

        topPanel.add(l3);
        topPanel.add(tfGrade);

        topPanel.add(l4);
        topPanel.add(tfDept);

        // -------- BUTTON PANEL --------

        Panel buttonPanel = new Panel(new FlowLayout());

        addBtn = new Button("Add");
        updateBtn = new Button("Update");
        deleteBtn = new Button("Delete");
        searchBtn = new Button("Search");
        displayBtn = new Button("Display");
        clearBtn = new Button("Clear");

        buttonPanel.add(addBtn);
        buttonPanel.add(updateBtn);
        buttonPanel.add(deleteBtn);
        buttonPanel.add(searchBtn);
        buttonPanel.add(displayBtn);
        buttonPanel.add(clearBtn);

        topPanel.add(new Label(""));
        topPanel.add(buttonPanel);

        // -------- OUTPUT AREA --------

        output = new TextArea(20, 80);

        output.setEditable(false);

        add(topPanel, BorderLayout.NORTH);

        add(output, BorderLayout.CENTER);

        // -------- LISTENERS --------

        addBtn.addActionListener(this);
        updateBtn.addActionListener(this);
        deleteBtn.addActionListener(this);
        searchBtn.addActionListener(this);
        displayBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setSize(800, 600);

        setVisible(true);

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {

                dispose();
            }
        });
    }

    // -------- CLEAR FIELDS --------

    void clearFields() {

        tfName.setText("");
        tfRoll.setText("");
        tfGrade.setText("");
        tfDept.setText("");
    }

    public void actionPerformed(ActionEvent e) {

        // -------- ADD --------

        if (e.getSource() == addBtn) {

            try {

                String name = tfName.getText();

                int roll = Integer.parseInt(tfRoll.getText());

                String grade = tfGrade.getText();

                String dept = tfDept.getText();

                Student student = new Student(
                        name,
                        roll,
                        grade,
                        dept);

                // Add to ArrayList

                students.add(student);

                // Insert into DB

                Connection con = DBConnection_2.getConnection();

                String query = "INSERT INTO students VALUES (?, ?, ?, ?)";

                PreparedStatement ps = con.prepareStatement(query);

                ps.setInt(1, student.getRoll());

                ps.setString(2, student.getName());

                ps.setString(3, student.getGrade());

                ps.setString(4, student.getDepartment());

                ps.executeUpdate();

                output.setText(
                        "Student added successfully!");

            } catch (Exception ex) {

                output.setText(ex.toString());
            }

            clearFields();
        }

        // -------- DISPLAY --------

        else if (e.getSource() == displayBtn) {

            try {

                Connection con = DBConnection_2.getConnection();

                String query = "SELECT * FROM students";

                PreparedStatement ps = con.prepareStatement(query);

                ResultSet rs = ps.executeQuery();

                String result = "Name\tRoll\tGrade\tDepartment\n";

                result += "-----------------------------------------\n";

                while (rs.next()) {

                    result += rs.getString("name") + "\t"
                            + rs.getInt("roll") + "\t"
                            + rs.getString("grade") + "\t"
                            + rs.getString("department")
                            + "\n";
                }

                output.setText(result);

            } catch (Exception ex) {

                output.setText(ex.toString());
            }
        }

        // -------- SEARCH --------

        else if (e.getSource() == searchBtn) {

            try {

                int roll = Integer.parseInt(tfRoll.getText());

                Connection con = DBConnection_2.getConnection();

                String query = "SELECT * FROM students WHERE roll=?";

                PreparedStatement ps = con.prepareStatement(query);

                ps.setInt(1, roll);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    output.setText(
                            "Student Found:\n\n"
                                    + "Name: "
                                    + rs.getString("name")

                                    + "\nRoll: "
                                    + rs.getInt("roll")

                                    + "\nGrade: "
                                    + rs.getString("grade")

                                    + "\nDepartment: "
                                    + rs.getString("department"));

                } else {

                    output.setText(
                            "Student not found!");
                }

            } catch (Exception ex) {

                output.setText(ex.toString());
            }

            clearFields();
        }

        // -------- UPDATE --------

        else if (e.getSource() == updateBtn) {

            try {

                int roll = Integer.parseInt(tfRoll.getText());

                String name = tfName.getText();

                String grade = tfGrade.getText();

                String dept = tfDept.getText();

                // Update ArrayList

                for (Student s : students) {

                    if (s.getRoll() == roll) {

                        s.setName(name);

                        s.setGrade(grade);

                        s.setDepartment(dept);
                    }
                }

                // Update DB

                Connection con = DBConnection_2.getConnection();

                String query = "UPDATE students SET name=?, grade=?, department=? WHERE roll=?";

                PreparedStatement ps = con.prepareStatement(query);

                ps.setString(1, name);

                ps.setString(2, grade);

                ps.setString(3, dept);

                ps.setInt(4, roll);

                int rows = ps.executeUpdate();

                if (rows > 0) {

                    output.setText(
                            "Student updated successfully!");

                } else {

                    output.setText(
                            "Student not found!");
                }

            } catch (Exception ex) {

                output.setText(ex.toString());
            }

            clearFields();
        }

        // -------- DELETE --------

        else if (e.getSource() == deleteBtn) {

            try {

                int roll = Integer.parseInt(tfRoll.getText());

                // Remove from ArrayList

                students.removeIf(
                        s -> s.getRoll() == roll);

                // Delete from DB

                Connection con = DBConnection_2.getConnection();

                String query = "DELETE FROM students WHERE roll=?";

                PreparedStatement ps = con.prepareStatement(query);

                ps.setInt(1, roll);

                int rows = ps.executeUpdate();

                if (rows > 0) {

                    output.setText(
                            "Student deleted successfully!");

                } else {

                    output.setText(
                            "Student not found!");
                }

            } catch (Exception ex) {

                output.setText(ex.toString());
            }

            clearFields();
        }

        // -------- CLEAR --------

        else if (e.getSource() == clearBtn) {

            clearFields();

            output.setText("");
        }
    }

    public static void main(String[] args) {

        new MainGUI();
    }
}