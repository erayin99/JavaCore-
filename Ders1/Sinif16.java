package Ders1;
class DatabaseManager{
    public void AddDatabase(IDatabase2 database2){
        database2.add();
    }
    public void deleteDatabase(IDatabase2 database2){
        database2.delete();
    }
    public void getDatabase(IDatabase2 database2){
        database2.get();
    }
    public void updateDatabase(IDatabase2 database2){
        database2.update();
    }
}
public class Sinif16 {
    public static void main(String[] args) {
    DatabaseManager manager = new DatabaseManager();
        manager.AddDatabase(new MySql());
        manager.AddDatabase(new OracleDatabase());
        manager.AddDatabase(new MongoDb());
    }
}
