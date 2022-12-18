package hcmute.ec.pa_ec_22_08.auction_web.controller;

import hcmute.ec.pa_ec_22_08.auction_web.dto.req.AuctionReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.service.AuctionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auction")
public class AuctionController {
    Logger log = LoggerFactory.getLogger(AuctionController.class);

    private final AuctionService auctionService;

    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody AuctionReqDTO auctionReqDTO) {
        log.info("REST ful api to create auction slot");
        return ResponseEntity.ok(auctionService.createAuction(auctionReqDTO));
    }
}
