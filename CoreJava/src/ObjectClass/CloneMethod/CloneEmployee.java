package ObjectClass.CloneMethod;

class CloneEmployee implements Cloneable {
	int id;
	public CloneEmployee(int id) {
		this.id=id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


