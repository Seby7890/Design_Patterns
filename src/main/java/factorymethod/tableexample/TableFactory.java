package factorymethod.tableexample;

public class TableFactory {
    public Table createTable(String type) {
        if (type.equals("office")) {
            return new OfficeTable("Office Table");
        } else if (type.equals("kitchen")) {
            return new KitchenTable("Kitchen Table");
        } else if (type.equals("bedroom")) {
            return new BedroomTable("Bedroom Table");
        } else {
            return null;
        }
    }
}