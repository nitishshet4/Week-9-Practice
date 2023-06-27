public class Primearr{

  public static void main(String args[]){
   int arr[]={3,5,6,9,11,13,17};
         int count=0;    
    for(int i=0;i<arr.length;i++){
      int temp=arr[i];
      for(int j=1;j<=arr[i];j++){
    if(temp==0||temp==1){
      System.out.println(arr[i] +"is not a prime number");
    }
      
    else {
      if (temp%2==0){
      count++;
      }
    }
     if(count==2){
       System.out.println(arr[i] +"is a prime number");
     }
    }
  }
}
}