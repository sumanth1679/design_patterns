package com.java.singleton;

//default-private, allowed- public, private
public enum MySingleton {
    INSTANC1,
    INSTANCE(30, "RAMA");//default & fixed(can't be changed)- public static final
int age;

MySingleton(){
    System.out.println("test");
}

String name;
   private String myInstance;//default- private, allowed- public, private, protected

    MySingleton(int age, String name){//default & always- private

        this.age = age;
        this.name = name;
       // myInstance = "MY_INSTANCE";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMyInstance(){//default- private, allowed- public, private, protected
        return myInstance;
    }


    @Override
    public String toString() {
        return "MySingleton{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
