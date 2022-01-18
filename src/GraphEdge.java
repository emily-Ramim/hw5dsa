public class GraphEdge {
    GraphNode to;
    GraphNode from;


    public GraphNode getFrom()
    {
        return this.from;
    }
    public GraphNode getTo()
    {
        return this.to;
    }
    public void setGraphEdge(GraphNode from, GraphNode to) {

        from.addOutDegree(to);
        to.addInDegree(from);
        this.from=from;
        this.to=to;
    }

    public void removeGraphEdge()
    {
        from.removeFromOutDegree(to);
        to.removeFromInDegree(from);

    }
}