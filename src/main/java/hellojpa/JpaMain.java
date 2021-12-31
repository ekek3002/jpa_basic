package hellojpa;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            //회원 등록
//            Member member = new Member();
//
//            member.setId(2L);
//            member.setName("HelloB");
//            em.persist(member);

//            //회원 찾기
//            Member findMember = em.find(Member.class, 1L);
//            System.out.println("findMember.getId() = " + findMember.getId());
//            System.out.println("findMember.getName() = " + findMember.getName());

//            //회원 삭제
//            Member findMember = em.find(Member.class, 1L);
//            em.remove(findMember);

//            //회원 수정
//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("HelloJPA");

//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(1)
//                    .setMaxResults(8)
//                    .getResultList();
//
//            for (Member member : result) {
//                System.out.println("member.getName() = " + member.getName());
//            }

//            //비영속
//            Member member = new Member();
//            member.setId(101L);
//            member.setName("HelloJPA");
//
//            //영속
//            System.out.println("====== BEFORE =======");
//            em.persist(member);
//            System.out.println("====== AFTER =======");
//
//            Member findMember = em.find(Member.class, 101L);
//
//            System.out.println("findMember.getId() = " + findMember.getId()); //1차 캐시에서 가져옴
//            System.out.println("findMember.getName() = " + findMember.getName());

//            Member findMember1 = em.find(Member.class, 101L);
//            Member findMember2 = em.find(Member.class, 101L);
//
//            System.out.println("findMember1 == findMember2 = " + (findMember1 == findMember2));

//            Member member1 = new Member(150L, "A");
//            Member member2 = new Member(160L, "B");
//
//            em.persist(member1);
//            em.persist(member2);

            //영속
//            Member member = em.find(Member.class, 150L);
//            member.setName("ZZZZZZZ");

            //준영속 상태로 만드는 방법
//            em.detach(member); //특정 엔티티만 준영속 상태로 전환

//            em.clear(); //영속성 컨텍스트를 완전히 초기화

//            Member member = new Member(200L, "member200");
//            em.persist(member);
//
//            em.flush();
//            System.out.println("==================================");

            Member member = new Member();
//            member.setId("ID_A");®
            member.setUsername("C");

            em.persist(member);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close(); //영속성 컨텍스트를 종료
        }
        emf.close();
    }
}
