#include <stdio.h>



int main() {

	int n,t;
	scanf("%d",&t);											//Test Cases	
	for(int i=0;i<t;i++){
		scanf("%d",&n);
		int a[n];
		for(int j=0;j<n;j++){
			scanf("%d",&a[i]);
		}
		printf("inp: %d",n);
		int k=0;
		int flag=0;
		while(k < n){
			int count = 1;
			if(a[k]==1){
				int l = k;
				l++;
				while(a[l]!=1 && l<n){
					l++;
					count++;
					printf("cn++\n");
				} 
				k= l;
				printf("l: %d",l);
			}
			if(count<5 && count!=1 && k!=n-1){
				printf("No: %d\n\n",count);
				flag=1;
				break;
			}
			k++;
			printf("cnt: %d\n",count);
		}
		if(flag==0){
			printf("Yes\n\n");
		}
	}

	return 0;
}
