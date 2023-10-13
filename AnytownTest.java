package Anytown;

public class AnytownTest {
    public static void main(String[] args) {
        Building b1 = new Building();
        Building b2 = new Building("27 Main Street", "Rex Dog Groomer");
        Building b3 = new Building("18 Low Street", "Mary Jones");
    
        b1.setAddress("3 High Street");
        b1.setOwner("Smith's Newsagent");
    
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println(b1.getAddress());
        System.out.println(b1.getOwner());

        Shop s1 = new Shop();
        Shop s2 = new Shop("2 Main Street", "Fred's News",
                           3, 300);

        System.out.println(s2);
        
        House h1 = new House();
        House h2 = new House("3 Main Street", "John Smith", 
                              3, false );
        System.out.println(h2); 

        s1.setAddress("1 Low Street");
        s1.setOwner("Homer Simpson");
        s1.setNumEmployees(4);
        s1.setAverageTurnover(400);
        System.out.println(s1);

        h1.setAddress("2 Low Street");
        h1.setOwner("Marge Simpson");
        h1.setNumBedrooms(5);
        h1.setHasGarage(true);
        System.out.println(h1);

        System.out.println(h1.getNumBedrooms());
        System.out.println(h1.getHasGarage());
        System.out.println(s1.getNumEmployees());
        System.out.println(s1.getAverageTurnover());

        House h3 = new House();
        House h4 = new House();
        Shop s3 = new Shop();

        System.out.print("There are " + Building.getNumBuildings() + " buildings");
        System.out.print(" of which " + House.getNumHouses() + " are houses and ");
        System.out.println(Shop.getNumShops() + " are shops.");
    }
}
