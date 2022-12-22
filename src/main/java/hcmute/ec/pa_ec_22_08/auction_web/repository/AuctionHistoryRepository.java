package hcmute.ec.pa_ec_22_08.auction_web.repository;

import hcmute.ec.pa_ec_22_08.auction_web.entity.AuctionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionHistoryRepository extends JpaRepository<AuctionHistory, Long> {
}
