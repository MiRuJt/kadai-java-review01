
public class Review01 {
    
    //mainメソッド
    public static void main(String[] args) {
        int productPrice = 1500;
        double tax = 0.1;
        double result = taxMethod(productPrice, tax);
        double taxIncludedPrice = productPrice + result;
        System.out.println(productPrice + "円の商品の税込価格は" + (int)taxIncludedPrice + "円（消費税は" + (int)result + "円)です。");
    }
    
    //taxメソッド
    public static double taxMethod(double productPrice, double tax) {
        double result = productPrice * tax;  
        return result;
    }
}
