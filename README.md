# JavaLearning

## 1、输入

```java
import java.util.Scanner;

//2. 创建键盘录入数据的对象
Scanner sc = new Scanner(System.in);
//3. 接收数据
System.out.print("请录入一个整数：");
int i = sc.nextInt();
//4. 输出数据
System.out.println("i:"+i);
```

## 2、随机

```java
import java.util.Random;

//2. 创建键盘录入数据的对象
Random r = new Random(90);
for(int i = 0; i < 3; i++){
    //3. 随机生成一个数据
    int number = r.nextInt(10);
    //4. 输出数据
    System.out.println("number:"+ number);
}
```

## 3、ArrayList

```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
String s1 = "ABC";
list.add(s1);
```

## 4、static 关键字

静态成员和静态方法可以使用==类名==访问

静态成员，可以统计对象总数

```java
static int idCounter = 0; // 静态成员
static void printInfo(){ // 静态方法
    System.out.println("yes!");
}

Student.idCounter; // 访问静态成员
Student.printInfo(); // 访问静态方法
```

## 5、Arrays

```java
import java.util.Arrays;

int[] arr = {2,34,35,4,657,8,69,9};
String s = Arrays.toString(arr);
System.out.println(s);
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
```

## 6、继承

## 7、接口

```java
interface LiveAble {
    void eat();
    public abstract void sleep();
}

class Animal implements LiveAble {
    public void eat(){
        System.out.println("吃东西");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
```

## 8、多态

## 9、内部类

## 10、红包类

## 11、Object 类

## 12、DateTime 类

## 13、StringBuilder 类

## 14、Collection 类

## 15、迭代器

## 16、泛型

## 17、斗地主

## 18、List 类

## 19、排序比较器 Comparator

## 20、学生排序

## 21、Map 类

## 22、异常类

## 23、多线程

## 24、线程安全

## 25、生产者消费者

## 26、多线程信号

## 27、线程池

## 28、Lambda 表达式

## 29、文件

## 30、输入输出流

## 31、序列化

## 32、网络编程

## 33、上传文件到服务器

## 34、WebServer

## 35、测试类

## 36、反射