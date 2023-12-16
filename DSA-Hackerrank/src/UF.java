import java.util.*;

public class UF {
    private int[] id;
    public UF(int N)
    {
        id = new int[N];
        for (int i = 0; i < N; i++)
        {
            id[i] = -1;
        }
    }
    public int getRoot(int x)
    {
        if (id[x] < 0)
        {
            return x;
        }
        return id[x] = getRoot(id[x]);
    }
    public int getSize(int x)
    {
        if (id[x] < 0)
        {
            return id[x];
        }
        return getSize(id[x]);
    }
    public void Union(int p, int q)
    {
        int sizeP = getSize(p);
        int sizeQ = getSize(q);
        if (getRoot(p) < getRoot(q))
        {
            id[getRoot(q)] = getRoot(p);
            id[getRoot(p)] = sizeP + sizeQ;
        }
        else if (getRoot(q) < getRoot(p))
        {
            id[getRoot(p)] = getRoot(q);
            id[getRoot(q)] = sizeP + sizeQ;
        }
        else
        {
            id[getRoot(p)] = getRoot(q);
            id[getRoot(q)] = sizeP + sizeQ;
        }
    }
    public boolean connected(int p, int q)
    {
        return getRoot(p) == getRoot(q);
    }
    public void printUnion()
    {
        int n = id.length;
        for (int i = 0; i < n; i++)
        {
            System.out.print(i + "  ");
        }
        System.out.print("\n");
        for (int i = 0; i < n; i++)
        {
            System.out.print(id[i] + "  ");
        }
    }


}