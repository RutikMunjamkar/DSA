 public static void main(String[]args){
   //checks the greater string between the two strings
      String x="rutik";
      String y="munjamkar";
      int res=x.compareTo(y);
      if(res==0){
          System.out.println("String1 is equal to the String2");
      }
      else if(res>0){
          System.out.println("String1 is greater than the String2");
      }
      else if(res<0){
          System.out.println("String1 is less than the String2");
      }
  }
