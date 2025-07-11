package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentRecordManagement {
    private Student head;

    // Add a student at the beginning
    public void addAtBeginning(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add a student at the end
    public void addAtEnd(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newStudent;
    }

    // Add a student at a specific position
    public void addAtPosition(int position, int rollNumber, String name, int age, char grade) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }

        Student newStudent = new Student(rollNumber, name, age, grade);
        Student current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newStudent.next = current.next;
        current.next = newStudent;
    }

    // Delete a student by roll number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted.");
            return;
        }

        Student current = head;
        while (current.next != null && current.next.rollNumber != rollNumber) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Student not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted.");
        }
    }

    // Search for a student by roll number
    public void searchByRollNumber(int rollNumber) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                System.out.println("Student Found:");
                displayStudent(current);
                return;
            }
            current = current.next;
        }
        System.out.println("Student not found.");
    }

    // Update grade by roll number
    public void updateGrade(int rollNumber, char newGrade) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                current.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            current = current.next;
        }
        System.out.println("Student not found.");
    }

    // Display all students
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }

        Student current = head;
        System.out.println("Student Records:");
        while (current != null) {
            displayStudent(current);
            current = current.next;
        }
    }

    // Helper method to display a student's details
    private void displayStudent(Student student) {
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Grade: " + student.grade);
        System.out.println("------------------------------");
    }
}

package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentRecordManagement {
    private Student head;

    // Add a student at the beginning
    public void addAtBeginning(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add a student at the end
    public void addAtEnd(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newStudent;
    }

    // Add a student at a specific position
    public void addAtPosition(int position, int rollNumber, String name, int age, char grade) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }

        Student newStudent = new Student(rollNumber, name, age, grade);
        Student current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newStudent.next = current.next;
        current.next = newStudent;
    }

    // Delete a student by roll number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted.");
            return;
        }

        Student current = head;
        while (current.next != null && current.next.rollNumber != rollNumber) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Student not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted.");
        }
    }

    // Search for a student by roll number
    public void searchByRollNumber(int rollNumber) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                System.out.println("Student Found:");
                displayStudent(current);
                return;
            }
            current = current.next;
        }
        System.out.println("Student not found.");
    }

    // Update grade by roll number
    public void updateGrade(int rollNumber, char newGrade) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                current.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            current = current.next;
        }
        System.out.println("Student not found.");
    }

    // Display all students
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }

        Student current = head;
        System.out.println("Student Records:");
        while (current != null) {
            displayStudent(current);
            current = current.next;
        }
    }

    // Helper method to display a student's details
    private void displayStudent(Student student) {
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Grade: " + student.grade);
        System.out.println("------------------------------");
    }
}

package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class Main {
	public static void main(String[] args) {
		StudentRecordManagement srm = new StudentRecordManagement();

		// Sample Operations
		srm.addAtEnd(101, "Divanshu", 21, 'A');
		srm.addAtBeginning(102, "Anubhav", 21, 'B');
		srm.addAtEnd(103, "Prakash", 22, 'C');
		srm.addAtPosition(2, 104, "Ayush", 21, 'B');

		srm.displayAll();

		srm.searchByRollNumber(104);

		srm.updateGrade(103, 'A');
		srm.displayAll();

		srm.deleteByRollNumber(102);
		srm.displayAll();
	}
}