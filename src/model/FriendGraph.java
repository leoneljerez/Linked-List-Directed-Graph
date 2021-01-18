package model;

import java.util.List;

public class FriendGraph<E> extends LinkedListBasedDirectedGraphData<E> {
	
	public void addContact(Vertex<E> startingVertex, Vertex<E> endingVertex){
		if(getVertexMap().containsKey(startingVertex) && getVertexMap().containsKey(endingVertex)){
			List<WeightedLinkedVertex<E>> startingVertexEdgeList = getVertexMap().get(startingVertex);
			int index = 0;
			
			for(int i = 0; i < startingVertexEdgeList.size(); i++){				
				if(startingVertexEdgeList.get(i).equals(endingVertex)){
					index = i;
					break;
				}
			}
			
			int num;
			num = startingVertexEdgeList.get(index).getEdgeWeight();
			num = num + 1;
			startingVertexEdgeList.get(index).setEdgeWeight(num);
		}
	}
}
