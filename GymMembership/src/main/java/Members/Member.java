package Members;

public abstract class Member {
    protected final String name;
    protected final String id;
    protected double accountBalance;

    public Member(String name, String id, double accountBalance) {
        this.name = name;
        this.id = id;
        this.accountBalance = 0.0;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
        System.out.println("Deposit " + amount + " to " + this.name);
    }

    public abstract void registerToClass(GymClass gymclass);
    public abstract void generateLogs();
}
