public class CST extends College{
//    String dept;
//    int strength;
//    int sections;
//    String hod;
    CST(String dept, int strength, int sections){
//        super(dept,strength,sections);
        super.dept=dept;
        super.strength=strength;
        super.sections=sections;
    }
    @Override
    void strength(){
        System.out.println("strength: "+strength);
    }
    @Override
    void sections(){
        System.out.println("sections: "+sections);
    }
    @Override
    void hod(String hod){
        System.out.println("hod: "+hod);
    }
    public static void main(String[] args){
        CST c1=new CST("CSE",68,1);
        c1.sections();
        c1.strength();
        c1.hod("K.UMA");
    }
}
