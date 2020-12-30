class Main {
    public static void z1_10() {
        int number = 3561;
        
        int a = number / 1000;  // 4
        
        int b1 = number / 100;
        int b = b1 % 10;  // 5
        
        int c1 = number / 10;
        int c = c1 % 10; // 6
        
        int d = number % 10; // 1
        
        
        // 3561 -> 51
        // 1 - 
        // -
        // 51 - 
        // 351  =
        int new_number = 0;
        
        int factor = 1; // 10, 100, 1000, 10000,
        
        
        if (d % 2 == 1)
        {
            new_number = d * factor + new_number; // new_number = 1 * 1 + 0 = 1;
            factor = factor * 10;
        }
        
        if (c % 2 == 1)
        {
            new_number = c * factor + new_number; // ------- 
            factor = factor * 10;
        }
        
        if (b % 2 == 1)
        {
            new_number = b * factor + new_number; // new_number = 10 * 5 + 1 = 51;
            factor = factor * 10;
        }
        
        if (a % 2 == 1)
        {
            new_number = a * factor + new_number;  // new_nuwber  =  3*100 + 51 = 351;
            factor = factor * 10; // 1000;
        } 
        
        System.out.print(new_number);
    }
    public static void main (String[] args) 
    { z1_10();
    }
}
