package com.adem.repository;

import com.adem.model.City;
import com.adem.model.Country;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CityRepository {

    @Select("select * from city order by city asc")
    @Results({
            @Result(property = "country", column = "country_id", javaType = Country.class,
                    one = @One(select = "com.adem.repository.CountryRepository.getCountry"))
    })
    List<City> getAll();
}
