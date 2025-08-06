import Entities.AuctionMediator;
import Entities.Bidder;
import Entities.Colleagues;
import Entities.Mediator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        AuctionMediator auctionMediator = new Mediator();

        Colleagues bidder1 = new Bidder("Amit", auctionMediator);
        Colleagues bidder2 = new Bidder("Rahul", auctionMediator);
        Colleagues bidder3 = new Bidder("Rohan", auctionMediator);

        auctionMediator.placeBid(bidder1, 1000);
        auctionMediator.placeBid(bidder3, 2000);
        auctionMediator.placeBid(bidder2, 4000);

    }
}
