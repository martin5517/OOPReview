public class Task {
    public static void main(String[] args){
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);
        /* TODO */
        Resume.Education ed = r.new Education("NEIU","Computer Science");

        /* TODO */
        r.addEducation(ed);
        /* TODO */
        Resume.Experience ex = new Resume.Experience("burger king", 2017,2018);
        r.addExperience(new Resume.Experience("sears",2018,2019));
        r.addExperience(new Resume.Experience("sherwin williams", 2019,2020));
        System.out.println(r); //watch the resume print.

    }
}

