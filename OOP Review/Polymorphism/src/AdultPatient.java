import java.util.ArrayList;

public class AdultPatient extends Person implements Diagnosable,Employable {
    double temperature;
    int systolic;
    int diastolic;
    ArrayList<String> jobs;

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public int getSystolic() {
        return systolic;
    }

    @Override
    public int getDiastolic() {
        return diastolic;
    }

    @Override
    public void setTemperature(double t) {
        this.temperature = t;
    }

    @Override
    public void setSystolic(int s) {
        this.systolic = s;
    }

    @Override
    public void SetDiastolic(int d) {
        this.diastolic=d;
    }

    @Override
    public ArrayList<String> getPreviousJobs() {
        return this.jobs;
    }

    @Override
    public void addJob(String job) {
        if (this.jobs == null)
            this.jobs = new ArrayList<>();
        this.jobs.add(job);
    }
}
