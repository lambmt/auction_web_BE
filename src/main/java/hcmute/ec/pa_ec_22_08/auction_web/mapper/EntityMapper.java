package hcmute.ec.pa_ec_22_08.auction_web.mapper;

import org.mapstruct.Mapper;

import java.util.List;

public interface EntityMapper<D,E> {
    D toDTO(E entity);
    List<D> toDTOs(List<E> entities);
    E toEntity(D dto);
    List<E> toEntities(List<D> dtos);
}
