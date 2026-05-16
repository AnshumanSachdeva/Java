
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainGUI extends Frame implements ActionListener {

    Label l1, l2, l3, l4;
    TextField tfName, tfRoll, tfGrade, tfDept;
    TextArea output;

    Button addBtn, displayBtn, searchBtn, updateBtn, deleteBtn, clearBtn;

    ArrayList<Student> students = new ArrayList<>();

    MainGUI() {
        setTitle("Student Management System");
        setLayout(new BorderLayout());

        // -------- TOP PANEL --------
        Panel topPanel = new Panel();
        topPanel.setLayout(new GridLayout(5, 2, 5, 5));

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

        // listeners
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

    void clearFields() {
        tfName.setText("");
        tfRoll.setText("");
        tfGrade.setText("");
        tfDept.setText("");
    }

    public void actionPerformed(ActionEvent e) {

        // ADD
        if (e.getSource() == addBtn) {
            String name = tfName.getText();
            int roll = Integer.parseInt(tfRoll.getText());
            String grade = tfGrade.getText();
            String dept = tfDept.getText();

            students.add(new Student(name, roll, grade, dept));
            output.setText("Student added successfully!");
            clearFields();
        }

        // DISPLAY
        else if (e.getSource() == displayBtn) {
            if (students.isEmpty()) {
                output.setText("No students found!");
            } else {
                String result = "Name\tRoll\tGrade\tDepartment\n";
                result += "--------------------------------------\n";

                for (Student s : students) {
                    result += s.getName() + "\t"
                            + s.getRoll() + "\t"
                            + s.getGrade() + "\t"
                            + s.getDepartment() + "\n";
                }

                output.setText(result);
            }
        }

        // SEARCH
        else if (e.getSource() == searchBtn) {
            int roll = Integer.parseInt(tfRoll.getText());
            boolean found = false;

            for (Student s : students) {
                if (s.getRoll() == roll) {
                    output.setText(
                            "Student Found:\n\n" +
                            "Name: " + s.getName() +
                            "\nRoll: " + s.getRoll() +
                            "\nGrade: " + s.getGrade() +
                            "\nDepartment: " + s.getDepartment()
                    );
                    found = true;
                    break;
                }
            }

            if (!found) {
                output.setText("Student not found!");
            }

            clearFields();
        }

        // UPDATE
        else if (e.getSource() == updateBtn) {
            int roll = Integer.parseInt(tfRoll.getText());
            boolean found = false;

            for (Student s : students) {
                if (s.getRoll() == roll) {
                    s.setName(tfName.getText());
                    s.setGrade(tfGrade.getText());
                    s.setDepartment(tfDept.getText());

                    output.setText("Student updated successfully!");
                    found = true;
                    break;
                }
            }

            if (!found) {
                output.setText("Student not found!");
            }

            clearFields();
        }

        // DELETE
        else if (e.getSource() == deleteBtn) {
            int roll = Integer.parseInt(tfRoll.getText());

            boolean removed = students.removeIf(s -> s.getRoll() == roll);

            if (removed) {
                output.setText("Student deleted successfully!");
            } else {
                output.setText("Student not found!");
            }

            clearFields();
        }

        // CLEAR
        else if (e.getSource() == clearBtn) {
            clearFields();
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}