 static int search(Node head, int x){
        if(head==null)return -1;
        if(head.data==x)return 1;
        else{
            int res=search(head.next,x);
            if(res==-1)return -1;
            else return res+1;
        }
    }
