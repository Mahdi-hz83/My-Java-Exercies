package Members;

import GymClass.GymClass;

public class StandardMember extends Member {
    public StandardMember(String name , String id) {
        super(name , id);

    }

    @Override
    public void registerToClass(GymClass gymClass) {
        if (gymClass.isAvailableForStandard()){
            System.out.println(name + " registered for " + gymClass.getClassName());
            gymClass.getRegisteredMembers().add(this);
        }
    }
}
