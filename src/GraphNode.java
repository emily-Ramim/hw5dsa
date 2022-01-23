
public class GraphNode {

    GraphEdge Out_head;
    GraphEdge In_head;
    int key;
    GraphNode next;
    GraphNode prev;


    public GraphNode(int key) {
        Out_head = null;
        In_head = null;
        this.key = key;
        this.next = null;
        this.prev = null;
    }


    public int getOutDegree() {
        int count = 0;
        GraphEdge u = Out_head;
        while (u != null) {
            count++;
            u = u.to_next;
        }
        return count;
    }

    public int getInDegree() {
        int count = 0;
        GraphEdge u = In_head;
        while (u != null) {
            count++;
            u = u.from_next;
        }
        return count;

    }

    public int getKey() {
        return this.key;
    }


    public void addIn(GraphEdge edge) {
        GraphEdge head = this.In_head;
        if (this.In_head == null) {
            this.In_head = edge;
        } else {
            edge.from_next = head;
            this.In_head = edge;
            head.from_prev = this.In_head;
        }
    }

    public void addOut(GraphEdge edge) {
        GraphEdge head = this.Out_head;
        if (this.Out_head == null) {
            this.Out_head = edge;
        } else {
            edge.to_next = head;
            this.Out_head = edge;
            head.to_prev = this.Out_head;
        }
    }

    public void deleteIn(GraphEdge edge) {
        if (edge == this.In_head && edge.from_next == null) {
            this.In_head = null;
        } else if (edge == this.In_head) {
            this.In_head = edge.from_next;
            this.In_head.from_prev = null;
        } else if (edge.from_next == null) {
            edge.from_prev.from_next = null;
        } else {
            edge.from_prev.from_next = edge.from_next;
            edge.from_next.from_prev = edge.from_prev;
        }
    }


    public void deleteOut(GraphEdge edge) {
        if (edge == this.Out_head && edge.to_next == null) {
            this.Out_head = null;
        } else if (edge == this.Out_head) {
            this.Out_head = edge.to_next;
            this.Out_head.to_prev = null;
        } else if (edge.to_next == null) {
            edge.to_prev.to_next = null;
        } else {
            edge.to_prev.to_next = edge.to_next;
            edge.to_next.to_prev = edge.to_prev;
        }
    }
}




