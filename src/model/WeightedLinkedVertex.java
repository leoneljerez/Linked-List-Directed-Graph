package model;

public class WeightedLinkedVertex<E> {
	private Vertex<E> vertex = null;
	private int edgeWeight = 0;
	
	public WeightedLinkedVertex(Vertex<E> v, int edgeWeight){
		this.vertex = v;
		this.edgeWeight = edgeWeight;
	}
	
	public Vertex<E> getVertex() {
		return this.vertex;
	}
	
	public int getEdgeWeight(){
		return this.edgeWeight;
	}

	public void setVertex(Vertex<E> vertex) {
		this.vertex = vertex;
	}

	public void setEdgeWeight(int edgeWeight) {
		this.edgeWeight = edgeWeight;
	}
	
	
}
