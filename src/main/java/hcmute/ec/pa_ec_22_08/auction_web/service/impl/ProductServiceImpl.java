package hcmute.ec.pa_ec_22_08.auction_web.service.impl;

import hcmute.ec.pa_ec_22_08.auction_web.dto.req.ProductReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.entity.Product;
import hcmute.ec.pa_ec_22_08.auction_web.entity.ProductImage;
import hcmute.ec.pa_ec_22_08.auction_web.enumuration.ProductStatus;
import hcmute.ec.pa_ec_22_08.auction_web.repository.ProductRepository;
import hcmute.ec.pa_ec_22_08.auction_web.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ProductRepository productRepository;


    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(ProductReqDTO productReqDTO) throws Exception {
        log.info("Start save product into database");
        if (productReqDTO.getQuantity() > 0) {
            if (productReqDTO.isCreated()) {
                Product product = new Product();
                product.setProductName(productReqDTO.getProductName());
                product.setCategory(productReqDTO.getCategory());
                product.setQuantity(productReqDTO.getQuantity());
                product.setUsername(productReqDTO.getUsername());
                product.setProductStatus(ProductStatus.WAITING_FOR_APPROVE);
                productRepository.save(product);
                return product;
            } else {
                Optional<Product> productOptional = productRepository.findById(productReqDTO.getProductId());
                if (productOptional.isPresent() && !productOptional.get().isDelFrag()) {
                    Product existedProduct = productOptional.get();
                    Long productId = existedProduct.getId();
                    existedProduct.setProductStatus(ProductStatus.WAITING_FOR_APPROVE);
                    existedProduct.setProductName(productReqDTO.getProductName());
                    existedProduct.setCategory(productReqDTO.getCategory());
                    existedProduct.setQuantity(productReqDTO.getQuantity());
                    List<ProductImage> productImages = new ArrayList<>();
                    productReqDTO.getImages().forEach(imageURL -> {
                        ProductImage productImage = new ProductImage();
                        productImage.setImageUrl(imageURL);
                        productImages.add(productImage);
                    });

                    productRepository.save(existedProduct);
                    return existedProduct;
                }
            }
        } else {
            throw new Exception("Quantity must be more than 0");
        }
        return null;
    }

    @Override
    public List<Product> getListProduct() {
        return null;
    }

    @Override
    public Product getProductDetail(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null);
    }
}
