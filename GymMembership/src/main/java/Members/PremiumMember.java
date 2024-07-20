package Members;

import GymClass.GymClass;

public class PremiumMember extends Member{
    public PremiumMember(String name , String id){
        super(name , id);
    }

    @Override
    public void registerToClass(GymClass gymClass) {
        System.out.println(name + " registered for " + gymClass.getClassName());
        gymClass.getRegisteredMembers().add(this);
    }
}
