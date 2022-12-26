package ru.vsuet.productsinthestore.repository;

import ru.vsuet.productsinthestore.domain.Otdel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class OtdelRepository implements Repository<Otdel>{
    private final Connection connection;
    public OtdelRepository(DataBaseConnector connector){
        this.connection=connector.getConnection();
    }
    @Override
    public Otdel find(String name) {
        return null;
    }

    @Override
    public void save(Otdel source) {

    }

    @Override
    public void remove(Otdel target) {

    }

    @Override
    public List<Otdel> list() {
        String query="select *from otdel;";
        try{
            PreparedStatement statement=connection.prepareStatement(query);
            ResultSet resultSet=statement.executeQuery();
            List<Otdel> otdels=new ArrayList<>();
            while (resultSet.next()){
                String nameot= resultSet.getString("nameot");
                Integer time=resultSet.getInt("time");
                String name=resultSet.getString("name");
                Integer price=resultSet.getInt("price");
                Otdel otdel=new Otdel(nameot, time, name, price);
                otdels.add(otdel);
            }
            return otdels;
        }catch (SQLException e){
            throw new RuntimeException("Error while metod list call"+e.getMessage());
        }
    }
}
