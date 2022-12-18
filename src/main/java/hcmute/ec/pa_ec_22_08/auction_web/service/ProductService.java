package hcmute.ec.pa_ec_22_08.auction_web.service;

import hcmute.ec.pa_ec_22_08.auction_web.dto.req.ProductReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.entity.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(ProductReqDTO productReqDTO) throws Exception;
    List<Product> getListProduct();
    Product getProductDetail(Long id);
}
