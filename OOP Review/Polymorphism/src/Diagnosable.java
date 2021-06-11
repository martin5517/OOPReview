public interface Diagnosable {
    double getTemperature();
/* TODO */
     default boolean hasFever(){
         return this.getTemperature() > 100.4;
     }
/*Declare a hasFever method that reutrns true is the temperature
is greater than 100.4*/

    int getSystolic();
    int getDiastolic();
    void setTemperature(double t);
    void setSystolic(int s);
    void SetDiastolic(int d);

/* TODO */
/*Decleare two setters. One for systolic and one for diastolic.
Check the getters to infer the parameter types.*/
}
