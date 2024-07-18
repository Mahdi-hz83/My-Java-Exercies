package org.example.Members;

public class PremiumMember extends Members {
    private final int borrowDuration = 28;

    public PremiumMember(String name , String memberId) {
        super(name, memberId);
    }

    @Override
    public int getBorrowDuration() {
        return borrowDuration;
    }
}
