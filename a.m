eps = 10^-6;
n = 12000;
alpha = -0.3;

L = sparse(n,n);
D = sparse(n,n);
U = sparse(n,n);

for i=2:n-1
    L(i,i-1)=-alpha;
    D(i,i)=1;
    U(i,i+1)=alpha-1;
end;

D(1,1)=1;
U(1,2) = alpha-1;
L(n,n-1)=-alpha;
D(n,n) = 1;

b=zeros(n,1);
b(1,1)=alpha;
b(2:n-1)=0;

N =U;    
M =L+D;
x=zeros(n,1);

%y=L*b;
y=M\(b-N*x);

%y=L*pinv(b-(N*x));
z=sparse(n,1);
z=y-x;
norm0=norm(z,Inf);
ratio = 1;
k = 1;
x=y;
while((ratio>eps)&&(k<10000))
    y = M\(b-N*x);
    z=y-x;
    norm1 = norm(z,Inf);
    ratio=norm1/norm0;
    k=k+1;
    x=y;
end;

y = (L+D+U)\b;
z=y-x;
solerror=norm(z,Inf);
