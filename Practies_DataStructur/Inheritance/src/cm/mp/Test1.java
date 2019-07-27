package cm.mp;

 public class Test1 {
		private int id;
		protected String name;//will avalable to same package
		String dep;//will avalable other package sub class
		public int code;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void showid(){
			System.out.println("id="+this.id);
		}
		protected void showName(){
			System.out.println("name="+this.name);
		}
		void show1(){
			System.out.println("name="+this.name);
		}


}
