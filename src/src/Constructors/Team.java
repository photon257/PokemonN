package src.Constructors;

import java.util.LinkedList;

public class Team extends LinkedList<Pokemon>{

	private static final long serialVersionUID = -3938621188766515471L;

	public Team() {
			add(new Pokemon("Bidoof"));
			add(new Pokemon("Flareon"));
			add(new Pokemon("Arbok"));
			add(new Pokemon("Regigigas"));
			add(new Pokemon("Beedrill"));
			add(new Pokemon("Gastrodon"));
	}
}

