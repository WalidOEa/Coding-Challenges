import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.recursion.MinimumInArray;

public class MinInt implements MinimumInArray {
    int i = 0;

    public int findMin(int[] array) {
        if (i == (array.length-1)) {
            i = 0;
            return array[i];
        }
        else {
            i++;
            return Math.min(array[i], findMin(array));
        }
    }


}
