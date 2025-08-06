package Entities;

public class Bidder implements Colleagues{

    String name;
    AuctionMediator auctionMediator;

    

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
       auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
       System.out.println("Hey! "+ name+ " Bid amount has increased, New amount is: " + bidAmount);
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
