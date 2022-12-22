package hcmute.ec.pa_ec_22_08.auction_web.controller;

import hcmute.ec.pa_ec_22_08.auction_web.dto.req.AuctionReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.req.BidAuctionReqDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.req.SearchAuctionDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.res.AuctionResDTO;
import hcmute.ec.pa_ec_22_08.auction_web.entity.Auction;
import hcmute.ec.pa_ec_22_08.auction_web.service.AuctionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/auction-web")
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

    @GetMapping("/list-latest-auction")
    public ResponseEntity<List<AuctionResDTO>> getListLatestAuction() {
        log.info("REST ful api to get list latest auction on time {}", LocalDateTime.now());
        return ResponseEntity.ok(auctionService.getListLatestAuction());
    }

    @GetMapping("/list-all-auction")
    public ResponseEntity<List<AuctionResDTO>> getListAllAuction(@RequestBody SearchAuctionDTO searchAuctionDTO) {
        log.info("REST ful api to get list latest auction on time {}", LocalDateTime.now());
        return ResponseEntity.ok(auctionService.getListAllAuction(searchAuctionDTO));
    }

    @GetMapping("/view-detail/{id}")
    public ResponseEntity<Auction> viewDetailAuction(@PathVariable(name = "id") Long auctionId) {
        return ResponseEntity.ok(auctionService.viewDetailAuction(auctionId));
    }

    @PostMapping("/bid-auction")
    public ResponseEntity<Auction> bidAuction(@RequestBody BidAuctionReqDTO bidAuctionReqDTO) throws Exception {
        return ResponseEntity.ok(auctionService.bidAuction(bidAuctionReqDTO));
    }

}
