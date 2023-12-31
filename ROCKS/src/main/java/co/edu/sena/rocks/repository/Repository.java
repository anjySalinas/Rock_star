package co.edu.sena.rocks.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Repository <T>{
    List<T> listAllObj() throws SQLException;

    T byIdOBj(Integer id)throws  SQLException;

    Integer saveObj(T t) throws SQLException;

    void deleteObj(Integer id) throws SQLException;

    T createObj(ResultSet rs) throws SQLException;
}
