import java.io.DataOutputStream;

public class RootedTree{
        RootedTreeNode root;

        public RootedTree(){
                root= new RootedTreeNode();
        }

        public void printByLayer(DataOutputStream out){
                out.writeInt(root.getKey());
                while (root.getLeft_child()!=null)
                {
                        RootedTreeNode sibling= root.getLeft_child();
                        out.writeInt(sibling.getKey());
                        while(sibling.getRight_sibling()!=null){
                                sibling= root.getRight_sibling();
                                out.writeInt(sibling.getKey());
                        }
                }

        public void preorderPrint(DataOutputStream out)
                {
                     RootedTreeNode from=null;
                     RootedTreeNode x= this.root;
                     while (x!= null){
                             if(from== x.getParent() || (from==x.getLeftSibling() && from!=null))
                             {
                                     out.writeInt(x.getKey());
                                     if(x.getLeft_child()!=null) x=x.getLeft_child();
                                     else
                                     {
                                        if(x.getRight_sibling()!=null) x=x.getRight_sibling();
                                        else
                                        {
                                            from=x.getLeft_child();
                                            x=x.getParent();
                                        }
                                     }
                             }
                             else
                             {
                                     if(x.getRight_sibling()!=null)
                                     {
                                             from=/*      */
                                             x=x.getRight_sibling();
                                     }
                                     else
                                     {
                                             x=x.getParent();
                                     }
                             }
                     }
                }







}