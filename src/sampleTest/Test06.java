package sampleTest;

public class Test06 {
	public static void main(String[] args) {
		MemberDao dao = new MemberDaoImpl();
		Member member = new Member(100,"박민수");
		dao.findAll();
		System.out.println("-----------------------");
		dao.findById(10);
		System.out.println("-----------------------");
		dao.findByName("최민수");
		System.out.println("-----------------------");
		dao.save(member);
		System.out.println("-----------------------");
		dao.update(member);
	}
}
