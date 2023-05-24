package inheritance.shop;

public class Shop1 extends HeadShop{
	// 생성자
	public Shop1() {
		System.out.println("대학가 매장입니다.");
	}

	@Override
	public void sellDoenJangJJige() {
		System.out.println("된찌 : 6.000원");
	}

	@Override
	public void sellKimchiJJige() {
		System.out.println("김찌 : 6.500원");
	}

	@Override
	public void sellBibimBap() {
		System.out.println("비빔밥 : 6.500원");
	}
	
}