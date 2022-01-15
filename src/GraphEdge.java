public class GraphEdge {

    GraphNode InNode;
    GraphNode OutNode;

    public GraphEdge(GraphNode InNode, GraphNode OutNode)
    {
        for(int i=0; i<OutNode.getOutDegree(); i++)
        {
            if(InNode.OutDegree.contains(OutNode.InDegree.get(i)))
            {
                this.InNode=InNode;
                this.OutNode=OutNode;
            }
        }
    }
}

