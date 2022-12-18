package hcmute.ec.pa_ec_22_08.auction_web.mapper;

import hcmute.ec.pa_ec_22_08.auction_web.dto.req.ProductReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper extends EntityMapper<ProductReqDTO, Product>{
    Product toEntity(ProductReqDTO productReqDTO);
    List<Product> toEntities(List<ProductReqDTO> productReqDTOS);
    ProductReqDTO toDTO(Product product);
    List<ProductReqDTO> toDTOs(List<Product> products);
}
