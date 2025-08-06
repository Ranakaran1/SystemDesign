package Entities;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements AuctionMediator {

    List<Colleagues> listColleagues = new ArrayList<>();

    @Override
    public void addBidder(Colleagues bidder) {
       listColleagues.add(bidder);
    }

    @Override
    public void placeBid(Colleagues bidder, int bidAmount) {
       for(Colleagues colleagues: listColleagues){
            if(!colleagues.getName().equals(bidder.getName())){
                colleagues.receiveBidNotification(bidAmount);
            }
       }
    }

    




    
}
