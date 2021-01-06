package Demo15_Generic;

public class MyGenericMethod {
    public <YES> void show(YES yes){
        System.out.println(yes.getClass());
    }
    public <YES> YES show2(YES yes){
        return yes;
    }
}
