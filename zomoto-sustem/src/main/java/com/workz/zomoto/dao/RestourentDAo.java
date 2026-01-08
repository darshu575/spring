package com.workz.zomoto.dao;

import com.workz.zomoto.dto.RestourentDto;

import java.util.List;
import java.util.Optional;

public interface RestourentDAo {

    public  boolean save(RestourentDto restourentDto);
    public Optional<RestourentDto> getByRestoName(String restoname);
    public Optional<RestourentDto>  getByGmail(String gmail);
    public List<RestourentDto> getByName(String name);
    public boolean update(RestourentDto restourentDto);
}
