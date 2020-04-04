#include<stdio.h>

int main(){
    int t,n;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
        int sum = 0;
        scanf("%d",&n);
        int a[n];
        for(int j=0;j<n;j++){
            scanf("%d",&a[j]);
        }
        for(int k=0;k<n;k++){
            if(a[k]!=0){
                sum = sum + a[k];
                for(int l=k+1;l<n;l++){
                    if(a[l]>0){
                        a[l] = a[l] - 1;
                    }
                }
            }
        }
        printf("%d",sum);
    }
    return 0;
}