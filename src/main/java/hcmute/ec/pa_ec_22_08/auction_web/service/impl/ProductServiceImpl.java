package hcmute.ec.pa_ec_22_08.auction_web.service.impl;

import hcmute.ec.pa_ec_22_08.auction_web.entity.Product;
import hcmute.ec.pa_ec_22_08.auction_web.repository.ProductRepository;
import hcmute.ec.pa_ec_22_08.auction_web.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public List<Product> getListProduct() {
        return null;
    }

    @Override
    public Product getProductDetail(Long id) {
        Optional<Product> product = productRepository.findByProductId(id);
        return product.orElse(null);
    }
}
