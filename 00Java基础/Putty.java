public class Putty {
    int puttyAge;
    public Putty(String name){
        System.out.println("小狗的名字是 : " + name);
    }
    public void setAge(int age) {
        puttyAge = age;
    }
    public int getAge() {
        System.out.println("小狗的年龄是 : " + puttyAge);
        return puttyAge;
    }
    
    public static void main (String[] args) {
        Putty myPutty = new Putty("tommy");
        myPutty.setAge(2);
        myPutty.getAge();
        System.out.println("变量值 ：" + myPutty.puttyAge);
    } 
}