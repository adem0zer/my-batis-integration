package com.adem.repository;

import com.adem.model.Country;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CountryRepository {
    @Select("select * from country where country_id = #{countryId} order by country desc")
    Country getCountry(Long countryId);
}
