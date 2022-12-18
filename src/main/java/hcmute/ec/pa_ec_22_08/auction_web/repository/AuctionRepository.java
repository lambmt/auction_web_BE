package hcmute.ec.pa_ec_22_08.auction_web.repository;

import hcmute.ec.pa_ec_22_08.auction_web.entity.Auction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuctionRepository extends JpaRepository<Auction, Long> {
    Optional<Auction> findByProductId(Long productId);
}
