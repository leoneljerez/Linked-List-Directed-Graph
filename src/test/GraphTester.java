package test;

import model.Friend;
import model.FriendGraph;
import model.Vertex;

public class GraphTester {

	public static void main(String[] args) {
		FriendGraph<Friend> friendGraph = new FriendGraph<Friend>();
		
		Friend l = new Friend("FriendMe", "FriendMe");
		String me = l.getInitials();
		Vertex<Friend> LJ = new Vertex<Friend>(me, l);

		Friend j = new Friend("Friend1", "Friend1"); 
		String first = j.getInitials();
		Vertex<Friend> JY = new Vertex<Friend>(first, j);
		
		Friend m = new Friend("Friend2", "Friend2"); 
		String second = m.getInitials();
		Vertex<Friend> MS = new Vertex<Friend>(second, m);
		
		Friend n = new Friend("Friend3", "Friend3");
		String third = n.getInitials();
		Vertex<Friend> NP = new Vertex<Friend>(third, n);
		
		Friend h = new Friend("Friend4", "Friend4");
		String fourth = h.getInitials();
		Vertex<Friend> HE = new Vertex<Friend>(fourth, h);
		
		Friend b = new Friend("Friend5", "Friend5");
		String fifth = b.getInitials();
		Vertex<Friend> BM = new Vertex<Friend>(fifth, b);
			
		friendGraph.addVertex(LJ);
		friendGraph.addVertex(JY);
		friendGraph.addVertex(MS);
		friendGraph.addVertex(NP);
		friendGraph.addVertex(HE);
		friendGraph.addVertex(BM);

		
		friendGraph.addEdge(LJ, JY, 0);
		friendGraph.addEdge(LJ, MS, 0);
	    friendGraph.addEdge(LJ, NP, 0);
		friendGraph.addEdge(LJ, HE, 0);
		friendGraph.addEdge(LJ, BM, 0);
	
		
		friendGraph.addContact(LJ,  JY);
		friendGraph.addContact(LJ,  JY);
		friendGraph.addContact(LJ,  JY);
		friendGraph.addContact(LJ,  MS);
		friendGraph.addContact(LJ,  MS);
		friendGraph.addContact(LJ,  MS);
		friendGraph.addContact(LJ,  NP);
		friendGraph.addContact(LJ,  HE);
		friendGraph.addContact(LJ,  BM);
		friendGraph.addContact(LJ,  BM);

		
		System.out.println(friendGraph);
		
	}

}
