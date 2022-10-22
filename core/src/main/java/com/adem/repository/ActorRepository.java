package com.adem.repository;

import com.adem.model.Actor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ActorRepository {

    @Select("select * from actor")
    List<Actor> getAll();
}