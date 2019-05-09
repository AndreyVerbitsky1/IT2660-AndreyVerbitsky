import java.util.*; 

public class DijkstrasShortestPath { 
	
    private int dist[]; 
    private Set<Integer> settled; 
    private PriorityQueue<Node> pq; 
    private int A;
    List<List<Node> > adj; 
  
    public DijkstrasShortestPath(int A) 
    { 
        this.A = A; 
        dist = new int[A]; 
        settled = new HashSet<Integer>(); 
        pq = new PriorityQueue<Node>(A, new Node()); 
    } 
  
    //  Dijkstra's Algorithm 
    public void dijkstra(List<List<Node> > adj, int src) 
    { 
        this.adj = adj; 
  
        for (int j = 0; j < A; j++) 
            dist[j] = Integer.MAX_VALUE; 
  
        pq.add(new Node(src, 0)); 
        dist[src] = 0; 
        while (settled.size() != A) { 
 
            int u = pq.remove().node; 
  
            settled.add(u); 
  
            e_Neighbours(u); 
        } 
    } 
  
    // Function to process all the neighbours  
    private void e_Neighbours(int u) 
    { 
        int edgeDistance = -1; 
        int newDistance = -1; 
  
        // All the neighbors of v 
        for (int j = 0; j < adj.get(u).size(); j++) { 
            Node v = adj.get(u).get(j); 
  
            // If current node hasn't already been processed 
            if (!settled.contains(v.node)) { 
                edgeDistance = v.path; 
                newDistance = dist[u] + edgeDistance; 
  
                // If new distance is shorter 
                if (newDistance < dist[v.node]) 
                    dist[v.node] = newDistance; 
  
                // Add the current node to the queue 
                pq.add(new Node(v.node, dist[v.node])); 
            } 
        } 
    } 
  
    // main method
    public static void main(String arg[]) 
    { 
        int A = 5; 
        int source = 0; 
  
        // Adjacency list representation 
        List<List<Node> > adj = new ArrayList<List<Node> >(); 
  
        // Initialize list for every node 
        for (int j = 0; j < A; j++) { 
            List<Node> item = new ArrayList<Node>(); 
            adj.add(item); 
        } 
  
        //  graph inout
        adj.get(0).add(new Node(1, 9)); 
        adj.get(0).add(new Node(2, 6)); 
        adj.get(0).add(new Node(3, 5)); 
        adj.get(0).add(new Node(4, 3)); 
  
        adj.get(2).add(new Node(1, 2)); 
        adj.get(2).add(new Node(3, 4)); 
  
        // Calculate the single source shortest path 
        DijkstrasShortestPath shortestpath = new DijkstrasShortestPath(A); 
        shortestpath.dijkstra(adj, source); 
  
        // Print the shortest path to all the nodes 
        System.out.println("The shorted path from node :"); 
        for (int j = 0; j < shortestpath.dist.length; j++) 
            System.out.println(source + " to " + j + " is "
                               + shortestpath.dist[j]); 
    } 
} 
  
// a node in the graph 
class Node implements Comparator<Node> { 
    public int node; 
    public int path; 
  
    public Node() 
    { 
    } 
  
    public Node(int node, int path) 
    { 
        this.node = node; 
        this.path = path; 
    } 
  
    @Override
    public int compare(Node node1, Node node2) 
    { 
        if (node1.path < node2.path) 
            return -1; 
        if (node1.path > node2.path) 
            return 1; 
        return 0; 
    } 
} 