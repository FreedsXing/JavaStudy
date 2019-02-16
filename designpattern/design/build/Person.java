package design.build;

public class Person {

	private String name;
	
	private int age;
	
	private boolean isBoy;
	
	private double score;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBoy() {
		return isBoy;
	}

	public void setBoy(boolean isBoy) {
		this.isBoy = isBoy;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Person(String name, int age, boolean isBoy, double score) {
		super();
		this.name = name;
		this.age = age;
		this.isBoy = isBoy;
		this.score = score;
	}

	public static class Builder{
		
		private String name;
		
		private int age;
		
		private boolean isBoy;
		
		private double score;
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public Builder isBoy(boolean isBoy) {
			this.isBoy = isBoy;
			return this;
		}
		
		public Builder score(double score) {
			this.score = score;
			return this;
		}
		
		public Person build() {
			return new Person(name, age, isBoy, score);
		}
	}
}
