package objectArray;

/*  3건의 데이터를 Member 객체배열에 넣고 foreach를 이용해서 출력하시오
101  kim  developer
102  lee  engineer
103  park sales 

[출력] 
101번 사원 kim은 developer입니다 
102번 사원 lee은 engineer입니다 
103번 사원 park은 sales입니다 
*/
public class MemberEx {
	public static void main(String[] args) {
		Member[] mem = new Member[] { 
				new Member(101, "kim", "developer"), 
				new Member(102, "lee", "engineer"),
				new Member(103, "park", "sales") };

		for(Member m : mem) {
			m.view();
		}
	}
}
