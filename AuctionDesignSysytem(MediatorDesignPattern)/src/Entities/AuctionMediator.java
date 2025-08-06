package Entities;

public interface AuctionMediator {
    void addBidder(Colleagues bidder);
    void placeBid(Colleagues bidder, int bidAmount);
}
