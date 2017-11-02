int firstDuplicate(int[] a) {
      int index=a.length;
      int d = 0;
      
      for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                  if(a[i]==a[j]){
                        if(index>j){
                              index=j;
                              d=1;
                        }
                  }
            }
      }
      if(d==0){
            return -1;
      }
      else{
           return a[index];
      }
      
}
