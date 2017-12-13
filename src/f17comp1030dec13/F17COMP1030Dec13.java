
package f17comp1030dec13;

/**
 *
 * @author jwright
 */
public class F17COMP1030Dec13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] presents = new String[5];
        presents[0]="house";
        presents[1]="lottery ticket";
        presents[2]="iPhone X";
        presents[3]="winter tires";
        presents[4]="broken laptop";
        
        displayArray(presents);
        displayArrayReverse(presents);
        displayArrayLowerCase(presents);
    }
    
    public static void displayArray(String[] array)
    {
        for (int i=0; i<array.length; i++)
            System.out.printf("%-20s", array[i]);
        
        System.out.println();
    }
    
    public static void displayArrayReverse(String[] array)
    {
        for (int i=array.length-1; i>=0; i--)
            System.out.printf("%-20s", array[i]);
        
        System.out.println();
    }
 
    public static void displayArrayLowerCase(String[] array)
    {
        for (int i=0; i<array.length; i++)
            System.out.printf("%-20s", array[i].toLowerCase());
        
        System.out.println();
    }
}
