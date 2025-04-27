class Waiter implements ResturantEmployee{

    @Override
    public void washDishes() {
        // not a job of waiter
    }

    @Override
    public void seerveCustomer() {
        System.out.println("serving customer");
    }

    @Override
    public void cookFood() {
        System.out.println("Not my job");
    }

    // we should not interface this way we have to implement unnecessary methods also.

}