package pack1;

class Ani {
	void makesound()
	{
		System.out.println("animal sound");
	}
}

	class cat extends Ani {
		void makesound()
		{
			System.out.println("meow meow");
		}
	}
		class dog extends Ani {
			void makesound()
			{
				System.out.println("bhow bhow");
			}
}
		public class Animal{
			public static void main(String[] a){
				Ani a1 = new dog();
				a1.makesound();
				a1 = new cat();
				a1.makesound();
				
			}
		}
