package airbnb;

public class Address {

    public static int id;
    private int instanceId;
    private String province;
    private String region;
    private String address;


    public Address( String province, String region, String address) {
        this.instanceId = id++;
        this.province = province;
        this.region = region;
        this.address = address;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Address.id = id;
    }

    public int getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(int instanceId) {
        this.instanceId = instanceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
