package Graph;


/**
 * 图
 */
public class Graph {
    //定点数组
    private Vertex[] vertexList;
    //邻接矩阵
    private int[][] adjMat;
    //顶点的最大数目
    private int maxsize = 20;
    //当前顶点
    private int nVertex;
    //栈
    private Stack stack;
    public Graph(){
        vertexList = new Vertex[maxsize];
        adjMat = new int[maxsize][maxsize];
        for(int i = 0;i < maxsize;i++){
            for(int j = 0;j < maxsize;j++){
                adjMat[i][j] = 0;
            }
        }
        nVertex = 0;
        stack = new Stack();
    }
    //添加结点
    public void addVertex(char label){
        vertexList[nVertex++] = new Vertex(label);
    }
    //添加边
    public void addEdge(int start,int end){
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    public int getadjUnvisitedVertex(int v){
        for(int i = 0;i < nVertex;i++){
            if(adjMat[v][i] == 1 && vertexList[i].wasVisited == false){
            return i;
            }
        }
        return -1;
    }
    //深度优先搜索
    public void dfs(){
        vertexList[0].wasVisited = true;
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()){
            int v = getadjUnvisitedVertex(stack.peek());
            if(v == -1){
                stack.pop();
            }else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                stack.push(v);
            }
        }
        for(int i = 0;i < nVertex;i++){
            vertexList[i].wasVisited = false;
        }
    }
    public void displayVertex(int v){
        System.out.print(vertexList[v].label+" ");
    }
}
