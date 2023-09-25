package com.audsat.carinsureapi.domain.model.def;

public interface DefaultEnum<E extends Enum<E>> {

    Integer getValue();
    String getLabel();
}