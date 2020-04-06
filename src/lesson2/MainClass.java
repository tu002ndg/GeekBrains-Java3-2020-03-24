package lesson2;

import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;

public class MainClass {
        public static Connection conn;
        public static Statement statmt;
        public static ResultSet resSet;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MainClass.Conn();
        MainClass.CreateDB();
        MainClass.WriteDB();
        MainClass.ReadDB();
        MainClass.CloseDB();
    }

        // --------ПОДКЛЮЧЕНИЕ К БАЗЕ ДАННЫХ--------
        public static void Conn () throws ClassNotFoundException, SQLException
        {
            conn = null;
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:TEST1.s3db");

            System.out.println("База Подключена!");
        }

        // --------Создание таблицы--------
        public static void CreateDB () throws ClassNotFoundException, SQLException
        {
            statmt = conn.createStatement();
            statmt.execute("CREATE TABLE if not exists 'users' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' text, 'phone' INT);");

            System.out.println("Таблица создана или уже существует.");
        }

        // --------Заполнение таблицы--------
        public static void WriteDB () throws SQLException
        {
            statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Petya', 125453); ");
            statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Vasya', 321789); ");
            statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Masha', 456123); ");

            System.out.println("Таблица заполнена");
        }

        // -------- Вывод таблицы--------
        public static void ReadDB () throws ClassNotFoundException, SQLException
        {
            resSet = statmt.executeQuery("SELECT * FROM users ");

            while (resSet.next()) {
                int id = resSet.getInt("id");
                String name = resSet.getString("name");
                String phone = resSet.getString("phone");
                System.out.println("ID = " + id);
                System.out.println("name = " + name);
                System.out.println("phone = " + phone);
                System.out.println();
            }

            System.out.println("Таблица выведена");
        }

        // --------Закрытие--------
        public static void CloseDB () throws ClassNotFoundException, SQLException
        {
            resSet.close();
            statmt.close();
            conn.close();
            System.out.println("Соединения закрыты");
        }
    }
