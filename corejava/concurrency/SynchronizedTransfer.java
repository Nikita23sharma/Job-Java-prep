class SynchronzedTransfer {
    private int amount = 0;

    public synchronized void transfer(int amount) {
        this.amount += amount;
    }

    public synchronized int getAmount() {
        return amount;
    }
}
