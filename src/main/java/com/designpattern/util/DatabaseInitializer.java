import java.sql.*;

import com.designpattern.util.DatabaseSingleton;

public class DatabaseInitializer {
    public DatabaseInitializer(){}
    public void initialize() {
        try (Connection conn = DatabaseSingleton.getInstance()) {
            if (conn != null) {
                System.out.println("Database connected.");
                initializeTables(conn);
            }
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }

    private void initializeTables(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();

        // Users Table
        stmt.execute("CREATE TABLE IF NOT EXISTS Users (" +
                     "username TEXT PRIMARY KEY, " +
                     "password TEXT NOT NULL, " +
                     "role TEXT NOT NULL);");

        // Students Table
        stmt.execute("CREATE TABLE IF NOT EXISTS Students (" +
                     "id TEXT PRIMARY KEY, " +
                     "name TEXT NOT NULL, " +
                     "branch TEXT NOT NULL);");

        // Branch Table
        stmt.execute("CREATE TABLE IF NOT EXISTS Branches (" +
                     "id TEXT PRIMARY KEY, " +
                     "name TEXT NOT NULL);");

        // Modules Table
        stmt.execute("CREATE TABLE IF NOT EXISTS Modules (" +
                     "code TEXT PRIMARY KEY, " +
                     "name TEXT NOT NULL, " +
                     "branchId TEXT NOT NULL, " +
                     "FOREIGN KEY(branchId) REFERENCES Branches(id));");

        // Module Elements Table
        stmt.execute("CREATE TABLE IF NOT EXISTS ModuleElements (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     "name TEXT NOT NULL, " +
                     "coefficient REAL NOT NULL, " +
                     "moduleCode TEXT NOT NULL, " +
                     "FOREIGN KEY(moduleCode) REFERENCES Modules(code));");

        // Evaluation Modes Table
        stmt.execute("CREATE TABLE IF NOT EXISTS EvaluationModes (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     "name TEXT NOT NULL, " +
                     "weight REAL NOT NULL);");

        // Grades Table
        stmt.execute("CREATE TABLE IF NOT EXISTS Grades (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     "studentId TEXT NOT NULL, " +
                     "elementId INTEGER NOT NULL, " +
                     "grade REAL, " +
                     "FOREIGN KEY(studentId) REFERENCES Students(id), " +
                     "FOREIGN KEY(elementId) REFERENCES ModuleElements(id));");

        System.out.println("Tables initialized.");
    }
}
