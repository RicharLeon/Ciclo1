package com.example.ciclo1.mappers;


import com.example.ciclo1.models.dto.PagosPersistenciaDTO;
import com.example.ciclo1.models.entity.Pagos;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import javax.swing.*;

@Mapper(componentModel = "spring")
public interface PagosMapper {

    PagosMapper INSTANCIA = Mappers.getMapper(PagosMapper.class);

    Pagos dtoPersistenciaToEntity(PagosPersistenciaDTO pagos);
}
