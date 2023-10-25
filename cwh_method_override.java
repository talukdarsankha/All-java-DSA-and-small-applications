

        //  method override ----->>>>

        class phonee {
            public void call(){
                System.out.println("calling in phone");
            }

            public void camera(){
                System.out.println("taking photos");
            }
        }

        class smartphonee extends phone {
            @Override
            public void call(){
                System.out.println("calling for smartphone");
            }
            public void see(){
                System.out.println("see youtube");
            }
        }
      public class cwh_method_override{
          public static void main(String[] args) {


                phonee pp = new phonee();
                pp.call();
                pp.camera();
                smartphonee ss = new smartphonee();
                ss.call();
                ss.camera();
                ss.see();
            }
        }
