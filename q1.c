#include <stdio.h>



int main() {

	int n,t;

	scanf("%d",&t);

	for(int i=0;i<t;i++){
		scanf("%d",&n);
		int a[n];
		for(int j=0;j<n;j++){
			scanf("%d",&a[i]);
		}
	int k=0;
	int flag=0;
	while(k < n){
		int count = 1;
		if(a[k]==1){
			int l = k;
			l++;
			while(a[l]!=1){
			l++;
			count++;
		} 
		k= l;
		}
		if(count>=5){
			printf("YES");
			flag=1;
			break;
		}
	}
		if(flag==0){
			printf("No");
		}
	}

return 0;

}