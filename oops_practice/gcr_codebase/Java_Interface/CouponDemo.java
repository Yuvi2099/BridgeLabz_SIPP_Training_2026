package oops_practice.gcr_codebase.Java_Interface;
interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 6;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {

        if (!CouponValidator.isLengthValid(code))
            return false;

        return code.startsWith("SAVE");
    }
}

public class CouponDemo {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE50",
                "SAVE100",
                "ABC123",
                "SAVE",
                "SAVE10"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {

            if (cart.validateCoupon(coupon))
                System.out.println(coupon + " -> Valid");
            else
                System.out.println(coupon + " -> Invalid");
        }
    }
}