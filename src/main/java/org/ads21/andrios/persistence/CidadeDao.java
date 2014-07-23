package org.ads21.andrios.persistence;

import java.util.List;

import org.ads21.andrios.conexao.SessionFactoryUtil;
import org.ads21.andrios.entidade.Cidades;
import org.ads21.andrios.entidade.Estados;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CidadeDao {
	
	public void salvarCidade(Cidades cidades){
		
		Session session = SessionFactoryUtil
				.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.save(cidades);
		tr.commit();
		session.close();
		
	}
	
	public void excluir(Cidades cidades){
		Session session = SessionFactoryUtil
				.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.delete(cidades);
		tx.commit();
		session.close();
	}
	
	public List<Estados> listarEstados(){
		Session session = SessionFactoryUtil
				.getSessionFactory().openSession();		
		Criteria criteria = session.createCriteria(Estados.class);
		return criteria.list();
	}
}
