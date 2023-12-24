// 创建名为AnytownTest的类
public class AnytownTest {
    public static void main(String[] args) {
        // 创建三个Building对象，其中两个使用特定的构造函数
        Building b1 = new Building();
        Building b2 = new Building("27 Main Street", "Rex Dog Groomer");
        Building b3 = new Building("18 Low Street", "Mary Jones");

        // 为b1设置地址和业主名
        b1.setAddress("3 High Street");
        b1.setOwner("Smith's Newsagent");

        // 打印三个Building对象的信息
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        
        // 打印b1的地址和业主名
        System.out.println(b1.getAddress());
        System.out.println(b1.getOwner());

        // 创建两个Shop对象，其中一个使用特定的构造函数
        Shop s1 = new Shop();
        Shop s2 = new Shop("2 Main Street", "Fred's News", 3, 300);

        // 打印s2的信息
        System.out.println(s2);

        // 创建两个House对象，其中一个使用特定的构造函数
        House h1 = new House();
        House h2 = new House("3 Main Street", "John Smith", 3, false);

        // 打印h2的信息
        System.out.println(h2);

        // 为s1设置地址、业主名、员工数量和平均营业额
        s1.setAddress("1 Low Street");
        s1.setOwner("Homer Simpson");
        s1.setNumEmployees(4);
        s1.setAverageTurnover(400);
        System.out.println(s1);

        // 为h1设置地址、业主名、卧室数量和是否有车库
        h1.setAddress("2 Low Street");
        h1.setOwner("Marge Simpson");
        h1.setNumBedrooms(5);
        h1.setHasGarage(true);
        System.out.println(h1);

        // 打印h1的卧室数量和是否有车库
        System.out.println(h1.getNumBedrooms());
        System.out.println(h1.getHasGarage());

        // 打印s1的员工数量和平均营业额
        System.out.println(s1.getNumEmployees());
        System.out.println(s1.getAverageTurnover());

        // 创建额外的House和Shop对象
        House h3 = new House();
        House h4 = new House();
        Shop s3 = new Shop();

        // 打印Building、House和Shop对象的数量
        System.out.print("There are " + Building.getNumBuildings() + " buildings");
        System.out.print(" of which " + House.getNumHouses() + " are houses and ");
        System.out.println(Shop.getNumShops() + " are shops.");
    }
}
