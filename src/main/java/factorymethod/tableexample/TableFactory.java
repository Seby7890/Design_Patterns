package factorymethod.tableexample;

public class TableFactory {
    public Table createTable(String type) {
        return switch (type) {
            case "office" -> new OfficeTable("Office Table");
            case "kitchen" -> new KitchenTable("Kitchen Table");
            case "bedroom" -> new BedroomTable("Bedroom Table");
            default -> null;
        };
    }
}