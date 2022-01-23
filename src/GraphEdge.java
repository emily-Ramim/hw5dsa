public class GraphEdge {
    GraphNode to;
    GraphNode from;
    GraphEdge from_prev;
    GraphEdge from_next;
    GraphEdge to_prev;
    GraphEdge to_next;


    public GraphEdge(GraphNode to, GraphNode from)
    {
        this.to=to;
        this.from=from;
        this.to_next=null;
        this.to_prev=null;
        this.from_prev=null;
        this.from_next=null;
        to.addIn(this);
        from.addOut(this);
    }
    public GraphNode getFrom()
    {
        return this.from;
    }
    public GraphNode getTo()
    {
        return this.to;
    }
    public void delete()
    {
        to.deleteIn(this);
        from.deleteOut(this);
    }

}