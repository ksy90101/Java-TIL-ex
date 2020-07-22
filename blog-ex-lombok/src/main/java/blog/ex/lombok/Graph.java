package blog.ex.lombok;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int V; // 노드 갯수
    private LinkedList<Integer> adj[]; // 인접 리스트

    Graph(int v){
        V = v;
        adj = new LinkedList[v];
        for (int i =0; i<v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    // 노드 연결
    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) {
        // 현재 노드를 방문한 것으로 표시
        visited[v] = true;
        // 방문한 노드와 인접한 모든 노드를 가져온다.
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()){
            int n = i.next();
            // 방문하지 않은 노드였다면 재귀
            if(!visited[v]){
                DFSUtil(n, visited);
            }
        }
    }

    // 주어진 노드를 시작으로 DFS xkator
    void DFS(int v){
        // 노드 방문 여부 판단
        boolean visited[] = new boolean[V];
        // v를 노드 시작으로 순환 호출
        DFSUtil(v, visited);
    }

    // DFS 탐색
    void DFS(){
        boolean visited[] = new boolean[V];
        for (int i =0; i<V; i++){
            if(visited[i] == false){
                DFSUtil(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.DFS(2);
        graph.DFS();

        graph.BFS(2);
    }

    void BFS(int s){
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // 현재 노드를 방문한 것으로 표시 후 queue에 삽입
        visited[s] = true;
        queue.add(s);

        // 큐가 빌 때까지 반복
        while (queue.size() != 0){
            // 방문한 노드를 큐에서 추출
            s = queue.poll();
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int n = i.next();

                // 방문하지 않았다면 큐에 삽입
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
