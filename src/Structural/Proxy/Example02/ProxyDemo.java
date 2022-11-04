package Structural.Proxy.Example02;

public class ProxyDemo {
    public static void main(String[] args) {
        OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess("Ashwani Rajput");
        officeInternetAccess.grantInternetAccess();
    }
}
