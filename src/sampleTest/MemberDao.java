package sampleTest;

public interface MemberDao {

	void findAll();

	void findById(int i);

	void findByName(String string);

	void save(Member member);

	void update(Member member);

}
