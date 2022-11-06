package oit.is.z1661.kaizi.janken.model;

import java.util.ArrayList;

//import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

  /**
   * @return
   */
  @Select("SELECT id, userName FROM users")
  ArrayList<User> selectAllUser();

  @Select("SELECT id, userName FROM users where userName = #{name}")
  User selectByname(String name);

  @Select("SELECT id, userName FROM users where id = #{id}")
  User selectByid(int id);
}
