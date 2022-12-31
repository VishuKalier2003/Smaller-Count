/* Given an integer array nums, return an integer array counts where counts[i] is the number of smaller elements to the right of nums[i]...
 * Eg 1: Input = [5, 2, 1, 6]       Output = [2, 1, 0, 0]
 * Eg 2: Input = [5, 2, 6, 1]       Output = [2, 1, 1, 0]
 * Eg 2: Input = [4, 3, 2, 1]       Output = [3, 2, 1, 0]
*/
import java.util.*;
public class SmallerCount
{
    public int[] Solution(int[] num)
    {
        int arr[] = new int[num.length];
        int count = 0;
        arr[num.length-1] = 0;
        for(int i = arr.length-2; i >= 0; i--)     // Performing Traversal backwards...
        {
            if(num[i] > num[i+1])
            {
                count++;
                arr[i] = count;    // If number is smaller...
            }
            else
                arr[i] = count;    // If number is same...
        }
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+", ");
        System.out.println();
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, a;
        System.out.print("Enter the size of the vector array : ");
        x = sc.nextInt();
        int number[] = new int[x];
        for(int i = 0; i < x; i ++)
        {
            System.out.print("Enter "+(i+1)+" th data : ");
            a = sc.nextInt();
            number[i] = a;
        }
        SmallerCount Count = new SmallerCount();    // Object creation...
        System.out.println("The Smaller Count Vector formed ");
        Count.Solution(number);
        sc.close();
    }
}

// Time Complexity  -  O(n) time...
// Space Complexity -  O(1) space...