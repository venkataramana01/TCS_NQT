abstract class College {
    String dept;
    int strength;
    int sections;
    String hod;
//    College(String dept, int strength, int sections) {
//        this.dept = dept;
//        this.strength = strength;
//        this.sections = sections;
//        System.out.println(" Dept: " + dept + " Strength: " + strength + " Sections: " + sections);
//    }
    abstract void hod(String hod);
    abstract void strength();
    abstract void sections();
}
