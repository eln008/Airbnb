package P.Service.Model;

public class Address {
   private static int idd;
   private int id;
   private String province;
   private String region;
   private String address;

   public Address(int id, String province, String region, String address) {
      this.id = id;
      this.province = province;
      this.region = region;
      this.address = address;
   }

   public static int getIdd() {
      return idd;
   }

   public static void setIdd(int idd) {
      Address.idd = idd;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
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

   @Override
   public String toString() {
      return "Address{" +
              "\nid=" + id +
              ", \nprovince='" + province + '\'' +
              ", \nregion='" + region + '\'' +
              ", \naddress='" + address + '\'' +
              "\n}";
   }

}
