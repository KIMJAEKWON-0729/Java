package abstractex;

//추상 메서드가 없는 추상 클래스=------------------------------
abstract class AA{
	public void view1() {};// -1
	public void view2() {} // -2
}

class BB extends AA{
	@Override			//
	public void view1() {} //강제성이 없는 재정의
}
public class AbstractEx1 {
	public static void main(String[] args) {
//		AA ob = new AA();//객체생성불가능 
		
		
		AA ob2 = new BB(); //3 , 2 번 호출 
		ob2.view1();
		ob2.view2();
	}
}


//추상 메서드가 있는 추상 클래스=------------------------------
/*
 * abstract class AA{ abstract public void view1(); public void view2() {} }
 * 
 * class BB extends AA{
 * 
 * @Override //부모 메서드를 재정의 하는 것인지 아렬주는 Annotation public void view1() {} //강제성이
 * 있는 재정의 } public class AbstractEx1 { public static void main(String[] args) {
 * // AA ob = new AA();//객체생성불가능
 * 
 * 
 * AA ob2 = new BB(); //3 , 2 번 호출 ob2.view1(); ob2.view2(); } }
 */

//일반 클래스 ------------------------------

/*
 * class AA{ public void view1() {} public void view2() {} }
 * 
 * class BB extends AA{
 * 
 * @Override //부모 메서드를 재정의 하는 것인지 아렬주는 Annotation public void view1() {} //강제성이
 * 없는 재정의 } public class AbstractEx1 { public static void main(String[] args) {
 * AA ob = new AA();//객체생성가능 1번 호출 ob.view1();
 * 
 * AA ob2 = new BB(); //3 , 2 번 호출 ob2.view1(); ob2.view2(); } }
 */