package dao;

public class DataBaseConfig {

    private static DataBase db;
    private Connection con;

    private DataBase() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + "clientes?user=root&useSSL=false");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao conectar com a base de dados\n");
            e.printStackTrace();
        }

    }

    public static DataBase getInstance() {

        if (db == null) {
            db = new DataBase();
        }

        return db;
    }

    public Connection getConnection() {

        return con;

    }

}
