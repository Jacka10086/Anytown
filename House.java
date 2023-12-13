package Anytown;  // 定义包名为Anytown

// House类继承自Building类
public class House extends Building {

    // 私有属性：卧室数量和是否有车库
    private int numBedrooms;
    private boolean hasGarage;
    
    // 一个静态属性来统计House对象的数量
    private static int numHouses = 0;

    // 默认构造函数
    public House() {
        super();  // 调用父类Building的默认构造函数
        this.numBedrooms = 0;  // 初始化卧室数量为0
        this.hasGarage = false;  // 初始化为没有车库
        House.numHouses++;  // 每创建一个House对象，数量加一
    }
    
    // 使用地址、业主、卧室数量和是否有车库作为参数的构造函数
    public House (String address, String owner, int numBedrooms, boolean hasGarage) {
        super(address, owner);  // 调用父类Building的构造函数
        this.numBedrooms = numBedrooms;  // 初始化卧室数量
        this.hasGarage = hasGarage;  // 初始化是否有车库
        House.numHouses++;  // 每创建一个House对象，数量加一
    }

    // 获取卧室数量的方法
    public int getNumBedrooms() {
        return this.numBedrooms;
    } 

    // 设置卧室数量的方法
    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }


    // 获取是否有车库的方法
    public boolean getHasGarage() {
        return this.hasGarage;
    }

    // 设置是否有车库的方法
    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    // 重写toString方法，用于输出House对象的信息
    public String toString() {
        return super.toString() + " and is a house with " + 
               this.numBedrooms + " bedrooms. ";
    }

    // 获取House对象数量的静态方法
    public static int getNumHouses() {
        return House.numHouses;
    }
}
