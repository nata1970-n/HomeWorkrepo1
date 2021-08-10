package HomeWork6;

 class Cat extends Animals {
     Cat(String type,String name,int maxLengthRun,int maxLengthSwim) {
        super(type,name,maxLengthRun,maxLengthSwim);

}
     @Override
     protected void swim(int maxLengthSwim){
             System.out.println("Кот не может плавать");
     }
 }
