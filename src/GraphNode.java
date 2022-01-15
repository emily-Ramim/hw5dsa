import java.util.LinkedList;
public class GraphNode {

    LinkedList<GraphNode> OutDegree= new LinkedList<>();
    LinkedList<GraphNode> InDegree= new LinkedList<>();
    LinkedList<GraphNode> siblings= new LinkedList<>();

    int key=0;

    public int getOutDegree()
    {
        return this.OutDegree.size();
    }

    public int getInDegree()
    {
        return this.InDegree.size();
    }

    public int getInDegree()
    {
        return this.siblings.size();
    }

    public boolean addSibling(GraphNode node){
        for(int i=0; i<node.InDegree.size(); i++)
        {
            if(this.InDegree.contains(node.InDegree.get(i))){
                this.siblings.addLast(node.InDegree.get(i));
                return true;
            }
        }
        return false;
    }


    public int getKey(){ return this.key;}

}
