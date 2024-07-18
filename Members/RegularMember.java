package org.example.Members;

public class RegularMember extends Members{
    private final int borrowDuration = 14;

    public RegularMember(String name , String memberId){
        super(name, memberId);
    }

    @Override
    public int getBorrowDuration() {
        return borrowDuration;
    }
}
