/* TODO */

import java.time.LocalDate;
import java.time.Period;
/* TODO */

    public class Person {


        /* TODO */

        private String name;
        private LocalDate birthDate;

        /* TODO */
        private class Position {
            String name;
            double salary;

            Position(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }

            public String toString() {
                return name + ":" + salary;
            }
        }


        /* TODO */

        private Position position;


        /* TODO */
        public Person(String name, String birthDate) {
            this.name = name;
            this.birthDate = LocalDate.parse(birthDate);
        }


        /* TODO */
        public int getAge() {
            return -1 * Period.between(LocalDate.now(), this.birthDate).getYears();
        }

        /* TODO */
        public void setPosition(String name, double salary) {
            this.position = new Position(name, salary);
        }


        /* TODO */
        public Position getPosition() {
            return this.position;
        }


        /* TODO */
        @Override
        public String toString() {
            return name + "-" + getAge() + ":" + this.position;
        }

        /* TODO */
    }
