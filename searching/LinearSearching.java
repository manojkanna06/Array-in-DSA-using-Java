boolean found=false;
for(int i=0;i<=arr.length-1;i++){
  if(arr[i]==key){
    System.out.print(i);
    found=true;
    break;
  }
}
if(!found){
  System.out.println("not found");
}
  
