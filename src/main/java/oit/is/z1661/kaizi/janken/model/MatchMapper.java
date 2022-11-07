package oit.is.z1661.kaizi.janken.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MatchMapper {
  /**
   * @return
   */
  @Select("SELECT id, user1, user2, user1Hand, user2Hand FROM matches")
  ArrayList<Match> selectAllMatch();

  @Insert("INSERT INTO matches (user1, user2, user1Hand, user2Hand, FALSE) VALUES (#{user1}, #{user2}, #{user1Hand}, #{user2Hand}, #{isActive});")
  @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
  void insertMatch(Match match);

}
