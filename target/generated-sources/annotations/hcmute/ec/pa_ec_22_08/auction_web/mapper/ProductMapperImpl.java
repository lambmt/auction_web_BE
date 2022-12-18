package hcmute.ec.pa_ec_22_08.auction_web.mapper;

import hcmute.ec.pa_ec_22_08.auction_web.dto.req.ProductReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-19T01:56:29+0700",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.17 (Amazon.com Inc.)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toEntity(ProductReqDTO productReqDTO) {
        if ( productReqDTO == null ) {
            return null;
        }

        Product product = new Product();

        return product;
    }

    @Override
    public List<Product> toEntities(List<ProductReqDTO> productReqDTOS) {
        if ( productReqDTOS == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( productReqDTOS.size() );
        for ( ProductReqDTO productReqDTO : productReqDTOS ) {
            list.add( toEntity( productReqDTO ) );
        }

        return list;
    }

    @Override
    public ProductReqDTO toDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductReqDTO productReqDTO = new ProductReqDTO();

        return productReqDTO;
    }

    @Override
    public List<ProductReqDTO> toDTOs(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductReqDTO> list = new ArrayList<ProductReqDTO>( products.size() );
        for ( Product product : products ) {
            list.add( toDTO( product ) );
        }

        return list;
    }
}
