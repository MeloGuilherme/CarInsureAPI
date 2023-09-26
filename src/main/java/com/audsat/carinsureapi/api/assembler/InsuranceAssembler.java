package com.audsat.carinsureapi.api.assembler;

import com.audsat.carinsureapi.api.dto.*;
import com.audsat.carinsureapi.common.LazyLoadingProvider;
import com.audsat.carinsureapi.domain.model.entity.Insurances;
import lombok.AllArgsConstructor;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class InsuranceAssembler {

    private final ModelMapper modelMapper;

    public Insurances toEntity(InsuranceCreateInput dto) {

        modelMapper.getConfiguration().setPropertyCondition(context -> true);
        modelMapper.getConfiguration().setProvider(new LazyLoadingProvider());

        return modelMapper.map(dto, Insurances.class);
    }

    public InsuranceCreateOutput toCreateOutput(Insurances entity) {

        modelMapper.getConfiguration().setPropertyCondition(context -> true);
        modelMapper.getConfiguration().setProvider(new LazyLoadingProvider());

        return modelMapper.map(entity, InsuranceCreateOutput.class);
    }

    public InsuranceSearchOutput toSearchOutput(Insurances entity) {

        modelMapper.getConfiguration().setPropertyCondition(context -> true);
        modelMapper.getConfiguration().setProvider(new LazyLoadingProvider());

        return modelMapper.map(entity, InsuranceSearchOutput.class);
    }

    public Insurances toEntityForPartialUpdate(Insurances entity, InsuranceUpdateInput dto) {

        if (entity == null || entity.getId() == null)
            return null;

        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        modelMapper.map(dto, entity);

        return entity;
    }

    public InsuranceUpdateOutput toUpdateOutput(Insurances entity) {

        modelMapper.getConfiguration().setPropertyCondition(context -> true);
        modelMapper.getConfiguration().setProvider(new LazyLoadingProvider());

        return modelMapper.map(entity, InsuranceUpdateOutput.class);
    }
}
