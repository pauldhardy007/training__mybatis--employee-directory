package org.winharleigh.training.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.winharleigh.training.model.Users;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("select * from users")
    List<Users> findAll();

    @Select("select * from users where id = #{id}")
    @Results(value = {
            @Result(property = "id", column = "id")
    })
    Users findById(String personId);

    /*
        @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property="name", column = "name"),
            @Result(property = "addresses", javaType = List.class,
                    column = "personId", many=@Many(select = "getAddresses"))
        })
     */
}
