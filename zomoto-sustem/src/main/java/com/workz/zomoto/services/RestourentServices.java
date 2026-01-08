package com.workz.zomoto.services;

import com.workz.zomoto.dto.RestourentDto;

import java.util.List;
import java.util.Optional;

public interface RestourentServices {

    public boolean validationAndSave(RestourentDto restourentDto);
    public Optional<RestourentDto> validateAndSerach( String restoName);
    public Optional<RestourentDto> ValidateEmailAndSerch(String gmail);
    public Optional<RestourentDto> getRestourentByName(String name);
    public Boolean validateAndUpdate(RestourentDto restourentDto);

}
