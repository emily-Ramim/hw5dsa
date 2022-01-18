import java.util.LinkedList;
public class GraphNode {

    LinkedList<GraphNode> OutDegree;
    LinkedList<GraphNode> InDegree;
    int key;

    public GraphNode(){
        OutDegree= new LinkedList<>();
        InDegree= new LinkedList<>();
    }
    public GraphNode(int key){
        OutDegree= new LinkedList<>();
        InDegree= new LinkedList<>();
        this.key=key;
    }

    public int getOutDegree()
    {
        return this.OutDegree.size();
    }

    public int getInDegree()
    {
        return this.InDegree.size();
    }

    public void addInDegree(GraphNode node)
    {
        this.InDegree.add(node);
    }

    public void addOutDegree(GraphNode node)
    {
        this.OutDegree.add(node);
    }

    public void removeFromInDegree(GraphNode node)
    {
        this.InDegree.remove(node);
    }

    public void removeFromOutDegree(GraphNode node)
    {
        this.OutDegree.remove(node);
    }
    public int getKey(){ return this.key;}

}
