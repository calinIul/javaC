package lab9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class MainApp {
    public static void main(String[] args) throws SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/lab9";
        String sql
                ="select * from persoane";
        Connection connection= DriverManager.getConnection(url, "root", "root");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        afisare_tabela(statement, "First print");
        afisare_persoane(statement, "Afisare persoane si excursii");
        statement.close();
        connection.close();

    }
    public static void afisare_tabela(Statement statement, String mesaj) throws IOException {

        String sql
                ="select * from persoane";
        System.out.println("\n---"
                +mesaj
                +"---");
        try(ResultSet rs
                    =statement.executeQuery(sql)) {
            while (rs.next())
                System.out.println("id=" + rs.getInt(1) + ", nume=" + rs.getString(2) + ",varsta="
                        + rs.getInt(3));
        } catch (SQLException
                e) {
            e.printStackTrace();
        }
    }
    public static void afisare_persoane(Statement statement, String mesaj) {
        String sql = "SELECT p.nume, e.destinatia " +
                "FROM persoane p, excursii e " +
                "WHERE p.id = e.id_persoana";
        System.out.println("\n---"
                +mesaj
                +"---");
        try(ResultSet rs
                    =statement.executeQuery(sql)) {
            while (rs.next())
                System.out.println("nume=" + rs.getString(1) + ", destinatie= " + rs.getString(2));

        } catch (SQLException
                e) {
            e.printStackTrace();
        }
    }
    public static void afisare_excursii(Statement statement, String mesaj) throws IOException {

        String sql
                ="select * from excursii";
        System.out.println("\n---"
                +mesaj
                +"---");
        try(ResultSet rs
                    =statement.executeQuery(sql)) {
            while (rs.next())
                System.out.println("id=" + rs.getInt(1) + ", id_pers=" + rs.getInt(3) + ",destinatia="
                        + rs.getString(3) + rs.getDate(4));
        } catch (SQLException
                e) {
            e.printStackTrace();
        }
    }
    public static void adaugare(Connection connection) throws SQLException {
        String sql="insert into persoane values (?,?,?)";
        String sql_id = "SELECT MAX(id) as idul FROM persoane "
                ;
        int id;
        try (PreparedStatement ps = connection.prepareStatement(sql_id)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            System.out.println(rs.getInt(1));
            id = rs.getInt("idul");
        }
        try(PreparedStatement ps=connection.prepareStatement(sql)) {
            ps.setInt(1, id + 1);
            System.out.println("Nume: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String nume = reader.readLine();
            System.out.println("Varsta: ");
            int varsta = Integer.parseInt(reader.readLine());
            ps.setString(2, nume);
            ps.setInt(3, varsta);
            int nr_randuri=ps.executeUpdate();
            System.out.println("\nNumar randuri afectate de adaugare="+nr_randuri);
        } catch (SQLException e) {
            System.out.println(sql);
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void actualizare(Connection connection,int id,int varsta){
        String sql="update persoane set varsta=? where id=?";
        try(PreparedStatement ps=connection.prepareStatement(sql)) {
            ps.setInt(1, varsta);
            ps.setInt(2, id);
            int nr_randuri=ps.executeUpdate();
            System.out.println("\nNumar randuri afectate de modificare="+nr_randuri);
        } catch (SQLException e) {
            System.out.println(sql);
            e.printStackTrace();
        }
    }
    public static void stergere(Connection connection,int id){
        String sql="delete from persoane where id=?";
        try(PreparedStatement ps=connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            int nr_randuri=ps.executeUpdate();
            System.out.println("\nNumar randuri afectate de modificare="+nr_randuri);
        }
        catch (SQLException e) {
            System.out.println(sql);
            e.printStackTrace();
        }
    }




}
