package code38;

import java.util.Objects;

public class Vertex {
    String data;
    int weight;

    public Vertex(String data) {
        this.data = data;
    }

    public Vertex(String data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(data, vertex.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        return "Vertex {" +
                " data='" + data + '\'' +
                " , weight=" + weight +
                "} ";
    }

}