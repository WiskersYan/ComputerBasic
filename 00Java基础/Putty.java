public class Putty {
    int puttyAge;
    public Putty(String name){
        System.out.println("С���������� : " + name);
    }
    public void setAge(int age) {
        puttyAge = age;
    }
    public int getAge() {
        System.out.println("С���������� : " + puttyAge);
        return puttyAge;
    }
    
    public static void main (String[] args) {
        Putty myPutty = new Putty("tommy");
        myPutty.setAge(2);
        myPutty.getAge();
        System.out.println("����ֵ ��" + myPutty.puttyAge);
    } 
}