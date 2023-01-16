package my.day18.c.multi_Interface;

public class Me implements Inter_Me {

	@Override
	public void work() {
		System.out.println("보람차게 일합니다.!!");
	}

	@Override
	public void cook() {
		System.out.println("맛있는 음식을 요리합니다.~~");
	}

	@Override
	public void play() {
		System.out.println("재미있게 놀아요^^");
	}

}
