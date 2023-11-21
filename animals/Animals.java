package animals;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
	abstract String move();
}

abstract class Bird extends Animal {
	abstract String move();
}

abstract class Mammal extends Animal {
	abstract String move();
}
interface Herbivore {
	String forage();
}
interface Carnivore {
	String hunt();
}
class Eagle extends Bird implements Carnivore {
	public String move() {
		return "Flying.";
	}

	public String hunt() {
		return "Looking for a rabbit.";
	}
}

class Finch extends Bird implements Herbivore{
	public String move() {
		return "Flying.";
	}

	public String forage() {
		return "Looking for seeds.";
	}
}

class Lion extends Mammal implements Carnivore {
	public String move() {
		return "Walking and running.";
	}

	public String hunt() {
		return "Looking for a zebra.";
	}
}

class Manatee extends Mammal implements Herbivore  {
	public String move() {
		return "Swimming.";
	}

	public String forage() {
		return "Looking for seagrass.";
	}
}

class Human extends Mammal implements Herbivore, Carnivore {
	public String move() {
		return "Walking and running.";
	}

	public String hunt() {
		return "Looking for a deer.";
	}

	public String forage() {
		return "Looking for fruit.";
	}
}

class Program {
	public static void list1() {
		final List<Object> list = new ArrayList<>();
		list.add(new Finch());
		list.add(new Manatee());
		list.add(new Eagle());
		}
	}


