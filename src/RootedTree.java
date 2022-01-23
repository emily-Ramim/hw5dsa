import java.io.DataOutputStream;

public class RootedTree {
    RootedTreeNode root;

    public RootedTree() {
        root = new RootedTreeNode(0);
    }




    public void printByLayer(DataOutputStream out) {



    }


    public void preorderPrint(DataOutputStream out) {
        int parent_sibling=0;
        int child=1;
        int from=parent_sibling;
        RootedTreeNode x= this.root;
        while(x!=null){
            if(from==parent_sibling){
                out.writeInt(x.getKey());
                if(x.left_child!=null)x=x.left_child;
                else
                {
                    if(x.right_sibling!=null)x=x.right_sibling;
                    else{
                        from=child;
                        x=x.parent;
                    }
                }
            }
            else {
                if(x.right_sibling!=null)
                {
                    from=parent_sibling;
                    x=x.right_sibling;
                }
                else x=x.parent;
            }
        }

    }

}






