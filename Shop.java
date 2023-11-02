package Anytown;  // 定义包名为Anytown

// Shop类继承自Building类
public class Shop extends Building {

    // 私有属性：雇员数量和平均营业额
    private int numEmployees;
    private int averageTurnover;
    
    // 一个静态属性来统计Shop对象的数量
    private static int numShops = 0;

    // 默认构造函数
    public Shop() {
        super();  // 调用父类Building的默认构造函数
        this.numEmployees = 0;  // 初始化雇员数量为0
        this.averageTurnover = 0;  // 初始化平均营业额为0
        Shop.numShops++;  // 每创建一个Shop对象，数量加一
    }

    // 使用地址、业主、雇员数量和平均营业额作为参数的构造函数
    public Shop(String address, String owner, int numEmployees, int averageTurnover) {
        super(address, owner);  // 调用父类Building的构造函数
        this.numEmployees = numEmployees;  // 初始化雇员数量
        this.averageTurnover = averageTurnover;  // 初始化平均营业额
        Shop.numShops++;  // 每创建一个Shop对象，数量加一
    }

    // 获取雇员数量的方法
    public int getNumEmployees() {
        return this.numEmployees;
    }

    // 设置雇员数量的方法
    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    // 获取平均营业额的方法
    public int getAverageTurnover() {
        return this.averageTurnover;
    }

    // 设置平均营业额的方法
    public void setAverageTurnover(int averageTurnover) {
        this.averageTurnover = averageTurnover;
    }

    // 重写toString方法，用于输出Shop对象的信息
    public String toString() {
        return super.toString() + " and is a shop with " +
               this.numEmployees + " employees ";
    }

    // 获取Shop对象数量的静态方法
    public static int getNumShops() {
        return Shop.numShops;
    }
}
