
public class large2small2_arrys5 {
public static void main(String[] args) {
int N=10;
int pin[]= {1,2,3,4,56,87,95,02,45,8};

	int i, max1, max2, min1, min2;

	max1 = pin[1];

	max2=pin[1];

	min1 = pin[1];

	min2=pin[1];

	for(i=0;i<N; i++){

	if(pin[i]> max1)

	max1 = pin[i];

	}

	for(i=0; i<N; i++){

	if(pin[i]>max2 && pin[i]!=max1)

	max2= pin[i];

	}

	for(i=0;i<N; i++){

	if(pin[i]< max1)

	min1 = pin[i];

	}

	for(i=0; i<N; i++){

	if(pin[i]<min2 && pin[i]!=min1)

	min2= pin[i];

	}


	System.out.println ("The First largest is " + max1);
	System.out.println ("The Second largest is " + max2);
	System.out.println ("The First smallest is " + min1);
	System.out.println ("The Second smallest is " + min2);
}
}
