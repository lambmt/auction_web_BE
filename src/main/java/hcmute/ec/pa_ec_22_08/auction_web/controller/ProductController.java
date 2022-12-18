package hcmute.ec.pa_ec_22_08.auction_web.controller;

import hcmute.ec.pa_ec_22_08.auction_web.dto.req.ProductReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.entity.Product;
import hcmute.ec.pa_ec_22_08.auction_web.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.protocol.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auction/product")
public class ProductController {

    Logger log = LoggerFactory.getLogger(ProductController.class);

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping("/save")
    public ResponseEntity<Product> saveProduct(ProductReqDTO productReqDTO) throws Exception {
        log.info("REST ful api to create product");
        return ResponseEntity.ok(productService.saveProduct(productReqDTO));
    }

    @GetMapping("/list-product")
    public ResponseEntity<List<Product>> getListProduct() {
        log.info("REST ful api to get list product");
        return ResponseEntity.ok(productService.getListProduct());
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Product> getProductDetail(@PathVariable(name = "id") Long productId) {
        log.info("REST ful api to get product detail");
        Product existedProduct = productService.getProductDetail(productId);
        if (existedProduct != null) {
            return ResponseEntity.ok(existedProduct);
        } else return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
