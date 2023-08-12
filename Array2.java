//Basic Array delcaration and Average operation :)


public class Array2 {
    
    public static void main(String Args[]){

        int a[] = {10, 20,30 ,40,50}; //Initialisation
        
        //Now, we'll use for loop to print every elemnt in Array one by one.

        for (int i= 0;i<a.length;i++){   
            //"a.length" is considered by defualt by the system as length of that array.

            System.out.println(a[i]); //it prints each elements.
        }
        
        //Average Calculation
        float sum=0,avg;
        for (int i = 0; i<a.length;i++){   
            sum += a[i];           //adds each element in array one by one.
            avg = sum/a.length;    // Average formula, Pata hai na ?
            
            //Abhi Average ko print karte hain!
            System.out.println("Average : "+avg);
        }
    }
}
