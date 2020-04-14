package Polymorphism;

class Movie {
  private String name;

  public Movie(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String plot() {
    return "No Plot Here";
  }
}

class Jaws extends Movie {
  public Jaws() {
    super("Jaws");
  }

  public String plot() {
    return "A shark eats people";
  }
}

class IndependenceDay extends Movie {
  public IndependenceDay() {
    super("Independence Day");
  }

  @Override
  public String plot() {
    return "Aliens fuck up some shit";
  }
}

class MazeRunner extends Movie {
  public MazeRunner() {
    super("Maze Runner");
  }

  @Override
  public String plot() {
    return "Can't get out";
  }
}

class StarWars extends Movie {
  public StarWars() {
    super("Star Wars");
  }

  @Override
  public String plot() {
    return "Space Western";
  }
}

class ForgettableMovie extends Movie {
  public ForgettableMovie() {
    super("Forgettable");
  }
  // no plot
}

public class Main {
  public static void main(String[] args) {

    for (int i = 0; i < 11; i++) {
      Movie movie = randomMovie();
      System.out.println("Movie #" + i + 
                          ": " + movie.getName() + "\n"+
                          "Plot: " + movie.plot() 
                          );
    }
  }

  public static Movie randomMovie() {
    int rdm = (int) (Math.random() * 5) + 1;
    System.out.println("rand is " + rdm);
    switch (rdm) {
      case 1:
        return new Jaws();
      case 2:
        return new IndependenceDay();
      case 3:
        return new MazeRunner();
      case 4:
        return new StarWars();
      case 5:
        return new ForgettableMovie();
      default:
        return null;
    }
  }
}
