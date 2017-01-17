package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import static HibUtils.HibernateUtils.*;
import pojo.NewUser;

public class UserDao {
	public void delete(String em, String ps){
		Session hs=getSf().getCurrentSession();
		Transaction tx=hs.beginTransaction();
		try {
			String hql="select u from NewUser u where email=:em and password=:ps";
			NewUser u=(NewUser)hs.createQuery(hql).setParameter("em", em).setParameter("ps", ps).uniqueResult();
			if(u==null){
				System.out.println("Your account not found, try again");
				return;
			}
			hs.delete(u);
			tx.commit();
			System.out.println("Account successfully deleted");
		} catch (HibernateException e) {
			// TODO: handle exception
			if(tx!=null)
				tx.rollback();
			System.out.println("Error in delete dao");
			throw e;
		}
	}
	public void insert(NewUser s){
		Session hs=getSf().getCurrentSession();
		Transaction tx=hs.beginTransaction();
		try{
			hs.save(s);
			tx.commit();
		}catch(HibernateException e){
			if(tx!=null)
				tx.rollback();
			System.out.println("Error in insert dao");
			throw e;
		}
	}
}
