package HomeWork6;

 class Animals {
     protected String type;
     protected String name;
     protected int maxLengthRun;
     protected int maxLengthSwim;

     Animals(String type, String name, int maxLengthRun, int maxLengthSwim) {
         this.type = type;
         this.name = name;
         this.maxLengthRun = maxLengthRun;
         this.maxLengthSwim = maxLengthSwim;

     }

     protected void run( int lengthRun) {
         if (lengthRun <= maxLengthRun) {
             System.out.println(type + " " + name + " " + "пробежала" + " " + lengthRun + " " + "м");
         } else {
             System.out.println(type + " " + name + " " + " не может так далеко бегать.");
         }
     }

     protected void swim(int lengthSw) {
         if (lengthSw<=maxLengthSwim ) {
             System.out.println(type + " " + name + " " + "проплыла" + " "+ lengthSw + " " + "м");
         }else {
             System.out.println(type+ " не смогла так долго плыть.");
         }
     }
 }



