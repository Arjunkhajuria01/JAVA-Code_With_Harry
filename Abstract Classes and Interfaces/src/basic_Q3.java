/*
Add a default method fuelType() in Vehicle interface that prints "Petrol or Diesel".
Override it only in ElectricCar class to print "Electric".
 */
    interface Vehicle2 {
        default String fueltype(String a) {
            return a;
        }
    }
         class Nonelec_car implements Vehicle2{
             public void fueltype(){
                 System.out.println("Petrol");
             }
        }
        class Elec_car implements Vehicle2{
        @Override
            public String fueltype(String a) {
                return a;
            }
        }



        public class basic_Q3 {
        public static void main(String[] args) {
        Nonelec_car nc = new Nonelec_car();
        Elec_car ec = new Elec_car();
        nc.fueltype();
            System.out.println(ec.fueltype("Electric"));

        }
    }
