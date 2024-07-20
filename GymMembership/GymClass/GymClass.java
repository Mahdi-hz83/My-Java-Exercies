package GymClass;

import Members.Member;

import java.util.ArrayList;
import java.util.List;

public class GymClass {
    private String classId;
    private String className;
    private String schedule;
    private double fee;
    private boolean availableForStandard;
    private List<Member> registeredMembers;


    public GymClass(String classId, String className, String schedule, double fee) {
        this.classId = classId;
        this.className = className;
        this.schedule = schedule;
        this.fee = fee;
        this.availableForStandard = availableForStandard;
        this.registeredMembers = new ArrayList<>();
    }

    public String getClassName(){return className;}

    public boolean isAvailableForStandard(){return availableForStandard;}


    public List<Member> getRegisteredMembers(){return registeredMembers;}


    public void registerMember(Member member){
        member.registerToClass(this);
        registeredMembers.add(member);
    }
}




