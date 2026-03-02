package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcMenuDriven {

    static final String url = "jdbc:mysql://localhost:3306/mysql_db";
    static final String user = "root";
    static final String password = "0000";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            int choice;

            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Select Student by ID");
                System.out.println("2. Insert Student");
                System.out.println("3. Update Student Marks");
                System.out.println("4. Delete Student");
                System.out.println("5. Display All Students");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        // SELECT BY ID
                        PreparedStatement ps1 = con.prepareStatement(
                                "SELECT * FROM student WHERE id=?");

                        System.out.print("Enter Id: ");
                        ps1.setInt(1, sc.nextInt());

                        ResultSet rs1 = ps1.executeQuery();

                        while (rs1.next()) {
                            System.out.println(
                                    rs1.getInt("id") + " " +
                                    rs1.getString("name") + " " +
                                    rs1.getInt("age") + " " +
                                    rs1.getString("gender") + " " +
                                    rs1.getDouble("marks")
                            );
                        }

                        rs1.close();
                        ps1.close();
                        break;

                    case 2:
                        // INSERT
                        PreparedStatement ps2 = con.prepareStatement(
                                "INSERT INTO student VALUES(?,?,?,?,?)");

                        System.out.print("Enter Id: ");
                        ps2.setInt(1, sc.nextInt());

                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        ps2.setString(2, sc.nextLine());

                        System.out.print("Enter Age: ");
                        ps2.setInt(3, sc.nextInt());

                        sc.nextLine();

                        System.out.print("Enter Gender: ");
                        ps2.setString(4, sc.nextLine());

                        System.out.print("Enter Marks: ");
                        ps2.setDouble(5, sc.nextDouble());

                        int inserted = ps2.executeUpdate();
                        System.out.println(inserted + " record inserted.");

                        ps2.close();
                        break;

                    case 3:
                        // UPDATE
                        PreparedStatement ps3 = con.prepareStatement(
                                "UPDATE student SET marks=? WHERE id=?");

                        System.out.print("Enter New Marks: ");
                        ps3.setDouble(1, sc.nextDouble());

                        System.out.print("Enter Id: ");
                        ps3.setInt(2, sc.nextInt());

                        int updated = ps3.executeUpdate();
                        System.out.println(updated + " record updated.");

                        ps3.close();
                        break;

                    case 4:
                        // DELETE
                        PreparedStatement ps4 = con.prepareStatement(
                                "DELETE FROM student WHERE id=?");

                        System.out.print("Enter Id to delete: ");
                        ps4.setInt(1, sc.nextInt());

                        int deleted = ps4.executeUpdate();
                        System.out.println(deleted + " record deleted.");

                        ps4.close();
                        break;

                    case 5:
                        // DISPLAY ALL ROWS
                        PreparedStatement ps5 = con.prepareStatement(
                                "SELECT * FROM student");

                        ResultSet rs5 = ps5.executeQuery();

                        System.out.println("\n--- Student List ---");

                        while (rs5.next()) {
                            System.out.println(
                                    rs5.getInt("id") + " " +
                                    rs5.getString("name") + " " +
                                    rs5.getInt("age") + " " +
                                    rs5.getString("gender") + " " +
                                    rs5.getDouble("marks")
                            );
                        }

                        rs5.close();
                        ps5.close();
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 6);

            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}