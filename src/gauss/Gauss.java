package gauss;

public interface Gauss<N extends Number, T extends Gauss<N, T>> {
    public void addEquation(T item);
    public void mul(N coefficient);
    public N findCoefficient(N a, N b);
    public N at(int index);
    public int size();
}