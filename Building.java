package Anytown; // 定义包名为Anytown

// 定义名为Building的类
public class Building {
    
    // 私有属性：地址和业主
    private String address;
    private String owner;
    
    // 一个静态属性来统计Building对象的数量
    private static int numBuildings = 0;

    // 默认构造函数
    public Building() {
        this.address = "";  // 初始化地址为空字符串
        this.owner = "";    // 初始化业主为空字符串
        Building.numBuildings++;  // 每创建一个Building对象，数量加一
    }

    // 使用地址和业主信息作为参数的构造函数
    public Building(String address, String owner) {
        this.address = address;  // 初始化地址
        this.owner = owner;      // 初始化业主
        Building.numBuildings++; // 每创建一个Building对象，数量加一
    }

    // 获取地址的方法
    public String getAddress() {
        return this.address;
    }

    // 设置地址的方法
    public void setAddress(String address) {
        this.address = address;
    }

    // 获取业主的方法
    public String getOwner() {
        return this.owner;
    }

    // 设置业主的方法
    public void setOwner(String owner) {
        this.owner = owner;
    }

    // 重写toString方法，用于输出Building对象的信息
    public String toString() {
        return this.address + " occupied by " + this.owner;
    }

    // 获取Building对象数量的静态方法
    public static int getNumBuildings() {
        return Building.numBuildings;
    }

    
    // 主函数，用于测试Building类的功能
    public static void main(String[] args) {
        // 创建三个Building对象
        Building b1 = new Building();
        Building b2 = new Building("27 Main Street", "Rex Dog Groomer");
        Building b3 = new Building("18 Low Street", "Mary Jones");

        // 为b1设置地址和业主
        b1.setAddress("3 High Street");
        b1.setOwner("Smith's Newsagent");

        // 打印三个Building对象的信息
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
