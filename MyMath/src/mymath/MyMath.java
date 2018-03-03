package mymath;

class MyMath {

    static int factorial(int x) {
        int result = 0;
        if (x == 0) {
            result = 1;
        }else if(x<0){
           result=-99; 
        }else {
            result = 1;
            for (int i = 1; i <= x; i++) {
                result = result * i;
            }
        }
        return result;
    }

}
