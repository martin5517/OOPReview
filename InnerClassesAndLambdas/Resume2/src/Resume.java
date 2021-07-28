/* TODO */
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Resume {
    /* TODO */
    public class Education {
        String school;
        String major;

        public String getSchool() {
            return school;
        }

        public String getMajor() {
            return major;
        }

        public Education(String school, String major) {
            this.school = school;
            this.major = major;

        }

        public String toString() {
            return major + "at" + school;
        }
    }

    /* TODO */
    public static class Experience {
        int fromYear;
        int toYear;
        String title;

        public Experience(String title, int from, int to) {
            this.title = title;
            this.fromYear = from;
            this.toYear = to;

        }

        public String toString() {
            return fromYear + ":" + toYear + ":" + title;
        }
    }

    /* TODO */
    private Person p;
    private List<Education> ed;
    private PriorityQueue<Experience> ex;

    public Resume(Person p) {
        this.p = p;
        ed = new ArrayList<>();
        ex = new PriorityQueue<>(new Comparator<Experience>() {
            @Override
            public int compare(Experience experience, Experience t1) {
                return t1.toYear - experience.toYear;

            }
        });
    }
        public PriorityQueue getExperience () {
            return ex;
        }
        /* TODO */
        public void addEducation (Education e){
            ed.add(e);
        }
        public void addExperience (Experience e){
            ex.add(e);
        }
        @Override
        public String toString () {
            String s = p.toString();
            s += "Experience";
            for (Experience e : ex)
                s += "\n" + e;
            s += "Education";
            for (Education e : ed)
                s += "\n" + e;
            return s;
        }
    }



