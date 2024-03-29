package 数据结构_慕课网.树.unionFInd;

/**
 * @Author ssl
 * @Date 2020/12/15 17:20
 * @Description
 */
public interface UnionFind {
    int getSize();

    boolean isConnected(int p, int q);

    void unionElements(int p, int q);
}
